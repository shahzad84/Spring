package com.standalonecollection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class test {

	public static void main(String[] args) {
		 ApplicationContext context=new ClassPathXmlApplicationContext("com/standalonecollection/config.xml");
//    stand alone list
//         Person person1= context.getBean("person1",Person.class);
//         System.out.println(person1);
		 
//		 standalone map
//		   Person person1= context.getBean("person1",Person.class);
//         System.out.println(person1.getFeestructure());
//         
         
//		standalone properties
		   Person person1= context.getBean("person1",Person.class);
	         System.out.println(person1.getProperties());
	         
         
	}

}
