package org.ankitgupta.springcore;

/**
 * Created by ankitgupta on 5/6/17.
 */

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpringProject {

    public static void main(String[] args)
    {
        ApplicationContext context = new ClassPathXmlApplicationContext("org/ankitgupta/springcore/SpringConfig.xml");

        ((AbstractApplicationContext)context).registerShutdownHook();
        Restaurant restaurantObj1 = (Restaurant) context.getBean("restaurantBean");
//        restaurantObj1.setGreetMessage("Hello Sir!");
        restaurantObj1.display();

//        Restaurant restaurantObj2 = (Restaurant) context.getBean("restaurantBean");
//        restaurantObj2.setGreetMessage("Hello Sir!");
//        restaurantObj2.display();
    }
}
