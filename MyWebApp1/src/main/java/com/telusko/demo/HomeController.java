package com.telusko.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HomeController
{
	@GetMapping("run")
	public String run() {
		return "home" ;
	}
	@PostMapping("details")
	public String viewdeatil(@RequestParam("id") String id,@RequestParam("name") String name,@RequestParam("email") String email,ModelMap map) {
		map.put("id", id);
		map.put("name", name);
		map.put("email",email);
		System.out.println("Your Entered NO is : "+id);
		System.out.println("You Entered Name is: "+name);
		System.out.println("You Entered Mail id Is : "+email);
		System.out.println();
		return"viewdetails";
	}
}
