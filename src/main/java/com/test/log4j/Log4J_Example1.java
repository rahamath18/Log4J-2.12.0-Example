package com.test.log4j;

import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;
 

public class Log4J_Example1 {
	
	private static final Logger logger = LogManager.getLogger(Log4J_Example1.class);

	public static void main(String[] args) {

		logger.trace("Log4J trace...");
		logger.info("Log4J info...");
		logger.debug("Log4J debug...");
		logger.warn("Log4J warn...");
		logger.error("Log4J error...");
		logger.fatal("Log4J fatal...");
	}
}