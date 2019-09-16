package com.javaLive.beans;

public class Hostel {
	private Student student;

	public Hostel(Student student) {
		this.student = student;
	}

	public void init() {
		System.out.println("init method  called !!!");
	}

	@Override
	public String toString() {
		return "Hostel [student=" + student.getName() + "]";
	}
}
