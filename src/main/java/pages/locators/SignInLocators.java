package pages.locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SignInLocators {
	@FindBy(xpath="//a[@id='userAccountLink']")
	public WebElement yourTrips;
	
	@FindBy(xpath="//input[@id='email']")
	public WebElement email;
	
	@FindBy(xpath="//input[@id='password']")
	public WebElement password;
	
	@FindBy(xpath="//button[@id='signInButton']")
	public WebElement submitButton;

}
