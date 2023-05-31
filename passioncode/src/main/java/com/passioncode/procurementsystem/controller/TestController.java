package com.passioncode.procurementsystem.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class TestController {
	
	@GetMapping("layout/basic")
	public void layoutTest() {
		
	}
//	public String layoutTest() {
//		return "layout/layoutTest";
//	}
	//테스트중입니다
}
