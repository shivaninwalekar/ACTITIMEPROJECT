package com.ActiTime.POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	//decleration
	
	@FindBy(id="username")
	private WebElement untbx;
	
	@FindBy(name="pwd")
	private WebElement pwtbx;
	
	@FindBy(xpath="//div[.='Login ']")
	private WebElement lgtbx;
	
	
	
	//
	public LoginPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
		
	}

	
	//UTILAZATION
	
	public WebElement getUntbx() {
		return untbx;
	}

	

	public WebElement getPwtbx() {
		return pwtbx;
	}

	

	public WebElement getLgtbx() {
		return lgtbx;
	}

	

	
	
	
}
