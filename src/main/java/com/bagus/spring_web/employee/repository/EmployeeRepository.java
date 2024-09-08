package com.bagus.spring_web.employee.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.bagus.spring_web.employee.model.Employee;

@Repository
@Transactional
public interface  EmployeeRepository extends JpaRepository<Employee, Integer> {
    
}
