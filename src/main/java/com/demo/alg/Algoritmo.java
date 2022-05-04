package com.demo.alg;

public class Algoritmo {


    public int[] intercalar(int[] a1, int[] a2) {
        int i = 0;
        int j = 0;
        int k = 0;
        int[] arrayResultado = new int[a1.length + a2.length];

        while ((i < a1.length) && (j < a2.length)) {
            if (a1[i] < a2[j]) arrayResultado[k++] = a1[i++];
            else arrayResultado[k++] = a2[j++];
        }

        if (0 == a2.length) //¿El 2º array no tiene datos?
            while (i < a1.length) arrayResultado[k++] = a1[i++];
        else
            while (j < a2.length) arrayResultado[k++] = a2[j++];

        return arrayResultado;
    }

}