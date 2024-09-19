package org.generation.classes;

public class Student {
	String firstName;
    String lastName;
    int registration;
    int grade;
    int year;

  //--Constructores (3)
    public Student (String firstName, String lastName, int registration, int grade, int year) {
    	this.firstName= firstName;
    	this.lastName= lastName; 
    	this.registration= registration;
    	this.grade= grade;
    	this.year= year;	
    			
    }//constructor 1
    
public Student(String firstName, String lastName, int registration, int grade) {
	this(firstName, lastName, registration, 0, 1);// Se asigna el primer registro
}//constructor 2

public Student(String firstName, String lastName) {
	this(firstName, lastName, 12364758, 0, 1);//
}//constructor 3
    
    
//Now, make the Student class implement the following methods:
	 
public String printFullName(){
	
 return firstName + lastName; 
}//printFullName

public boolean isApproved(){
    //TODO implement: should return true if grade >= 60
 if( grade >= 60) {
	 return true;
 }else {
	 return false;
 }//else

}//isApproved

public int changeYearIfApproved(){
    //TODO implement: the student should advance to the next year if he/she grade is >= 60
    // Make year = year + 1, and print "Congragulations" if the student has been approved
    if(isApproved()) {
    	year += 1;
    	System.out.println("Congratulations");
    }//if
	return year;
	
//	public String toString() {
//		return "firstName=" + this.firstName +", lastName=" + this.lastName 
//				+ ", registration" + this.registration + ", grade" + this.grade 
//				+ ", year" + this.year;
				
//	}//toString
	
}//changeYearIfApproved

}//class Student


