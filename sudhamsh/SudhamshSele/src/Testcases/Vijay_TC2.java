package Testcases;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import com.Browser;
import com.CommonMethods;
import com.Explicit_wait;

public class Vijay_TC2 {

	
	public Vijay_TC2()
	{
		WebDriver driver;


		//Opening the browser
		driver=Browser.startBrowser("chrome", "https://medfile.co/lab");
		Explicit_wait explicit_Wait=new Explicit_wait(driver);
		CommonMethods commonMethods= new CommonMethods(driver);
 
		
		
	}

	public static void main(String[] args) {
		Vijay_TC2 tc=new Vijay_TC2();
		
		
	}
	
}