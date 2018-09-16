package com.coadingRound_Asmit_ObjectRepositary;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

import com.codingRound_Asmit_GenericLibrary.CommonUtility;

public class SignIn extends CommonUtility{
    @FindBy(linkText="Your trips")
    private WebElement yourTrips;
    
    @FindBy(id="SignIn")
    private WebElement signIn;
    
    @FindBy(id="signInButton")
    private WebElement signInButton;
    
    @FindBy(id="email")
    private WebElement email;
    
    @FindBy(id="errors1")
    private WebElement errors;
    
    @FindBy(xpath="//a[@id='close']")
    private WebElement closePopUp;
    
    public void homePage() throws InterruptedException
    {
    	//To navigate
    	clickUsingjavaScript(yourTrips);
    	clickUsingjavaScript(signIn);
    	driver.switchTo().frame("modal_window");
    	clickUsingjavaScript(signInButton);
    	//To verify the text
    	String actualErrors = errors.getText();
    	Assert.assertTrue(actualErrors.contains("There were errors in your submission"));
    	driver.switchTo().defaultContent();
    	Thread.sleep(2000);
    	clickUsingjavaScript(closePopUp);
    	
    }
}
