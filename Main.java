import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);
    static ArrayList<Student> students = new ArrayList<>();

    public static void main(String[] args) {
        while (true) {
            System.out.println("\n--- Student Grade System ---");
            System.out.println("1. Add Student");
            System.out.println("2. Display All Students");
            System.out.println("3. Exit");
            System.out.print("Enter choice: ");
            int choice = sc.nextInt();

            switch (choice) {
                case 1: addStudent(); break;
                case 2: displayStudents(); break;
                case 3: System.exit(0);
                default: System.out.println("Invalid Choice!");
            }
        }
    }

    static void addStudent() {
        sc.nextLine();  // Clear buffer
        System.out.print("Enter name: ");
        String name = sc.nextLine();
        System.out.print("Enter marks (out of 100): ");
        int marks = sc.nextInt();

        Student s = new Student(name, marks);
        students.add(s);
        System.out.println("Student added successfully!");
    }

    static void displayStudents() {
        if (students.isEmpty()) {
            System.out.println("No student records found.");
            return;
        }

        System.out.println("\nName\tMarks\tGrade");
        for (Student s : students) {
            System.out.println(s.getName() + "\t" + s.getMarks() + "\t" + s.getGrade());
        }
    }
}

