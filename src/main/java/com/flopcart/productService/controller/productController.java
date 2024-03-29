package com.flopcart.productService.controller;

import com.flopcart.productService.Entities.Product;
import com.flopcart.productService.services.ProductService;
import dtos.ProductDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/products")
@Controller
public class productController {

    @Autowired
    ProductService productService;

    @GetMapping("/")
    public  String helloApi(){
        return "omg this is ";
    }
    @GetMapping("/{productId}")
    public Product getProductById(@PathVariable Long productId){
        return new Product();
    }

    @PostMapping("/")
    public Product addProduct(@RequestBody ProductDTO productDTO){
        return productService.addAndgetProduct(productDTO);
    }
}
