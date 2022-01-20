package io.turntabl.leaderboardservice;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;


@SpringBootApplication
//@OpenAPIDefinition(info = @Info(title = "CodeWars API",version="1.0", description = "Codewars Service here"))
@OpenAPIDefinition()
@EnableScheduling
public class LeaderboardServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(LeaderboardServiceApplication.class, args);
	}

}
