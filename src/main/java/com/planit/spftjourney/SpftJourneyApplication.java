package com.planit.spftjourney;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@EntityScan("com.planit.journey_common.model.*")
@SpringBootApplication
public class SpftJourneyApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpftJourneyApplication.class, args);
	}

}
