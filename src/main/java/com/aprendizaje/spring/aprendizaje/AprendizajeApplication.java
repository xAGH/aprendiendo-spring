package com.aprendizaje.spring.aprendizaje;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.aprendizaje.spring.aprendizaje.bean.MyBean;
import com.aprendizaje.spring.aprendizaje.component.ComponentDependency;

@SpringBootApplication
public class AprendizajeApplication implements CommandLineRunner {

	private ComponentDependency componentDependency;
	private MyBean myBean;

	public AprendizajeApplication(
		@Qualifier("componentTwoImplement") ComponentDependency componentDependency,
		MyBean myBean
	) {
		this.componentDependency = componentDependency;
		this.myBean = myBean;
	}

	public static void main(String[] args) {
		SpringApplication.run(AprendizajeApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		this.componentDependency.greeting();
		myBean.print();
	}

}
