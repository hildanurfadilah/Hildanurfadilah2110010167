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
public class Dshasiltest {
    private ArrayList<Integer> notest;
    private ArrayList<String> nilaitest;
    private ArrayList<String> hasiltest;
    
    public Dshasiltest (){
        notest=new ArrayList<Integer>();
        nilaitest=new ArrayList<String>();
        hasiltest=new ArrayList<String>();
    }
    
    public void notest(Integer value) {
        notest.add(value);
    }
    public ArrayList<Integer> getDataSetnotest(){
        return this.notest;
        
    }
    public void nilaitest(String value){
        nilaitest.add(value);
    }
    public ArrayList<String> getDataSetnilaitest(){
        return this.nilaitest;
    }
    
    public void hasiltest(String value) {
        hasiltest.add(value);
    }
    public ArrayList<String> getDataSethasiltest(){
        return this.hasiltest;
    }
    
    public void tambahData (Integer notest, String nilaitest, String hasiltest) {
        this.notest.add(notest);
        this.nilaitest.add(hasiltest);
        this.hasiltest.add(hasiltest);
        
    }
    
}
