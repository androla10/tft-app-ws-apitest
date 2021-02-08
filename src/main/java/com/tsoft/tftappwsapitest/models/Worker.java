package com.tsoft.tftappwsapitest.models;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.io.Serializable;
import java.math.BigDecimal;

@Entity
public class Worker implements Serializable {
    @Id
    private Long id;
    private String firstName;
    private String lastName;
    private String secondSurName;
    private Integer age;
    private boolean isPayroll;
    private BigDecimal salary;
    private String gender;
}
