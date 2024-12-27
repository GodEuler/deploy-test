package com.ocean.springbootstart;

import jakarta.annotation.PostConstruct;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.stereotype.Component;

@Component
public class BeanMy implements InitializingBean, DisposableBean {

    public BeanMy() {
        System.out.println("构造方法");
    }

    @PostConstruct
    public void init() {
        System.out.println("初始化方法");
    }


    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("属性设置完成以后");
    }


    @Override
    public void destroy() throws Exception {
        System.out.println("销毁方法");
    }


    // public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
    //     System.out.println("初始化之前");
    //     return BeanPostProcessor.super.postProcessBeforeInitialization(bean, beanName);
    // }
    //
    // public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
    //     System.out.println("初始化之后");
    //     return BeanPostProcessor.super.postProcessAfterInitialization(bean, beanName);
    // }
}
