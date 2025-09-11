/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package eva2_1_ejemplo;

/**
 *
 * @author invitado
 */
public class EVA2_1_EJEMPLO {

    public static void main(String[] args) {
        // TODO code application logic here
        Ejemplo miObj = new Ejemplo();
        miObj.val = 100;
        miObj.sig = new Ejemplo();
        miObj.sig.val = 200;
        miObj.sig.sig = new Ejemplo();
        miObj.sig.sig.val = 300;
        miObj.sig.sig.sig = null;
        
        Ejemplo temp = miObj;
        while(temp != null){
            System.out.println("[" + temp.val + "]");
            temp = temp.sig;
        }
    }
    
}
       
    class Ejemplo{
        int val;
        Ejemplo sig;
    
    }
   
