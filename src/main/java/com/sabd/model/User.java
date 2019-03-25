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
@Table(name = "User")
public class User {

    @Id @GeneratedValue(strategy = IDENTITY)
    public Integer id;

    @Column(name = "userName")
    public String userName;

    public String password;
    public String email;
    public String role;

    @OneToMany(mappedBy = "user")
    public Set<Order> orders;
}
