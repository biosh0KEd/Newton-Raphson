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
        // TODO code application logic here
        Scanner entradaDatos;
        entradaDatos = new Scanner(System.in);
        System.out.println("Calculando x por Newton-Raphson");
        System.out.println("Ingrese una ecuacion de una variable\n con la forma Nx^N");
        String ecu = entradaDatos.next();
        EcuacionAlgebraica ecuacion;
        ecuacion = new EcuacionAlgebraica(ecu);
        for(int x = 0; x == ecuacion.numeroDeTerminos; x++){
            System.out.println(ecuacion.terminos[x][0]);
            System.out.println(ecuacion.terminos[x][1]);
        }
        /*System.out.println("Ingrese el punto de partida para\nrealizar el algoritmo");
        double puntoPartida = entradaDatos.nextDouble();
        System.out.println("Ingrese hasta que numero mas\ncercano a 0 se tratara de igualar la ecuacion");
        double igual = entradaDatos.nextDouble();*/
    }
    
}
