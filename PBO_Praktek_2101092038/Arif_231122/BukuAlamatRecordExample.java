/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Arif_231122;

/**
 *
 * @author lenovo
 */
import java.util.Scanner;
public class BukuAlamatRecordExample {
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        
        int n;
        int a;
        String nama;
        String alamat; 
        String telepon;
        String email;
        
        System.out.print("Masukkan jumlah data : ");
        n = in.nextInt();
        
        BukuAlamatRecord bukuAlamat[] =  new BukuAlamatRecord[100]; 
        
        in.nextLine();
        
        for (int i=0;i<n;i++){
            System.out.println("\nData ke-"+(i+1));
            BukuAlamatRecord bukuAlamat1 = new BukuAlamatRecord();
            
            System.out.print("Masukkan Nama : ");
            nama = in.nextLine();
            bukuAlamat1.setNama(nama);

            System.out.print("Masukkan Alamat : ");
            alamat = in.nextLine();
            bukuAlamat1.setAlamat(alamat);

            System.out.print("Masukkan Telepon : ");
            telepon = in.nextLine();
            bukuAlamat1.setTelepon(telepon);

            System.out.print("Masukkan Email : ");
            email = in.nextLine();
            bukuAlamat1.setEmail(email);
            
            bukuAlamat[i] = bukuAlamat1;
        }
        
        
        for (int i=0;i<n;i++){
            System.out.println("\nData ke-"+(i+1));
            System.out.println("Nama : "+bukuAlamat[i].getNama());
            System.out.println("Alamat : "+bukuAlamat[i].getAlamat());
            System.out.println("Telepon : "+bukuAlamat[i].getTelepon());
            System.out.println("Email : "+bukuAlamat[i].getEmail());
        }
    }
}
