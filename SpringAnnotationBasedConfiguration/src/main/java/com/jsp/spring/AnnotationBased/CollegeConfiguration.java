package com.jsp.spring.AnnotationBased;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@PropertySource("classpath:college-info.properties")
public class CollegeConfiguration {
	@Bean
	public Principal principalBean() {
		return new Principal();
	}
	@Bean
	public College collegeBean(){
		College college=new College();
		return college;
	}
	@Bean
	public Teacher mathTeacher() {
		return new MathTeacher();
	}
	
	@Bean
	public Teacher scienceTeacher() {
		return new ScienceTeacher();
	}
}
