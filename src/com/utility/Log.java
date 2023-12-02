package com.utility;

import org.testng.log4testng.Logger;

public class Log {
//Initialize Log4j logs
//	private static Logger Log = Logger.getLogger(Log.class.getTypeName());
	//Need to create these methods, so that they can be called
	public static void info(String message) {
		Log.info(message);
	}
public static void error(String message) {	
	Log.error(message);
}
}
