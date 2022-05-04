package com.demo.junit;

public class Main {

    public static void main(String[] args) {

        var calculadora = new Calculadora(new LogaritmosApiClient());

        var resultado = calculadora.division(100.0, 3.0);

        System.out.println("Resultado: " + resultado);

    }
}
