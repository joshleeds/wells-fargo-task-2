package com.wellsfargo.counselor.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class Portfolio {
    @Id
    @GeneratedValue()
    private long PortfolioId;

    @Column(nullable = false)
    private String creationDate;

    private Client Client;
    protected Portfolio() {

    }

    public Portfolio(String creationDate, Client Client) {
        
        this.creationDate = creationDate;
        this.Client = Client;

    }

    public Long getPortfolioId() {
        return PortfolioId;
    }

    public String getcreationDate() {
        return creationDate;
    }

    public void setcreationDate(String creationDate) {
        this.creationDate = creationDate;
    }

}
