package fi.haagahelia.ExerciseOne.Web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@ResponseBody
public class ExerciseOneController {
	@RequestMapping("/index")
	public String mainPage() {
		return "This is the main page";
	}
	
	@RequestMapping("/contact")
	public String contactPage() {
		return "This is the contact page";
	}
	
	@RequestMapping("/hello")
	public String helloPage(
			@RequestParam(name="location", required=false, defaultValue="somewhere") String location,
			@RequestParam(name="name", required=false, defaultValue="someone") String name) {
		return "Welcome to the " + location + " " + name + "!";
	}
}
