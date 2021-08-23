package appModules;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import pageObjects.BaseClass;
import pageObjects.SignUp;
import utility.Log;

public class SignUp_Action extends BaseClass{
    public SignUp_Action(WebDriver driver){
    	super(driver);
} 
    public static void Execute() throws Exception{
    	
    	//Launching the web url
    	driver.get("https://www.yocket.in/");
    	try {
    		//Entering the Details on the SignUp Page
    		SignUp.signup().click();
    		Log.info("Clicked on Sign Up Link");
    		
    		Thread.sleep(5000);
    		SignUp.email().click();
    		SignUp.email().sendKeys("xy9@gmail.com");
    		Log.info("Entered the User Email");
    		
    		SignUp.continueSignUp().click();
    		Log.info("Clicked on Continue Button");
    		
    		SignUp.firstName().sendKeys("TestUser");
    		Log.info("Entered First Name");
    		
    		SignUp.lastName().sendKeys("TestSurname");
    		Log.info("Entered Last Name");
    		
    		SignUp.phone().sendKeys("2924523785");
    		Log.info("Entered the Phone number");
    		
    		SignUp.password().sendKeys("TestPwd");
    		Log.info("Entered the password");
    		
    		//This wait is used to Manually verify the captcha,in Live Project it can be disabled for test environment
    		Thread.sleep(60000);

    		
    		SignUp.signUpButton().click();
    		Log.info("Clicked on Sign Up Button");
    		
    		SignUp.student().click();
    		Log.info("Selected I am a Student");
    		
    		SignUp.undergrad().click();
    		Log.info("Selected Undergrad Profile");
    		
    		//Selecting the School name using list
    		SignUp.schoolName().click();
    		SignUp.schoolName().sendKeys("Mumbai University, Mumbai");
    		List<WebElement> a = driver.findElements(By.xpath("//*[@id='overlay']/div/div[2]/div/div/div/div[1]/ul/li"));
    		for(WebElement list:a)
    		{
    			if (list.getText().equalsIgnoreCase("Mumbai University, Mumbai")) {
    				list.click();
    				System.out.println("School Name found");
    				break;
    			}
    		}
    		
    		//Thread.sleep(2000);
    		Log.info("Entered the School Name");
    		
    		SignUp.board().click();
    		//Using the Select class to select values from dropdown
    		Select se1 = new Select(driver.findElement(By.xpath("(//div/select[@class='custom-select form-control-emphasized'])[1]")));
    		se1.selectByValue("Other");
    		Log.info("Board selected");
    		
    		SignUp.grade().click();
    		Select se2 = new Select(driver.findElement(By.xpath("(//div/select[@class='custom-select form-control-emphasized'])[2]")));
    		se2.selectByIndex(2);
    		Log.info("Grade Selected");
    		
    		SignUp.marks().click();
    		Select se3 = new Select(driver.findElement(By.xpath("(//div/select[@class='custom-select form-control-emphasized'])[3]")));
    		se3.selectByIndex(2);
    		Log.info("Marks Selected");
    		SignUp.continueButtonSchool().click();
    		Log.info("Clicked on Continue Button on School Details page");
    		Thread.sleep(1000);
    		SignUp.testScoreContinueButton().click();
    		Log.info("CLicked on Continue Button on Test Score Page");
    		
    		SignUp.courseCategory().click();
    		Select se4  = new Select(driver.findElement(By.xpath("(//div/select[@class='custom-select form-control-emphasized'])[1]")));
    		se4.selectByIndex(1);
    		Log.info("Selected Course Category");
    		
    		SignUp.courseGroup().click();
    		Select se5 = new Select(driver.findElement(By.xpath("(//div/select[@class='custom-select form-control-emphasized'])[2]")));
    		se5.selectByIndex(2);
    		Log.info("Selected Course Group");
    		
    		SignUp.term().click();
    		Select se6 = new Select(driver.findElement(By.xpath("(//div/select[@class='custom-select form-control-emphasized'])[3]")));
    		se6.selectByIndex(1);
    		Log.info("Selected Term");
    		
    		SignUp.year().click();
    		Select se7 = new Select(driver.findElement(By.xpath("(//div/select[@class='custom-select form-control-emphasized'])[4]")));
    		se7.selectByIndex(2);
    		Log.info("Selected Year");
    		
    		SignUp.finance().click();
    		Select se8 = new Select(driver.findElement(By.xpath("(//div/select[@class='custom-select form-control-emphasized'])[5]")));
    		se8.selectByIndex(1);
    		Log.info("Selected Source of Finance");
    		
    		SignUp.dreamUniversity().click(); 		
    		SignUp.dreamUniversity().sendKeys("Harvard University");
    		List<WebElement> b = driver.findElements(By.xpath("//*[@id='overlay']/div/div[2]/div/div/div/div[5]/ul/li"));
    		for(WebElement list:b)
    		{
    			if (list.getText().equalsIgnoreCase("Harvard University")) {
    				list.click();
    				System.out.println("Dream University found");
    				break;
    			}
    		}
    		Log.info("Dream University Selected");
    		
    		boolean print = SignUp.continueInterest().isEnabled();
    		System.out.println(print);
    		
    	}catch (Exception e) {
    		Log.error("Please Enter a valid input");
			throw (e);
		}
  	}
}
