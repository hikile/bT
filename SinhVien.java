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
    
    public void setmaSinhVien(String maSV){
        this.maSinhVien=maSV;
    }
    public String getmaSinhVien(){
        return maSinhVien;
    }
    
    public void sethoTen(String Ten){
        this.hoTen=Ten;
    }
    public String gethoTen(){
        return hoTen;
    }
    public void setdiemToan(int dToan){
        this.diemToan=dToan;
    }
    public float getdiemToan(){
        return diemToan;
    }
    public void setdiemLy(int dLy){
        this.diemLy=dLy;
    }
    public float getdiemLy(){
        return diemLy;
    }
    public void setdiemHoa(int dHoa){
        this.diemHoa=dHoa;
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
    
    
      public static void main(String[] args) {
        
        System.out.println("");
        SinhVien[]  sinhvien  = new SinhVien[6];
        for(int i=1 ; i<=5 ;i++){
            System.out.println("nhap du lieu cua sinh vien thu "+i +":");
            sinhvien[i]=new SinhVien();
            sinhvien[i].nhap();
            System.out.println("");
        }
        for(int i=1 ; i<=5 ;i++){
            System.out.println("ho so cua sinh vien thu "+i+" la: " );
            sinhvien[i].xuat();
            System.out.println("");
        }
    }
}
