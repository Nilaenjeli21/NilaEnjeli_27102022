/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package NilaEnjeli_27102022;

/**
 *
 * @author Nila Enjeli
 */
import java.util.Scanner;
public class CetakNamaDoWhile {
    
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        int i=0,batas;
        String nama="Viola Yosevi";

        System.out.print("Masukkan Batas : ");
        batas = in.nextInt();

        do{
            System.out.println(nama);
            i++;
        } while(i<batas);
    }

}
