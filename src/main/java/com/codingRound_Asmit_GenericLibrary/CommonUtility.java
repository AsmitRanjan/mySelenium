package com.codingRound_Asmit_GenericLibrary;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class CommonUtility extends TestBase{
    
	public static void clickUsingjavaScript(WebElement we){
		try{

			if (we.isEnabled()){
				JavascriptExecutor executor = (JavascriptExecutor)driver;
				executor.executeScript("arguments[0].click();", we);
				
			}else{
				System.out.println("Element is not Enabled");
			}

		}catch(Exception e){
			System.out.println(e.toString());
		}		
	}
	
	public static void selectDropDownVisibleText(WebElement dropDownXpath, String visibleText) {
		new Select(dropDownXpath).selectByVisibleText(visibleText);
		
	}
}
