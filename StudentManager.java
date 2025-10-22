import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StudentManager {
    private List<Student> students;
    private Scanner scanner;

    public StudentManager() {
        students = new ArrayList<>();
        scanner = new Scanner(System.in);
    }

    public void addStudent() {
        System.out.println("\n=== ADD NEW STUDENT ===");

        System.out.print("Enter Student ID: ");
        String id = scanner.nextLine();

        if (findStudentById(id) != null) {
            System.out.println("Error: Student with ID " + id + " already exists!");
            return;
        }

        System.out.print("Enter Name: ");
        String name = scanner.nextLine();

        System.out.print("Enter Age: ");
        int age = Integer.parseInt(scanner.nextLine());

        System.out.print("Enter Marks: ");
        double marks = Double.parseDouble(scanner.nextLine());

        Student student = new Student(id, name, age, marks);
        students.add(student);
        System.out.println("Student added successfully!");
    }

    public void viewAllStudents() {
        System.out.println("\n=== ALL STUDENTS ===");
        if (students.isEmpty()) {
            System.out.println("No students found!");
            return;
        }

        System.out.println("Total Students: " + students.size());
        System.out.println("------------------------------------------------------------");
        for (int i = 0; i < students.size(); i++) {
            System.out.println((i + 1) + ". " + students.get(i));
        }
    }

    public void viewStudent() {
        System.out.print("\nEnter Student ID to view: ");
        String id = scanner.nextLine();

        Student student = findStudentById(id);
        if (student != null) {
            System.out.println("\n=== STUDENT DETAILS ===");
            System.out.println(student);
        } else {
            System.out.println("Student with ID " + id + " not found!");
        }
    }

    public void updateStudent() {
        System.out.print("\nEnter Student ID to update: ");
        String id = scanner.nextLine();

        Student student = findStudentById(id);
        if (student == null) {
            System.out.println("Student with ID " + id + " not found!");
            return;
        }

        System.out.println("\nCurrent Details:");
        System.out.println(student);

        System.out.println("\n=== UPDATE STUDENT ===");
        System.out.println("1. Update Name");
        System.out.println("2. Update Age");
        System.out.println("3. Update Marks");
        System.out.println("4. Update All");
        System.out.print("Choose option: ");

        int choice = Integer.parseInt(scanner.nextLine());

        switch (choice) {
            case 1:
                System.out.print("Enter new Name: ");
                student.setName(scanner.nextLine());
                break;
            case 2:
                System.out.print("Enter new Age: ");
                student.setAge(Integer.parseInt(scanner.nextLine()));
                break;
            case 3:
                System.out.print("Enter new Marks: ");
                student.setMarks(Double.parseDouble(scanner.nextLine()));
                break;
            case 4:
                System.out.print("Enter new Name: ");
                student.setName(scanner.nextLine());
                System.out.print("Enter new Age: ");
                student.setAge(Integer.parseInt(scanner.nextLine()));
                System.out.print("Enter new Marks: ");
                student.setMarks(Double.parseDouble(scanner.nextLine()));
                break;
            default:
                System.out.println("Invalid option!");
                return;
        }

        System.out.println("Student updated successfully!");
    }

    public void deleteStudent() {
        System.out.print("\nEnter Student ID to delete: ");
        String id = scanner.nextLine();

        Student student = findStudentById(id);
        if (student == null) {
            System.out.println("Student with ID " + id + " not found!");
            return;
        }

        System.out.println("\nStudent to delete:");
        System.out.println(student);
        System.out.print("Are you sure you want to delete this student? (y/n): ");
        String confirmation = scanner.nextLine();

        if (confirmation.equalsIgnoreCase("y")) {
            students.remove(student);
            System.out.println("Student deleted successfully!");
        } else {
            System.out.println("Deletion cancelled.");
        }
    }

    private Student findStudentById(String id) {
        for (Student student : students) {
            if (student.getStudentId().equalsIgnoreCase(id)) {
                return student;
            }
        }
        return null;
    }

}
