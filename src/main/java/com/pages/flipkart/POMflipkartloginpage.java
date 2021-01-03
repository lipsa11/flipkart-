package com.pages.flipkart;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.generic.flipkart.Autoconstants;
import com.generic.flipkart.ExcelLibrary;

public class POMflipkartloginpage implements Autoconstants
{
	@FindBy(xpath="(//input[@type='text'])[2]")
	private WebElement EnterEmailTextfield;
	
	@FindBy(xpath="//input[@type='password']")
	private WebElement EnterpasswardTextfield;
	
	@FindBy(xpath="(//button[@type='submit'])[2]")
	private WebElement loginbutton;
	
	@FindBy(xpath="//input[@type='text']")
	private WebElement searchproduct;
	
	public POMflipkartloginpage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	public void loginmethod() throws IOException, InterruptedException
	{
		EnterEmailTextfield.sendKeys(ExcelLibrary.getcellvalue(excelpath, sheetname, 1, 0));
		EnterpasswardTextfield.sendKeys(ExcelLibrary.getcellvalue(excelpath, sheetname, 1, 1));
		loginbutton.click();
		Thread.sleep(2000);
	searchproduct.sendKeys(ExcelLibrary.getcellvalue(excelpath, sheetname, 1, 2));
		//searchproduct.sendKeys("iphone");
	}
	

}
