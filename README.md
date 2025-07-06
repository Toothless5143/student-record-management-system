# Student Record Management System

![Java](https://img.shields.io/badge/language-Java-blue.svg?style=for-the-badge&logo=java)
![License](https://img.shields.io/badge/license-MIT-green.svg?style=for-the-badge)

A robust, command-line based Student Record Management System built in Java. This application provides administrators with essential tools to manage student data, including adding new students, updating existing records, and viewing all entries.

This project was created as a university assignment to demonstrate fundamental Java programming concepts, object-oriented design, and best practices in software architecture.

## 📋 Table of Contents

- [Features](#-features)
- [Project Structure](#-project-structure)
- [Getting Started](#-getting-started)
  - [Prerequisites](#prerequisites)
  - [Installation & Execution](#installation--execution)
- [Usage](#-usage)
- [Architectural Design](#-architectural-design)
- [License](#-license)

## ✨ Features

- **Create Students**: Add new students with a name, age, and grade.
- **Update Students**: Modify the information of an existing student using their unique ID.
- **View Students**: Display a clean, formatted list of all students in the system.
- **Automatic ID Generation**: Ensures every student receives a unique, auto-incremented ID.
- **Interactive CLI**: A user-friendly, menu-driven interface for seamless operation.
- **Robust Error Handling**: Prevents crashes from invalid user inputs (e.g., text instead of numbers) and handles logical errors (e.g., student ID not found).

## 📂 Project Structure

The system is designed with a clear separation of concerns, dividing the logic into three distinct classes:
```
/
├── Student.java // The Model: Represents a student entity with encapsulated data.
├── StudentManagementSystem.java // The Controller/Service: Handles all business logic for data manipulation.
└── Main.java // The View/Entry-Point: Manages the CLI and user interaction.
```


## 🚀 Getting Started

Follow these steps to get a local copy up and running.

### Prerequisites

You must have the Java Development Kit (JDK) installed on your machine.
- [Java SE Development Kit (JDK)](https://www.oracle.com/java/technologies/javase-downloads.html) - Version 8 or higher.

### Installation & Execution

1.  **Clone the repository**
    ```sh
    git clone https://github.com/toothless5143/student-record-management-system.git
    ```
2.  **Navigate to the project directory**
    ```sh
    cd student-record-management-system
    ```
3.  **Compile the Java source files**
    ```sh
    javac *.java
    ```
4.  **Run the application**
    ```sh
    java Main
    ```

## 💻 Usage

Once the program is running, you will be greeted with the main menu. Enter the number corresponding to the desired action and press `Enter`. The application will guide you through the process with on-screen prompts.
```
Welcome to the Student Record Management System
Administrator Menu:
Add a new student
Update student information
View all student details
Exit
Enter your choice: 1
```
## 🏗️ Architectural Design

- **Encapsulation**: The `Student` class uses `private` fields with `public` getters and setters to protect data integrity.
- **Static Service Class**: As per assignment requirements, `StudentManagementSystem` uses `static` methods and a `static` list to provide a single, global access point for student data management without needing instantiation.
- **Separation of Concerns**: The project is divided into a data model (`Student`), a logic controller (`StudentManagementSystem`), and a user interface (`Main`), making the code modular, readable, and easy to maintain.
- **Dynamic Data Structure**: An `ArrayList` is used to store students, allowing the system to scale dynamically without a fixed size limit.

## 📜 License

This project is distributed under the MIT License. See `LICENSE.txt` for more information.
