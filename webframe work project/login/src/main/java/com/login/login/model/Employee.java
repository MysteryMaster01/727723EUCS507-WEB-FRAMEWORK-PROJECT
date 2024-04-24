package com.login.login.model;

import com.fasterxml.jackson.annotation.JsonManagedReference;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
public class Employee {
    @Id
    @GeneratedValue(strategy =GenerationType.IDENTITY)
    private int no;
    private int EmployeeId;
    private String Employeename;
    private int EmployeeAge;
    private int EmployeeSalary;
    private String EmployeeAddress;
    private String EmployeeJoin;
    private int EmployeeExperience;

    @OneToOne(mappedBy = "employee",cascade = CascadeType.ALL)
    @JsonManagedReference
    private Login login;


    
}
