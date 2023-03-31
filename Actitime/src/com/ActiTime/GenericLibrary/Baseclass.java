package com.ActiTime.GenericLibrary;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

import com.ActiTime.POM.LoginPage;

public class Baseclass {
	
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	
	public static WebDriver driver;
	FileLibrary f = new FileLibrary();
	
	@BeforeSuite
	public void databaseconnected() {
		Reporter.log("database is connected",true);
	}
	
	@AfterSuite
	public void databasedisconnected () {
		Reporter.log("database is disconnected",true);
		
		
	}

	@BeforeClass
	public void launchbrowser() throws IOException {
		ChromeOptions option = new ChromeOptions();
		option.addArguments("--remote-allow-origins=*");
	 driver =  new ChromeDriver(option);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		String url = f.Readdatafrompropertyfile("URL");
		driver.get(url);
		Reporter.log("browser is launched",true);
		
	}
	@AfterClass
	public void closebrowser() {
		driver.close();
		Reporter.log("browser is closed",true);
	}
	@BeforeMethod
	public void login() throws IOException {
		String un = f.Readdatafrompropertyfile("username");
		String pd = f.Readdatafrompropertyfile("pwd");
		
		//driver.findElement(By.id("username")).sendKeys(un);
		//driver.findElement(By.id("pwd")).sendKeys(pd);
		//driver.findElement(By.xpath("//div[.='Login ']")).click();
		
		LoginPage lp = new LoginPage(driver);
		lp.getUntbx().sendKeys(un);
		lp.getPwtbx().sendKeys(pd);
		lp.getLgtbx().click();
		Reporter.log("logged in successfully",true);
		
	}
	@AfterMethod
	public void logout() {
		driver.findElement(By.id("logoutLink")).click();
		Reporter.log("logged out",true);
		
	}
	
	
	
	
}
