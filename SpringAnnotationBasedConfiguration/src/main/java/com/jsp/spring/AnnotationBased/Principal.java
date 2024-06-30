package com.jsp.spring.AnnotationBased;

import org.springframework.stereotype.Component;

@Component
public class Principal {

	public void principalInfo() {
		System.out.println("Hi I am your Principal");
		System.out.println("My name is Manoj");
	}
}
