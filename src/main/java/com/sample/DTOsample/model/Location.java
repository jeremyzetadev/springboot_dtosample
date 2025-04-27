package com.sample.DTOsample.model;

import jakarta.persistence.*;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="locations")
public class Location {

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private long id;
    private String place;
    private String description;
    private double longitude;
    private double latitude;
}
