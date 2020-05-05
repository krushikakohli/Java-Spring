package com.ibm;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		
//		B b  = new B();
//		b.execute();

//		A a = new A();
//		a.execute();
		
//		a.setB(b);		
//		 Spring code that can generate objects and wire up dependencies

		ApplicationContext context = new ClassPathXmlApplicationContext("classpath:beans.xml");
		A a = context.getBean(A.class);
		a.execute();
		
//		PaymentService ps = (PaymentService)context.getBean("paymentService");
//		ps.payment();

	}

}
