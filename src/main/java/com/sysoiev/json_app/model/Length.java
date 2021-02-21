package com.sysoiev.json_app.model;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@Data
public class Length {

    @Id
    private Long id;
    private String unit;
    private Double value;
}
