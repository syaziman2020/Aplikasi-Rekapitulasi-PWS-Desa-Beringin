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
public class Imunisasi {
    String imunName;
    String dusunImun;
    String bulanImun;
    int sasaranImun;
    int perolehanImun;
    double persentaseImun;
    public Imunisasi(String imunName,String dusunImun,int sasaranImun,int perolehanImun,String bulanImun,double persentaseImun){
        this.imunName=imunName;
        this.dusunImun=dusunImun;
        this.bulanImun=bulanImun;
        this.sasaranImun=sasaranImun;
        this.perolehanImun=perolehanImun;
        this.persentaseImun=persentaseImun;
    }

    
    
}
