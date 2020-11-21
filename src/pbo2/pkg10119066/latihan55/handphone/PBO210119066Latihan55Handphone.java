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
public class PBO210119066Latihan55Handphone {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Android android = new Android("Samsung", "Android", "Grand", 3000000);
        BlackBerry bb = new BlackBerry("BlackBerry", "RIM", "Curve", 2000000);
        WindowsPhone wp = new WindowsPhone("Nokia", "Windows 8", "Lumia", 1000000);
        
        android.displayProduct();
        android.setKeyStore("234ibfd3840fo");
        System.out.println("Android Key Store \t: " + android.getkeyStore());
        System.out.println("");
        
        bb.displayProduct();
        bb.setPinBB("BHS249");
        System.out.println("PIN \t\t\t: " + bb.getPinBB());
        System.out.println("");
        
        wp.displayProduct();
        wp.setwpKeyStore("UUUQIJWQRJ");
        System.out.println("WP Key Store \t\t: " + wp.getWpKeyStore());
    }
    
}
