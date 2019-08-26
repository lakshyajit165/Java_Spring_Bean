package com.stackroute.DI;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class DiApplication {

	public static void main(String[] args) {

		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("beans.xml");

		ClassRoom c = (ClassRoom)applicationContext.getBean("classroom");

		c.showDetails();



	}

}
