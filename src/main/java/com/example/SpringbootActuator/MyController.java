package com.example.SpringbootActuator;

import java.util.concurrent.atomic.AtomicLong;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MyController {
	  private static final String template = "Hello, %s!";
	  private final AtomicLong counter = new AtomicLong();

	  @GetMapping("/hello")
	  @ResponseBody
	  public Company sayHello(@RequestParam(name="name", required=false, defaultValue="Stranger") String name) {
	    return new Company(counter.incrementAndGet(), String.format(template, name));
	  }

	  @ResponseBody
	  public Company sayHitoClient(@RequestParam(name="name", required=false, defaultValue="Stranger") String name) {
	    return new Company(counter.incrementAndGet(), String.format(template, name));
	  }
	  
	  
	  
}
