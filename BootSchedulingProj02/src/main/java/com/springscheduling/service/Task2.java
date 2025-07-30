package com.springscheduling.service;

import java.util.Date;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

@Service("task2")
public class Task2 {
	
//	*	*	*	*	*	*
//
//--> First star --> Second of the minute(0-59)
//--> Second star --> Minute of the hour(0-59)
//--> Third star --> Hour of the day(0-23)
//--> Fourth star --> Date of the month(1-31)
//--> Fifth star --> Month of the year(1-12)
//--> Week day --> (SUN-SAT) 3 Letter style

//	Below o/p will be like:-
//	task2....startsWed Jul 30 11:45:15 IST 2025
//	task2....startsWed Jul 30 11:46:15 IST 2025
//	task2....startsWed Jul 30 11:47:15 IST 2025
//	-------------------------------------------
//	-------------------------------------------
	@Scheduled(cron="15 * * * * *")
	public void doTask() {
		System.out.println("task2....starts" + new Date());
	}
}
