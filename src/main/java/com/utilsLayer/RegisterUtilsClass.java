package com.utilsLayer;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;

import com.BaseLayer.BaseClass;

public class RegisterUtilsClass extends BaseClass {

	public static void checkStatusAndEnterValue(WebElement wb, String value) {
		if ((wb.isDisplayed()) && (wb.isEnabled())) {
			wb.sendKeys(value);
		}
	}

	public static void takeScreenshot(String name) throws IOException {

		File f = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);

		File dist = new File(System.getProperty("user.dir")+"\\PassScreenshot\\"+name+".png");

		FileUtils.copyFile(f, dist);

	}
}
