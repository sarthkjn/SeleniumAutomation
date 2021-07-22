package main.java.com.amazon.pageEvents;

import org.testng.Assert;

import main.java.com.amazon.pageObjects.LoginPageElements;
import main.java.com.amazon.utils.ElementFetch;

public class LoginPage {
	public void verifyLoginPageOpenedOrNot()
	{
		ElementFetch elementFetch = new ElementFetch();
		Assert.assertTrue(elementFetch.getListWebElements("XPATH", LoginPageElements.loginText).size()>0, "Login page did not open");
		
		
	}
	
	public void enterEmailId()
	{
		ElementFetch elementFetch = new ElementFetch();
		elementFetch.getWebElement("ID", LoginPageElements.emailAddress).sendKeys("sarthakjain505@gmail.com");
		
		
	}

}
