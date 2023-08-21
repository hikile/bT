package baitapt4;

/**
 *
 * @author TRAN HUYNH DUC
 */
import java.util.Scanner;
public class HCN {
    int chieuDai;
    int chieuRong;
    public void setchieuDai(int D){
        chieuDai=D;
    }
    public int getchieuDai(){
        return chieuDai;
    }
    public void setchieuRong(int R){
        chieuRong=R;
    }
    public int getchieuRong(){
        return chieuRong;
    }
    public void nhap(){
        Scanner sc =new Scanner(System.in);
        System.out.print("nhap chieu dai: ");
        chieuDai=sc.nextInt();
         System.out.print("nhap chieu rong: ");
        chieuRong=sc.nextInt();
    }
    public void veHCN(){
        for (int i = 0; i < chieuRong; i++) {
            for (int j = 0; j < chieuDai; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public float chuVi(){
        return 2 * (chieuDai + chieuRong);
    }
    public float dienTich(){
        return chieuDai * chieuRong;
    }
     public static void main(String[] args) {
        HCN hcn=new HCN();
        hcn.nhap();
        System.out.println("");
        System.out.println("chieu dai cua hinh chu nhat la: " + hcn.chieuDai);
        System.out.println("chieu rong cua hinh chu nhat la: " + hcn.chieuRong);
        System.out.println("");
        hcn.veHCN();
        System.out.println("chu vi cua hinh chu nhat la : " + hcn.chuVi());
        System.out.println("dien tich cua hinh chu nhat la:  " + hcn.dienTich());
        System.out.println("chieu dai cua hinh chu nhat la: " + hcn.chieuDai);
        System.out.println("");
     }
}
