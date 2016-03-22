package com.example;

import org.junit.ClassRule;
import org.junit.Rule;
import org.junit.Test;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.rules.SpringClassRule;
import org.springframework.test.context.junit4.rules.SpringMethodRule;

@SpringApplicationConfiguration(classes = JunitRuleChainApplication.class)
public class JunitRuleApplicationTests {

    @ClassRule
    public static final LoggingRule LOGGING_RULE = new LoggingRule("outer");

    @ClassRule
    public static final SpringClassRule SPRING_CLASS_RULE = new SpringClassRule();

    @Rule
    public SpringMethodRule springMethodRule = new SpringMethodRule();

	@Test
	public void contextLoads() {
	}

}
