package com.leafBot.testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.leafBot.pages.LoginPage;
import com.leafBot.testng.api.base.ProjectSpecificMethods;





public class TC001_Login extends ProjectSpecificMethods { 
	@BeforeTest
	public void setData() {
		excelFileName="TC001";
		testcaseName= "TC001_Login Page";
		 testcaseDec="Login Page";
		 author="Priya";
		 category="Smoke";
		//test
	}
	@Test(dataProvider="fetchData")
	public void runLogin(String username, String password) {
		
		new LoginPage()
		.enterUsername(username)
		.enterpassword(password)
		.clickLogin()
		.clickLogout();
		
}
}