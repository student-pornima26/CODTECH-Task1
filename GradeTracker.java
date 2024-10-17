
import java.util.Scanner;

class Student {
    private String name;
    private double[] grades;
    private int numOfGrades;

    public Student(String name, int numOfGrades) {
        this.name = name;
        this.numOfGrades = numOfGrades;
        grades = new double[numOfGrades];
    }

    public void inputGrades() {
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < numOfGrades; i++) {
            System.out.print("Enter grade for subject " + (i + 1) + ": ");
            grades[i] = scanner.nextDouble();
        }
    }

    public double calculateAverage() {
        double sum = 0;
        for (double grade : grades) {
            sum += grade;
        }
        return sum / numOfGrades;
    }

    public String getLetterGrade(double average) {
        if (average >= 90) {
            return "A";
        } else if (average >= 80) {
            return "B";
        } else if (average >= 70) {
            return "C";
        } else if (average >= 60) {
            return "D";
        } else if (average >= 50) {
            return "E";
        } else {
            return "F";
        }
    }

    public double calculateGPA(double average) {
        if (average >= 90) {
            return 9.0;
        } else if (average >= 80) {
            return 8.0;
        } else if (average >= 70) {
            return 7.0;
        } else if (average >= 60) {
            return 6.0;
        } else if (average >= 50) {
            return 5.0;
        } else if (average >= 40) {
            return 4.0;
        } else {
            return 0.0;
        }
    }

    public void displayInfo() {
        double average = calculateAverage();
        String letterGrade = getLetterGrade(average);
        double gpa = calculateGPA(average);

        System.out.println("Student Name: " + name);
        System.out.println("Average Grade: " + average);
        System.out.println("Letter Grade: " + letterGrade);
        System.out.println("GPA: " + gpa);
    }
}

public class GradeTracker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter student name: ");
        String name = scanner.nextLine();
        System.out.print("Enter the number of subjects: ");
        int numOfSubjects = scanner.nextInt();

        Student student = new Student(name, numOfSubjects);
        student.inputGrades();
        student.displayInfo();

        scanner.close();
    }
}
