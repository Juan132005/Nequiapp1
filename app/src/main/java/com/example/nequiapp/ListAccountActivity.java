package com.example.nequiapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import java.util.ArrayList;

public class ListAccountActivity extends AppCompatActivity {

    private ArrayList<Account> listAccountRV=new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_account);
    }

    private void loadFakeData(){
        Account myAccount1= new Account("Bancolombia","Cuenta Corriente",1000012.0);
        Account myAccount2= new Account("Davivienda","Cuenta Corriente",704512.0);
        Account myAccount3= new Account("JPMorgan","Credit card",12.0);
        listAccountRV.add(myAccount1);
        listAccountRV.add(myAccount2);
        listAccountRV.add(myAccount3);
    }

}