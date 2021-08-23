package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import utility.Log;

public class SignUp extends BaseClass {
	private static WebElement element = null;

	public SignUp(WebDriver driver) {
		super(driver);
	}
//Locators for the elements on Sign Up page
	public static WebElement signup() throws Exception {
		try {
			element = driver.findElement(By.linkText("SIGNUP"));
			Log.info("SIGNUP Button is found");
		} catch (Exception e) {
			Log.error("SIGNUP Button is not found");
			throw (e);
		}
		return element;
	}

	public static WebElement email() throws Exception {
		try {
			element = driver.findElement(By.name("email"));
			Log.info(" Email field is found");
		} catch (Exception e) {
			Log.error("Email field is not found");
			throw (e);
		}
		return element;
	}

	public static WebElement continueSignUp() throws Exception {
		try {
			element = driver.findElement(By.cssSelector(
					"#overlay > div > div.col-md-6.p-0.d-flex.align-items-center.justify-content-center.h-100 > div > div:nth-child(2) > form > div:nth-child(3) > button"));
			Log.info(" Continue Button is found");
		} catch (Exception e) {
			Log.error("Continue Button is not found");
			throw (e);
		}
		return element;
	}

	public static WebElement firstName() throws Exception {
		try {
			element = driver.findElement(By.name("first_name"));
			Log.info("First Name Field is found");
		} catch (Exception e) {
			Log.error("First Name Field is not found");
			throw (e);
		}
		return element;
	}

	public static WebElement lastName() throws Exception {
		try {
			element = driver.findElement(By.name("last_name"));
			Log.info("Last Name Field is found");
		} catch (Exception e) {
			Log.error("L Name Field is not found");
			throw (e);
		}
		return element;
	}

	public static WebElement phone() throws Exception {
		try {
			element = driver.findElement(By.name("phone"));
			Log.info("Phone number Field is found");
		} catch (Exception e) {
			Log.error("Phone number Field is not found");
			throw (e);
		}
		return element;
	}

	public static WebElement password() throws Exception {
		try {
			element = driver.findElement(By.name("password"));
			Log.info("Password Field is found");
		} catch (Exception e) {
			Log.error("Password  Field is not found");
			throw (e);
		}
		return element;
	}

	public static WebElement captcha() throws Exception {
		try {
			element = driver.findElement(By.xpath("//div[@class='recaptcha-checkbox-borderAnimation']"));
			Log.info("captcha is found");
		} catch (Exception e) {
			Log.error("Captcha is not found");
			throw (e);
		}
		return element;
	}

	public static WebElement signUpButton() throws Exception {
		try {
			element = driver.findElement(By.cssSelector(
					"#overlay > div > div.col-md-6.p-0.d-flex.align-items-center.justify-content-center.h-100 > div > div:nth-child(3) > form > div > div:nth-child(4) > div.mt-4 > button"));
			Log.info("Sign Up Button is found");
		} catch (Exception e) {
			Log.error("Sign Up Button is not found");
			throw (e);
		}
		return element;
	}

	public static WebElement student() throws Exception {
		try {
			element = driver.findElement(
					By.xpath("(//div[@class='card card-overlay hover-shadow-lg hover-translate-y-n10 p-3'])[1]"));
			Log.info("Student Button is found");
		} catch (Exception e) {
			Log.error("Student Button is not found");
			throw (e);
		}
		return element;
	}

	public static WebElement undergrad() throws Exception {
		try {
			element = driver.findElement(
					By.xpath("(//div[@class='card card-overlay hover-shadow-lg hover-translate-y-n10 p-3'])[1]"));
			Log.info("Undergrad Button is found");
		} catch (Exception e) {
			Log.error("Undergrad Button is not found");
			throw (e);
		}
		return element;
	}

	public static WebElement schoolName() throws Exception {
		try {
			element = driver.findElement(By.cssSelector("#overlay > div > div.my-auto.h-100 > div > div > div > div:nth-child(1) > div > input"));
			Log.info("School Name Field is found");
		} catch (Exception e) {
			Log.error("School Name Field is not found");
			throw (e);
		}
		return element;
	}

	public static WebElement board() throws Exception {
		try {
			element = driver.findElement(By.xpath("(//div/select[@class='custom-select form-control-emphasized'])[1]"));
			Log.info("Board Field is found");
		} catch (Exception e) {
			Log.error("Board Field is not found");
			throw (e);
		}
		return element;
	}

