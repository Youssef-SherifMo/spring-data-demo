package com.example.springdatademo.entity;

import jakarta.persistence.*;

import java.math.BigDecimal;
import java.time.LocalDateTime;
@Entity
@Table(name = "products",uniqueConstraints = {
        @UniqueConstraint(name = "sku_unique",columnNames = "stock_keeping_unit"),
        @UniqueConstraint(name="name_unique",columnNames = "name")
})
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "stock_keeping_unit",nullable = false)
    private String sku;
    @Column(nullable = false)
    private String name;
    @Column(length = 500)
    private String description;
    private BigDecimal price;
    private boolean active;
    private String imageUrl;
    private LocalDateTime dateCreated;
    private LocalDateTime lastUpdated;
}
