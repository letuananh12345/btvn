package service;

import models.HocVien;

import java.util.ArrayList;

public class CRUDHocVien {
    public ArrayList<HocVien> list = new ArrayList<>();

    public CRUDHocVien() {
        list.add(new HocVien(1,"dung","14-7-1991","tn","5892459","dung@gmail.com",1));
        list.add(new HocVien(2,"nam","14-7-1991","tn","981523045","dung@gmail.com",1));
        list.add(new HocVien(3,"Tuan anh","14-7-1991","tn","58910345","dung@gmail.com",1));
    }
    public void add(HocVien hocVien){
        list.add(hocVien);
    }
    public void edit(int index, HocVien hocVien){
        list.set(index, hocVien);
    }
    public void delete(int index){
        list.remove(index);
    }
    public HocVien finByName(String name){
        for (HocVien h:list
             ) {
       if (h.getTen().equals(name))
           return h;
        }
        return null;
    }
}
