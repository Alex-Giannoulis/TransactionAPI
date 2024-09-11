package com.example.Transaction.API;

import java.util.HashMap;
import java.util.List;
import java.util.Objects;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import java.time.LocalDateTime;


@Entity
class User{

	private double bal;
	private String name;
	private String address;
	private @Id
	@GeneratedValue Long accountID;
	private String accountType;
    private LocalDateTime transactionDate;
    private String transactionType;
    private double transactionAmount;

    
	User(){}

	User(double bal, String name, String address, String accountType, String transactionType, double transactionAmount){
		this.bal = bal;
		this.name = name;
		this.address = address;
		this.accountType = accountType;

	}

    public Long getID(){
        return this.accountID;
    }

    public double getBal(){
        return this.bal;
    }

    public String getName(){
        return this.name;
    }

    public String getAddress(){
        return this.address;
    }

    public String getAccountType(){
        return this.accountType;
    }

    public void setID(Long accountID){
        this.accountID = accountID;
    }

    public void setBal(double bal){
        this.bal = bal;
    }

    public void setName(String name){
        this.name = name;
    }

    public void setAddress(String address){
        this.address = address;
    }

    public void setAccountType(String accountType){
        this.accountType = accountType;
    }

}
