package com.example.pratica_render.products;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/products")
public class ProductController {

    private final ProductRepository productRepository;

    public ProductController(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    @GetMapping
    public List<Product> list(){
        return this.productRepository.findAll();
    }

    @PostMapping("/")
    public Product create(@RequestBody Product product){
        return this.productRepository.save(product);
    }
}
