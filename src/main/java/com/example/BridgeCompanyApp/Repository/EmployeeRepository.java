package com.example.BridgeCompanyApp.Repository;

import com.example.BridgeCompanyApp.Entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepository extends JpaRepository <Employee, Integer> {
}
