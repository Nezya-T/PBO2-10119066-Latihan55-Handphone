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
public class WindowsPhone extends Handphone {
    
    private String wpKeyStore;
    
    public WindowsPhone(String man, String os, String model, int harga){
        super(man, os, model, harga);
    }
    public String getWpKeyStore(){
        return wpKeyStore;
    }
    public void setwpKeyStore(String wpKeyStore){
        this.wpKeyStore = wpKeyStore;
    }
    
}
