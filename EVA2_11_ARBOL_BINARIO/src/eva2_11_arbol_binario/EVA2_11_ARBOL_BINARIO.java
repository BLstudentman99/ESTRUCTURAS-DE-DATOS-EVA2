/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package eva2_11_arbol_binario;

/**
 *
 * @author invitado
 */
public class EVA2_11_ARBOL_BINARIO {


    public static void main(String[] args) {
        Arbol arbol = new Arbol();
        arbol.agregar(13);
        arbol.agregar(10);
        arbol.agregar(18);
        arbol.agregar(2);
        arbol.agregar(11);
        arbol.agregar(10);
        arbol.agregar(17);
        arbol.agregar(20);
        arbol.agregar(16);
        System.out.println("Cantidad de nodos: " + arbol.size());
        arbol.imprimirPreOrder();
        System.out.println("");
        arbol.imprimirInOrder();
        System.out.println("");
        arbol.imprimirPostOrder();
    }
    
}
