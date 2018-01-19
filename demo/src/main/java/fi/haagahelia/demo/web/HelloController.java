package fi.haagahelia.demo.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@ResponseBody
public class HelloController {
	
//	@RequestMapping("/hello")
//	public String hello() {
//		return "Hello World!";
//	}
	
	@RequestMapping("/about")
	public String about() {
		return "About";
	}
	
	@RequestMapping("/hello")
	public String helloWithParam(
			@RequestParam(name="firstname", required=false, defaultValue = "") String firstName, 
			@RequestParam(name="lastname", required=false, defaultValue = "The World") String lastName) {
		return "Hello " + firstName + " " + lastName;
	}
}
