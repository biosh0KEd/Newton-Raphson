/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package newtonraphson;

import java.util.Scanner;

/**
 *
 * @author Efraín
 */
public class NewtonRaphson {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner Entrada;
        Entrada = new Scanner(System.in);
        System.out.println("Algoritmo Newton-Raphson");
        System.out.println("Ingresa el numero de terminos de tu ecuacion:");
        EcuacionAlgebraica Ecuacion;
        Ecuacion = new EcuacionAlgebraica(Entrada.nextInt());
        
        
    }
    
}
