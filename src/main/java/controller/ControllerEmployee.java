package controller;

import lombok.AllArgsConstructor;
import model.Employee;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import service.ServiceEmployee;

import java.util.List;

@RestController
@AllArgsConstructor
public class ControllerEmployee {
    ServiceEmployee serviceEmployee;
    @GetMapping
    public List<Employee> getAllEmployee() {
        return serviceEmployee.getAllEmployee();
    }

    @PostMapping
    public Employee saveEmployee(@RequestBody Employee employee) {
        return serviceEmployee.saveEmployee(employee);
    }
}
