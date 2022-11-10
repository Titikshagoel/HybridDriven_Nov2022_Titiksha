package com.tc.orghrm.base;

import org.openqa.selenium.WebDriver;

public class Conflict_Practise {
	protected static WebDriver driver;
	public static void closeBrowser() {
		driver.close();
		System.out.print("--------------");
}
}