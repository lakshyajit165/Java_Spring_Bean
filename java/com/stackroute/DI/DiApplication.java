package com.stackroute.DI;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class DiApplication {

	public static void main(String[] args) {

		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("beans.xml");

		FlippedClass fc = (FlippedClass)applicationContext.getBean("flippedclass");
		fc.showDetails();
		System.out.println(fc.getDuration());
//		ClassRoom c = (ClassRoom)applicationContext.getBean("classroom");
//		ClassRoom c1 = (ClassRoom)applicationContext.getBean("classroom2");
//		c.showDetails();
//		c1.showDetails()	;



	}

}
