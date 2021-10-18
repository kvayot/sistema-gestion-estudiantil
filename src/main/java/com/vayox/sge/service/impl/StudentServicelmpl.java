package com.vayox.sge.service.impl;

import java.util.List;

import com.vayox.sge.service.StudentService;
import org.springframework.stereotype.Service;

import com.vayox.sge.entity.Student;
import com.vayox.sge.repository.StudentRepository;

@Service
public class StudentServicelmpl implements StudentService {

    private StudentRepository studentRepository;

    public StudentServicelmpl(StudentRepository studentRepository) {
        super();
        this.studentRepository = studentRepository;
    }

    @Override
    public List<Student> getAllStudents() {
        return studentRepository.findAll();
    }

    @Override
    public Student saveStudent(Student student) {
        return studentRepository.save(student);
    }

    @Override
    public Student getStudentById(Long id) {
        return studentRepository.findById(id).get();
    }

    @Override
    public Student updateStudent(Student student) {
        return studentRepository.save(student);
    }

    @Override
    public void deleteStudentById(Long id) {
        studentRepository.deleteById(id);
    }

}