import java.util.ArrayList;
import java.util.List;

/**
 * Provides static methods to manage a list of students.
 * This class handles the core logic of adding, updating, and viewing students,
 * operating on a static list of Student objects.
 */
public class StudentManagementSystem {

    // Private static variables as required by the assignment
    private static List<Student> studentList = new ArrayList<>();
    private static int nextStudentId = 1; // For auto-incrementing student IDs

    /**
     * Adds a new student to the system with a unique, auto-generated ID.
     * @param name The name of the new student.
     * @param age The age of the new student.
     * @param grade The grade of the new student.
     */
    public static void addStudent(String name, int age, String grade) {
        Student newStudent = new Student(nextStudentId, name, age, grade);
        studentList.add(newStudent);
        nextStudentId++; // Increment ID for the next student
        System.out.println("Student added successfully with ID: " + newStudent.getId());
    }

    /**
     * Finds a student by their ID.
     * @param id The ID of the student to find.
     * @return The Student object if found, otherwise null.
     */
    public static Student findStudentById(int id) {
        for (Student student : studentList) {
            if (student.getId() == id) {
                return student;
            }
        }
        return null; // Return null if no student with the given ID is found
    }

    /**
     * Updates the information of an existing student.
     * @param id The ID of the student to update.
     * @param newName The new name for the student.
     * @param newAge The new age for the student.
     * @param newGrade The new grade for the student.
     * @return true if the update was successful, false if the student was not found.
     */
    public static boolean updateStudent(int id, String newName, int newAge, String newGrade) {
        Student studentToUpdate = findStudentById(id);
        if (studentToUpdate != null) {
            studentToUpdate.setName(newName);
            studentToUpdate.setAge(newAge);
            studentToUpdate.setGrade(newGrade);
            return true;
        }
        return false; // Indicates that the student ID was not found
    }

    /**
     * Retrieves a list of all students in the system.
     * @return A List containing all Student objects.
     */
    public static List<Student> getAllStudents() {
        return studentList;
    }
}
