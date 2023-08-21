/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
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
}
