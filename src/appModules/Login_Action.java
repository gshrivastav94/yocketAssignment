package appModules;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;

import pageObjects.BaseClass;
import pageObjects.Login;
import utility.Log;

public class Login_Action extends BaseClass {
	public Login_Action(WebDriver driver) {
		super(driver);
	}

	public static void Execute() throws Exception {
		
		//Launching the WebPage for Yocket
		driver.get("https://www.yocket.in/");
		
		//Entering the details on the Login Page
		try {
			Login.login().click();
			Log.info("Clicked on Login");

			Login.email().click();
			Login.email().sendKeys("gshrivastav94@gmail.com");
			Log.info("Entered User Email");

			Login.continueLogin().click();
			Log.info("Clicked on Continue button");

			Login.passwordLogin().click();
			Login.passwordLogin().sendKeys("Gautam@14294");
			Log.info("Entered the password");

			Login.loginButton().click();
			Log.info("CLicked on Login Button");
		} catch (Exception e) {
			Log.error("Please Enter a valid input");
			throw (e);
		}
	}

	@AfterClass
	//Closin the browser
	public void tearDown() {
		driver.quit();
	}
}
