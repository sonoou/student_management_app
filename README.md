# Student Management System

A comprehensive Command-Line Interface (CLI) based CRUD (Create, Read, Update, Delete) system for managing student records, built with Java.

## 📋 Overview

This application provides a complete solution for managing student information through a simple and intuitive command-line interface. It demonstrates real-world data structure usage and object-oriented programming principles.

## ✨ Features

- **📝 Create**: Add new student records
- **👀 Read**: View all students or search by student ID
- **✏️ Update**: Modify existing student information (name, age, marks)
- **🗑️ Delete**: Remove student records with confirmation
- **🎯 Data Validation**: Prevents duplicate IDs and validates input
- **📁 Sample Data**: Pre-loaded sample records for testing
- **🛡️ Error Handling**: Robust input validation and error management

## 🏗️ Project Structure

```
StudentManagementSystem/
│
├── Student.java          # Student entity class
├── StudentManager.java   # Business logic and CRUD operations
├── StudentManagementApp.java # Main application and UI
└── README.md
```

## 🚀 Getting Started

### Prerequisites

- Java JDK 8 or higher
- VS Code or IntelliJ IDEA Community Edition

### Installation & Running

#### Using VS Code
1. Create a new Java project
2. Copy the three Java files into your folder
3. Run `StudentManagementApp.java`

#### Using IntelliJ IDEA CE
1. Create a new Java project
2. Add the three Java classes to your project
3. Run the `main` method in `StudentManagementApp`

#### Using Command Line
```bash
# Compile all Java files
javac *.java

# Run the application
java StudentManagementApp
```

## 📖 Usage Guide

### Main Menu Options

1. **Add New Student**
   - Enter Student ID, Name, Age, and Marks
   - Duplicate ID prevention

2. **View All Students**
   - Display all student records in formatted table
   - Shows total count of students

3. **View Student by ID**
   - Search for specific student using their ID
   - Detailed view of individual record

4. **Update Student**
   - Options to update name, age, marks, or all fields

5. **Delete Student**
   - Remove student records by ID
   - Confirmation prompt to prevent accidental deletion

6. **Add Sample Data**
   - Pre-loads sample records for testing
   - Includes 3 sample students

7. **Exit**
   - Safely close the application

## 💻 Code Architecture

### Student.java
- Entity class representing a student
- Private fields: `studentId`, `name`, `age`, `marks`
- Getters and setters with validation
- Formatted toString() method

### StudentManager.java
- Core business logic and CRUD operations
- Uses ArrayList for data storage
- Input validation and error handling
- Student search functionality

### StudentManagementApp.java
- Main application class
- User interface and menu management
- Application flow control

## 🛠️ Technical Details

- **Data Structure**: ArrayList for dynamic student storage
- **Input Handling**: Scanner with proper resource management
- **Validation**: Comprehensive input validation and error checking
- **OOP Principles**: Encapsulation, abstraction, and modular design
- **Memory Management**: Proper object lifecycle management

## 🎯 Learning Outcomes

This project demonstrates:
- Real-world CRUD operations
- ArrayList data structure implementation
- Object-oriented programming concepts
- User input handling and validation
- Menu-driven application design
- Java collections framework usage

## 🔧 Customization

You can extend this system by adding:
- Data persistence (file I/O or database)
- Additional student fields (email, phone, address)
- Search by name
- Sorting and filtering options
- Statistics and reporting features
- Export functionality

## Sample Output:
```
=== MAIN MENU ===
1. Add New Student
2. View All Students
3. View Student by ID
4. Update Student
5. Delete Student
6. Add Sample Data
7. Exit
Choose an option (1-7): 2

=== ALL STUDENTS ===
Total Students: 3
------------------------------------------------------------
1. ID: S001   | Name: John Doe        | Age: 20  | Marks: 85.50  | 
2. ID: S002   | Name: Jane Smith      | Age: 22  | Marks: 92.00  | 
3. ID: S003   | Name: Mike Johnson    | Age: 21  | Marks: 78.50  | 
```

This system provides a complete CRUD implementation using ArrayList and demonstrates real-world data structure usage with proper object-oriented design principles.

## 🤝 Contributing

Feel free to fork this project and submit pull requests for any enhancements.



