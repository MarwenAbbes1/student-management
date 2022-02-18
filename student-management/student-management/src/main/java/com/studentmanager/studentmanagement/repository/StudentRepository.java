package com.studentmanager.studentmanagement.repository;
import org.springframework.data.jpa.repository.JpaRepository;

import com.studentmanager.studentmanagement.entity.Student;

public interface StudentRepository extends JpaRepository<Student, Long>{

}
