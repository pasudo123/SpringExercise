package com.javalec.ex;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class AdminConnection implements InitializingBean, DisposableBean{
	private String adminId;
	private String adminPw;
	private String subAdminId;
	private String subAdminPw;
	
	public void setAdminId(String adminId){
		this.adminId = adminId;
	}
	
	public void setAdminPw(String adminPw){
		this.adminPw = adminPw;
	}
	
	public void setSubAdminId(String subAdminId){
		this.subAdminId = subAdminId;
	}
	
	public void setSubAdminPw(String subAdminPw){
		this.subAdminPw = subAdminPw;
	}
	
	public String getAdminId(){
		return adminId;
	}
	
	public String getAdminPw(){
		return adminPw;
	}
	
	public String getSubAdminId(){
		return subAdminId;
	}
	
	public String getSubAdminPw(){
		return subAdminPw;
	}
	
	@Override
	public void afterPropertiesSet() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("afterPropertiesSet()");
	}
	
	@Override
	public void destroy() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("destroy()");
	}
}
