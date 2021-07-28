/*
La función sumaVectorial recibe como parámetros dos vectores de números enteros DE IGUAL LONGITUD (L), su trabajo será retornar un vector nuevo de números enteros, que es el resultado de hacer la suma vectorial entre los dos vectores recibidos como parámetro.
El programa debe retornar como resultado exclusivamente el valor solicitado, no debe contener letras ni enunciados que lo acompañen.
Ejemplo de entrada:
int [] v1 = {0, 2, 1, 65, 66, 78, 12, 11, 90, 13};
int [] v2 = {0, -2, 1, 9, 4, 78, 12, 11, 90, 13};
Salida (Retorno):
int [] s = {0, 0, 2, 74, 70, 156, 24, 22, 180, 26};
*/
package ejercicios;

import java.util.Arrays;

/**
 *
 * @author Laura Lamprea
 */
public class Ejercicio5 {
    public static int[] sumaVectorial(int [] v1, int [] v2){
        //int s [] = null;// DUDA PORQUE NO FUNIONA
        int[] s = new int[v1.length]; 
        
        
        for (int i=0;i<v1.length;i++){
            int n1 = v1[i];
            int n2 = v2[i];
            s[i] = n1+n2;
        }
        
        return s;
    }
    
    public static void main(String[] args){
        int [] v_1 = {0, 2, 1, 65, 66, 78, 12, 11, 90, 13};
        int [] v_2 = {0, -2, 1, 9, 4, 78, 12, 11, 90, 13};
        
        System.out.println(Arrays.toString(Ejercicio5.sumaVectorial(v_1,v_2)));

    }
}