	public static WebElement grade() throws Exception {
		try {
			element = driver.findElement(By.xpath("(//div/select[@class='custom-select form-control-emphasized'])[2]"));
			Log.info("Grade Field is found");
		} catch (Exception e) {
			Log.error("Grade Field is not found");
			throw (e);
		}
		return element;
	}

	public static WebElement marks() throws Exception {
		try {
			element = driver.findElement(By.xpath("(//div/select[@class='custom-select form-control-emphasized'])[3]"));
			Log.info("Marks Field is found");
		} catch (Exception e) {
			Log.error("Marks Field is not found");
			throw (e);
		}
		return element;
	}

	public static WebElement continueButtonSchool() throws Exception {
		try {
			element = driver
					.findElement(By.cssSelector("#overlay > div > div.my-auto.h-100 > div > div > div > button"));
			Log.info("continueButtonSchool Button is found");
		} catch (Exception e) {
			Log.error("continueButtonSchool is not found");
			throw (e);
		}
		return element;
	}
	public static WebElement testScoreContinueButton() throws Exception {
		try {
			element = driver
					.findElement(By.cssSelector("#overlay > div > div.my-auto.h-100 > div > div > form > div.row.d-flex.p-4.align-items-center.justify-content-center > div > button"));
			Log.info("testScoreContinueButton Button is found");
		} catch (Exception e) {
			Log.error("testScoreContinueButton is not found");
			throw (e);
		}
		return element;
	}

	public static WebElement courseCategory() throws Exception {
		try {
			element = driver.findElement(By.xpath("(//div/select[@class='custom-select form-control-emphasized'])[1]"));
			Log.info("Course Category Field is found");
		} catch (Exception e) {
			Log.error("Course Category Field is not found");
			throw (e);
		}
		return element;
	}

	public static WebElement courseGroup() throws Exception {
		try {
			element = driver.findElement(By.xpath("(//div/select[@class='custom-select form-control-emphasized'])[2]"));
			Log.info("Course Group Field is found");
		} catch (Exception e) {
			Log.error("Course Group Field is not found");
			throw (e);
		}
		return element;
	}

	public static WebElement term() throws Exception {
		try {
			element = driver.findElement(By.xpath("(//div/select[@class='custom-select form-control-emphasized'])[3]"));
			Log.info("Term Field is found");
		} catch (Exception e) {
			Log.error("Term Field is not found");
			throw (e);
		}
		return element;
	}

	public static WebElement year() throws Exception {
		try {
			element = driver.findElement(By.xpath("(//div/select[@class='custom-select form-control-emphasized'])[4]"));
			Log.info("Year Field is found");
		} catch (Exception e) {
			Log.error("Year Field is not found");
			throw (e);
		}
		return element;
	}

	public static WebElement finance() throws Exception {
		try {
			element = driver.findElement(By.xpath("(//div/select[@class='custom-select form-control-emphasized'])[5]"));
			Log.info("Source of Finance Field is found");
		} catch (Exception e) {
			Log.error("Source of Finance Field is not found");
			throw (e);
		}
		return element;
	}

	public static WebElement dreamUniversity() throws Exception {
		try {
			element = driver.findElement(By.xpath("//div/input[@class='form-control form-control-emphasized']"));
			Log.info("Dream University Field is found");
		} catch (Exception e) {
			Log.error("Dream University Field is not found");
			throw (e);
		}
		return element;
	}

	public static WebElement continueInterest() throws Exception {
		try {
			element = driver.findElement(By.cssSelector("#overlay > div > div.my-auto.h-100 > div > div > div > button"));
			Log.info("Continue Button on Interest for Undergrad page is found");
		} catch (Exception e) {
			Log.error("Continue Button on Interest for Undergrad page is not found");
			throw (e);
		}
		return element;
	}
//	public static WebElement schoolList() throws Exception {
//		try {
//			element = driver.findElement(By.xpath("//*[@id='overlay']/div/div[2]/div/div/div/div[1]/ul/li"));
//			Log.info("Continue Button on Interest for Undergrad page is found");
//		} catch (Exception e) {
//			Log.error("Continue Button on Interest for Undergrad page is not found");
//			throw (e);
//		}
//		return element;
//	}

}