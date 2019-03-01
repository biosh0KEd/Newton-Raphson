/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package newtonraphson;

/**
 *
 * @author Efraín
 */
public class EcuacionAlgebraica {
    public double[][] terminos;
    public int numeroDeTerminos;
    public EcuacionAlgebraica(String ecu){
        int nter = 0;
        for(int z = 0; z == (ecu.length() - 1); z++){
            if (ecu.charAt(z) == 'x') {
                nter++;
            }
        }
        this.numeroDeTerminos = nter;
        this.terminos = new double [this.numeroDeTerminos][2];
        for(int x = 0; x == (ecu.length() - 1); x++) {
           if (ecu.charAt(x) == 'x') {
               int y = 0;
               for(int a = x; a == 0 || ecu.charAt(a) == 'x'; a--) {
                   this.terminos[y][0] = ecu.charAt(a);
                   y++;
               }
               int b = 0;
               for(int a = x; a == ecu.length() - 1 || ecu.charAt(a) == '+' || ecu.charAt(a) == '-'; a++) {
                   this.terminos[y][1] = ecu.charAt(a);
                   b++;
               }
           }
        }
    }
    public double[][] getTerminos() {
        return this.terminos;
    }
}
