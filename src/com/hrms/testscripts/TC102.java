package com.hrms.testscripts;
import org.apache.log4j.xml.DOMConfigurator;
import org.testng.annotations.Test;

import com.hrms.lib.General;
//Remove main method and in place of main method we can write any other method and add @Test to invoke testNG

public class TC102 {
	@Test
	public void tc102() throws Exception{
//public static void main(String[] args) throws Exception{
	//Test case steps
		DOMConfigurator.configure("log4j.xml");
	General obj = new General();
	obj.openApplication();
	obj.login();
	obj.addEmp();
	obj.delEmp();
	obj.logout();
	obj.closeApplication();
}
}
