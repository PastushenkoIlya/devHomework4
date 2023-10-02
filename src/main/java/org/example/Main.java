package org.example;

import javax.management.*;
import java.lang.management.ManagementFactory;
import java.util.Scanner;
import org.apache.log4j.Logger;
public class Main {
    static Logger logger = Logger.getLogger(LogSwitchMBeanImpl.class);
    public static void main(String[] args) throws MalformedObjectNameException, NotCompliantMBeanException, InstanceAlreadyExistsException, MBeanRegistrationException {
        // Створення MBean-сервера
        MBeanServer mbs = ManagementFactory.getPlatformMBeanServer();

        // Створення об'єкта MBean
        StandardMBean mBean = new StandardMBean(new LogSwitchMBeanImpl(), LogSwitchMBean.class);

        // Створення ObjectName для реєстрації MBean
        ObjectName mBeanName = new ObjectName("com.example:type=LogSwitchMBeanImpl");

        // Реєстрація MBean в MBean-сервері
        mbs.registerMBean(mBean, mBeanName);

        // Запуск програми
        System.out.println("you are welcome");
        Scanner scanner = new Scanner(System.in);

        while(true){
            String inputString = scanner.nextLine();
            //logging before formatting string
            logger.debug(inputString);
            //logging after formatting string
            logger.debug(CaseFormatter.formatSwitchingCase(inputString));
            if(inputString.equalsIgnoreCase("stop")) break;
        }
    }
}