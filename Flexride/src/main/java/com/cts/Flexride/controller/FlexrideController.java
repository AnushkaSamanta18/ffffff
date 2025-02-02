package com.cts.Flexride.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class FlexrideController {
	@GetMapping("/")
   public String home() {
	   return "front";
   }
	
	@GetMapping("/Login")
	public String Login() {
		   return "Login";
	   }
	
	@GetMapping("/signup")
	public String SignUp() {
		   return "signup";
	   }
	@GetMapping("/index")
	public String Index() {
		   return "index";
	   }
	@GetMapping("/front")
	   public String front() {
		   return "front";
	   }
	@GetMapping("/contact")
	   public String Contact() {
		   return "contact";
	   }
	@GetMapping("/AdminLogin")
	public String AdLogin() {
		   return "AdminLogin";
	   }
	@GetMapping("/book")
	public String book() {
		   return "book";
	   }
	@GetMapping("/dashboard")
	public String Dashboard() {
		   return "dashboard";
	   }
	@GetMapping("/customerdashboard")
	public String CustomerDashboard() {
		   return "customerdashboard";
	   }
	@GetMapping("/Cardetails")
	public String CarDetails() {
		   return "Cardetails";
	   }
	
	
}