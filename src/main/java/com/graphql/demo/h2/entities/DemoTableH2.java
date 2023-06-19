package com.graphql.demo.h2.entities;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Getter
@Setter
@Table(name = "demo_table_h2")
public class DemoTableH2 {

    @Id
    @Column(name = "id")
    private Integer id;
    @Column(name = "col1")
    private String col1;
    @Column(name = "col2")
    private String col2;

}
