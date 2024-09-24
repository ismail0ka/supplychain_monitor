package com.lear.supplychain_monitor.models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.Instant;

@Entity
@Table(name = "product")
@Getter
@Setter
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "machineid")
    private Long id;

    @Column(name = "n_serie")
    private String serialNumber;

    @Column(name = "resultat_final")
    private Boolean pass;

    @Column(name = "station")
    private String station;

    @Column(name = "reference")
    private String reference;

    @Column(name = "projet")
    private String project;

    @Column(name = "date_produit")
    private Instant productionDate;
}
