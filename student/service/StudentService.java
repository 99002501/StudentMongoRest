package com.student.service;
import java.util.List;

import com.student.exception.StudentNotFoundException;
import com.student.model.Student;



public interface StudentService {
 
    Student addStudent(Student student);
    Student getStudentById(Integer studentid) throws StudentNotFoundException;
    boolean deleteStudent(Integer studentid);
    List<Student> getStudentByCity(String city) throws StudentNotFoundException;
    List<Student> getStudentByDept(String dept) throws StudentNotFoundException;
    List<Student> findByAge(Integer age);
    
}
