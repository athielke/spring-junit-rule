package com.example;

import org.junit.ClassRule;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.RuleChain;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.rules.SpringClassRule;
import org.springframework.test.context.junit4.rules.SpringMethodRule;

@SpringApplicationConfiguration(classes = JunitRuleChainApplication.class)
public class JunitRuleChainApplicationTests {

    @ClassRule
    public static final RuleChain RULE_CHAIN = RuleChain.outerRule(new LoggingRule("outer"))
            .around(new SpringClassRule());

    @Rule
    public SpringMethodRule springMethodRule = new SpringMethodRule();

	@Test
	public void contextLoads() {
    }
}
