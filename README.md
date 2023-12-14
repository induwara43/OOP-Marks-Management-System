# OOP Marks Management System

## Overview
This is a simple Java application for managing OOP (Object-Oriented Programming) marks for students. The system allows users to enter and view student marks, as well as delete entries.
This project was developed as part of a university assignment for OOP Course module. It showcases the application of Java, Swing, and database integration for managing student marks.

## Features
- Enter and save student marks including CA (Continuous Assessment), Practical, and Theory.
- View all entered marks in a tabular format.
- Delete specific entries based on student ID.

## Technologies Used
- **Java**: Programming language used for application logic.
- **Swing**: Java GUI toolkit used for building the graphical user interface.
- **MySQL**: Relational database used for storing and retrieving student marks.
- **JDBC**: Java Database Connectivity for connecting Java applications with the database.

## Project Structure
The project is structured as follows:
- `com.mycompany.oopmarks`: Main package containing Java classes for the application.
  - `Students.java`: Class representing a student with ID, name, CA, practical, and theory marks.
  - `EnterMarks.java`: GUI form for entering student marks.
  - `ViewMarks.java`: GUI form for viewing all entered marks.
  - `marksCRUD.java`: Class handling CRUD operations for student marks in the database.
  - `DBconnection.java`: Class for establishing a connection to the MySQL database.
  - `OOPmarks.java`: Main class to run the application.

## Usage
1. Compile and run the `OOPmarks.java` file to start the application.
2. Use the "Enter Student OOP Marks" form to input student marks.
3. View all entered marks using the "View Student OOP Marks" form.
4. Optionally, delete entries by selecting a row and clicking the "Delete" button.

## Requirements
- Java Development Kit (JDK)
- Apache NetBeans (or any Java IDE)
- MySQL database

## Database Configuration
- Database name: `oopresults`
- Database connection details are configured in `DBconnection.java`. Modify the URL, username, and password as needed.
