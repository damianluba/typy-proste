import java.util.Scanner;
public class SchoolMarks {
	static int numberOfSubjects;
	private static int[][] marks;
	int numberOfMarks, sum, fullsum, mark;
//	int[][] marks;//=new int[numberOfSubjects-1][numberOfMarks-1];
	
	public static void main(String args[]) {
		SchoolMarks firstYear = new SchoolMarks();
		firstYear.getMarks();
		for(int subject=0; subject<numberOfSubjects; subject++) {
			firstYear.SubjectAverage(subject, marks[subject].length);
		}
		firstYear.FullAverage(numberOfSubjects);
	}
	
	void getMarks() {
		System.out.print("Ile przedmiotów?");
		Scanner numberOfSubjectsScanner = new Scanner(System.in);
		numberOfSubjects = numberOfSubjectsScanner.nextInt();
		System.out.println("Ile ocen?");
		Scanner numberOfMarksScanner = new Scanner(System.in);
		numberOfMarks = numberOfMarksScanner.nextInt();
		Scanner marksScanner = new Scanner(System.in);
		System.out.println("Wpisuj");
		
		for(int subject = 0; subject<numberOfMarks; subject++) {
			for(int markIndex = 0; markIndex<numberOfMarks; markIndex++) {
				while(marks[subject][markIndex]<1 && marks[subject][markIndex]>6) {
					this.marks[subject][markIndex] = marksScanner.nextInt();
				}
			}
		}
	}
	
	double SubjectAverage(int subject, int numberOfMarks) {
		for(subject = 0; subject<numberOfSubjects; subject++) {
			for(mark = 0; mark<numberOfMarks; mark++) {
				sum += marks[subject][mark];
			}
		}
		return sum/numberOfMarks;
	}
	
	double FullAverage(int numberOfSubjects) {
		for(int subject = 0; subject<numberOfSubjects; subject++) {
			fullsum += SubjectAverage(subject, numberOfMarks);
		}
		return fullsum/numberOfSubjects;
	}
}
