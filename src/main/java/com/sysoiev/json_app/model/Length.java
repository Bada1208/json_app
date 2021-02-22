package com.sysoiev.json_app.model;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
@Data
@NoArgsConstructor
public class Length {

    @Id
    @GeneratedValue
    private Long id;

    private String unit;

    private Double value;

    public Length(String unit, Double value) {
        this.unit = unit;
        this.value = value;
    }

}
