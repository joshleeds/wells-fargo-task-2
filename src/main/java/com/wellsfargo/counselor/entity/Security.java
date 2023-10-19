package com.wellsfargo.counselor.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class Security {
    @Id
    @GeneratedValue()
    private long SecurityId;

    @Column(nullable = false)
    private String Name;

    @Column(nullable = false)
    private String Category;

    @Column(nullable = false)
    private int purchasePrice;

    @Column(nullable = false)
    private String purchaseDate;

    @Column(nullable = false)
    private int quantity;

    private Portfolio Portfolio;

    protected Security() {

    }

    public Security(String Name, String Category, int purchasePrice, String purchaseDate, int quantity, Portfolio Portfolio) {
        this.Name = Name;
        this.Category = Category;
        this.purchasePrice = purchasePrice;
        this.purchaseDate = purchaseDate;
        this.Portfolio = Portfolio;
    }

    public String getName() {
        return Name;
    }

    public String getCategory() {
        return Category;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public void setCategory(String Category) {
        this.Category = Category;
    }

    public int getpurchasePrice() {
        return purchasePrice;
    }

    public void setpurchasePrice(int purchasePrice) {
        this.purchasePrice= purchasePrice;
    }

    public String getpurchaseDate() {
        return purchaseDate;
    }

    public void setpurchaseDate(String purchaseDate) {
        this.purchaseDate = purchaseDate;
    }
}
