package com.example.prueba321.entity;

import javax.persistence.*;

@Entity
@Table(name = "regions")
public class Region {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "region_id")
    private int regionid;

    @Column(name = "region_name")
    private String regionname;

}
