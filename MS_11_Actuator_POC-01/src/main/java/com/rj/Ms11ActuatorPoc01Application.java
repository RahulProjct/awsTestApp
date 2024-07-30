package com.rj;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;


@SpringBootApplication
@Controller
public class Ms11ActuatorPoc01Application {

	public static void main(String[] args) {
		SpringApplication.run(Ms11ActuatorPoc01Application.class, args);
	}

	@GetMapping("/wish")
	@ResponseBody
	public String getString() {
		return "Good evening";
	}

}
