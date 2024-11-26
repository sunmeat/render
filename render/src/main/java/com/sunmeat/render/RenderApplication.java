package com.sunmeat.render;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
@RequestMapping("/")
class HomeController {

    @GetMapping
    public String home() {
        return "Hello Render!";
    }
}

@SpringBootApplication
public class RenderApplication {

	public static void main(String[] args) {
		SpringApplication.run(RenderApplication.class, args);
	}

}
