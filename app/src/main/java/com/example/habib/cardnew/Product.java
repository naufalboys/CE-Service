package com.example.habib.cardnew;

public class Product {
    private int id;
    private String tipe;
    private String nama;

    public Product(int id, String tipe, String nama) {
        this.id = id;
        this.tipe = tipe;
        this.nama = nama;

    }

    public int getId() {
        return id;
    }

    public String getTipe() {
        return tipe;
    }

    public String getNama() {
        return nama;
    }

}
