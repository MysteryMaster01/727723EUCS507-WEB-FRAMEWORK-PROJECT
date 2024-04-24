package com.login.login.model;

import java.sql.Date;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
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
public class Attendance {
    @Id
    public int id;
    // @GeneratedValue(strategy =GenerationType.IDENTITY)
    // public int no;
    public String date;
    public String Present;

    @OneToMany(mappedBy="attendance",cascade = CascadeType.REMOVE)
    private List<PF> pf;

}
