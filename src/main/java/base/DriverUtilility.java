package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;

public class DriverUtilility {

	public static WebDriver driver;
	public static WebDriverWait wait;
	public static String browser;
	public static String url;

	public static void init_browser() {
		if (browser.equalsIgnoreCase("chrome")) {
			String chromePath = "codingRound//src//test//java//resources//executables//chromedriver";
			System.setProperty("webdriver.chrome.driver", chromePath);
			driver = new ChromeDriver();
		} else {
			Reporter.log("Webdriver Driver not defined");
		}

	}
	
	public static void openUrl(String Url){
		driver.get(Url);
		Reporter.log("Url opened in browser window");
	}
	
	public static void quitBrowser(){
		driver.quit();
		Reporter.log("Browser windows quit successfully");
	}
	

	
}
