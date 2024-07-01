package com.mediasoft.agafonov.controller.dto;

import java.math.BigDecimal;
import java.time.OffsetDateTime;

public class ProductRequestDTO {

    private String productName;

    private String productCode;

    private String description;

    private String category;

    private BigDecimal price;

    private int quantity;

    private OffsetDateTime dateOfLastChange;

    private OffsetDateTime creationDate;

    public ProductRequestDTO() {
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
