package com.generic.flipkart;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelLibrary implements Autoconstants {
	public static String getcellvalue(String path,String sheet,int row,int cell) throws IOException 
	  {
		  FileInputStream fis=new FileInputStream(excelpath);
		  XSSFWorkbook wb=new XSSFWorkbook(fis);
		  String cellvalue=wb.getSheet(sheet).getRow(row).getCell(cell).getStringCellValue();
		  return cellvalue;

	  }
}
