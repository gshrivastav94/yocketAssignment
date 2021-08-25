Steps to Run the Automation Project:

1.Clone the Project using the link:
 https://github.com/gshrivastav94/yocket-assignment
 
2. Add the attached jars to the following path:
 Right Click on the project in Eclipse >> Properties >>Java Build Path>> Libraries >> Add External jars >> Apply and Close.
 
3.Make Sure TestNG is installed in Eclipse. Follow the below link to install it:
https://www.lambdatest.com/blog/how-to-install-testng-in-eclipse-step-by-step-guide/

4.Under the project go to testng.xml and add the class as follows:
	<!DOCTYPE suite SYSTEM "https://testng.org/testng-1.0.dtd">
<suite name="Suite">
  <test thread-count="5" name="Yocket Web Page">
      <classes>
      <class name="testCases.Validate_SignUp"/>
      <class name="testCases.Validate_Login"/>
      <class name="testCases.Validate_HarvardUniversity"/>
    </classes>
  </test> <!-- Test -->
</suite> <!-- Suite -->

5.To run the Project:
Run >> Run As >> TestNG Suite.


Please Note: A 60 seconds wait is added to verify the captcha Manually, for live projects captcha is disabled in Test environment
