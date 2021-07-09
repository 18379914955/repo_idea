package com.xukun.common.pojo;

import lombok.Data;

import javax.persistence.Id;
import javax.persistence.Table;

@Data
@Table(name = "department")
public class Department {

    @Id
    private Integer id;
    private String depName;
    private String depLocation;
}
