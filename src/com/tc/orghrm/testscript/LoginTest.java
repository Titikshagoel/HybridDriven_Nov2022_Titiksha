package com.tc.orghrm.testscript;


import org.testng.Assert;
import org.testng.annotations.Test;
import com.tc.orghrm.base.PreDefinedActions;
import com.tc.orghrm.pages.loginPages;

public class LoginTest {
	
	
	@Test
	public void tc1() {
		System.out.println("STEP-Launch Chrome Browser And Hit URL");
		PreDefinedActions.start("https://tgoel-trials77.orangehrmlive.com/");
		
		System.out.println("STEP-Enter Your login Credentials");
		loginPages loginpage=new loginPages();
		loginpage.login("Admin","yWzm@X0X6V");
	 
		System.out.println("VERIFY - home page is displayed");
		String actualTitle=loginPages.getPageTitle();
		String expectectedTitle="Employee Management";
		Assert.assertEquals(actualTitle,expectectedTitle,"Expected title was"+expectectedTitle +"but actual title is"+ actualTitle);//overloaded function
		
		PreDefinedActions.closeBrowser();
}
}
