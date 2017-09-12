/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gt.edu.url.examen1.impl;

import gt.edu.url.examen1.api.*;

/**
 *
 * @author fabia
 */
public class C_tennis implements Reportero {

    private String[] res = new String[9];
    int cont;
    public String resultado = " ";

    @Override
    public String calcularGanador(int a, int b) {

        if (a <= 7 && b <= 7) {
            if (a == 7 || b == 7) {
                if (a == b + 1 || a == b + 2) {

                    resultado = "Gana A";

                } else if (b == a + 1 || b == a + 2) {

                    resultado = "Gana B";
                } else {
                    resultado = "Juego Invalido";
                }
            } else if (a == 6 || b == 6) {

                if (a >= b + 2) {

                    resultado = "Gana A";
                } else if (b >= a + 2) {
                    resultado = "Gana B";
                } else {
                    resultado = " juego no acaba";
                }
            } else {
                resultado = "Juego no acaba";
            }
        } else {
            resultado = "Juego invalido";
        }

        apilar(resultado);
        return resultado;
    }

    @Override
    public String calcularCampeon() {
        int a = 0, b = 0;

        for (int i = 0; i < res.length; i++) {
            if (res[i] == "Gana A" && res[i] != null) {
                a++;
            }

        }
        for (int i = 0; i < res.length; i++) {
            if (res[i] == "Gana B" && res[i] != null) {
                b++;
            }
        }

        if (a > b) {
            return "Gana A";

        } else if (b > a) {
            return "Gana B";
        } else {
            return "empataron";
        }

    }

    @Override
    public String recordarGanador(int juego) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void apilar(String x) {

        if (res[cont] != null) {
            res[cont] = x;
            cont++;
        }

    }

}
