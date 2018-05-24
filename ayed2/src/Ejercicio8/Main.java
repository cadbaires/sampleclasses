package Ejercicio8;
import java.io.*;

import static java.lang.System.out;

/**
 * Created by CarlosAdrián on 24/05/2018.
 */

public class Main{
public static void main(String[] args) {

    Punto p1= new Punto(1,2);
    Punto p2= new Punto(2,4);

    System.out.println("P1  ("+p1.getX()+","+p1.getY()+")");
    System.out.println("P2  ("+p2.getX()+","+p2.getY()+")");
    Punto resultante= new Punto(0,0);
    resultante= p1.sumarPunto(p2);
    System.out.println("Suma= ("+resultante.getX()+","+resultante.getY()+")");
    System.out.println("Son iguales= "+p1.igual(p2));

}

        }