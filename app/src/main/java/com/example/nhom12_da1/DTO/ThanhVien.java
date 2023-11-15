package com.example.nhom12_da1.DTO;

public class ThanhVien {
    private int maTV;
    private String hoTen;
    private String dienThoai;
    private String diaChi;

    public ThanhVien() {
    }

    public ThanhVien(int maTV, String hoTen, String dienThoai, String diaChi) {
        this.maTV = maTV;
        this.hoTen = hoTen;
        this.dienThoai = dienThoai;
        this.diaChi = diaChi;
    }

    public int getMaTV() {
        return maTV;
    }

    public void setMaTV(int maTV) {
        this.maTV = maTV;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public String getDienThoai() {
        return dienThoai;
    }

    public void setDienThoai(String dienThoai) {
        this.dienThoai = dienThoai;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }
}
