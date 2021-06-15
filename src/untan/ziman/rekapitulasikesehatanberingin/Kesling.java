/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package untan.ziman.rekapitulasikesehatanberingin;

/**
 *
 * @author USER
 */
public class Kesling {
    String keslingName;
    String dusunKesling;
    String bulanKesling;
    int sasaranKesling;
    int perolehanKesling;
    double persentaseKesling;
    public Kesling(String keslingName,String dusunKesling,int sasaranKesling,int perolehanKesling,String bulanKesling,double persentaseKesling){
        this.keslingName=keslingName;
        this.dusunKesling=dusunKesling;
        this.bulanKesling=bulanKesling;
        this.sasaranKesling=sasaranKesling;
        this.perolehanKesling=perolehanKesling;
        this.persentaseKesling=persentaseKesling;
    }
}
