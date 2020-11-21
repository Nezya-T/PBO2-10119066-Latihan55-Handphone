/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10119066.latihan55.handphone;

/**
 *
 * @author Neyza-T
 */
public class Android extends Handphone{
    private String keyStore;
    
    public Android(String man, String os, String model, int harga){
        super(man, os, model, harga);
    }
    public String getkeyStore(){
        return keyStore;
    }
    public void setKeyStore(String keyStore){
        this.keyStore = keyStore;
    }
    
}
