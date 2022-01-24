package com.example.BridgeCompanyApp.Entity;

import lombok.*;

import javax.persistence.*;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Details {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int Salary;
    @Column(nullable = false, unique = true, length = 40)
    int Emp_id;
    int Dept_id;
}
