package com.example.StudentManagementSystem.model;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "student")

public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column(name="first name",nullable = false)
    private long firstName;
    @Column(name="Last name",nullable = false)
    private String lastName;
    @Column(name="email id",nullable = false)
    private String email;  
    @Column(name="Department",nullable = false)
    private String Department;
    @Column(name = "year of Enrollment",nullable = false)
    private String yearOfEnrollment;
}
