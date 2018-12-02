package com;

import java.awt.Dimension;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import javax.imageio.ImageIO;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;


public class CommonMethods {

	WebDriver driver;
	Explicit_wait explicit_wait;


	public CommonMethods(WebDriver driver) {
		this.driver=driver;
		explicit_wait = new Explicit_wait(driver);
	}



	/*Text box control*/

	public  void enterText(By element, String value) throws InterruptedException
	{

		explicit_wait.waitForElementClickable(element);
		driver.findElement(element).clear();
		driver.findElement(element).sendKeys(value);


	}


	public void selectDropdown(By element, String value) throws InterruptedException {

		explicit_wait.waitForElementClickable(element);
		Select select= new Select (driver.findElement(element));
		select.selectByVisibleText(value);


	}
	public void clickBtn(By element) throws InterruptedException {
		explicit_wait.waitForElementClickable(element);
		driver.findElement(element).click();

	}

	public void selectDropdownByIndex(By element, int index) throws InterruptedException {

		explicit_wait.waitForElementClickable(element);
		Select select= new Select (driver.findElement(element));
		select.selectByIndex(index);

	}

	public  void enterTextLoad(By element, String value) throws InterruptedException
	{

		explicit_wait.waitForElementClickable(element);
		driver.findElement(element).clear();
		driver.findElement(element).sendKeys(value);
		waitTillPageLoad();

	}


	public void selectDropdownLoad(By element, String value) throws InterruptedException {

		explicit_wait.waitForElementClickable(element);
		Select select= new Select (driver.findElement(element));
		select.selectByVisibleText(value);
		waitTillPageLoad();

	}

	public void country_SelectDropdownLoad(By element, String value) throws InterruptedException {

		explicit_wait.waitForElementClickable(element);
		Select select= new Select (driver.findElement(element));
		select.selectByVisibleText(value);
		int i=0;
		do {
			if(i>30)
				break;
			Thread.sleep(6000);
			i++;
		}while(driver.findElement(CommonElements.loadingIcon).getAttribute("title").equalsIgnoreCase("Busy"));

	}
	public void clickBtnLoad(By element) throws InterruptedException {
		explicit_wait.waitForElementClickable(element);
		driver.findElement(element).click();
		waitTillPageLoad();
	}

	public void selectDropdownByIndexLoad(By element, int index) throws InterruptedException {

		explicit_wait.waitForElementClickable(element);
		Select select= new Select (driver.findElement(element));
		select.selectByIndex(index);
		waitTillPageLoad();
	}

	public void waitTillPageLoad() throws InterruptedException {
		int i=0;
		do {
			if(i>60)
				break;
			Thread.sleep(2000);
			i++;
		}while(driver.findElement(CommonElements.loadingIcon).getAttribute("title").equalsIgnoreCase("Busy"));
	}

	public void policy_WaitTillPageLoad() throws InterruptedException {
		int i=0;
		do {
			if(i>90)
				break;
			Thread.sleep(2000);
			i++;
		}while(driver.findElement(CommonElements.policy_LoadingIcon).getAttribute("title").equalsIgnoreCase("Busy"));
	}
	public static String takeScreenshot(){

		String scrPath = System.getProperty("user.dir")+"/Screenshots/Screenshot_"+System.currentTimeMillis()+".jpg";

		try {
			Robot robot = new Robot();
			Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
			Rectangle rec = new Rectangle(dim);
			BufferedImage image = robot.createScreenCapture(rec);
			ImageIO.write(image, "jpg", new File(scrPath));
			return scrPath;

		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}



	}

	public static String getProperty(String key){

		String path = "./src/com/OIM/Testcases/config.properties";
		String value = null;
		try {
			FileInputStream fis = new FileInputStream(path);
			Properties prop = new Properties();
			prop.load(fis);
			value = prop.getProperty(key);
		} catch (IOException e) {
			e.printStackTrace();
		}

		return value;
	}

	public boolean isElementPresent(By by) {
		try {
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			driver.findElement(by);
			return true;
		} catch (NoSuchElementException e) {
			return false;
		}
	}


}
