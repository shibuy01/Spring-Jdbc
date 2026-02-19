package com.spring.jdbc.Spring_Jdbc;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
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
        
        ApplicationContext ioc = new AnnotationConfigApplicationContext(JdbcConfig.class);
        
        StudentDao studentDao = ioc.getBean("studentDao",StudentDao.class);
        
        //Insert the Data
//        Student student = new Student();
//        student.setId(212225);
//        student.setName("Khan Sir");
//        student.setCity("Noida");
//        
//        int result = studentDao.inset(student);
//        System.out.println("Student is Added " + result);
        
        //Update the data
//        Student student = new Student();
//        student.setName("Shibu kumar Kumar");
//        student.setCity("Delhi");
//        student.setId(1);
//        
//        int result = studentDao.Update(student);
//        System.out.println("Student Details Updated" + result);
        
        //Delete Query
//        Student student = new Student();
//        student.setId(1);
//        
//        int result = studentDao.Delete(student);
//        System.out.println("Delete Student Sucessfull"+result);
        
        // Fetching Data Single Object
//        Student student = studentDao.getStudent(111);
//        System.out.println(student);
        
        // Fetchin Data Multiple Object
        List<Student> students = studentDao.getAllStudent();
        for(Student s : students) {
        	System.out.println(s);
        }
    }
}
