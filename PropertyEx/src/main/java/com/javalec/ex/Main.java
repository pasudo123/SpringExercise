package com.javalec.ex;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class Main {
	public static void main(String[]args){
		AbstractApplicationContext ctx = new GenericXmlApplicationContext("classpath:applicationCTX.xml");
		
		AdminConnection connection = ctx.getBean("adminConnection", AdminConnection.class);
		
		System.out.println(connection.getAdminId());
		System.out.println(connection.getAdminPw());
		System.out.println(connection.getSubAdminId());
		System.out.println(connection.getSubAdminPw());
		
		ctx.close();
	}
}
