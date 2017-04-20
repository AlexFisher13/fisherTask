package com.example.model;

import lombok.Data;

import javax.persistence.*;

/**
 * Created by Михан on 20.04.2017.
 */

@Data
@Entity
@Table
public class Task {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String name;

}
