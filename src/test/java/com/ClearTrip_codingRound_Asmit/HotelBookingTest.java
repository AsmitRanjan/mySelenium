package com.ClearTrip_codingRound_Asmit;

import java.io.IOException;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.coadingRound_Asmit_ObjectRepositary.HotelBooking;
import com.codingRound_Asmit_GenericLibrary.TestBase;

public class HotelBookingTest extends TestBase{
	
	/*@BeforeSuite
	@Parameters("browser")
	public void setup(String browser) throws IOException, InterruptedException{
		System.out.println(browser);
		super.setup(browser);		
	}*/
	
	@Test
	public void hotelBooking() {
		HotelBooking hotelBookinOperaton=PageFactory.initElements(driver, HotelBooking.class);
		hotelBookinOperaton.hotelBookingPage();
	}
}
