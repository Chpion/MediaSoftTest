package com.mediasoft.agafonov.controller;

import com.mediasoft.agafonov.controller.dto.ProductRequestDTO;
import com.mediasoft.agafonov.controller.dto.ProductResponseDTO;
import com.mediasoft.agafonov.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class ProductController {

    private final ProductService productService;

    @Autowired
    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    @GetMapping("/{productId}")
    public ProductResponseDTO getProduct(@PathVariable Long productId) {
        return new ProductResponseDTO(productService.getProductById(productId));
    }

    @PostMapping("/")
    public Long createProduct(@RequestBody ProductRequestDTO productRequestDTO) {
        return productService.createProduct(productRequestDTO.getProductName(), productRequestDTO.getProductCode(),
                productRequestDTO.getDescription(), productRequestDTO.getCategory(), productRequestDTO.getPrice(),
                productRequestDTO.getQuantity());
    }

    @PutMapping("/{productId}")
    public ProductResponseDTO updateProduct(@PathVariable Long productId,
                                            @RequestBody ProductRequestDTO productRequestDTO) {
        return new ProductResponseDTO(productService.updateProduct(productId, productRequestDTO.getProductName(), productRequestDTO.getProductCode(),
                productRequestDTO.getDescription(), productRequestDTO.getCategory(), productRequestDTO.getPrice(),
                productRequestDTO.getQuantity()));
    }

    @DeleteMapping("/{productId}")
    public ProductResponseDTO deleteProduct(@PathVariable Long productId) {
        return new ProductResponseDTO(productService.deleteProduct(productId));
    }
}
