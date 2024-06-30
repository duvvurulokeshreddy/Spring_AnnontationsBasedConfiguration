package com.jsp.spring.AnnotationBased;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main( String[] args ){
    	ApplicationContext context=new AnnotationConfigApplicationContext(CollegeConfiguration.class);
    	College college = context.getBean("collegeBean",College.class);
    	System.out.println("College Object is created"+college);
    	college.test();
    }
}
