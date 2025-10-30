/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package eva2_10_tipos_genericos;

/**
 *
 * @author invitado
 */
public class EVA2_10_TIPOS_GENERICOS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Nodo<String> nodo = new Nodo<String>();
        nodo.setValor("Juan Perez");
    }
}
class Nodo<T>{
    private T valor;
    private Nodo siguiente;
    private Nodo previo;
    
    public Nodo(){
        siguiente = null;
        previo = null;
        
    }

    public T getValor() {
        return valor;
    }

    public void setValor(String T) {
        this.valor = valor;
    }

    public Nodo getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(Nodo siguiente) {
        this.siguiente = siguiente;
    }

    public Nodo getPrevio() {
        return previo;
    }

    public void setPrevio(Nodo previo) {
        this.previo = previo;
    }

    
    
}
