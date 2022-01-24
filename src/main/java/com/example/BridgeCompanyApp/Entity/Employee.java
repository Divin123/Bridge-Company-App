package com.example.BridgeCompanyApp.Entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
/*import org.hibernate.annotations.ValueGenerationType;*/

import javax.persistence.*;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int Emp_id;
    @Column(nullable = false, unique = true, length = 40)
    String Employee_Name;
}
