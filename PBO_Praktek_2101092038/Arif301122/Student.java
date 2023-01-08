/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Arif301122;

/**
 *
 * @author user
 */
public class Student extends Person{
    public Student(){
        super("Ali","Padang");
        super.name="somename";
        super.address="someaddress";
        System.out.println("Inside Student:Constructor");
    }
    
    @Override
    public String getName(){
        System.out.println("Parent : getName");
        return name+" "+address;
    }
    
    public static void main(String[] args){
        Student anna=new Student();
        
        anna.setName("Dodi");
        anna.name="Dodi";
        System.out.println("Nama : "+anna.name);
    }
}
