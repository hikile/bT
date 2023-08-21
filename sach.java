package baitapt4;

/**
 *
 * @author TRAN HUYNH DUC
 */
import java.util.Scanner;
public class sach {
    String maSach;
    String tenSach;
    String tenTacgia;
    String nhaXuatBan;
    int namXuatBan;
    
    public void setmaSach(String ma){
        this.maSach=ma;
    }
     public String getmaSach(){
        return maSach;
    }
     public void settenSach(String ten){
        this.tenSach=ten;
    }
    public String gettenSach(){
        return tenSach;
    }
    public void settenTacGia(String TacGia){
        this.tenTacgia=TacGia;
    }
    public String gettenTacgia(){
        return tenTacgia;
    }
    public void setnhaXuatBan(String NXB){
        this.nhaXuatBan=NXB;
    }
    public String getnhaXuatBan(){
        return nhaXuatBan;
    }
     public void setnamXuatBan(int nNXB){
        this.namXuatBan=nNXB;
    }
    public int getnamXuatBan(){
        return namXuatBan;
    }
    
    public void nhap(){
        Scanner sc= new Scanner(System.in);
        System.out.print("nhap ma sach: ");
        maSach = sc.nextLine();
        System.out.print("nhap ten sach: ");
        tenSach = sc.nextLine();
        System.out.print("nhap ten tac gia: ");
        tenTacgia = sc.nextLine();
        System.out.print("nhap ten nha xuat ban: ");
        nhaXuatBan = sc.nextLine();
        System.out.print("nhap nam san xuat: ");
        namXuatBan = sc.nextInt();
    }
    public void xuat(){
       System.out.println("Ma sach: " + maSach);
       System.out.println("Ten sach: " + tenSach);
       System.out.println("Ten tac gia: " + tenTacgia);
       System.out.println("Nha xuat ban: " + nhaXuatBan);
       System.out.println("Nam xuat ban: " + namXuatBan);
    }
     public static void main(String[] args) {
        
        //sach 
        sach sach1=new sach();
        sach1.nhap();
        System.out.println("");
        sach1.xuat();
        System.out.println("");
        System.out.println("");
}
}

