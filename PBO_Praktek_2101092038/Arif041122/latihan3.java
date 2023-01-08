/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Arif041122;

/**
 *
 * @author lenovo
 */
public class latihan3 {
     public static void main(String[] args){
        int i;
        String entry[][]={{"Florance","735-1234","Manila"},
            {"Joyce","983-3333","Quezon City"},
            {"Becca","456-3322","Manila"}
        };
        
        System.out.println("Banyak Data : "+entry.length);
        for(i=0;i<entry.length;i++){
            System.out.println("Name : "+entry[i][0]);
            System.out.println("Telp : "+entry[i][1]);
            System.out.println("Address : "+entry[i][2]);
            System.out.println("\n");
        }        
    }
}
