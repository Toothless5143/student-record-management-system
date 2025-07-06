/**
 * Represents a student with personal and academic details.
 * This class encapsulates student data using private fields and provides
 * public methods for controlled access (getters and setters).
 */
public class Student {
    // Private instance variables for data encapsulation
    private int id;
    private String name;
    private int age;
    private String grade;

    /**
     * Constructs a new Student object.
     * @param id The unique identifier for the student.
     * @param name The name of the student.
     * @param age The age of the student.
     * @param grade The current grade of the student.
     */
    public Student(int id, String name, int age, String grade) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.grade = grade;
    }

    // --- Getters ---
    public int getId() { return id; }
    public String getName() { return name; }
    public int getAge() { return age; }
    public String getGrade() { return grade; }

    // --- Setters ---
    public void setName(String name) { this.name = name; }
    public void setAge(int age) { this.age = age; }
    public void setGrade(String grade) { this.grade = grade; }

    /**
     * Returns a string representation of the student object.
     * @return A formatted string with the student's details.
     */
    @Override
    public String toString() {
        return "ID: " + id + ", Name: " + name + ", Age: " + age + ", Grade: " + grade;
    }
}
