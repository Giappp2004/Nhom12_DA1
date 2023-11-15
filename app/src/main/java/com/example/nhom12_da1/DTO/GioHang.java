package com.example.nhom12_da1.DTO;

public class GioHang {
    private String tenGioHang;
    private String sizeGiayGio;
    private int giaGiayGio;

    public GioHang() {
    }

    public GioHang(String tenGioHang, String sizeGiayGio, int giaGiayGio) {
        this.tenGioHang = tenGioHang;
        this.sizeGiayGio = sizeGiayGio;
        this.giaGiayGio = giaGiayGio;
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
