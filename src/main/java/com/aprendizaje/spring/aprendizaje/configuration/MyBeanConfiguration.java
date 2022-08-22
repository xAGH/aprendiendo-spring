package com.aprendizaje.spring.aprendizaje.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.aprendizaje.spring.aprendizaje.bean.MyBean;
import com.aprendizaje.spring.aprendizaje.bean.MyBeanImplement;

@Configuration
public class MyBeanConfiguration {
    @Bean
    public MyBean beanOperation(){
        return new MyBeanImplement();
    }
}
