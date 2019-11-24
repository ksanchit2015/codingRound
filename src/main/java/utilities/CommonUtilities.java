package utilities;

import org.openqa.selenium.WebElement;
import org.testng.Reporter;

public class CommonUtilities {
	public static void webElementClick(WebElement element){
		element.click();
		Reporter.log("Clicking on an Element : "+element);
	}
	
	public static void webElementTypeValue(WebElement element, String value){
		element.sendKeys(value);
	}

}
