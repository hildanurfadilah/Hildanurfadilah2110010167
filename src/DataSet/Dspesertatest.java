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
public class Dspesertatest {
    private ArrayList<Integer> notest;
    private ArrayList<String> nama;
    private ArrayList<String> program;
    private ArrayList<String> jurusan;
    private ArrayList<String> gelombang;
    private ArrayList<String> tgltest;
    private ArrayList<String> nopendaftaran;
    
    public Dspesertatest(){
        notest=new ArrayList<Integer>();
        nama=new ArrayList<String>();
        program=new ArrayList<String>();
        jurusan=new ArrayList<String>();
        gelombang=new ArrayList<String>();
        tgltest=new ArrayList<String>();
        nopendaftaran=new ArrayList<String>();
    }
    
    public void notest(Integer value){
        notest.add(value);
    }
    public ArrayList<Integer> getDataSetnotest(){
        return this.notest;
    }
    
    public void nama(String value){
        nama.add(value);
    }
    public ArrayList<String> getDataSetnama(){
        return this.nama;
    }
    
    public void program(String value){
        program.add(value);
    }
    public ArrayList<String> getDataSetprogram(){
        return this.program;
    }
    
    public void jurusan(String value){
        jurusan.add(value);
    }
    public ArrayList<String> getDataSetjurusan(){
        return this.jurusan;
    }
    
    public void gelombang(String value){
        gelombang.add(value);
    }
    public ArrayList<String> getDataSetgelombang(){
        return this.gelombang;
    }
    
    public void tgltest(String value){
        tgltest.add(value);
    }
    public ArrayList<String> getDataSettgltest(){
        return this.tgltest;
    }
    
    public void nopendaftaran(String value){
        nopendaftaran.add(value);
    }
    public ArrayList<String> getDataSetnopendaftaran(){
        return this.nopendaftaran;
    }
    
    public void tambahData (Integer notest, String nama, String program, String jurusan, String gelombang, String tgltest, String nopendaftaran) {
        this.notest.add(notest);
        this.nama.add(nama);
        this.program.add(program);
        this.jurusan.add(jurusan);
        this.gelombang.add(gelombang);
        this.tgltest.add(tgltest);
        this.nopendaftaran.add(nopendaftaran);
    }
}
