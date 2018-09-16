package com.codingRound_Asmit_GenericLibrary;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Iterator;
import java.util.Properties;
import java.util.Set;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;





public class TestBase {
	public static WebDriver driver;
	protected static Properties prop=new Properties();
	// Method to load and read the property file
				public static void readPropFile(){
					FileInputStream fis;
					try {
						fis = new FileInputStream("./Config.properties");
						
						try {
							prop.load(fis);
							
						} catch (Exception e) {
							e.printStackTrace();	
						}
					} catch (FileNotFoundException e1) {
						e1.printStackTrace();
							
					}
					
					
				}
	
	
	@BeforeSuite
	public void setup(String browser) throws IOException, InterruptedException
	{   
		TestBase.readPropFile();
		if (browser.equalsIgnoreCase("chrome"))
		{
			System.setProperty("webdriver.chrome.driver", prop.getProperty("ChromeDriverPath")); 
			ChromeOptions options = new ChromeOptions();
			options.addArguments("start-maximized");
			options.addArguments("--disable-impl-side-painting");
			options.addArguments("--disable-notifications");
			driver = new ChromeDriver(options);

		}
		else if (browser.equalsIgnoreCase("Firefox"))
		{
			Thread.sleep(1000);
			//System.setProperty("webdriver.gecko.driver", prop.getProperty("geckoDriverPath"));
			driver = new FirefoxDriver();
			driver.manage().window().maximize();
		}
		
	}
	@BeforeTest
	public void loadUrl() throws InterruptedException{
		try{
			driver.get(prop.getProperty("testURL"));	
		}catch(Exception e){
			System.out.println(e.toString());
		}
	}
	
	/*	@AfterTest
	public void closeAllWindows(){
		String homeWindow = driver.getWindowHandle();
		Set<String> allWindows = driver.getWindowHandles();

		//Use Iterator to iterate over windows
		Iterator<String> windowIterator =  allWindows.iterator();

		//Verify next window is available
		while(windowIterator.hasNext()){

			//Store the child window id
			String childWindow = windowIterator.next();

			if (homeWindow.equals(childWindow)){
				driver.switchTo().window(childWindow);
				driver.quit();
			}
		}
		
	}
*/
	
	
	
}
