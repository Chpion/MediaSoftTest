package com.mediasoft.agafonov.entity;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.math.BigDecimal;
import java.time.OffsetDateTime;

@Entity
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long productId;

    private String productName;

    private String productCode;

    private String description;

    private String category;

    private BigDecimal price;

    private int quantity;

    private OffsetDateTime dateOfLastChange;

    private OffsetDateTime creationDate;

    public Product(String productName, String productCode, String description, String category,
                   BigDecimal price, int quantity, OffsetDateTime dateOfLastChange,
                   OffsetDateTime creationDate) {
        this.productName = productName;
        this.productCode = productCode;
        this.description = description;
        this.category = category;
        this.price = price;
        this.quantity = quantity;
        this.dateOfLastChange = dateOfLastChange;
        this.creationDate = creationDate;
    }

    public Product() {
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

    public void setProductId(Long productId) {
        this.productId = productId;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public void setProductCode(String productCode) {
        this.productCode = productCode;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public void setDateOfLastChange(OffsetDateTime dateOfLastChange) {
        this.dateOfLastChange = dateOfLastChange;
    }

    public void setCreationDate(OffsetDateTime creationDate) {
        this.creationDate = creationDate;
    }

    @Override
    public String toString() {
        return "Product{" +
                "productId=" + productId +
                ", productName='" + productName + '\'' +
                ", productCode='" + productCode + '\'' +
                ", description='" + description + '\'' +
                ", category='" + category + '\'' +
                ", price=" + price +
                ", quantity=" + quantity +
                ", dateOfLastChange=" + dateOfLastChange +
                ", creationDate=" + creationDate +
                '}';
    }
}
