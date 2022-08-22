package com.aprendizaje.spring.aprendizaje.component;

import org.springframework.stereotype.Component;

@Component
public class ComponentImplement implements ComponentDependency {

    @Override
    public void greeting() {
        System.out.println("Hola mundo desde mi componente.");        
    }

}
