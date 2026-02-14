package com.spring.jdbc.Spring_Jdbc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.jdbc.Spring_Jdbc.Dao.StudentDao;
import com.spring.jdbc.Spring_Jdbc.entities.Student;

/**
 * Hello world!
 *
 */
public class App {
    public static void main( String[] args ) {
    	
        System.out.println( "My Program Started....." );
        
        ApplicationContext ioc = new ClassPathXmlApplicationContext("com/spring/jdbc/Spring_Jdbc/config.xml");
        
        StudentDao studentDao = ioc.getBean("studentDao",StudentDao.class);
        
        Student student = new Student();
        student.setId(212227);
        student.setName("raoShibu");
        student.setCity("America");
        
        int result = studentDao.inset(student);
        System.out.println("Stusdent is Added " + result);
    }
}
