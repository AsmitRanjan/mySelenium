package com.ClearTrip_codingRound_Asmit;

import java.io.IOException;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.coadingRound_Asmit_ObjectRepositary.SignIn;
import com.codingRound_Asmit_GenericLibrary.TestBase;

public class SignInTest extends TestBase{
	@BeforeSuite
	@Parameters("browser")
	public void setup(String browser) throws IOException, InterruptedException{
		System.out.println(browser);
		super.setup(browser);		
	}
	
	@Test
	public void signIn()throws Throwable
	{
		SignIn homePageOperaton=PageFactory.initElements(driver, SignIn.class);
		homePageOperaton.homePage();	
	}
}
