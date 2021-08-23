package testCases;

import org.apache.log4j.xml.DOMConfigurator;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import appModules.Login_Action;
import pageObjects.BaseClass;
import utility.Constant;
import utility.ExcelUtils;
import utility.Log;
import utility.Utils;

public class Validate_Login {
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
	  	// From above method we get long test case name including package and class name
	  	// The below method will refine your test case name, exactly the name we have used
	  	sTestCaseName = Utils.getTestCaseName(this.toString());
	  	
	  	
	  	// Start printing the logs and printing the Test Case name
		Log.startTestCase(sTestCaseName);
		
		
		// Setting up the Test Data Excel file using Constants variables
		ExcelUtils.setExcelFile(Constant.Path_TestData + Constant.File_TestData,"Sheet1");
		
		// Fetching the Test Case row number from the Test Data Sheet
		iTestCaseRow = ExcelUtils.getRowContains(sTestCaseName,Constant.Col_TestCaseName);
		// Launching the browser, this will take the Browser Type from Test Data Sheet 
		driver = Utils.OpenBrowser(iTestCaseRow);
		
		// Initializing the Base Class for Selenium driver
		new BaseClass(driver);
		}	
			@Test //Test Case to validate the sign up Functionality
			 public void main() throws Exception {
				  try{
					  Login_Action.Execute();
				  }catch (Exception e) {
						throw (e);
					}
		}

			@AfterClass
			//Closing the browser
			public void tearDown() {
				driver.quit();
			}


}
