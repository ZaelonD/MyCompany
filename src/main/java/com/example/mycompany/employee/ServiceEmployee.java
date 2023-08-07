package com.example.mycompany.employee;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.Month;
import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
public class ServiceEmployee {
    EmployeeRepo employeeRepo;

    public List<Employee> getAllEmployee() {
        return employeeRepo.findAll();
    }

    public Employee saveEmployee(Employee employee) {
        Optional<Employee> employeeOptional = employeeRepo.findByEmail(employee.getEmail());
        if (employeeOptional.isPresent()) {
            throw new IllegalStateException("this email is already exist");
        }
        return employeeRepo.save(employee);
    }
}
