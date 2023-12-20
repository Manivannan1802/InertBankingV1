package com.intertBanking.testCases;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import com.inertBanking.utilities.ReadConfig;

public class BaseClass1 {
	
	ReadConfig RC=new ReadConfig();
	
	
	public String baseURL=RC.Geturl();
	public String username=RC.Getusername();
	public String password=RC.Password();
	public static WebDriver driver;
	public static Logger logger;
	
	@BeforeClass
	public void setup() {
		System.setProperty("webdriver.chrome.driver",RC.chromepath());
		driver=new ChromeDriver();
		
		logger=Logger.getLogger("InertBankingV1");
		PropertyConfigurator.configure("log4j.properties");
		
	}
	@AfterClass
	public void tearDown() {
		
		driver.quit();
		
	}
	
	public void Screenshot() throws IOException {
		
		
		TakesScreenshot ss=(TakesScreenshot) driver;
		File SourcepathSS=ss.getScreenshotAs(OutputType.FILE);
		File Destination=new File("C:\\Users\\sanma\\eclipse-workspace\\InertBankingV1\\Screenshots");
		FileUtils.copyDirectory(SourcepathSS, Destination);		
		
	}
	

}
