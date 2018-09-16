package com.coadingRound_Asmit_ObjectRepositary;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.codingRound_Asmit_GenericLibrary.CommonUtility;

public class HotelBooking extends CommonUtility{
	@FindBy(linkText = "Hotels")
    private WebElement hotelLink;
	
	@FindBy(id = "Tags")
    private WebElement localityTextBox;

    @FindBy(id = "SearchHotelsButton")
    private WebElement searchButton;

    @FindBy(id = "travellersOnhome")
    private WebElement travellerSelection;
    
    public void hotelBookingPage() {
    	clickUsingjavaScript(hotelLink);
    	localityTextBox.sendKeys(prop.getProperty("City"));
    	selectDropDownVisibleText(travellerSelection, prop.getProperty("Travellers_DD_Option"));
    	clickUsingjavaScript(searchButton);
    }
}
