/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Arif021122;

/**
 *
 * @author user
 */
public class StudentRecordExample {
    public static void main(String[] args){
        StudentRecord student1=new StudentRecord();
        //isi object
        student1.setName("Ali");
        student1.setAddress("Padang");
        student1.setAge(18);
        student1.setMathGrade(80);
        student1.setEnglishGrade(90);
        student1.setScienceGrade(85);
        
        //Tampilan object yang diisi
        System.out.println("Nama : "+student1.getName());
        System.out.println("Alamat : "+student1.getAddress());
        System.out.println("Nilai Mtk : "+student1.getMathGrade());
        System.out.println("Nilai B.Inggris : "+student1.getEnglishGrade());
        System.out.println("Nilai Pengetahuan : "+student1.getScienceGrade());
        System.out.println("Nilai Rata-Rata : "+student1.getAverage());
        System.out.println("Nilai Max : "+student1.getMax());
        
        StudentRecord student2=new StudentRecord();
        
        student2.setName("Ani");
        student2.setAddress("Padang");
        student2.setAge(20);
        student2.setMathGrade(80);
        student2.setEnglishGrade(85);
        student2.setScienceGrade(70);
        
        System.out.print("\n");
        student2.print("");
        student2.print(student2.getMathGrade(),student2.getEnglishGrade(),student2.getScienceGrade(),student2.getAverage(),+student2.getMax());
        
        
    
    }
}
