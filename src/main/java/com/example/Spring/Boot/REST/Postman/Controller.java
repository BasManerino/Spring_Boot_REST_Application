package com.example.Spring.Boot.REST.Postman;

import java.time.LocalDate;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

	@GetMapping("/current-date")
	public LocalDate currentDate() {
		return LocalDate.now();
	}
	
	@PostMapping("/welcome")
	public String welcome(@RequestParam String naam) {
		return "Welkom " + naam + "!";
	}
}
