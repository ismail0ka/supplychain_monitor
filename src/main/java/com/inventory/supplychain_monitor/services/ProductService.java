package com.inventory.supplychain_monitor.services;

import com.inventory.supplychain_monitor.repositories.ProductRepository;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
@NoArgsConstructor
public class ProductService {
    private ProductRepository productRepository;

}
