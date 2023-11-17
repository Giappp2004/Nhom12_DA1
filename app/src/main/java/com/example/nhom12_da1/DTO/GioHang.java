package com.example.nhom12_da1.DTO;

public class GioHang {
    private int maGio;
    private String tenGioHang;
    private String sizeGiayGio;
    private int giaGiayGio;

    public GioHang() {
    }

    public GioHang(int maGio, String tenGioHang, String sizeGiayGio, int giaGiayGio) {
        this.maGio = maGio;
        this.tenGioHang = tenGioHang;
        this.sizeGiayGio = sizeGiayGio;
        this.giaGiayGio = giaGiayGio;
    }

    public int getMaGio() {
        return maGio;
    }

    public void setMaGio(int maGio) {
        this.maGio = maGio;
    }

    public String getTenGioHang() {
        return tenGioHang;
    }

    public void setTenGioHang(String tenGioHang) {
        this.tenGioHang = tenGioHang;
    }

    public String getSizeGiayGio() {
        return sizeGiayGio;
    }

    public void setSizeGiayGio(String sizeGiayGio) {
        this.sizeGiayGio = sizeGiayGio;
    }

    public int getGiaGiayGio() {
        return giaGiayGio;
    }

    public void setGiaGiayGio(int giaGiayGio) {
        this.giaGiayGio = giaGiayGio;
    }
}
