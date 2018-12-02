package com;

import java.io.File;


import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;


public  class Utility_Screenshot {

	public static String captureScreenshot(WebDriver driver, String screenshotName) throws Exception {
		try {
			TakesScreenshot ts=(TakesScreenshot)driver;
			File source=ts.getScreenshotAs(OutputType.FILE);
			String dest="./Screenshots/"+screenshotName+".png";
			FileUtils.copyFile(source, new File("dest"));
			System.out.println("screenshot taken");
			return dest;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println("Exception while takingh screenshot"+ e.getMessage());
			return e.getMessage();
		}

	}
}
