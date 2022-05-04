package com.demo.junit;

public class Main {

    public static void main(String[] args) {

        var calculadora = new Calculadora(new LogaritmosApiClient());

        calculadora.division(100.0, 3.0);

    }
}
