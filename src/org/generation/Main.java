package org.generation;
import org.generation.classes.Course;
import org.generation.classes.Student;


public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Student student = new Student ("Juan", "Gultier", 1458, 70, 1);
		Student student1 = new Student ("Aranza", "Cruz", 2809, 26, 2);
        Course course = new Course ("Literatura", "Mayito", 0014);	
		course.enroll(student1);
		course.enroll(student);
		
       // System.out.println("Estudiantes inscritos: " + course.
		System.out.println(student1);
//    System.out.println(student.toString());
	
	}//main

}//classMain