/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DataSet;
import java.util.ArrayList;

/**
 *
 * @author ACER
 */
public class Dsmahasiswa {
    private ArrayList<Integer> noregistrasi;
    private ArrayList<String> npm;
    private ArrayList<String> nama;
    private ArrayList<String> jurusan;
    private ArrayList<String> program;
    
    public Dsmahasiswa (){
        noregistrasi=new ArrayList<Integer>();
        npm=new ArrayList<String>();
        nama=new ArrayList<String>();
        jurusan=new ArrayList<String>();
        program=new ArrayList<String>();
    }
    
    public void noregistrasi (Integer value) {
        noregistrasi.add(value);
    }
    public ArrayList<Integer>getDataSetnoregistrasi(){
        return this.noregistrasi;
    }
    
    public void npm (String value) {
        npm.add(value);
    }
    public ArrayList<String>getDataSetnpm (){
        return this.npm;
    }
    
    public void nama (String value) {
        nama.add(value);
    }
    public ArrayList<String>getDataSetnama(){
        return this.nama;
    }
    
    public void jurusan (String value) {
        jurusan.add(value);
    }
    public ArrayList<String>getDataSetjurusan(){
        return this.jurusan;
    }
    
    public void program (String value) {
        program.add(value);
    }
    public ArrayList<String>getDataSetprogram(){
        return this.program;
    }
    
    public void tambahData (Integer noregistrasi, String npm, String nama, String jurusan, String program){
        this.noregistrasi.add(noregistrasi);
        this.npm.add(npm);
        this.nama.add(nama);
        this.jurusan.add(jurusan);
        this.program.add(program);
    }
}
