package org.example;

import org.apache.log4j.Level;

public class LogSwitchMBeanImpl implements LogSwitchMBean{

    @Override
    public void changeLogLevelInfo() {
        Main.logger.setLevel(Level.INFO);
        Main.logger.info("Logging level switched to INFO");
    }

    @Override
    public void changeLogLevelDebug() {
        Main.logger.setLevel(Level.DEBUG);
        Main.logger.info("Logging level switched to DEBUG");
    }
}
