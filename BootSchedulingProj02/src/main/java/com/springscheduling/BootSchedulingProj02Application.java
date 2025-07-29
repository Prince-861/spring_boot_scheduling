package com.springscheduling;

import java.util.Date;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class BootSchedulingProj02Application {

	public static void main(String[] args) {
		System.out.println("BootSchedulingProj02Application.main():: App started At::" + new Date());//we got this using systrace
		SpringApplication.run(BootSchedulingProj02Application.class, args);
	}

}
