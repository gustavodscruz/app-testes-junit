package org.example;
import org.junit.Assert;
import org.junit.Test;

import java.util.Scanner;

public class Triângulo {
    private double base = 10;
    private double altura = 5;

    public Triângulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

  
    public double calcularArea(){
        return(base * altura)/2;

    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double base = 10.00;
        double altura = 5;

        Triângulo tri1 = new Triângulo(base, altura);



        System.out.println(tri1.calcularArea());


    }
}

