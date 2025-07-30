package com.springscheduling.service;

import java.util.Date;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

@Service
public class CronExample {
	
	@Scheduled(cron="0 0 0 15 8 *")
	public void wishIndependenceDay() {
		System.out.println("Happy Independence day!! - " + new Date());
	}
}
