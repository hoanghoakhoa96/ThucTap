package model;

import java.io.Serializable;

/**
 * Created by hoangkhoa on 6/7/17.
 */

public class NhanVien implements Serializable {
    private int maNv;
    private String tenNhanVien;
    private String ngayLamViec;
    private byte[] hinhAnh;
    private boolean isNghiViec;

    public NhanVien() {
    }

    public NhanVien(int maNv, String tenNhanVien, String ngayLamViec, byte[] hinhAnh, boolean isNghiViec) {
        this.maNv = maNv;
        this.tenNhanVien = tenNhanVien;
        this.ngayLamViec = ngayLamViec;
        this.hinhAnh = hinhAnh;
        this.isNghiViec = isNghiViec;
    }

    public boolean isNghiViec() {
        return isNghiViec;
    }

    public void setNghiViec(boolean nghiViec) {
        isNghiViec = nghiViec;
    }

    public int getMaNv() {
        return maNv;
    }

    public void setMaNv(int maNv) {
        this.maNv = maNv;
    }

    public String getTenNhanVien() {
        return tenNhanVien;
    }

    public void setTenNhanVien(String tenNhanVien) {
        this.tenNhanVien = tenNhanVien;
    }

    public String getNgayLamViec() {
        return ngayLamViec;
    }

    public void setNgayLamViec(String ngayLamViec) {
        this.ngayLamViec = ngayLamViec;
    }

    public byte[] getHinhAnh() {
        return hinhAnh;
    }

    public void setHinhAnh(byte[] hinhAnh) {
        this.hinhAnh = hinhAnh;
    }
}
