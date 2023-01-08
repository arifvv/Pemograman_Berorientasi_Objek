/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Arif.DAO;
import Arif.Model.Anggota;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author user
 */
public class AnggotaDaoImpl implements AnggotaDao {
    List<Anggota> data = new ArrayList<>();
    
    public AnggotaDaoImpl(){
        data.add(new Anggota("Arif","KPJ","2101092029"));
        data.add(new Anggota("Aji","KPJ","2101092000"));
        data.add(new Anggota("OOO","KPJ","2101092011"));
    }
    
    @Override
    public Anggota save(Anggota anggota){
        data.add(anggota);
        return anggota;
    }
    
    public Anggota update(int index,Anggota anggota){
        data.set(index, anggota);
        return anggota;
    }
    
    public Anggota delete(int index){
        return data.remove(index);
    }
    
    public Anggota getAnggota(int index){
        return data.get(index);
    }
    
    public List<Anggota> getAllAnggota(){
        return data;
    }
}
