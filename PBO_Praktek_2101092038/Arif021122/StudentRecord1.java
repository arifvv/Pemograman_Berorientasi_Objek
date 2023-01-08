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
public class StudentRecord1 {
    public static void main(String[] args){
        StudentRecord student3=new StudentRecord("Doni","Padang",20);
        
        student3.setAge(22);
        student3.print("");
        
        StudentRecord student4=new StudentRecord("Ali");
        student4.print("");
        
        StudentRecord student5=new StudentRecord();
        student5.print("");
        
        StudentRecord student6=new StudentRecord();
        student6.setName("Andi");
        student6.setAddress("Bukit");
        student6.setAge(22);
        student6.print("");
        System.out.println("Jumlah Siswa : "+StudentRecord.getStudentCount());
    }
}
