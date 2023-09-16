package com.autowire;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class test {

	public static void main(String[] args) {
		 ApplicationContext context=new ClassPathXmlApplicationContext("com/autowire/config.xml");
    
         Emp emp1=(Emp) context.getBean("emp1",Emp.class);
         System.out.println(emp1);
         
	}

}
