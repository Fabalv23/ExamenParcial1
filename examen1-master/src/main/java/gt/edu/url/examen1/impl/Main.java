package gt.edu.url.examen1.impl;

import gt.edu.url.examen1.api.*;

/**
 *
 * @author tuxtor
 */
public class Main {

    public static void main(String[] args) {

        System.out.println("Serie 1");
        System.out.println("Calcular PI");

        CalcularDigitos pi;

        pi = new CalcularDigitos();

        double res;
        res = (426880 * Math.sqrt(10005)) / pi.calcularPi(0);
        System.out.println(res);

        System.out.println("Serie 3");

        System.out.println("Fabrica de Monstruos para Rangers");

        Monstruo m1, m2, m3, m4;

        m1 = new Monstruo();
        m2 = new Monstruo();
        m3 = new Monstruo();
        m4 = new Monstruo();

        m1.setNombre("Pikachu");
        m1.setElemento("Fuego");
        m1.setColor("Amariilo");
        m1.setEdad(15);

        m2.setNombre("A");
        m2.setElemento("Agua");
        m2.setColor("Rojo");
        m2.setEdad(10);

        m3.setNombre("ads");
        m3.setElemento("Aire");
        m3.setColor("Cafe");
        m3.setEdad(50);

        m4.setNombre("fskjdf");
        m4.setElemento("Tierra");
        m4.setColor("Naranja");
        m4.setEdad(20);

        m1.hacerAlgo();
        m2.hacerAlgo();
        m3.hacerAlgo();

        System.out.println("Serie 2");
        System.out.println("Partidos de Tennis");

        Reportero Fabian = new C_tennis();

        System.out.println(Fabian.calcularGanador(2, 6));
        System.out.println(Fabian.calcularGanador(6, 2));
        System.out.println(Fabian.calcularGanador(2, 6));
        System.out.println(Fabian.calcularGanador(6, 2));
        System.out.println(Fabian.calcularGanador(6, 2));
        System.out.println(Fabian.calcularGanador(2, 6));
        System.out.println(Fabian.calcularGanador(6, 2));
        System.out.println(Fabian.calcularGanador(2, 6));
        System.out.println(Fabian.calcularGanador(6, 2));

        System.out.println(Fabian.calcularCampeon());

    }

}
