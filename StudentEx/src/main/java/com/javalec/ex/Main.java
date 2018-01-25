package com.javalec.ex;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class Main {
	public static void main(String[]args){
		String xmlPath = "classpath:applicationCTX.xml";
		
		AbstractApplicationContext ctx = new GenericXmlApplicationContext(xmlPath);
		Student student = ctx.getBean("student", Student.class);
		student.getInfo();
		
		Student student2 = ctx.getBean("student", Student.class);
		student2.setName("고구마");
		student2.setAge(45);
		student2.getInfo();
		
		if(student.equals(student2))
			System.out.println("student == student2");
		else
			System.out.println("student != student2");
		
		student.getInfo();
	}
}
