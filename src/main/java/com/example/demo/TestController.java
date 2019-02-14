package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class TestController {

	/*2. 컨트롤러에서 템플릿으로 값 전달*/
//	@RequestMapping("/")
//	public String index() {
//		return "index";
//	}
//	
//	@RequestMapping("/{num}")
//	public String index(@PathVariable int num, Model model) {
//		int res = num;
//		model.addAttribute("msg", "num : " + res);
//		return "index";
//	}
	
	/*1. 폼 사용하기*/
	/*@RequestMapping("/")
	public String index(Model model) {
		model.addAttribute("msg", "input your id");
		return "index";
	}
	
	@RequestMapping(value="/", method=RequestMethod.POST)
	public String send(@RequestParam("id1")String id, Model model) {
		model.addAttribute("msg", "Hi. " + id + "!!");
		model.addAttribute("id2", id);
		return "index";
	}*/
	
	/*
	 * 3. redirect, forward
	 * redirect : localhost:8080/redi 입력시 /redi가 /로 변경된다. 
	 * forward : localhost:8080/forw 입력시 /farw는 그대로 남아있다.
	 * */
	
	@RequestMapping("/")
	public String index(Model model) {
		return "index";
	}
	
	@RequestMapping(value="/redi")
	public String other() {
		return "redirect:/";
	}
	
	@RequestMapping(value="/forw")
	public String home() {
		return "forward:/";
	}
	
	
}
