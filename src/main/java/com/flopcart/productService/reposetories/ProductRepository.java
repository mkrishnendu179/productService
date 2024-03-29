package com.flopcart.productService.reposetories;

import com.flopcart.productService.Entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.lang.NonNull;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface ProductRepository extends JpaRepository<Product,Long> {

    @Override
    @NonNull
    Optional<Product> findById(@NonNull  Long lg);

    @Override
    @NonNull
    <S extends Product> S save(@NonNull  S product);

}
