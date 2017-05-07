package org.ankitgupta.springcore;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.integration.monitor.LifecycleMessageSourceMetrics;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import java.util.List;

/**
 * Created by ankitgupta on 5/6/17.
 */
public class Restaurant{

    String greetMessage;
//
    public void setGreetMessage(String greetMessage) {
        this.greetMessage = greetMessage;
    }

    public void display()
    {
        System.out.println(greetMessage);
    }

//    @Override
//    public void afterPropertiesSet() throws Exception {
//        System.out.println("Init");
//    }
//
//    @Override
//    public void destroy() throws Exception {
//        System.out.println("Destroy");
//    }


//    @PostConstruct
//    public void init()
//    {
//        System.out.println("Init");
//    }
//
//    @PreDestroy
//    public void destroy()
//    {
//        System.out.println("Destroy");
//    }
//    private List restaurantWaiterList;
//
//    public List getRestaurantWaiterList() {
//        return restaurantWaiterList;
//    }
//
//    public void setRestaurantWaiterList(List restaurantWaiterList) {
//        this.restaurantWaiterList = restaurantWaiterList;
//    }

//    public void displayWaiterNames()
//    {
//        System.out.println(restaurantWaiterList);
//    }
//    Car car;
//
//    public void setCar(Car car) {
//        this.car = car;
//    }
//
//    public void displayCar()
//    {
//        car.makeCar();
//    }
}
