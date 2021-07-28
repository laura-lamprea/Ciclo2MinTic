/*
Cree un programa en Java que le solicite al usuario un número entero 
(NO COLOCAR MENSAJES DESCRIPTIVOS PARA LA SOLICITUD DE ESTE, O SU PROGRAMA NO
PASARÁ LOS TEST), luego calcule el factorial del número ingresado, y como resultado
muestre en la pantalla el factorial del número ingresado. El programa debe mostrar 
como resultado exclusivamente el valor solicitado, no debe contener letras ni enunciados 
que lo acompañen. por ejemplo si el usuario ingresa 3 el programa debe mostrar: 6

 */
package ejercicios;
import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner teclado=new Scanner(System.in);
        int num;
        long fact=1;
        System.out.print("Ingrese:");
        num=teclado.nextInt();
        for(int i=1;i<=num;i++){
            
            fact=fact*i;
            //System.out.println(fact);
        }
        
        System.out.println("resultado: "+ fact);
        
    }
    
}



////////////////


    