package com.example.demo.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Department {

    @Id
    @SequenceGenerator(name="MYSEQ", sequenceName="my_seq_id", allocationSize=1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "MYSEQ")
    private Long departmentId;

    @NotBlank(message = "Please add department name")
    private String departmentName;
    private String departmentAddress;
    private String departmentCode;
}
