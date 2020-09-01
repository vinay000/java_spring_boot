package com.example.Intro;
import java.util.*;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
class Controller{
	
	ArrayList<User> l = new ArrayList();
	
	@GetMapping("/user")
	public ArrayList getUser() {
		return l;
	}
	@GetMapping("/search")
	public String searchUser(@RequestParam String q) {
		return "sucess";
	}
	
	@PostMapping("/add-bommer")
	public String addBommer(@RequestBody User payload) {
//		User ob = new User();
//		ob.setId(payload.id);
//		ob.setName(payload.name);
		l.add(payload);		
		return "added-bommerwa";
	}
	

}