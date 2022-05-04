package com.demo.junit;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.Executable;
import org.mockito.Mockito;

import static org.mockito.ArgumentMatchers.anyDouble;

public class CalculadoraTests {

    private Calculadora calculadora;
    private LogaritmosApiClient logaritmosApiClient;

    @BeforeEach
    public void setup() {
        logaritmosApiClient = Mockito.mock(LogaritmosApiClient.class);
        calculadora = new Calculadora(logaritmosApiClient);
    }

    @Test
    public void division_numerosPositivos_retornaNumeroPositivo() {

        var resultado = calculadora.division(4.0, 2.0);

        Assertions.assertEquals(2.0, resultado);
    }

    @Test
    public void division_unNumeroNegativo_retornaNumeroNegativo() {

        var resultado = calculadora.division(4.0, -2.0);

        Assertions.assertEquals(-2.0, resultado);
    }

    @Test
    public void division_divisorCero_lanzaExcepcion() {

        Executable executable = () -> calculadora.division(4.0, 0.0);

        Assertions.assertThrows(IllegalArgumentException.class, executable);
    }

    @Test
    public void logaritmo_clienteRetorna10_retorna10() {

        Mockito.when(logaritmosApiClient.calcularLogaritmo(anyDouble()))
                .thenReturn(10.0);
        var resultado = calculadora.logaritmo(5);

        Assertions.assertEquals(10, resultado);
    }

}
