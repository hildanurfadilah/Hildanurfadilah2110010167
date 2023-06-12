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
public class Dslogin {
    private ArrayList<String> username;
    private ArrayList<String> password;
    
    public Dslogin (){
        username=new ArrayList<String>();
        password=new ArrayList<String>();
    }
    
    public void username(String value){
        username.add(value);
    }
    public ArrayList<String>getDataSetusername(){
        return this.username;
    }
    
    public void password (String value) {
        password.add(value);
    }
    public ArrayList<String>getDataSetpassword(){
        return this.password;
    }
    
    public void tambahData (String username, String password){
        this.username.add(username);
        this.password.add(password);
    }
}
