package com.ActiTime.GenericLibrary;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class FileLibrary {
	
	/**
	 * this class is a non static
	 * @param key
	 * @return
	 * @throws IOException
	 */
	
	public String Readdatafrompropertyfile(String key) throws IOException {
		
		FileInputStream fis =  new FileInputStream("./TestData/commondata.property");
		Properties p = new Properties();
		p.load(fis);
		String value = p.getProperty(key);
		return value;
	}
		
	/**
	 * 	this method is a non static method used to read data from excel sheet
	 * @param sheetname
	 * @param row
	 * @param cell
	 * @return
	 * @throws EncryptedDocumentException
	 * @throws IOException
	 */
	
	
	public String Readdatafromexcel (String sheetname, int row, int cell) throws EncryptedDocumentException, IOException {
			
	   FileInputStream f = new FileInputStream("./TestData/ACTITIME TESTDATA.xlsx");
	   Workbook wb = WorkbookFactory.create(f);
	   String value = wb.getSheet(sheetname).getRow(cell).getCell(cell).getStringCellValue();
	   return value; 		
		
	}

}
