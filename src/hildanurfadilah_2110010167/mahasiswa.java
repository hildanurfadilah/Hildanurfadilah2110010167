/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hildanurfadilah_2110010167;

/**
 *
 * @author ACER
 */
public class mahasiswa {
    private int noregistrasi;
    private String npm;
    private String nama;
    private String jurusan;
    private String program;
    
    public mahasiswa(){
    }
    
    
    public void setnoregistrasi(int noregistrasi){
    this.noregistrasi=noregistrasi;
    }
    public int getnoregistrasi(){
    return this.noregistrasi;
    }
    
    public void setnpm(String npm){
    this.npm=npm;
    }
    public String getnpm(){
    return this.npm;
    }
    
    public void setnama(String nama){
    this.nama=nama;
    }
    public String getnama(){
    return this.nama;
    }
    
    public void setjurusan(String jurusan){
    this.jurusan=jurusan;
    }
    public String getjurusan(){
    return this.jurusan;
    }
    
    public void setprogram(String program){
    this.program=program;
    }
    public String getprogram(){
    return this.program;
    }
}
