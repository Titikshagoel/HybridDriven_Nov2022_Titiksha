package com.tc.orghrm.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.tc.orghrm.base.PreDefinedActions;

public class loginPages extends PreDefinedActions {
	public void login(String username,String password) {
		enterUserName(username);
		enterPassword(password);
		clickOnLoginButton();
	}
		
		
		
	public void enterUserName(String username) {
		driver.findElement(By.xpath("//input[@id='txtUsername']")).sendKeys("username");
	}
	public void enterPassword(String password) {
		driver.findElement(By.xpath("//input[@id='txtPassword']")).sendKeys("password");
	}
	public void clickOnLoginButton() {
		driver.findElement(By.xpath("//button[@type='submit']")).click();
	}
	public boolean isUsernameErrorMessage() {
		WebElement usernameErrorMessage=driver.findElement(By.cssSelector("#txtUsername-error"));
		return usernameErrorMessage.isDisplayed();
	}
	public boolean isPasswordErrorMessage() {
		WebElement passwordErrorMessage=driver.findElement(By.cssSelector("#txtPassword-error"));
		return passwordErrorMessage.isDisplayed();
	}
	public boolean isLogoDisplayed() {
		return driver.findElement(By.cssSelector("div.organization-logo.shadow>img")).isDisplayed();
	}
	public static String getPageTitle() {
		return driver.getTitle();
	}
}
