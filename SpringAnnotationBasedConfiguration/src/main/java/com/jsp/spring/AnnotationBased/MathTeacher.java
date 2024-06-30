package com.jsp.spring.AnnotationBased;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
//@Primary
public class MathTeacher implements Teacher{

	@Override
	public void teach() {
		System.out.println("Hi I am Your math Teacher");
		System.out.println("My Name is Venky");
	}

	
}
