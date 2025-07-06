import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

/**
 * The main entry point for the Student Record Management System.
 * It provides a command-line interface for the administrator.
 */
public class Main {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Welcome to the Student Record Management System");

        while (true) {
            displayMenu();
            int choice = getIntegerInput("Enter your choice: ");

            switch (choice) {
                case 1:
                    handleAddStudent();
                    break;
                case 2:
                    handleUpdateStudent();
                    break;
                case 3:
                    handleViewStudents();
                    break;
                case 4:
                    System.out.println("Thank you for using the system. Goodbye!");
                    scanner.close();
                    return; // Exit the program
                default:
                    System.out.println("Invalid choice. Please enter a number between 1 and 4.");
            }
            System.out.println(); // Add a blank line for better readability
        }
    }

    /**
     * Displays the administrator menu.
     */
    private static void displayMenu() {
        System.out.println("-----------------------------------------");
        System.out.println("Administrator Menu:");
        System.out.println("1. Add a new student");
        System.out.println("2. Update student information");
        System.out.println("3. View all student details");
        System.out.println("4. Exit");
        System.out.println("-----------------------------------------");
    }

    /**
     * Handles the logic for adding a new student.
     */
    private static void handleAddStudent() {
        System.out.println("\n--- Add New Student ---");
        System.out.print("Enter student name: ");
        String name = scanner.nextLine();
        int age = getIntegerInput("Enter student age: ");
        System.out.print("Enter student grade: ");
        String grade = scanner.nextLine();

        StudentManagementSystem.addStudent(name, age, grade);
    }

    /**
     * Handles the logic for updating an existing student.
     */
    private static void handleUpdateStudent() {
        System.out.println("\n--- Update Student Information ---");
        int id = getIntegerInput("Enter the ID of the student to update: ");

        if (StudentManagementSystem.findStudentById(id) == null) {
            System.out.println("Error: Student with ID " + id + " not found.");
            return;
        }

        System.out.print("Enter new name: ");
        String newName = scanner.nextLine();
        int newAge = getIntegerInput("Enter new age: ");
        System.out.print("Enter new grade: ");
        String newGrade = scanner.nextLine();

        if (StudentManagementSystem.updateStudent(id, newName, newAge, newGrade)) {
            System.out.println("Student information updated successfully.");
        }
    }

    /**
     * Handles the logic for displaying all students.
     */
    private static void handleViewStudents() {
        System.out.println("\n--- All Student Details ---");
        List<Student> students = StudentManagementSystem.getAllStudents();
        if (students.isEmpty()) {
            System.out.println("No students have been added to the system yet.");
        } else {
            for (Student student : students) {
                System.out.println(student.toString());
            }
        }
    }

    /**
     * Safely gets an integer input from the user, handling invalid inputs.
     * @param prompt The message to display to the user.
     * @return The integer value entered by the user.
     */
    private static int getIntegerInput(String prompt) {
        int value = 0;
        while (true) {
            try {
                System.out.print(prompt);
                value = scanner.nextInt();
                scanner.nextLine(); // Consume the leftover newline character
                return value;
            } catch (InputMismatchException e) {
                System.out.println("Invalid input. Please enter a valid number.");
                scanner.nextLine(); // Clear the invalid input from the scanner
            }
        }
    }
}
