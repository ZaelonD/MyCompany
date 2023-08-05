package service;

import lombok.AllArgsConstructor;
import model.Employee;
import org.springframework.stereotype.Service;
import repository.EmployeeRepo;

import java.util.List;

@Service
@AllArgsConstructor
public class ServiceEmployee {

    EmployeeRepo employeeRepo;

    public List<Employee> getAllEmployee() {
        return List.of(new Employee());
    }

    public Employee saveEmployee(Employee employee) {
        return employeeRepo.save(employee);
    }
}
