package com.javaLive.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

import com.javaLive.beans.Hostel;
import com.javaLive.beans.Student;
import com.javaLive.config.AppConfiguration;

public class MainClass {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
		context.register(AppConfiguration.class);
		context.refresh();
		Student studentA = (Student) context.getBean("student");
		Student studentB = (Student) context.getBean("student");
		System.out.println("Is student bean is singleton?  " + (studentA == studentB));
		Hostel hostel1 = (Hostel) context.getBean("hostel");
		Hostel hostel2 = (Hostel) context.getBean("hostel");
		System.out.println(hostel1);
		System.out.println(hostel2);
		System.out.println("Is Hostel bean is singleton?  " + (hostel1 == hostel2));
		((AbstractApplicationContext) context).registerShutdownHook();
		;
	}
}
