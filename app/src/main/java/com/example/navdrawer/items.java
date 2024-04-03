package com.example.navdrawer;

public class items {
    String nama;
    String image;
    String deskripsi;

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getDeskripsi() {
        return deskripsi;
    }

    public void setDeskripsi(String deskripsi) {
        this.deskripsi = deskripsi;
    }

    public items(String nama, String image, String deskripsi) {
        this.nama = nama;
        this.image = image;
        this.deskripsi = deskripsi;
    }
}
