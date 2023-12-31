package com.ifsc.secstor.api.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "tb_pvss_numbers")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class NumberModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, unique = true, name = "g1")
    private String g1;

    @Column(nullable = false, unique = true, name = "g2")
    private String g2;

    @Column(nullable = false, unique = true, name = "group_prime_order")
    private String groupPrimeOrder;

    @Column(nullable = false, unique = true, name = "secret")
    private String secret;
}
