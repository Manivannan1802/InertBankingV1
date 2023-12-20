package com.inertBanking.utilities;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.WebDriver;
import org.testng.ITestContext;
import org.testng.ITestResult;
import org.testng.TestListenerAdapter;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.Markup;
import com.aventstack.extentreports.markuputils.MarkupHelper;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class Reporting extends TestListenerAdapter {

   public ExtentHtmlReporter htmlreporter;
   public ExtentReports extent;
   public ExtentTest logger;
   
   public void OnStart(ITestContext testcontext ) {
	   
	  String dateFormat=new SimpleDateFormat("yyyy.MM.DD.hh.mm.ss").format(new Date());
	  String ReportName="Test-report"+dateFormat+".html";
	  
	  htmlreporter=new ExtentHtmlReporter(System.getProperty("user.dir")+"/test-output"+ ReportName);
	  			  
	  htmlreporter.loadConfig(System.getProperty("user.dir")+"/extent-config.xml");
	  htmlreporter.config().setDocumentTitle("Automation test");
	  htmlreporter.config().setReportName("Functional testing");
	  
	  extent=new ExtentReports();
	  extent.attachReporter(htmlreporter);
	  extent.setSystemInfo("Tester", "Manivannan");
	  
	  
	  
	  
	  
	  }
	  
	  
	  
	   
	   
   
   
   
   
}