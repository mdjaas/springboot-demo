package com.employee.payroll;

import org.springframework.data.jpa.repository.JpaRepository;

public interface employeerepository extends JpaRepository<Employee, Long> {

}
