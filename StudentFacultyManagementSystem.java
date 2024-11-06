package org.example;

import java.util.ArrayList; // ArrayList 클래스 임포트
import java.util.List; // List 인터페이스 임포트

class Student { // 학생 클래스 정의
    private final String studentId; // 학생 ID
    private String name; // 학생 이름
    private String department; // 학과
    private String ssn; // 주민등록번호

    public Student(String studentId, String name, String department, String ssn) { // 생성자
        this.studentId = studentId; // 학생 ID 초기화
        this.name = name; // 이름 초기화
        this.department = department; // 학과 초기화
        this.ssn = ssn; // 주민등록번호 초기화
    }

    public String getStudentId() { // 학생 ID 반환
        return studentId;
    }

    public String getName() { // 학생 이름 반환
        return name;
    }

    public void setName(String name) { // 학생 이름 설정
        this.name = name;
    }

    public void setDepartment(String department) { // 학과 설정
        this.department = department;
    }

    public void setSsn(String ssn) { // 주민등록번호 설정
        this.ssn = ssn;
    }

    @Override
    public String toString() { // 학생 정보를 문자열로 반환
        return "Student ID: " + studentId + ", Name: " + name + ", Department: " + department + ", SSN: " + ssn;
    }
}

class Professor { // 교수 클래스 정의
    private final String professorId; // 교수 번호
    private String name; // 교수 이름
    private String department; // 학과
    private String ssn; // 주민등록번호

    public Professor(String professorId, String name, String department, String ssn) { // 생성자
        this.professorId = professorId; // 교수 번호 초기화
        this.name = name; // 이름 초기화
        this.department = department; // 학과 초기화
        this.ssn = ssn; // 주민등록번호 초기화
    }

    public String getProfessorId() { // 교수 번호 반환
        return professorId;
    }

    public String getName() { // 교수 이름 반환
        return name;
    }

    public void setName(String name) { // 교수 이름 설정
        this.name = name;
    }

    public void setDepartment(String department) { // 학과 설정
        this.department = department;
    }

    public void setSsn(String ssn) { // 주민등록번호 설정
        this.ssn = ssn;
    }

    @Override
    public String toString() { // 교수 정보를 문자열로 반환
        return "Professor ID: " + professorId + ", Name: " + name + ", Department: " + department + ", SSN: " + ssn;
    }
}

class UniversityManagement { // 학사 관리 클래스 정의
    private final List<Student> students; // 학생 목록
    private final List<Professor> professors; // 교수 목록

    public UniversityManagement() { // 생성자
        students = new ArrayList<>(); // 학생 목록 초기화
        professors = new ArrayList<>(); // 교수 목록 초기화
    }

    // 학생 관리
    public void addStudent(Student student) { // 학생 추가
        students.add(student);
    }

    public void updateStudent(String studentId, String name, String department, String ssn) { // 학생 정보 수정
        for (Student student : students) { // 학생 목록에서 검색
            if (student.getStudentId().equals(studentId)) { // 해당 학생 ID와 일치하는 경우
                student.setName(name); // 이름 수정
                student.setDepartment(department); // 학과 수정
                student.setSsn(ssn); // 주민등록번호 수정
                break; // 수정 후 종료
            }
        }
    }

    public void deleteStudent(String studentId) { // 학생 삭제
        students.removeIf(student -> student.getStudentId().equals(studentId)); // 해당 학생 ID와 일치하는 경우 삭제
    }

    public Student findStudentByIdOrName(String studentId, String name) { // 학생 ID 또는 이름으로 학생 검색
        for (Student student : students) { // 학생 목록에서 검색
            if (student.getStudentId().equals(studentId) || student.getName().equalsIgnoreCase(name)) { // 학생 ID 또는 이름이 일치하는 경우
                return student; // 학생 반환
            }
        }
        return null; // 일치하는 학생이 없는 경우 null 반환
    }

    // 교수 관리
    public void addProfessor(Professor professor) { // 교수 추가
        professors.add(professor);
    }

    public void updateProfessor(String professorId, String name, String department, String ssn) { // 교수 정보 수정
        for (Professor professor : professors) { // 교수 목록에서 검색
            if (professor.getProfessorId().equals(professorId)) { // 해당 교수 번호와 일치하는 경우
                professor.setName(name); // 이름 수정
                professor.setDepartment(department); // 학과 수정
                professor.setSsn(ssn); // 주민등록번호 수정
                break; // 수정 후 종료
            }
        }
    }

    public void deleteProfessor(String professorId) { // 교수 삭제
        professors.removeIf(professor -> professor.getProfessorId().equals(professorId)); // 해당 교수 번호와 일치하는 경우 삭제
    }

    public Professor findProfessorByIdOrName(String professorId, String name) { // 교수 번호 또는 이름으로 교수 검색
        for (Professor professor : professors) { // 교수 목록에서 검색
            if (professor.getProfessorId().equals(professorId) || professor.getName().equalsIgnoreCase(name)) { // 교수 번호 또는 이름이 일치하는 경우
                return professor; // 교수 반환
            }
        }
        return null; // 일치하는 교수가 없는 경우 null 반환
    }

    // 학생 목록 출력
    public void displayAllStudents() {
        for (Student student : students) { // 학생 목록에서 각 학생 출력
            System.out.println(student);
        }
    }

    // 교수 목록 출력
    public void displayAllProfessors() {
        for (Professor professor : professors) { // 교수 목록에서 각 교수 출력
            System.out.println(professor);
        }
    }
}