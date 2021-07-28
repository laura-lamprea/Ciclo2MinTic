/*
La función ordenamientoPersonalizado recibe como parámetro un vector de números enteros de longitud PAR, su trabajo será retornar el vector ordenado de la siguiente manera:
La primera mitad de los valores deben estar ordenados ascendentemente
La segunda mitad de los valores deben estar ordenados descendentemente
El programa debe retornar como resultado exclusivamente el valor solicitado, no debe contener letras ni enunciados que lo acompañen.
Ejemplo de entrada:
int [] vectorEntrada = {0, 2, 1, 65, 66, 78, 12, 11, 90, 13};
Salida (Retorno):
int [] vectorEntradaOrdenado = {0, 1, 2, 65, 66, 90, 78, 13, 12, 11};
 */
package ejercicios;

import java.util.Arrays;

/**
 *
 * @author Laura Lamprea
 */
public class Ejercicio4 {
     public static int[] ordenamientoPersonalizado(int [] vector){
         int aux=0;
         for (int i=0;i<vector.length/2;i++){
            for(int j=i;j<vector.length/2;j++){
                if (vector[j]<vector[i]){
                   aux=vector[j]; 
                   vector[j]=vector[i];
                   vector[i]=aux;
                }
            }
        }
        
        for (int i=vector.length/2;i<vector.length;i++){
            for(int j=i;j<vector.length;j++){
                if (vector[j]>vector[i]){
                   aux=vector[j]; 
                   vector[j]=vector[i];
                   vector[i]=aux;
                }
            }
        }
        
        /*
        for (int i=0;i<vector.length;i++){
            System.out.print(vector[i]+"");
        }
        */
        return vector;
    }
    
    public static void main(String[] args){
        //int vector[]={0, 2, 1, 65, 66, 78, 12, 11, 90, 13, -8};
        int vec[]={0,65, 2, 66, 78, 12, 11, 90, 13,1};
        
        //System.out.println(Ejercicio4.ordenamientoPersonalizado(vec));
        System.out.println(Arrays.toString(Ejercicio4.ordenamientoPersonalizado(vec)));

    }
    
}
