package com.jsp.spring.AnnotationBased;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component

public class ScienceTeacher implements Teacher{

	@Override
	public void teach() {
		System.out.println("Hi I am Your Science Teacher");
		System.out.println("My Name is Anju");
	}

}
