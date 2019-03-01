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
    private final int numeroDeTerminos;
    private final double[][] termino;
    public EcuacionAlgebraica(int term) {
        this.numeroDeTerminos = term;
        termino = new double[term][2];
    }
    public void ingresarDatos(int term, double coeficiente, double exponente) {
        this.termino[term][0] = coeficiente;
        this.termino[term][1] = exponente;
    }
}
