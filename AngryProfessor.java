package angryprofessor;

import java.util.Scanner;

public class AngryProfessor {
	static String nStudents; // instance variable for number of students

	// Method for the angry professor's action
	static String AngryProfAct(int threshhold, int[] nStudents) {
		int nStudentsOnTime = 0;
		String decision;
		for (int i = 0; i < nStudents.length; i++) {
			if (nStudents[i] <= 0) {
				nStudentsOnTime++;
			}
		}
		if (nStudentsOnTime >= threshhold) {
			System.out.println("");
			decision = "VERDIT: No, class is not cancelled\n";

		} else {
			System.out.println("");
			decision = "VERDIT: Yes, class is cancelled\n";
		}
		return decision;

	}

	public static void main(String[] args) {

		System.out.print("Number of Test cases: ");
		int nTestCase = new Scanner(System.in).nextInt();
		// Constraint 01 begin
		if (nTestCase >= 1 && nTestCase <= 10) {

			for (int i = 0; i < nTestCase; i++) {

				System.out.print("Enter Number of Students: ");
				int nstudents = new Scanner(System.in).nextInt();
				//BEGIN

				System.out.print("Enter threshold: ");
				int threshhold = new Scanner(System.in).nextInt();

				System.out.println("");
				System.out.println("Enter the arrival time of each students...");
				System.out.println("******************************************");

				int[] nStudents = new int[nstudents];
				
				for (int j = 0; j < nstudents; j++) {

					System.out.print("Arrival Time- Student " + (j + 1) + ": ");
					nStudents[j] = new Scanner(System.in).nextInt();
				}
				
//			System.out.println();
				System.err.println(AngryProfAct(threshhold, nStudents));

			}
		} else {
			System.out.println("Error! Enter values between 1 and 10");
		}

	}

}