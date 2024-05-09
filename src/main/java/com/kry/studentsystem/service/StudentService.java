package com.kry.studentsystem.service;

import java.util.List;

import com.kry.studentsystem.model.Student;

public interface StudentService {
public Student saveStudent(Student student);
public List<Student> getAllStudents();
}
