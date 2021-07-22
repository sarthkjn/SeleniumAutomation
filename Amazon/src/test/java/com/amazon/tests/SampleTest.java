package test.java.com.amazon.tests;

import org.testng.annotations.Test;

import main.java.com.amazon.pageEvents.HomePage;
import main.java.com.amazon.pageEvents.LoginPage;

public class SampleTest extends BaseTest{
	@Test
	public void sampleMethod1()
	{
		HomePage homePage = new HomePage();
		homePage.clickOnSignInButton();
		
		LoginPage loginPage = new LoginPage();
		loginPage.verifyLoginPageOpenedOrNot();
		loginPage.enterEmailId();
		
	}

}
