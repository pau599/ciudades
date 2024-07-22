/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ciudades;

import modelo.Lugar;

/**
 *
 * @author paula
 */
public class Ciudades {

    public static void main(String[] args) {
        
        int[][] matrizAdyacencia = {
                {0, 1, 1, 1, 1}, 
                {1, 0, 0, 0, 1}, 
                {1, 0, 0, 1, 1}, 
                {1, 0, 1, 0, 0}, 
                {1, 1, 1, 0, 0}  
        };

        // Matriz de distancias para representar la distancia entre los lugares conectados (en kilómetros)
        int[][] matrizDistancias = {
                {0, 2, 3, 4, 5}, 
                {2, 0, 5, 6, 3}, 
                {3, 5, 0, 2, 4}, 
                {4, 6, 2, 0, 5}, 
                {5, 3, 4, 5, 0}  
        };

        // Creación de los objetos Lugar
        Lugar stationMetro = new Lugar("La Station de Metro", 0);
        Lugar banque = new Lugar("La Banque", 1);
        Lugar cinema = new Lugar("Le Cinéma", 2);
        Lugar boulangerie = new Lugar("La Boulangerie", 3);
        Lugar restaurant = new Lugar("Le Restaurant", 4);

        // Asignación de los lugares a la matriz
        Lugar[] lugares = {stationMetro, banque, cinema, boulangerie, restaurant};

        // Impresión de la matriz de adyacencia
        System.out.println("Matriz de adyacencia:");
        for (int i = 0; i < matrizAdyacencia.length; i++) {
            for (int j = 0; j < matrizAdyacencia[i].length; j++) {
                System.out.print(matrizAdyacencia[i][j] + " ");
            }
            System.out.println();
        }

      

        // Mostrar las conexiones entre los lugares con sus respectivas distancias
        for (int i = 0; i < matrizAdyacencia.length; i++) {
            for (int j = 0; j < matrizAdyacencia[i].length; j++) {
                if (matrizAdyacencia[i][j] == 1) {
                    for (int k = 0; k <matrizDistancias.length; k++) {
                        for (int l = 0; l <matrizDistancias[i].length; l++) {
                System.out.println(lugares[i].getNombre() + " se conecta a " + lugares[j].getNombre() +
                        " con una distancia de " + matrizDistancias[i][j] + " kilómetros");

                           break; 
                        }
                      break;
                    }
                }
            }
            
        }
    }
}

    
