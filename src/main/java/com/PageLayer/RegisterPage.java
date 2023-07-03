package com.PageLayer;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.BaseLayer.BaseClass;
import com.utilsLayer.HandleDropDown;
import com.utilsLayer.RegisterUtilsClass;

public class RegisterPage extends BaseClass{
	
	public void enterFirstName(String firstname) {
		WebElement fname = driver.findElement(By.name("firstname"));
		RegisterUtilsClass.checkStatusAndEnterValue(fname, firstname);
	}

	public void enterLastName(String lastname) {
		WebElement lname = driver.findElement(By.name("lastname"));
		RegisterUtilsClass.checkStatusAndEnterValue(lname, lastname);
	}

	public void enterUsername(String uname) {
		WebElement username = driver.findElement(By.name("reg_email__"));
		RegisterUtilsClass.checkStatusAndEnterValue(username, uname);
	}

	public void enterPassword(String pass) {
		WebElement password = driver.findElement(By.name("reg_passwd__"));
		RegisterUtilsClass.checkStatusAndEnterValue(password, pass);
	}

	public String selectDate(String date) {
		WebElement day = driver.findElement(By.id("day"));
		HandleDropDown.selectValueUsingVisibleText(day, date);
		return HandleDropDown.checkSelectedValue(day);
	}

	public String selectMonth(String Months) {
		WebElement month = driver.findElement(By.id("month"));
		HandleDropDown.selectValueUsingVisibleText(month, Months);
		return HandleDropDown.checkSelectedValue(month);
	}

	public String selectYear(String Years) {
		WebElement year = driver.findElement(By.id("year"));
		HandleDropDown.selectValueUsingVisibleText(year, Years);
		return HandleDropDown.checkSelectedValue(year);
	}
}
