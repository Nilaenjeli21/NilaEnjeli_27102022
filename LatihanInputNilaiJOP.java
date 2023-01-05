/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package NilaEnjeli_27102022;

/**
 *
 * @author Nila Enjeli
 */
import javax.swing.JOptionPane;
public class LatihanInputNilaiJOP {


     public static void main(String[] args){
        double nilai1,nilai2,nilai3,jumlah,rata;
        String nilai,nilai_2,nilai_3;

        nilai = JOptionPane.showInputDialog("Masukkan nilai 1 : ");
        nilai1 = Double.parseDouble(nilai);
        nilai_2 = JOptionPane.showInputDialog("Masukkan nilai 2 : ");
        nilai2 = Double.parseDouble(nilai_2);
        nilai_3 = JOptionPane.showInputDialog("Masukkan nilai 3 : ");
        nilai3 = Double.parseDouble(nilai_3);

        jumlah = nilai1 + nilai2 + nilai3;
        rata = jumlah/3;
        JOptionPane.showMessageDialog(null,"Jumlah Nilai =  " +jumlah + "\n" + "Rata-Rata = " +rata);
    }

}
