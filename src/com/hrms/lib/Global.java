package com.hrms.lib;

import org.openqa.selenium.WebDriver;

public class Global {
//Test data and Objects
	//Variables
	public WebDriver driver;
	public String url = "http://183.82.103.245/nareshit/index.php";
	public String un  = "nareshit";
	public String pwd = "nareshit";
	
	//Objects
	public String txt_UserName = "txtUserName";
	public String txt_Password = "txtPassword";
	public String btn_login    = "Submit";
	public String link_logout  = "Logout";
	
}
