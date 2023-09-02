package com.ref;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context=new ClassPathXmlApplicationContext("com/ref/config.xml");
		reference temp=(reference) context.getBean("aref");
		System.out.println(temp.getX());
		System.out.println(temp.getOb().getY());
	}
	

}
