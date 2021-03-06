package org.ankitgupta.springcore;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.core.Ordered;

/**
 * Created by ankitgupta on 5/7/17.
 */
public class DemoBeanPostProcessor implements BeanPostProcessor, Ordered {
    @Override
    public Object postProcessBeforeInitialization(Object o, String s) throws BeansException {
        System.out.println("DemoBeanPostProcessor postProcessBeforeInitialization" + s);
        return o;
    }

    @Override
    public Object postProcessAfterInitialization(Object o, String s) throws BeansException {
        System.out.println("DemoBeanPostProcessor postProcessAfterInitialization" + s);
        return o;
    }

    @Override
    public int getOrder() {
        return 1;
    }
}
