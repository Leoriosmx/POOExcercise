package org.generation.classes;

import java.util.HashMap;
import java.util.Map;


public class Course {
String courseName;
String teacherName;
int year;

HashMap<String, Integer> enrolledStudents = new HashMap<String, Integer>(); 

public Course(String courseName, String teacherName, int year) {
	 this.courseName = courseName;
	 this.teacherName = teacherName;
	 this.year = year; 
	 this.enrolledStudents = new HashMap<>();  

}//constructor 

public void enroll(Student student) {
	String fullName = student.printFullName();
	if(!enrolledStudents.containsKey(fullName)) {
		enrolledStudents.put(fullName, student.grade);
		System.out.println("El alumno " + student.printFullName() + "esta inscrito en " + courseName);
	}//enroll
}//key
public void unEnroll(Student student) {
String fullName = student.printFullName();
if(enrolledStudents.containsKey(fullName)) {
	enrolledStudents.put(fullName, student.grade);
	System.out.println("El alumno " + student.printFullName() + "no esta inscrito  " + courseName);
}//unEnroll
}//key


}// Class Course
