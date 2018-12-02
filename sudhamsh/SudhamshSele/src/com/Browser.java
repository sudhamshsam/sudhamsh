/**
 * 
 */

package com;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

/**
 * Browser types
 *
 */
public class Browser {
	static WebDriver driver;

	public  static  WebDriver startBrowser(String browsername, String url) {
		if(browsername.equalsIgnoreCase("chrome"))
		{
			System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"/Drivers/chromedriver_win32/chromedriver.exe");
			driver= new ChromeDriver();
			driver.manage().deleteAllCookies();
			driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		}
		else if(browsername.equalsIgnoreCase("ie"))
		{
			System.setProperty("webdriver.ie.driver","");
			driver= new InternetExplorerDriver();
			driver.manage().deleteAllCookies();
		}
		else if(browsername.equalsIgnoreCase("firefox"))
		{
			System.setProperty("webdriver.gecko.driver","");
			driver= new FirefoxDriver();
			driver.manage().deleteAllCookies();
		}
		driver.manage().window().maximize();
		driver.get(url);
		return driver;

	}
}

