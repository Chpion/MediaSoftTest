package com.mediasoft.agafonov.controller.dto;

import com.mediasoft.agafonov.entity.Product;

import java.math.BigDecimal;
import java.time.OffsetDateTime;

public class ProductResponseDTO {

    private Long productId;

    private String productName;

    private String productCode;

    private String description;

    private String category;

    private BigDecimal price;

    private int quantity;

    private OffsetDateTime dateOfLastChange;

    private OffsetDateTime creationDate;

    public ProductResponseDTO(Product product) {
        productId = product.getProductId();
        productName = product.getProductName();
        productCode = product.getProductCode();
        description = product.getDescription();
        category = product.getCategory();
        price = product.getPrice();
        quantity = product.getQuantity();
        dateOfLastChange = product.getDateOfLastChange();
        creationDate = product.getCreationDate();
    }

    public ProductResponseDTO(Long productId, String productName, String productCode,
                              String description, String category, BigDecimal price, int quantity,
                              OffsetDateTime dateOfLastChange, OffsetDateTime creationDate) {
        this.productId = productId;
        this.productName = productName;
        this.productCode = productCode;
        this.description = description;
        this.category = category;
        this.price = price;
        this.quantity = quantity;
        this.dateOfLastChange = dateOfLastChange;
        this.creationDate = creationDate;
    }

    public Long getProductId() {
        return productId;
    }

    public String getProductName() {
        return productName;
    }

    public String getProductCode() {
        return productCode;
    }

    public String getDescription() {
        return description;
    }

    public String getCategory() {
        return category;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }

    public OffsetDateTime getDateOfLastChange() {
        return dateOfLastChange;
    }

    public OffsetDateTime getCreationDate() {
        return creationDate;
    }
}
