package com.ActiTime.POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TASKPAGE {
	
	//DECLARATION
	@FindBy(xpath="//div[.='Add New']")
	private WebElement addnewbutton;
	
	@FindBy (xpath="//div[.='+ New Customer']")
	private WebElement newcustomer;
	
	@FindBy(xpath="(//input[@placeholder='Enter Customer Name'])[2]")
	private WebElement custname;
	
	@FindBy (xpath="//textarea[@placeholder='Enter Customer Description']")
	private WebElement custdescription;
	
	@FindBy(xpath="//div[.='Create Customer']")
	private WebElement createcustbutton;
	
	
	//INIT
	public TASKPAGE(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}


	

	//UTILIZATION
	
	public WebElement getAddnewbutton() {
		return addnewbutton;
	}


	public WebElement getNewcustomer() {
		return newcustomer;
	}


	public WebElement getCustname() {
		return custname;
	}


	public WebElement getCustdescription() {
		return custdescription;
	}


	public WebElement getCreatecustbutton() {
		return createcustbutton;
	}
	
	
	
}
