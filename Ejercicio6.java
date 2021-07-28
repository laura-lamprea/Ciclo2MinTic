/*
La función join recibe como parámetro un vector de caracteres, su trabajo será retornar una cadena de caracteres que es el resultado de concatenar todos los caracteres del vector.
El programa debe retornar como resultado exclusivamente el valor solicitado, no debe contener letras ni enunciados que lo acompañen.
Ejemplo de entrada:
char [] vector = {' ','P', 'r','o',' ', 'g', 'r','a',' ','m','a', 'r'};
Salida (Retorno):
String vectorConcatenado = " Pro gra mar";
 */
package ejercicios;



/**
 *
 * @author Laura Lamprea
 */
public class Ejercicio6 {
    public static String join(char [] vector){
        String vectorConcatenado="";
        for (int i=0;i<vector.length;i++){
            vectorConcatenado=vectorConcatenado+vector[i];
        }
        return vectorConcatenado;
    }
    
    public static void main(String[] args){
        char [] vector = {' ','P', 'r','o',' ', 'g', 'r','a',' ','m','a', 'r'};
        
        System.out.println(Ejercicio6.join(vector));

    }
}
