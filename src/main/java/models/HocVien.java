package models;

public class HocVien {
    private int id;
    private String ten, ngaySinh, diaChi, soDienThoai, email;
    private int phongHoc;

    public HocVien() {
    }

    public HocVien(int id, String ten, String ngaySinh, String diaChi, String soDienThoai, String email, int phongHoc) {
        this.id = id;
        this.ten = ten;
        this.ngaySinh = ngaySinh;
        this.diaChi = diaChi;
        this.soDienThoai = soDienThoai;
        this.email = email;
        this.phongHoc = phongHoc;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getNgaySinh() {
        return ngaySinh;
    }

    public void setNgaySinh(String ngaySinh) {
        this.ngaySinh = ngaySinh;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public String getSoDienThoai() {
        return soDienThoai;
    }

    public void setSoDienThoai(String soDienThoai) {
        this.soDienThoai = soDienThoai;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getPhongHoc() {
        return phongHoc;
    }

    public void setPhongHoc(int phongHoc) {
        this.phongHoc = phongHoc;
    }
}
