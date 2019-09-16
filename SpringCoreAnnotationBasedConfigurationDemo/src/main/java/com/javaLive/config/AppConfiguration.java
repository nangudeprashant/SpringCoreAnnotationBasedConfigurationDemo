package com.javaLive.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Scope;
import com.javaLive.beans.Hostel;
import com.javaLive.beans.Student;

public class AppConfiguration {
	public AppConfiguration()
    {        
    }    
    @Bean(name="student")
    @Scope("prototype")
    public Student getStudent()
    {
        Student student = new Student();
        student.setName("Student A");
        return student;
    }    
    @Bean( initMethod="init")
    public Hostel hostel()
    {
        return new Hostel(getStudent());
    }
}
