package com.benny.springboot.web;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class WebApplicationTests {

	@Test
	public void contextLoads() {

		Logger logger = LoggerFactory.getLogger(getClass());

		//日志级别 trace<debug<info<warn<error
		//SpringBoot默认日志级别info
		logger.trace("trace日志");
		logger.debug("debug日志");
		logger.info("info日志");
		logger.warn("warn日志");
		logger.error("error日志");
	}

}
