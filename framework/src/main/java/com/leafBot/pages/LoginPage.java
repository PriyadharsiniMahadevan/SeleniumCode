package com.leafBot.pages;

import org.openqa.selenium.WebElement;

import com.leafBot.testng.api.base.ProjectSpecificMethods;



public class LoginPage extends ProjectSpecificMethods{
	
	public LoginPage enterUsername(String data) {
	WebElement eleusername =locateElement("id", "username" );
	clearAndType(eleusername, data);
	return this;
	}

public LoginPage enterpassword(String data) {
	WebElement elepassword =locateElement("id", "password" );
	clearAndType(elepassword, data);
	return this;
	}



public HomePage clickLogin() {
	
	WebElement elesubmit =locateElement("ClassName", "decorativeSubmit" );
	click(elesubmit);
	return new HomePage();
	}

}
