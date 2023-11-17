package com.example.nhom12_da1.DAO;

import android.annotation.SuppressLint;
import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

import com.example.nhom12_da1.DTO.ChuHang;
import com.example.nhom12_da1.DbHelper.MyDbHelper;

import java.util.ArrayList;
import java.util.List;

public class ChuHangDAO {
    private SQLiteDatabase db;

    public ChuHangDAO(Context context){
        MyDbHelper dbHelper = new MyDbHelper(context);
        db = dbHelper.getWritableDatabase();
    }

    public long insert(ChuHang obj){
        ContentValues values = new ContentValues();
        values.put("maCH",obj.getMaCH());
        values.put("hoten",obj.getHoTen());
        values.put("matkhau",obj.getMatKhau());
        return db.insert("ChuHang",null,values);
    }

    public long updatePass(ChuHang obj){
        ContentValues values = new ContentValues();
        values.put("hoten",obj.getHoTen());
        values.put("matkhau",obj.getMatKhau());
        return db.update("ChuHang",values,"maCH = ?",new String[]{String.valueOf(obj.getMaCH())});
    }
    public long delete(String id) {
        return db.delete("ChuHang", "maCH = ?", new String[]{String.valueOf(id)});
    }


    public List<ChuHang> getAll(){
        String sql = "select * from ChuHang";
        return getData(sql);
    }

    public ChuHang getID(String id){
        String sql = "select * from ChuHang where maCH = ?";
        List<ChuHang> list = getData(sql,id);
        return list.get(0);
    }
    // check login
    public int checkLogin(String id, String password) {
        String sql = "SELECT * FROM ChuHang WHERE maCH=? AND matkhau=?";
        List<ChuHang> list = getData(sql, id, password);
        if (list.size() == 0) {
            return -1;
        }
        return 1;
    }

    @SuppressLint("Range")
    private List<ChuHang> getData(String sql, String... selectionArgs){
        List<ChuHang> list = new ArrayList<>();
        Cursor cursor = db.rawQuery(sql, selectionArgs);
        while (cursor.moveToNext()){
            ChuHang obj = new ChuHang();
            obj.setMaCH(cursor.getString(cursor.getColumnIndex("maCH")));
            obj.setHoTen(cursor.getString(cursor.getColumnIndex("hoten")));
            obj.setMatKhau(cursor.getString(cursor.getColumnIndex("matkhau")));
            list.add(obj);
        }
        return list;
    }
}
