package com.pages.flipcart;

import java.io.IOException;

import org.testng.annotations.Test;

import com.generic.flipkart.BaseTest;
import com.pages.flipkart.POMflipkartloginpage;

public class TestFlipkartLogin extends BaseTest

{
	
	@Test
	public void length() throws IOException, InterruptedException
	{
		POMflipkartloginpage login=new POMflipkartloginpage(driver);
		login.loginmethod();
	}
	
}
