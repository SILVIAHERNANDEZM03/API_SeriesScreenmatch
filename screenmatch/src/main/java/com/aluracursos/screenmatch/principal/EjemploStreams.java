package com.aluracursos.screenmatch.principal;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;

public class EjemploStreams {
    public void muestraEjemplo(){
        List<String> nombres = Arrays.asList("Brenda", "José", "Pedro", "Silvia", "Oswaldo", "Maria");

        nombres.stream()
                .sorted()//Ordena los nombres
                .limit(6)//limitamos cuantos nombres salgan
                .filter(n -> n.startsWith("S"))//filtra los nombre para encontrar la letra que pusiste
                .map(n ->n.toUpperCase())//Pone los nombres en mayusculas
                .forEach(System.out::println);//imprime

//        Filter: permite filtrar los elementos del stream basándose en una condición. Por ejemplo, podemos filtrar una
//        lista de números para devolver solo los números pares.
//
//                List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
//
//        List<Integer> numerosPares = numeros.stream()
//                .filter(n -> n % 2 == 0)
//                .collect(Collectors.toList());
//
//        System.out.println(numerosPares); // Salida: [2, 4, 6, 8, 10]
        /// //////////////////////////////////
//        Map: permite transformar cada elemento del stream en otro tipo de dato. Por ejemplo, podemos transformar
//        una lista de cadenas en una lista de sus respectivas longitudes.
//
//        List<String> palabras = Arrays.asList("Java", "Stream", "Operaciones", "Intermedias");
//
//        List<Integer> tamaños = palabras.stream()
//                .map(s -> s.length())
//                .collect(Collectors.toList());
//
//        System.out.println(tamaños); // Salida: [4, 6, 11, 11]

        /// //////////////////////////////

//        ForEach: permite ejecutar una acción en cada elemento de la stream.
//        Por ejemplo, podemos imprimir cada elemento de la lista.
//        List<String> nombres = Arrays.asList("Juan", "Maria", "Pedro", "Ana");
//
//        nombres.stream()
//                .forEach(nombre -> System.out.println("Hola, " + nombre + "!"));
        /// ///////////////////////
//        Collect: permite recopilar los elementos de la stream en una colección o
//        en otro tipo de dato. Por ejemplo, podemos recopilar los números pares en un conjunto.
//
//                List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
//
//        Set<Integer> numerosPares = numeros.stream()
//                .filter(n -> n % 2 == 0)
//                .collect(Collectors.toSet());
//
//        System.out.println(numerosPares); // Salida: [2, 4, 6, 8, 10]

    }
}
