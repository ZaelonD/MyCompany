package com.example.mycompany.employee;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.Period;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "employee")
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String surName;
    private LocalDate dateOfBirth;
    private String email;
    @Transient
    private int age;
    private BigDecimal salary;

    public Employee(String name, String surName, LocalDate dateOfBirth, String email, int age, BigDecimal salary) {
        this.name = name;
        this.surName = surName;
        this.dateOfBirth = dateOfBirth;
        this.email = email;
        this.age = age;
        this.salary = salary;
    }

    public int getAge() {
        return Period.between(this.dateOfBirth, LocalDate.now()).getYears();
    }
}
