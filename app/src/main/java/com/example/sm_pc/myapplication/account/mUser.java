package com.example.sm_pc.myapplication.account;


public class mUser {

    public String registerDate, email, height, weight;

    public mUser(){
        //blank constructor
    }

    public mUser(String registerDate, String email, String height, String weight) {
        this.registerDate = registerDate;
        this.email = email;
        this.height = height;
        this.weight = weight;
    }
}

