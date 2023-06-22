package org.example;
import org.junit.Test;

import java.util.Scanner;

public class Triangulo {
    private double base;
    private double altura ;

    public Triangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    @Test
    public double calcularArea(){
        return(base * altura)/2;

    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double base = 10.00;
        double altura = 5;

        Triangulo tri1 = new Triangulo(base, altura);
        System.out.println(tri1.calcularArea());


    }
}

