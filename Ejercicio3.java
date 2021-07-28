/*
La función mean recibe como parámetro un vector de números enteros, su trabajo será retornar la media aritmética (Promedio) de los números que hay en el vector.
El calificador considera un 2% de error debido a posibles aproximaciones.
El programa debe retornar como resultado exclusivamente el valor solicitado, no debe contener letras ni enunciados que lo acompañen.
Ejemplo de entrada:
int [] vectorEntrada = {0, 2, 1, 65, 66, 78, 12, 11, 90, 13, -8}; 
Salida (Retorno):
30.0

{0, 2, 1, 65, 66, 78, 12, 11, 90, 13}  ---> 33.79999923706055
 */
package ejercicios;

/**
 *
 * @author Laura Lamprea
 */
public class Ejercicio3 {
    public static double mean(int [] vector){
        float promedio=0;
        int s=0;
        for (int i=0;i<vector.length;i++){
            s=s+vector[i]; 
        }
        promedio=(float)s/vector.length;
        return promedio;
    }
    
    public static void main(String[] args){
        //int vector[]={0, 2, 1, 65, 66, 78, 12, 11, 90, 13, -8};
        int vector[]={0, 2, 1, 65, 66, 78, 12, 11, 90, 13};
        
        System.out.println(Ejercicio3.mean(vector));
        
    }
}
