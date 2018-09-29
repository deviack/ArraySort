/*
 * To change this license header, choose License Headers in Project Properties.To change this template file, choose Tools | Templates, and open the template in the editor.
 */
package metodosordenamiento;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Stack;

/**
 *
 * @author Citla
 */
public class MetodosOrdenamiento {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Entrada 1234 - Salida 4321
        //ARREGLO SIN USO :V
        System.out.println("Lista array:");
        int[] numbers = {1, 2, 3, 4};//We create a List for the numbers
        for (int j = 0; j < numbers.length; j++) {
            System.out.print(numbers[j] + ", ");
        }
        System.out.println("");
        
        //OTRO ARREGLO SIN USO :V
        ArrayList<Integer> arrayNumeros = new ArrayList<Integer>();
        for (int i = 1; i <= 4; i++) {
            arrayNumeros.add(i);
            System.out.println("ArrayList: " + arrayNumeros.toString());
        }
        System.out.println("ArrayList completo: " + arrayNumeros.toString());
        System.out.println("");

        
        //SUMAR NÚMEROS DE UN ARRAY    
        System.out.println("SUMA DE NÚMEROS DE UN ARRAY ");
        int sumNumeros[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};  //Creamos el arreglo. Tenemos que sumar todos sus números  
        int total = 0;
        for (int i = 0; i < sumNumeros.length; i++) {//Iniciamos ciclo, limitando al tamaño del arreglo sumNumeros
            total += sumNumeros[i];//Sumamos el total + 
            System.out.print(" + " + sumNumeros[i]);//0+1,1+2,3+3,6+4,10+5,15+6,21+7,28+8,36+9,45+10= 55.  
        }
        System.out.println(" = " + total);
        System.out.println("");
        
        //INVERTIR UNA LISTA DE NÚMERO (con STACK)
        Scanner scan2 = new Scanner(System.in);
        System.out.println("¿De qué tammaño quiere su lista a invertir?");
        int varChida = scan2.nextInt();
        Stack<Integer> pila = new Stack<>();//Creamos una pila nueva
        for (int k = 1; k <= varChida; k++) {
            pila.push(k);
        }
        System.out.println("tamaño de la pila: " + pila.size());
        System.out.println("Stack inicial: " + pila.toString());
        System.out.println("Stack final: ");
        for (int f = pila.size(); f > 0; pila.pop()) {
            System.out.print((pila.peek()) + " ");
            f--;
        }
        System.out.println("");
        System.out.println("");
        
        //PIRÁMIDE DE ASTERISCOS 
        System.out.println("¿Cuántos escalones va a tener su escalera?");
        Scanner scan = new Scanner(System.in);
        int altura = scan.nextInt();
        for (int k = 1; k <= altura; k++) {
            for (int j = 1; j <= k; j++) {//La J es variable local, y se reinicia cuando se romple el ciclo
                System.out.print("*");
            }
            System.out.println(" ");
            
        }//Closing the 'for'

    }//Closing the main

}//Closing the Class MetodosOrdenamiento

