package com.example;

import org.junit.rules.ExternalResource;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class LoggingRule extends ExternalResource {

    private static final Logger LOG = LoggerFactory.getLogger(LoggingRule.class);

    private final String prefix;

    public LoggingRule(String prefix) {
        this.prefix = prefix;
    }

    @Override
    protected void before() throws Throwable {
        LOG.info("{} starting", prefix);
    }

    @Override
    protected void after() {
        LOG.info("{} finished", prefix);
    }
}
