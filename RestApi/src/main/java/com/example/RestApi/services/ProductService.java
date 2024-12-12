package com.example.RestApi.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.RestApi.models.entities.Product;
import com.example.RestApi.repos.ProductRepo;

@Service
@Transactional
public class ProductService {

    @Autowired
    private ProductRepo productRepo;

    public Product save(Product product) {
        return productRepo.save(product);
    }

    public Product findOne(Long id) {
        return productRepo.findById(id).orElse(null);
    }

    public List<Product> findAll() {
        return productRepo.findAll();
    }

    public void delete(Long id) {
        productRepo.deleteById(id);
    }
    
    public Product updateProduct(Long id, Product updatedProduct) {
        Optional<Product> existingProductOpt = productRepo.findById(id);
        if (existingProductOpt.isPresent()) {
            Product existingProduct = existingProductOpt.get();
            existingProduct.setName(updatedProduct.getName());
            existingProduct.setNim(updatedProduct.getNim());
            return productRepo.save(existingProduct);
        }
        return null;
    }
}
