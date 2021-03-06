package com.joshlikestocode.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanScopeDemoApp {

	public static void main(String[] args) {
		
		// load the spring config file
		ClassPathXmlApplicationContext context = 
				new ClassPathXmlApplicationContext("beanScope-applicationContext.xml");
		
		// retrieve beans from spring container
		Coach theCoach = context.getBean("myCoach", Coach.class);
		Coach alphaCoach = context.getBean("myCoach", Coach.class);
		
		// check if they are the same beans
		boolean result = (theCoach == alphaCoach); // <-- point to same place in memory?
		System.out.println("\nPointing to the same object: " + result);
		System.out.println("\nThe memory location for theCoach: " + theCoach.toString());
		System.out.println("\nThe memory location for alphaCoach: " + alphaCoach.toString());
		
		// close the context
		context.close();
		
	}

}
