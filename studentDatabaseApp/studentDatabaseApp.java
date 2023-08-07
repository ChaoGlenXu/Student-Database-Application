package studentDatabaseApp;

import java.util.Scanner;

public class studentDatabaseApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Student student1 = new Student();
		//student1.enroll();
		//student1.payTuition();
		//System.out.println(student1.showInfo());
		
		
		
		
		//Ask how many new users we want to add
		System.out.print("Enter number of new students to enroll: ");
		Scanner in = new Scanner(System.in);
		int numOfStudents = in.nextInt();
		Student[] students = new Student[numOfStudents];
		
		//Create n number of new students
		for (int i = 0; i < numOfStudents; i++) {
			students[i] = new Student();
			students[i].enroll();
			students[i].payTuition();
			
		}
		
		for (int j = 0; j < numOfStudents; j++) {
			System.out.println(students[j].showInfo());
			
		}
	}

}
