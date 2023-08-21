/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package baitapt4;

import java.util.Scanner;

/**
 *
 * @author TRAN HUYNH DUC
 */
public class SinhVien {
    String maSinhVien;
    String hoTen;
    float diemToan;
    float diemLy;
    float diemHoa;
    
    public String getmaSinhVien(){
        return maSinhVien;
    }
     
    public String gethoTen(){
        return hoTen;
    }
    public float getdiemToan(){
        return diemToan;
    }
    public float getdiemLy(){
        return diemLy;
    }
    public float getdiemHoa(){
        return diemHoa;
    }
    
    public void nhap(){
        Scanner sc= new Scanner(System.in);
        System.out.print("nhap ma sinh vien: ");
        maSinhVien = sc.nextLine();
        System.out.print("nhap ho va ten: ");
        hoTen = sc.nextLine();
        System.out.print("nhap diem toan: ");
        diemToan = sc.nextFloat();
        System.out.print("nhap diem ly: ");
        diemLy = sc.nextFloat();
        System.out.print("nhap diem hoa: ");
        diemHoa= sc.nextFloat();
    }
    public float diemTB(){
        return (diemToan + diemHoa + diemLy)/3;
    }
    public void xuat(){
       System.out.println("Ma sinh vien: " + maSinhVien);
       System.out.println("Ho va Ten : " + hoTen);
       System.out.println("diem Toan: " + diemToan);
       System.out.println("diem Ly : " + diemLy);
       System.out.println("diem Hoa : " + diemHoa);
       System.out.println("diem trung binh la: " + diemTB());
    }
}
