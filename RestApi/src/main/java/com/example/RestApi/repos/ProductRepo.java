package com.example.RestApi.repos;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.RestApi.models.entities.Product;

@Repository
public interface ProductRepo extends JpaRepository<Product, Long> {
}
