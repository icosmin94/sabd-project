package com.sabd.model;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Set;

import static javax.persistence.GenerationType.IDENTITY;

@Entity
@Getter
@Setter
@EqualsAndHashCode(of="id")
@Table(name = "Car")
public class Car {
    @Id
    @GeneratedValue(strategy = IDENTITY)
    public Integer id;
    public String name;
    public String model;

    @OneToMany(mappedBy = "car")
    public Set<Component> components;
}
