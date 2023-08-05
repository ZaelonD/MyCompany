package model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.time.LocalDate;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Employee {

    private Long id;
    private String name;
    private String surName;
    private LocalDate dateOfBirth;
    private int age;
    private BigDecimal salary;

    public Employee(String name, String surName, LocalDate dateOfBirth, int age, BigDecimal salary) {
        this.name = name;
        this.surName = surName;
        this.dateOfBirth = dateOfBirth;
        this.age = age;
        this.salary = salary;
    }
}
