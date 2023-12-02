package com.hrms.lib;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;

import com.utility.Log;

public class General extends Global {
	
//All Re-Usable functions
	public void openApplication() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sathish\\OneDrive\\Desktop\\Drivers\\chromedriver-win64\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.navigate().to(url);
		System.out.println("Application Opened");
		Reporter.log("Application opened");
		Log.info("APPLICATION OPENED");
	}
	public void closeApplication() {
		driver.close();
		System.out.println("Application Closed");
		Log.info("APPPLICATION CLOSED");
	}
	public void login() throws Exception{
		driver.findElement(By.name(txt_UserName)).sendKeys(un);
		driver.findElement(By.name(txt_Password)).sendKeys(pwd);
		driver.findElement(By.name(btn_login)).click();
		Thread.sleep(3000);
		System.out.println("Login Completed");
		Log.info("LOGIN COMPLETED");
	}
	public void logout() {	
		driver.findElement(By.linkText(link_logout)).click();
		System.out.println("Logout Completed");
		Log.info("LOGOUT COMPLETED");
	}
	public void addEmp() {
		System.out.println("Adding new employee");
		Log.info("ADD NEW EMPLOYEE");
	}
	public void delEmp() {
		System.out.println("Deleting employee");
		Log.info("DELETE EMP");
	}
	
}
