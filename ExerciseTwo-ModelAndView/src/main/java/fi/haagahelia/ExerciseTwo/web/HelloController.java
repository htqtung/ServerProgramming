package fi.haagahelia.ExerciseTwo.web;

import java.util.ArrayList;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import fi.haagahelia.ExerciseTwo.java.*;

@Controller
public class HelloController {
	
	ArrayList<Friend> friendList = new ArrayList<Friend>();
	
	@RequestMapping("/hello")
	public String hello(
			@RequestParam(value="name") String name, 
			@RequestParam(value="age") int age, 
			Model model) {
		model.addAttribute("name", name);
		model.addAttribute("age", age);
		return "hello";
	}
	
	@RequestMapping("/student")
	public String message(Model model) {
		Student[] studentArr = new Student[3];
		Student a;
		a = new Student();
		a.setLastName("Cole");
		a.setFirstName("Kate");
		a.setEmail("kate.cole@abc.com");
		studentArr[0] = a;
		a = new Student();
		a.setLastName("Brown");
		a.setFirstName("Dan");
		a.setEmail("dan.brown@abc.com");
		studentArr[1] = a;
		a = new Student();
		a.setLastName("Mars");
		a.setFirstName("Mike");
		a.setEmail("mike.mars@abc.com");
		studentArr[2] = a;
		model.addAttribute("studentList", studentArr);
		return "student";
	}
	
	@RequestMapping("/index")
	public String addFriend(Model model) {
		model.addAttribute("friend", new Friend());
		model.addAttribute("friendList", friendList);
		return "index";
	}
	
	@RequestMapping(value="/index", method=RequestMethod.POST)
	public String friendForm(@ModelAttribute Friend friend, Model model) {
		friendList.add(friend);
		model.addAttribute("friendList", friendList);
		model.addAttribute("friend", new Friend());
		return "index";
	}
	
}
