package com.springsecurity6.repositroy;

import com.springsecurity6.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepositroy extends JpaRepository<Employee,Long> {

    public Employee findByEmail(String email);
}
