package angryprofessor;

import java.util.Scanner;

public class AngryProfessorModified {
	int threshhold;
	int nStudents;
	int nTestCase;
	int nStudents1;

	String decision;

	public void AngryProfDecides() {
		System.out.print("Number of Test cases: ");
		nTestCase = new Scanner(System.in).nextInt();
		// Constraint 01 begin
		if (nTestCase >= 1 && nTestCase <= 10) {

			for (int i = 0; i < nTestCase; i++) {

				System.out.print("Enter Number of Students & threshold for Test Case-" + (i + 1) + ": ");
				String nstud_threshold = new Scanner(System.in).nextLine();
				String[] nstud_thresh = nstud_threshold.split(" ");
				for (int k = 0; k < nstud_thresh.length; k++) {

					nStudents1 = Integer.parseInt(nstud_thresh[0]);
					// Beginning of constraint 1<=N<=1000
					if (nStudents1 >= 1 && nStudents1 <= 1000) {
						nStudents = nStudents1;
						threshhold = Integer.parseInt(nstud_thresh[1]);
					} else {
						System.out.println("Error");
					} // End of constraint 1<=N<=1000

				}

				System.out.print("Enter the arrival time of each students: ");
				int nStudentsOnTime = 0;

				String nStrStudOnTime = new Scanner(System.in).nextLine();
				String[] nStudentsOnTimeArr = nStrStudOnTime.split(" ");

				for (int m = 0; m < nStudentsOnTimeArr.length; m++) {
//					
					int nStudentsArr = Integer.parseInt(nStudentsOnTimeArr[m]);
					if (nStudentsArr <= 0) {
						nStudentsOnTime++;
					}

				}
				if (nStudentsOnTime >= threshhold) {
					System.out.println("VERDIT: No, class is not cancelled\n");

				} else {
					System.out.println();
					System.err.println("VERDIT: Yes, class is cancelled\n");

				}

			}

		} else {
			System.err.println("Error! Only values between 1 and 10 allowed");
		}

	}

	public static void main(String[] args) {

		AngryProfessorModified2 call = new AngryProfessorModified2();
		call.AngryProfDecides();

	}

}