package com.nasir.rediscachev2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@EnableCaching
@SpringBootApplication
public class RedisCacheV2Application {

	public static void main(String[] args) {
		SpringApplication.run(RedisCacheV2Application.class, args);
	}

}
