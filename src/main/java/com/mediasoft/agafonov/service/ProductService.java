package com.mediasoft.agafonov.service;

import com.mediasoft.agafonov.entity.Product;
import com.mediasoft.agafonov.exceptions.ProductNotFoundException;
import com.mediasoft.agafonov.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.time.OffsetDateTime;

@Service
public class ProductService {

    private final ProductRepository productRepository;

    @Autowired
    public ProductService(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    public Product getProductById(Long id) {
        return productRepository.findById(id)
                .orElseThrow(() -> new ProductNotFoundException("Product not found with id: " + id));
    }

    public Long createProduct(String productName, String productCode, String description,
                              String category, BigDecimal price, int quantity){
        Product product = new Product(productName, productCode, description, category, price,
                quantity, OffsetDateTime.now(), OffsetDateTime.now());
        return productRepository.save(product).getProductId();
    }

    public Product updateProduct(Long productId,String productName, String productCode, String description,
                              String category, BigDecimal price, int quantity){
        Product product = new Product();
        product.setProductId(productId);
        product.setProductName(productName);
        product.setProductCode(productCode);
        product.setDescription(description);
        product.setCategory(category);
        product.setPrice(price);
        product.setQuantity(quantity);
        product.setDateOfLastChange(OffsetDateTime.now());
        product.setCreationDate(productRepository.findById(productId).get().getCreationDate());
        return productRepository.save(product);
    }

    public Product deleteProduct(Long productId){
        Product deleteProduct = getProductById(productId);
        productRepository.deleteById(productId);
        return deleteProduct;
    }
}
