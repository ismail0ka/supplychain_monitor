package com.lear.supplychain_monitor.repositories;

import com.lear.supplychain_monitor.models.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {

}
