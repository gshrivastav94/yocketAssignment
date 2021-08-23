package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import utility.Log;

public class Login extends BaseClass {
	private static WebElement element = null;

	public Login(WebDriver driver) {
		super(driver);
	}
	
//Locators for the elaments on Login Page
public static WebElement login() throws Exception{
    try{ 
    	 element = driver.findElement(By.linkText("LOGIN"));
         Log.info("Login Button is found");
    }catch (Exception e){
   		Log.error("Login Button is not found");
   		throw(e);
   		}
   	return element;
}
public static WebElement email() throws Exception{
    try{ 
    	 element = driver.findElement(By.name("email"));
         Log.info("Email Field is found");
    }catch (Exception e){
   		Log.error("Email is not found");
   		throw(e);
   		}
   	return element;
}
public static WebElement continueLogin() throws Exception{
    try{ 
    	 element = driver.findElement(By.xpath("//div/button[@class='btn btn-primary btn-block  text-uppercase']"));
         Log.info("Continue Button is found");
    }catch (Exception e){
   		Log.error("Continue Button is not found");
   		throw(e);
   		}
   	return element;
}
public static WebElement passwordLogin() throws Exception{
    try{ 
    	 element = driver.findElement(By.name("password"));
         Log.info("Password Field is found");
    }catch (Exception e){
   		Log.error("Password Field is not found");
   		throw(e);
   		}
   	return element;
}
public static WebElement loginButton() throws Exception{
    try{ 
    	 element = driver.findElement(By.cssSelector("#overlay > div > div.col-md-6.p-0.d-flex.align-items-center.justify-content-center.h-100 > div > div:nth-child(4) > form > div:nth-child(3) > button"));
         Log.info("Login Button is found");
    }catch (Exception e){
   		Log.error("Login Btton is not found");
   		throw(e);
   		}
   	return element;
}

}
