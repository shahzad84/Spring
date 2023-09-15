package com.xmllifecycle;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class test {

	public static void main(String[] args) {
		 AbstractApplicationContext context=new ClassPathXmlApplicationContext("com/xmllifecycle/config.xml");
		 samosa s1=(samosa) context.getBean("s1");
         System.out.println(s1);
         context.registerShutdownHook();
	}

}
