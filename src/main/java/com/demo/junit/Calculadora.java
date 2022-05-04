package com.demo.junit;

public class Calculadora {

    private final LogaritmosApiClient logaritmosApiClient;

    public Calculadora(LogaritmosApiClient logaritmosApiClient) {
        this.logaritmosApiClient = logaritmosApiClient;
    }

    public Double division(Double dividendo, Double divisor) {
        return dividendo / divisor;
    }

    public Double logaritmo(Integer numero) {
        return logaritmosApiClient.calcularLogaritmo(numero.doubleValue());
    }

}
