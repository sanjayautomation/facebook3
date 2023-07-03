package com.TestLayer;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.BaseLayer.BaseClass;

public class Demo1 extends BaseClass {
	@BeforeTest
	public void setup() {
		BaseClass.initialization();
	}
	@Test(priority = 1)
	public void login() throws InterruptedException {
		driver.findElement(By.name("email")).sendKeys("prafulp1010@gmail.com");
		driver.findElement(By.name("password")).sendKeys("Pr@ful0812");
		driver.findElement(By.xpath("//div[text()='Login']")).click();
		
	}
	@Test (priority = 2)
	public void validateTitle() throws InterruptedException {
		Thread.sleep(3000);
		Assert.assertEquals(true, driver.getTitle().contains("CRM"));
	}
	
	@Test (priority = 3)
	public void validateUrl() throws InterruptedException {
	
		Assert.assertEquals(true, driver.getCurrentUrl().contains("cogmetro"));
	}
	@AfterTest
	public void teardown() {
		driver.close();
	}
}
