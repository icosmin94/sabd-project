package com.sabd.model;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

import static javax.persistence.GenerationType.IDENTITY;

@Entity
@Getter
@Setter
@EqualsAndHashCode(of="id")
@Table(name = "Component")
public class Component {
    @Id @GeneratedValue(strategy = IDENTITY)
    public Integer id;
    public String name;
    public Float price;

    @ManyToOne
    @JoinColumn(name = "Car_id")
    public Car car;
}
