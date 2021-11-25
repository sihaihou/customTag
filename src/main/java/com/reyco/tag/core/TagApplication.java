package com.reyco.tag.core;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

/**
 * @author reyco
 * @version v1.0.1
 */
@SpringBootApplication
@ImportResource(locations = { "classpath:spring.xml" })
public class TagApplication {
	
	public static void main(String[] args) {
		SpringApplication.run(TagApplication.class, args);
	}
	
}
