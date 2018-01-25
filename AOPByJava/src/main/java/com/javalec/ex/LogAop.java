package com.javalec.ex;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class LogAop {
	
	@Pointcut("within(com.javalec.ex.*)")
	private void pointcutMethod(){}
	
	@Around("pointcutMethod()")
 	// 핵심기능들을 조인포인트로 가져온다. 
 	public Object loggerAop(ProceedingJoinPoint joinPoint) throws Throwable{
		// 메소드만 AOP에 적용되기 때문에 어떤 메소드인지
 		String signatureStr = joinPoint.getSignature().toShortString();
		System.out.println(signatureStr + " is Start");
		
		// 공통 기능
		long st = System.currentTimeMillis();
		
		try{
			// joinPoint 핵심기능, 핵심기능을 실행시켜준다. 
			Object obj = joinPoint.proceed();
			return obj;
		}
		finally{
			
			// 핵심기능이 실행되기 이전의 시간과 
			// 핵심기능이 실행되고 이후의 시간을 구해준다.
			long et = System.currentTimeMillis();
			System.out.println(signatureStr + " is finished");
			System.out.println(signatureStr + " 경과시간 : " + (et - st));
			//로직이 돌아간 경과시간을 구할 수 있다.
		}
	}
	
	@Before("within(com.javalec.ex.*)")
	public void beforeAdvice(){
		System.out.println("beforeAdvice()");
	}
}
