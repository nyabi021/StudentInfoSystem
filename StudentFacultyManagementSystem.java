package org.example;

import java.util.ArrayList; // Import ArrayList class
import java.util.List; // Import List interface

class Student { // Define Student class
    private final String studentId; // Student ID
    private String name; // Student name
    private String department; // Department
    private String ssn; // Social Security Number (SSN)

    public Student(String studentId, String name, String department, String ssn) { // Constructor
        this.studentId = studentId; // Initialize student ID
        this.name = name; // Initialize name
        this.department = department; // Initialize department
        this.ssn = ssn; // Initialize SSN
    }

    public String getStudentId() { // Return student ID
        return studentId;
    }

    public String getName() { // Return student name
        return name;
    }

    public void setName(String name) { // Set student name
        this.name = name;
    }

    public void setDepartment(String department) { // Set department
        this.department = department;
    }

    public void setSsn(String ssn) { // Set SSN
        this.ssn = ssn;
    }

    @Override
    public String toString() { // Return student information as a string
        return "Student ID: " + studentId + ", Name: " + name + ", Department: " + department + ", SSN: " + ssn;
    }
}

class Professor { // Define Professor class
    private final String professorId; // Professor ID
    private String name; // Professor name
    private String department; // Department
    private String ssn; // Social Security Number (SSN)

    public Professor(String professorId, String name, String department, String ssn) { // Constructor
        this.professorId = professorId; // Initialize professor ID
        this.name = name; // Initialize name
        this.department = department; // Initialize department
        this.ssn = ssn; // Initialize SSN
    }

    public String getProfessorId() { // Return professor ID
        return professorId;
    }

    public String getName() { // Return professor name
        return name;
    }

    public void setName(String name) { // Set professor name
        this.name = name;
    }

    public void setDepartment(String department) { // Set department
        this.department = department;
    }

    public void setSsn(String ssn) { // Set SSN
        this.ssn = ssn;
    }

    @Override
    public String toString() { // Return professor information as a string
        return "Professor ID: " + professorId + ", Name: " + name + ", Department: " + department + ", SSN: " + ssn;
    }
}

class UniversityManagement { // Define University Management class
    private final List<Student> students; // List of students
    private final List<Professor> professors; // List of professors

    public UniversityManagement() { // Constructor
        students = new ArrayList<>(); // Initialize student list
        professors = new ArrayList<>(); // Initialize professor list
    }

    // Student management
    public void addStudent(Student student) { // Add student
        students.add(student);
    }

    public void updateStudent(String studentId, String name, String department, String ssn) { // Update student information
        for (Student student : students) { // Search in student list
            if (student.getStudentId().equals(studentId)) { // If student ID matches
                student.setName(name); // Update name
                student.setDepartment(department); // Update department
                student.setSsn(ssn); // Update SSN
                break; // Exit after update
            }
        }
    }

    public void deleteStudent(String studentId) { // Delete student
        students.removeIf(student -> student.getStudentId().equals(studentId)); // Remove if student ID matches
    }

    public Student findStudentByIdOrName(String studentId, String name) { // Find student by ID or name
        for (Student student : students) { // Search in student list
            if (student.getStudentId().equals(studentId) || student.getName().equalsIgnoreCase(name)) { // If student ID or name matches
                return student; // Return student
            }
        }
        return null; // Return null if no match found
    }

    // Professor management
    public void addProfessor(Professor professor) { // Add professor
        professors.add(professor);
    }

    public void updateProfessor(String professorId, String name, String department, String ssn) { // Update professor information
        for (Professor professor : professors) { // Search in professor list
            if (professor.getProfessorId().equals(professorId)) { // If professor ID matches
                professor.setName(name); // Update name
                professor.setDepartment(department); // Update department
                professor.setSsn(ssn); // Update SSN
                break; // Exit after update
            }
        }
    }

    public void deleteProfessor(String professorId) { // Delete professor
        professors.removeIf(professor -> professor.getProfessorId().equals(professorId)); // Remove if professor ID matches
    }

    public Professor findProfessorByIdOrName(String professorId, String name) { // Find professor by ID or name
        for (Professor professor : professors) { // Search in professor list
            if (professor.getProfessorId().equals(professorId) || professor.getName().equalsIgnoreCase(name)) { // If professor ID or name matches
                return professor; // Return professor
            }
        }
        return null; // Return null if no match found
    }

    // Display all students
    public void displayAllStudents() {
        for (Student student : students) { // Print each student in the list
            System.out.println(student);
        }
    }

    // Display all professors
    public void displayAllProfessors() {
        for (Professor professor : professors) { // Print each professor in the list
            System.out.println(professor);
        }
    }
}