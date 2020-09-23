package com.spring.ex;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class StudentController {
	@RequestMapping(value="form", method = RequestMethod.GET) //url 직접 입력
	public String form() {
		return "form"; 
	}
	
	@RequestMapping(value="form", method = RequestMethod.POST) // type = "submit" 요청
	public String form2( @ModelAttribute("stu") @Valid Student stu, BindingResult result) {
		//BindingResult 에러 발생 여부 확인하는 인터페이스
		System.out.println(stu.getName());
		System.out.println(stu.getId());
		String page = "result";
		System.out.println("result.hasErrors() : " + result.hasErrors());
		
		if(result.hasErrors()) {
			page = "form";
		}
		return page; 
	} 
}
