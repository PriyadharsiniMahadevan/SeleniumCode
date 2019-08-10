package com.leafBot.pages;

import org.openqa.selenium.WebElement;

import com.leafBot.testng.api.base.ProjectSpecificMethods;


public class HomePage extends ProjectSpecificMethods{ 

	public LoginPage clickLogout() {
		WebElement elelogout =locateElement("ClassName", "decorativeSubmit" );
		click(elelogout);
		return new LoginPage();
	}
}



