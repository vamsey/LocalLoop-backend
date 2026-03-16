package com.localloop.model;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "businesses")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Business {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    private String category;

    @Column(length = 1000)
    private String description;

    private String phone;

    private String status;
}
