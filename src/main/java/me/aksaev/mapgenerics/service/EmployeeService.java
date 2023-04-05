package me.aksaev.mapgenerics.service;

import me.aksaev.mapgenerics.model.Employee;
import java.util.Collection;
import java.util.Collections;


public interface EmployeeService {
    Employee addEmployee(String firstName, String lastName);
    Employee removeEmployee(String firstName, String lastName);
    Employee findEmployee(String firstName, String lastName);
    Collection<Employee> findAllEmployee();
}