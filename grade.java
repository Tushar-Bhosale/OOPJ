import java.util.Scanner;
class Grade{
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter the numerical grade:");
		int numGrade = scanner.nextInt();
		
		char grade;
		
		if(numGrade >= 90) {
			grade = 'A';
		}
		else if (numGrade >= 80) {
			grade = 'B';
		}
		else if (numGrade >= 70) {
			grade = 'C';
		}
		else if (numGrade >= 60) {
			grade = 'D';
		}
		else
			grade = 'F';
		
		System.out.println(grade);
		
		scanner.close();
		
	}
	
	
}