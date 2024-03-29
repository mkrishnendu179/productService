package com.flopcart.productService.services;

import com.flopcart.productService.Entities.Product;
import com.flopcart.productService.reposetories.ProductRepository;
import dtos.ProductDTO;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductService {

    @Autowired
    ProductRepository productRepository;

    public Product addAndgetProduct(ProductDTO  productDTO){

            Product product = new Product();
            product.setCntt(productDTO.getCntt());
            product.setName(productDTO.getName());
            Product returnProduct=  productRepository.save(product);
            return returnProduct;
    }



}
