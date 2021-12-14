package com.spring.di; 

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class main2
{
	public static void main(String[] args)
	{
		ApplicationContext context = new ClassPathXmlApplicationContext("com/spring/di/DiBeans.xml");
		CentralController2 centralController = (CentralController2)context.getBean("centralControl");
		centralController.OnAll();
		centralController.offAll();
	}
}
