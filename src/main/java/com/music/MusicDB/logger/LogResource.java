package com.music.MusicDB.logger;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@RestController
public class LogResource {
	
	Logger logger = LoggerFactory.getLogger(LogResource.class);
	
	@RequestMapping("/")
	public String home() {
		logger.debug("This is a DEBUG statement");
		logger.warn("This is a WARN statement");
		logger.error("This is a ERROR statement");
		return "Hello Readers";
	}
}