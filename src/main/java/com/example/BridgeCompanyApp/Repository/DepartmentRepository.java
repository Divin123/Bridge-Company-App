package com.example.BridgeCompanyApp.Repository;

import com.example.BridgeCompanyApp.Entity.Department;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DepartmentRepository extends JpaRepository<Department, Integer> {
}
