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
public class Dspendaftar {
    private ArrayList<Integer> nopendaftaran;
    private ArrayList<String> tgldaftar;
    private ArrayList<String> thnakademik;
    private ArrayList<String> nama;
    private ArrayList<String> tmptlahir;
    private ArrayList<String> tgllahir;
    private ArrayList<String> jeniskelamin;
    private ArrayList<String> agama;
    private ArrayList<String> alamattlpn;
    private ArrayList<Integer> kodepos;
    private ArrayList<String> namaayah;
    private ArrayList<String> namaibu;
    private ArrayList<String> pekerjaan;
    private ArrayList<String> alamatortu;
    private ArrayList<String> asalsekolah;
    private ArrayList<String> tahunlulus;
    private ArrayList<String> carapendaftaran;
    private ArrayList<String> statusdaftar;

    public Dspendaftar(){
       nopendaftaran=new ArrayList<Integer>();
       tgldaftar=new ArrayList<String>();
       thnakademik=new ArrayList<String>();
       nama=new ArrayList<String>();
       tmptlahir=new ArrayList<String>();
       tgllahir=new ArrayList<String>();
       jeniskelamin=new ArrayList<String>();
       agama=new ArrayList<String>();
       alamattlpn=new ArrayList<String>();
       kodepos=new ArrayList<Integer>();
       namaayah=new ArrayList<String>();
       namaibu=new ArrayList<String>();
       pekerjaan=new ArrayList<String>();
       alamatortu=new ArrayList<String>();
       asalsekolah=new ArrayList<String>();
       tahunlulus=new ArrayList<String>();
       carapendaftaran=new ArrayList<String>();
       statusdaftar=new ArrayList<String>();
    }
    
       public void nopendaftaran (Integer value){
           nopendaftaran.add(value);
       }
       public ArrayList<Integer>getDataSetnopendaftaran(){
           return this.nopendaftaran;
       }
       
       public void tgldaftar (String value){
           tgldaftar.add(value);
       }
       public ArrayList<String>getDataSettgldaftar(){
           return this.tgldaftar;
       }
       
       public void thnakademik (String value){
           thnakademik.add(value);
       }
       public ArrayList<String>getDataSetthnakademik(){
           return this.thnakademik;
       }
       
       public void nama (String value){
           nama.add(value);
       }
       public ArrayList<String>getDataSetnama(){
           return this.nama;
       }
       
       public void tmptlahir (String value){
           tmptlahir.add(value);
       }
       public ArrayList<String>getDataSettmptlahir(){
           return this.tmptlahir;
       }
       
       public void tgllahir (String value){
           tgllahir.add(value);
       }
       public ArrayList<String>getDataSettgllahir(){
           return this.tgllahir;
       }
       
       public void jeniskelamin (String value){
           jeniskelamin.add(value);
       }
       public ArrayList<String>getDataSetjeniskelamin(){
           return this.jeniskelamin;
       }
       
        public void agama (String value){
           agama.add(value);
       }
       public ArrayList<String>getDataSetagama(){
           return this.agama;
       }
       
       public void alamattlpn (String value){
           alamattlpn.add(value);
       }
       public ArrayList<String>getDataSetalamattlpn(){
           return this.alamattlpn;
       }
       
       public void kodepos (int value){
           kodepos.add(value);
       }
       public ArrayList<Integer>getDataSetkodepos(){
           return this.kodepos;
       }
       
       public void namaayah (String value){
           namaayah.add(value);
       }
       public ArrayList<String>getDataSetnamaayah(){
           return this.namaayah;
       }
       
       public void namaibu (String value){
           namaibu.add(value);
       }
       public ArrayList<String>getDataSetnamaibu(){
           return this.namaibu;
       }
       
       public void pekerjaan (String value){
           pekerjaan.add(value);
       }
       public ArrayList<String>getDataSetpekerjaan(){
           return this.pekerjaan;
       }
       
       public void alamatortu (String value){
           alamatortu.add(value);
       }
       public ArrayList<String>getDataSetalamatortu(){
           return this.alamatortu;
       }
       
       public void asalsekolah (String value){
           asalsekolah.add(value);
       }
       public ArrayList<String>getDataSetasalsekolah(){
           return this.asalsekolah;
       }
       
       public void tahunlulus (String value){
           tahunlulus.add(value);
       }
       public ArrayList<String>getDataSettahunlulus(){
           return this.tahunlulus;
       }
       
       public void carapendaftaran (String value){
           carapendaftaran.add(value);
       }
       public ArrayList<String>getDataSetcarapendaftaran(){
           return this.carapendaftaran;
       }
       
       public void statusdaftar (String value){
           statusdaftar.add(value);
       }
       public ArrayList<String>getDataSetstatusdaftar(){
           return this.statusdaftar;
       }
       
       public void tambahData (Integer nopendaftaran, String tgldaftar, String thnakademik, String nama, String tmptlahir, String tgllahir, String jeniskelamin,String agama, String alamattlpn, Integer kodepos, String namaayah, String namaibu, String pekerjaan, String alamatortu, String asalsekolah, String tahunlulus, String carapendaftaran, String statusdaftar){
           this.nopendaftaran.add(nopendaftaran);
           this.tgldaftar.add(tgldaftar);
           this.thnakademik.add(thnakademik);
           this.nama.add(nama);
           this.tmptlahir.add(tmptlahir);
           this.tgllahir.add(tgllahir);
           this.jeniskelamin.add(jeniskelamin);
           this.agama.add(agama);
           this.alamattlpn.add(alamattlpn);
           this.kodepos.add(kodepos);
           this.namaayah.add(namaayah);
           this.namaibu.add(namaibu);
           this.pekerjaan.add(pekerjaan);
           this.alamatortu.add(alamatortu);
           this.asalsekolah.add(asalsekolah);
           this.tahunlulus.add(tahunlulus);
           this.carapendaftaran.add(carapendaftaran);
           this.statusdaftar.add(statusdaftar);
       }
}

