package com.example.nhom12_da1.DTO;

public class ChuHang {
    private String maCH;
    private String hoTen;
    private String matKhau;

    public ChuHang() {
    }

    public ChuHang(String maCH, String hoTen, String matKhau) {
        this.maCH = maCH;
        this.hoTen = hoTen;
        this.matKhau = matKhau;
    }

    public String getMaCH() {
        return maCH;
    }

    public void setMaCH(String maCH) {
        this.maCH = maCH;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public String getMatKhau() {
        return matKhau;
    }

    public void setMatKhau(String matKhau) {
        this.matKhau = matKhau;
    }
}
