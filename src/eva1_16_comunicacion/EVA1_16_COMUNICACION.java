/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva1_16_comunicacion;

/**
 *
 * @author IvanTron
 */
public class EVA1_16_COMUNICACION {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ClaseA objA = new ClaseA();
        ClaseB objB = new ClaseB();
        objA.setValorA(100);
        objB.setValorB(objA.getValorA());
        System.out.println("Valor A: " + objA.getValorA());
        System.out.println("Valor B: " + objB.getValorB());
    }
    
}

class ClaseA {
    private int ValorA;
    public int getValorA() {
        return ValorA;
    }

    public void setValorA(int ValorA) {
        this.ValorA = ValorA;
    }
    
}

class ClaseB {
    private int ValorB;
    public int getValorB() {
        return ValorB;
    }

    public void setValorB(int ValorB) {
        this.ValorB = ValorB;
    }
    
}
