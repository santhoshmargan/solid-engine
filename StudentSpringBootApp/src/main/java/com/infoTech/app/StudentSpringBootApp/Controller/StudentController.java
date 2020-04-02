package com.infoTech.app.StudentSpringBootApp.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {
	
	@GetMapping(value="/sayHello")
	//@RequestMapping(value="/",method=RequestMethod.GET)
	public String hello()
	{
		return "Hello World--!";
	}
	

}
