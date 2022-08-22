package com.aprendizaje.spring.aprendizaje.bean;

public class MyBeanImplement implements MyBean {

    @Override
    public void print() {
        System.out.println("Hola desde el bean");
    }
    
}
