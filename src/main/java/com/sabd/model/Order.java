package com.sabd.model;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;
import java.util.Set;

import static javax.persistence.GenerationType.IDENTITY;

@Entity
@Getter
@Setter
@EqualsAndHashCode(of="id")
@Table(name = "Order")
public class Order {
    @Id
    @GeneratedValue(strategy = IDENTITY)
    public Integer id;
    @Column(name = "quantiy")
    public Integer quantity;

    @ManyToOne
    @JoinColumn(name = "User_id")
    public User user;

    @ManyToOne
    @JoinColumn(name = "Component_id")
    public Component component;
}
