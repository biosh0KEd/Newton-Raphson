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
    private final boolean[]  signoTermino;
    public EcuacionAlgebraica(int term) {
        this.numeroDeTerminos = term;
        termino = new double[term][3];
        signoTermino = new boolean[term];
    }
    public void ingresarDatos(int term, boolean signo, double coeficiente, double exponente) {
        this.signoTermino[term][0] = signo;
        this.termino[term][1] = coeficiente;
        this.termino[term][2] = exponente;
    }
    
}
