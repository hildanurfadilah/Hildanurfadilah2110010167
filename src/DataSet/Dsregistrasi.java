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
public class Dsregistrasi {
    private ArrayList<Integer> noregistrasi;
    private ArrayList<Integer> notest;
    private ArrayList<String> tglregistrasi;
    private ArrayList<String> nama;
    private ArrayList<String> program;
    private ArrayList<String> jurusan;
    
    public Dsregistrasi(){
        noregistrasi=new ArrayList<Integer>();
        notest=new ArrayList<Integer>();
        tglregistrasi=new ArrayList<String>();
        nama=new ArrayList<String>();
        program=new ArrayList<String>();
        jurusan=new ArrayList<String>();
    }
    
    public void noregistrasi (Integer value) {
        noregistrasi.add(value);
    }
    public ArrayList<Integer> getDataSetnoregistrasi(){
        return this.noregistrasi;
    }
    
    public void notest (Integer value) {
        notest.add(value);
    }
    public ArrayList<Integer> getDataSetnotest(){
        return this.notest;
    }
    
    public void tglregistrasi (String value) {
        tglregistrasi.add(value);
    }
    public ArrayList<String> getDataSettglregistrasi(){
        return this.tglregistrasi;
    }
    
    public void nama (String value) {
        nama.add(value);
    }
    public ArrayList<String> getDataSetnama(){
        return this.nama;
    }
    
    public void program (String value) {
        program.add(value);
    }
    public ArrayList<String> getDataSetprogram(){
        return this.program;
    }
    
    public void jurusan (String value) {
        jurusan.add(value);
    }
    public ArrayList<String> getDataSetjurusan(){
        return this.jurusan;
    }
    
    public void tambahData (Integer noregistrasi, Integer notest, String tglregistrasi, String nama, String program, String jurusan){
        this.noregistrasi.add(noregistrasi);
        this.notest.add(notest);
        this.tglregistrasi.add(tglregistrasi);
        this.nama.add(nama);
        this.program.add(program);
        this.jurusan.add(jurusan);
    }
    
}
