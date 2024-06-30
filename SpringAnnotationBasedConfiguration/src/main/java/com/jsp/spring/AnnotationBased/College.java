package com.jsp.spring.AnnotationBased;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;

public class College {
	@Value("${college.Name}")
	private String collegeName;
	@Autowired
	private Principal principal;
	@Autowired
	@Qualifier("mathTeacher")
	private Teacher teacher;

	public void test() {
		System.out.println("My College Name is "+collegeName);
		principal.principalInfo();
		teacher.teach();
		System.out.println("testing this class Methods");
	}
}

/*---------------- The dependency Injection by Constructor Injection ----------------------------------
		public College(Principal principal) {
			this.principal = principal;
		}
		@Bean

	public Principal principalBean() {
		return new Principal();
	}
	@Bean
	public College collegeBean(){
		College college=new College(principalBean());
		return college;
	}
	}
 */

/*---------------- The dependency Injection by Setter Injection ----------------------------------
  public void setPrincipal(Principal principal) {
		this.principal = principal;
	}

 @Bean public Principal principalBean() { 
  return new Principal(); }
  @Bean public College collegeBean(){ 
  College college=new College();
  college.setPrincipal(principalBean()); 
  return college; 
  }
 */

