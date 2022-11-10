package com.tc.orghrm.base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PreDefinedActions {
	protected static WebDriver driver;

	public final static WebDriver start(String url) {
		System.setProperty("webdriver.chrome.driver", ".//drivers/chromedriver_106.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(url);
		return driver;
		
		}
	
	public static void closeBrowser() {
		driver.close();
		System.out.println("hello");
		System.out.println("hii");
		System.out.print("abc");
		System.out.print("Hi");
		System.out.print("------");


	}
}
