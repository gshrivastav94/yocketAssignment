package testCases;

import java.util.List;

import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.log4j.xml.DOMConfigurator;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import pageObjects.BaseClass;
import utility.Constant;
import utility.ExcelUtils;
import utility.Log;
import utility.Utils;

public class Validate_HarvardUniversity {
	public WebDriver driver;
	private String sTestCaseName;
	private int iTestCaseRow;

	@BeforeMethod
	public void beforeMethod() throws Exception {
		// Configuring Log4j logs for logging
		DOMConfigurator.configure("log4j.xml");

		// Getting the Test Case name
		// The main use is to get the TestCase row from the Test Data Excel sheet
		sTestCaseName = this.toString();
		// From above method we get long test case name including package and class
		// name.
		// The below method will refine your test case name, exactly the name we have
		// used
		sTestCaseName = Utils.getTestCaseName(this.toString());

		// Start printing the logs and printing the Test Case name
		Log.startTestCase(sTestCaseName);

		// Setting up the Test Data Excel file using Constants variables
		ExcelUtils.setExcelFile(Constant.Path_TestData + Constant.File_TestData, "Sheet1");

		// Fetching the Test Case row number from the Test Data Sheet
		iTestCaseRow = ExcelUtils.getRowContains(sTestCaseName, Constant.Col_TestCaseName);
		// Launching the browser, this will take the Browser Type from Test Data Sheet
		driver = Utils.OpenBrowser(iTestCaseRow);

		// Initializing the Base Class for Selenium driver
		new BaseClass(driver);
	}

	@Test // Test Case to validate the Harvard University Page
	public void main() throws Exception {
		//Getting the Web URL for Yocket Harvard University Page
		driver.get("https://yocket.in/university-reviews/harvard-university-2574");
		
		//Getting all the elements under a tag i.e. all the links from the page
		List<WebElement> links = driver.findElements(By.tagName("a"));
		{
			//Running the loop to check the HTTPS status code for the links
			for (WebElement t : links) {
				String url = t.getAttribute("href");
				checkStatusCode(url);
			}
		}
	}

	//Method to check the HTTP Response codes for the links
	public static void checkStatusCode(String url) {
		HttpClient client = HttpClientBuilder.create().build();
		HttpGet request = new HttpGet(url);

		try {
			HttpResponse response = client.execute(request);
			if (response.getStatusLine().getStatusCode() != 200) {
				System.out.println("Non-working link = " + url);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	@AfterClass
	//Closing the browser
	public void tearDown() {
		driver.quit();
	}

}
