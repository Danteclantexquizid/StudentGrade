//student grade
//Danson Njenga Wambui
//ADM:CT101/G/20010/23

//Allows the use of a scanner
import java.util.Scanner;

// Student Class
class Student {
    private String name;
    private double marks;

    // Constructor to initialize attributes
    public Student(String name, double marks) {
        this.name = name;
        this.marks = marks;
    }

    // Getter methods
    public String getName() {
        return name;
    }

    public double getMarks() {
        return marks;
    }

    // display student details
    public void displayDetails(String grade) {
        System.out.println("Student Name: " + name);
        System.out.println("Marks: " + marks);
        System.out.println("Grade: " + grade);
    }
}

// GradeCalculator Class
class GradeCalculator {
    //  calculate grade based on marks
    public String calculateGrade(double marks) {
        if (marks >= 90) {
            return "A";
        } else if (marks >= 75) {
            return "B";
        } else if (marks >= 50) {
            return "C";
        } else {
            return "D";
        }
    }
}

// MainApp Class
public class MainApp {
    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Asks the user to enter their name
        System.out.print("Enter student name: ");
        String name = scanner.nextLine();

        // Asks the user to enter their marks
        System.out.print("Enter student marks: ");
        double marks = scanner.nextDouble();

        // Create Student object
        Student student = new Student(name, marks);

        // Calculate grade using GradeCalculator
        GradeCalculator calculator = new GradeCalculator();
        String grade = calculator.calculateGrade(marks);

        // Display student details and grade
        student.displayDetails(grade);

        scanner.close();
    }
}
