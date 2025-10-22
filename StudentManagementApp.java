import java.util.Scanner;

public class StudentManagementApp {
    private StudentManager studentManager;
    private Scanner scanner;
    private boolean running;

    public StudentManagementApp() {
        studentManager = new StudentManager();
        scanner = new Scanner(System.in);
        running = true;
    }

    public void start() {
        System.out.println("====================================");
        System.out.println("   STUDENT MANAGEMENT SYSTEM");
        System.out.println("====================================");

        while (running) {
            displayMenu();
            int choice = getMenuChoice();
            processChoice(choice);
        }

        scanner.close();
        System.out.println("Thank you for using Student Management System!");
    }

    private void displayMenu() {
        System.out.println("\n=== MAIN MENU ===");
        System.out.println("1. Add New Student");
        System.out.println("2. View All Students");
        System.out.println("3. View Student by ID");
        System.out.println("4. Update Student");
        System.out.println("5. Delete Student");
        System.out.println("6. Exit");
        System.out.print("Choose an option (1-7): ");
    }

    private int getMenuChoice() {
        try {
            return Integer.parseInt(scanner.nextLine());
        } catch (NumberFormatException e) {
            return -1;
        }
    }

    private void processChoice(int choice) {
        switch (choice) {
            case 1:
                studentManager.addStudent();
                break;
            case 2:
                studentManager.viewAllStudents();
                break;
            case 3:
                studentManager.viewStudent();
                break;
            case 4:
                studentManager.updateStudent();
                break;
            case 5:
                studentManager.deleteStudent();
                break;
            case 6:
                running = false;
                break;
            default:
                System.out.println("Invalid option! Please choose 1-7.");
        }
    }

    public static void main(String[] args) {
        StudentManagementApp app = new StudentManagementApp();
        app.start();
    }
}