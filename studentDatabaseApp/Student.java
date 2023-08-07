package studentDatabaseApp;

import java.util.Scanner;

public class Student {
	private String firstName;
	private String lastName;
	private int gradeYear;
	private String studentID;
	private String courses;
	private int tuitionBalance;
	private static int costOfCourse = 600;
	private static int id = 1000;
	
	//Constructor: prompt user to enter student's name and year
	public Student() {
		Scanner in = new Scanner(System.in);
		System.out.print("Enter student first name: ");
		this.firstName = in.nextLine();
		
		System.out.print("Enter student last name: ");
		this.lastName = in.nextLine();
		
		System.out.print("1 - Freshmen\n - Sophmore\n3 - Junior\n4 - Senior\nEnter student class level: ");
		this.gradeYear = in.nextInt();
		
		
		setStudentID();
		
		System.out.println(firstName + " " + lastName + " " + gradeYear + " " +studentID );
		
	}
	
	//Generate an ID
	private void setStudentID() {
		//Grade Level + ID 
		id++;
		this.studentID = gradeYear + "" + id; //"" concatenate it to the string  
	}
	
	//Enroll in courses
	public void enroll(){
		//infinite loop for user to enter enroll information unless user choose to quit
		while(1 != 0) {
			System.out.print("Enter course to enroll (Q to quit): ");
			Scanner in = new Scanner(System.in);
			String course = in.nextLine();
			if(course.equals("Q")) {
				System.out.println("Quited");
				break;
			}else {
				courses = courses + "\n  --- " + course;
				tuitionBalance = tuitionBalance + costOfCourse;
			}
		}
		System.out.println("Enrolled In: " + courses);
		//System.out.println("Tuition balance: " + tuitionBalance);
	}
	
	//View balance
	public void viewBalance() {
		System.out.println( "Your balance is $" + tuitionBalance);
	}
	
	//Pay Tuition
	public void payTuition() {
		viewBalance();
		System.out.print("Enter your payment: $");
		Scanner in = new Scanner(System.in);
		int payment = in.nextInt();
		tuitionBalance = tuitionBalance - payment;
		System.out.println("Thank you for your payment of $" + payment);
		viewBalance();
	}
	
	//Show status
	public String showInfo() {
		return "Name: " + firstName + " " + lastName + 
				"\nGrade Level: " + gradeYear +
				"\nStudent ID: " + studentID + 
				"\nCourses Enrolled: " + courses + 
				"\nBalance: $" + tuitionBalance;
	}
	
	
}
