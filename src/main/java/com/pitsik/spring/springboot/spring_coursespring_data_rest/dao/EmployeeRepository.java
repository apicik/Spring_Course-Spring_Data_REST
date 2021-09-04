package com.pitsik.spring.springboot.spring_coursespring_data_rest.dao;

import com.pitsik.spring.springboot.spring_coursespring_data_rest.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {
}
