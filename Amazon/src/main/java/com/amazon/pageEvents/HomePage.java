package main.java.com.amazon.pageEvents;

import main.java.com.amazon.pageObjects.HomePageElements;
import main.java.com.amazon.utils.ElementFetch;

public class HomePage {
	public void clickOnSignInButton()
	{
		ElementFetch elementFetch = new ElementFetch();
		elementFetch.getWebElement("XPATH", HomePageElements.signInButton).click();
	}

}
