package com.constructor;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class testok {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context=new ClassPathXmlApplicationContext("com/constructor/config.xml");
		person p=(person) context.getBean("person");
		System.out.println(p);
			
	}

}
