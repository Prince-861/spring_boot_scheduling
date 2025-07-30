package com.springscheduling.service;

import java.util.Date;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

@Service
public class PeriodOfTimeUsingCron {
	
//	Execute the task having 20sec gap
//	@Scheduled(cron="0/20 * * * * *")
//	public void doTask() {
//		System.out.println("task1..."+ new Date());
//	}
	
//	Execute given task having 15 minutes gap at 10sec
//	@Scheduled(cron="10 0/15 * * * *")
//	public void doTask1() {
//		System.out.println("task1..." + new Date());
//	}
	
//	Execute given task having 2 min gap at 10am 20sec
//	@Scheduled(cron="20 0/2 10 * * *")
//	public void doTask1() {
//		System.out.println("task1..." + new Date());
//	}
	
//	Execute the task every minute starting from 4pm at 30sec
	@Scheduled(cron="30 0/1 16 * * *")
//	public void doTask1() {
//		System.out.println("task1..." + new Date());
//	}
	
//	Task should execute for 5 minutes starting 6pm
//	@Scheduled(cron="0 0/5 18 * * *")
//	public void doTask1() {
//		System.out.println("task1....started"+ new Date());
//	}
	
	
//	taskYY....Wed Jul 30 18:36:10 IST 2025
//	taskYY....Wed Jul 30 18:36:20 IST 2025
//	taskYY....Wed Jul 30 18:36:30 IST 2025
//	taskYY....Wed Jul 30 18:36:40 IST 2025
//	taskYY....Wed Jul 30 18:36:50 IST 2025
//	taskYY....Wed Jul 30 18:38:10 IST 2025
//	taskYY....Wed Jul 30 18:38:20 IST 2025
//	taskYY....Wed Jul 30 18:38:30 IST 2025
//	taskYY....Wed Jul 30 18:38:40 IST 2025
//	taskYY....Wed Jul 30 18:38:50 IST 2025
	@Scheduled(cron="0/10 36/2 18 * * *")
	public void doTask() {
		System.out.println("taskYY...."+new Date());
	}
	
}
