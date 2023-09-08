package com.example.nequiapp;

import androidx.annotation.NonNull;

public class Account {

    private String name;
    private String typeAccount;

    public String getName() {
        return name;
    }

    public String getTypeAccount() {
        return typeAccount;
    }

    public Double getCurrentValue() {
        return currentValue;
    }

    private Double currentValue;

    public void setName(String name) {
        this.name = name;
    }

    public Account(String name, String typeAccount, Double currentValue) {
        this.name = name;
        this.typeAccount = typeAccount;
        this.currentValue = currentValue;
    }

    public void setTypeAccount(String typeAccount) {
        this.typeAccount = typeAccount;
    }

    public void setCurrentValue(Double currentValue) {
        this.currentValue = currentValue;
    }
}
