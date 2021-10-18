package com.vayox.sge.repository;
import org.springframework.data.jpa.repository.JpaRepository;

import com.vayox.sge.entity.Student;

public interface StudentRepository extends JpaRepository<Student, Long>{

}