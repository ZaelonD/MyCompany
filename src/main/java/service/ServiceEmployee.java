package service;

import model.Employee;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ServiceEmployee {
    public List<Employee> getAllEmployee() {
        return List.of(new Employee());
    }
}
