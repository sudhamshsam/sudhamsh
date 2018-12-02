package com;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Explicit_wait {

	WebDriver driver;

	public Explicit_wait(WebDriver driver) 
	{
		this.driver=driver;
	}



	public  WebElement getWhenVisible(By locator, int timeout)
	{

		WebElement element = null;

		WebDriverWait wait = new WebDriverWait(driver, timeout);

		element = wait.until(ExpectedConditions.visibilityOfElementLocated(locator));

		return element;

	}
	public  void clickWhenReady(By locator, int timeout) 
	{

		WebElement element = null;

		WebDriverWait wait = new WebDriverWait(driver, timeout);

		element = wait.until(ExpectedConditions.elementToBeClickable(locator));


		element.click();

	}

	public void waitForElementClickable(By element){
		new WebDriverWait(driver,90).until(ExpectedConditions.elementToBeClickable(element));
	}

}
