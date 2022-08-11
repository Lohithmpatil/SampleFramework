package com.crm.comcast.genericutitlity;

import java.io.File;

import org.testng.ISuite;
import org.testng.ISuiteListener;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.reporters.SuiteHTMLReporter;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class ListenerImplimentation implements ITestListener,ISuiteListener{
private ExtentReports reports;
private ExtentTest test;


public void onStart(ISuite suite) {
    ExtentSparkReporter htmlReport=new ExtentSparkReporter(new File(".\\ExtentReport\\report.html"));				
    htmlReport.config().setDocumentTitle("Extent Report");
    htmlReport.config().setTheme(Theme.DARK);
    htmlReport.config().setReportName("Functional Test");
    
    
     reports=new ExtentReports();
    reports.attachReporter(htmlReport);
    reports.setSystemInfo("TestURL", "https://example.com");
    reports.setSystemInfo("Platform", "Windows 11");
    reports.setSystemInfo("Reporter Name", "Lohith m patil");

}
public void onFinish(ISuite suite) {
    public void onTestFailedButWithinSuccessPercentage1(ITestResult arg0) 
}
public void onTestStart(ITestResult result) {
	// TODO Auto-generated method stub
	ITestListener.super.onTestStart(result);
}
public void onTestSuccess(ITestResult result) {
	// TODO Auto-generated method stub
	ITestListener.super.onTestSuccess(result);
}
public void onTestFailure(ITestResult result) {
	// TODO Auto-generated method stub
	ITestListener.super.onTestFailure(result);
}
public void onTestSkipped(ITestResult result) {
	// TODO Auto-generated method stub
	ITestListener.super.onTestSkipped(result);
}
public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
	// TODO Auto-generated method stub
	ITestListener.super.onTestFailedButWithinSuccessPercentage(result);
}
public void onTestFailedWithTimeout(ITestResult result) {
	// TODO Auto-generated method stub
	ITestListener.super.onTestFailedWithTimeout(result);
}
public void onStart(ITestContext context) {
	// TODO Auto-generated method stub
	ITestListener.super.onStart(context);
}
public void onFinish(ITestContext context) {
	// TODO Auto-generated method stub
	ITestListener.super.onFinish(context);
}
@Override

	
	
}
