package com.BaseLayer;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class BaseClass {
	protected static WebDriver driver;
	
	public static void initialization() {
		System.setProperty("webdriver.chrome.driver", "D:\\Java Workspace\\FacebookFramework\\AllDrivers\\chromedriver.exe");
//		System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+ "//AllDrivers//chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
		driver.manage().deleteAllCookies();
		driver.get("https://ui.cogmento.com/");
		
	}
}
