package com.javaLive.beans;

public class Hostel {
	private Student student;

	public Hostel(Student student) {
		this.student = student;
	}

	public void init() {
		System.out.println("custom init method of Hostel bean is called !!!");
	}

	@Override
	public String toString() {
		return "Hostel [student=" + student.getName() + "]";
	}
}
