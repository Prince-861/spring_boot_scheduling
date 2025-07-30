package com.springscheduling.service;

import java.util.Date;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

@Service("task1")
public class Task1 {
	
//	@Scheduled(initialDelay=10000,fixedDelay=3000)//Here after 10ms delay only doTask will start and then it will repeat for each fixedDelay of 3ms
//	@Scheduled(fixedDelayString="3000")
//	@Scheduled //Exception: org.springframework.beans.factory.BeanCreationException: Error creating bean with name 'task1' defined in file [P:\springboot_workspace\spring-scheduler-workspace\BootSchedulingProj02\target\classes\com\springscheduling\service\Task1.class]: Encountered invalid @Scheduled method 'doTask': One-time task only supported with specified initial delay
//	@Scheduled(fixedDelay=3000)//task1...Tue Jul 29 15:23:06 IST 2025
//	public void doTask() {
//		System.out.println("task1..."+new Date());
//	}
	
//	@Scheduled(fixedDelay=8000)
//	public void doTask() {
//		try {
//			Thread.sleep(5000);
//		}catch(Exception e) {
//			e.printStackTrace();
//		}
//		System.out.println("task1...."+new Date());
//	}
	
	//Here we are getting 5sec time after the doTask finishes and executing again.....
//	@Scheduled(fixedRate=10000)
//	public void doTask() {
//		System.out.println("task1...starts"+new Date());
//		try {
//			Thread.sleep(5000);
//		}catch(Exception e) {
//			e.printStackTrace();
//		}
//		System.out.println("task1....ends"+new Date());
//	}
	
	
//	Below doTask() execution time is more than the fixedRate so, once the initial task finishes, it immediately starts the task again and didn't wait even
//	op:- task1...startsTue Jul 29 16:22:20 IST 2025
//	task1...endsTue Jul 29 16:22:35 IST 2025
//	task1...startsTue Jul 29 16:22:35 IST 2025
//	task1...endsTue Jul 29 16:22:50 IST 2025
//	task1...startsTue Jul 29 16:22:50 IST 2025
	
//	@Scheduled(fixedRate=10000)
//	public void doTask() {
//		System.out.println("task1...starts"+new Date());
//		try {
//			Thread.sleep(15000);
//		}catch(Exception e) {
//			e.printStackTrace();
//		}
//		System.out.println("task1...ends"+new Date());
//	}
	
//	org.springframework.beans.factory.BeanCreationException: Error creating bean with name 'task1' defined in file [P:\springboot_workspace\spring-scheduler-workspace\BootSchedulingProj02\target\classes\com\springscheduling\service\Task1.class]: 
//	Encountered invalid @Scheduled method 'doTask': Exactly one of the 'cron', 'fixedDelay' or 'fixedRate' attributes is required
//	@Scheduled(initialDelay=5000,fixedDelay=3000,fixedRate=4000) //invalid
//	public void doTask() {
//		System.out.println("task1...starts"+new Date());
//		try {
//			Thread.sleep(15000);
//		}catch(Exception e) {
//			e.printStackTrace();
//		}
//		System.out.println("task1...ends"+new Date());
//	}
}
