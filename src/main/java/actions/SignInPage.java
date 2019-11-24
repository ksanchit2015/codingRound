package actions;

import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

import base.DriverUtilility;
import bsh.org.objectweb.asm.Type;
import pages.locators.SignInLocators;
import utilities.CommonUtilities;

public class SignInPage extends DriverUtilility{
	
	
	public SignInLocators signInLocator;
	public CommonUtilities commonUtil;

	public SignInPage(){
		this.signInLocator = new SignInLocators();
		AjaxElementLocatorFactory factory = new AjaxElementLocatorFactory(driver,10);
		PageFactory.initElements(driver, this.signInLocator);
		
	}
	
	public void doLogin(String username, String password){
		commonUtil.webElementClick(signInLocator.yourTrips);
		commonUtil.webElementTypeValue(signInLocator.email, username);
		commonUtil.webElementTypeValue(signInLocator.password, password);
		commonUtil.webElementClick(signInLocator.submitButton);
	}
}
