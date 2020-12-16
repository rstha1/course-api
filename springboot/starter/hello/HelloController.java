package springboot.starter.hello;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController //you can have request to method
public class HelloController {
	
	@RequestMapping("/hello") // only to the GET method
	public String sayHi() {
		return "Hi";
	}
	

}
