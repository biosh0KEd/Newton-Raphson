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
    private final double[][] terminoDerivado;
    public EcuacionAlgebraica(int term) {
        this.numeroDeTerminos = term;
        termino = new double[term][2];
        terminoDerivado = new double[term][2];
    }
    public void ingresarDatos(int term, double coeficiente, double exponente) {
        this.termino[term][0] = coeficiente;
        this.termino[term][1] = exponente;
    }
    public void generarDerivada() {
        for (int x = 0; x < this.numeroDeTerminos; x++){
            terminoDerivado[x][0] = this.termino[x][0] * this.termino[x][1];
            terminoDerivado[x][1] = this.termino[x][1] - 1;
        }
    }
    public double newtonRaphson(int PP, int error) {
        double fx = 0;
        double x2 = 0;
        for (int x = 0; x < this.numeroDeTerminos; x++){
            double fx1 = fx;
            for (int a = 0; a < this.termino[x][1]; a++) {
                x2 = PP * PP;
            }
            fx = this.termino[x][0] * PP * x2;
        }
    }
}
