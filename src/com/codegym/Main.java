package com.codegym;

public class Main {

    public static void main(String[] args) {
        DBConnection dbConnection = DBConnection.getINSTANCE();
        dbConnection.getAllData();
    }
}
