package com.example.StudentManagementSystem.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.StudentManagementSystem.model.Student;

public interface StudentRepository extends JpaRepository<Student,Long> {
    //crud
 }
