package com.sapient.product1;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Application {
	
	static final Logger logger = LoggerFactory.getLogger(Application.class);
	
	public static void main(String[] args) {
//		Logger.trace("this is a trace message");
		logger.debug("this is a debug method");
		logger.info("this is a info method");
		logger.warn("this is a warning method");
		logger.error("this is a error method");
	}
}
