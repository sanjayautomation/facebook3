package com.utilsLayer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.BaseLayer.BaseClass;

public class HandleDropDown extends BaseClass{
	public static void selectValueUsingVisibleText(WebElement wb, String value) {
		new Select(wb).selectByVisibleText(value);
	}

	public static String checkSelectedValue(WebElement wb) {
		return new Select(wb).getFirstSelectedOption().getText();

	}
}
