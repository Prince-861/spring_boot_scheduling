package com.pkd.scheduling;

import java.util.Date;
import java.util.Timer;

import com.pkd.task.Task1;

public class SchedulingTest {
	public static void main(String[] args) {
		System.out.println("Start of the App::"+new Date());
		Timer timer = new Timer();
//		timer.schedule(new Task1(),10000, 5000);//Here we are using Period of Time execution.
		
//		timer.schedule(new Task1(),5000);//Here we are using Point of Execution.
		
		timer.schedule(new Task1(),new Date((2025-1900),06,29,13,19,30));//months range is(0-11).
	}
}
