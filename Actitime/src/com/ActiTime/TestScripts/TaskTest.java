package com.ActiTime.TestScripts;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.Test;

import com.ActiTime.GenericLibrary.Baseclass;
import com.ActiTime.GenericLibrary.FileLibrary;
import com.ActiTime.POM.HOMEPAGE;
import com.ActiTime.POM.TASKPAGE;

public class TaskTest extends Baseclass {
	
	@Test
	public void createcustomer() throws EncryptedDocumentException, IOException {
		HOMEPAGE hp = new HOMEPAGE(driver); 
		hp.getTasklink().click();
		
		TASKPAGE tp =  new TASKPAGE(driver);
		tp.getAddnewbutton().click();
		tp.getNewcustomer().click();
		FileLibrary f=new FileLibrary();
		String name = f.Readdatafromexcel("Sheet1", 4, 1);//to get name of customer
		tp.getCustname().sendKeys(name);
		String description = f.Readdatafromexcel("Sheet1", 4, 2); //to get customer description
		tp.getCustdescription().sendKeys(description);
		tp.getCreatecustbutton().click();
		

}
}
