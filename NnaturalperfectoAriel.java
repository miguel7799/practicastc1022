package nnaturalperfectoariel;

import java.util.Scanner;

public class NnaturalperfectoAriel {

    public static void main(String[] args) {
    
    Scanner Lector = new Scanner(System.in);
    
    System.out.println("-Numero Naural Perfecto-");
    System.out.print("Introduce el numero: ");
    int num = Lector.nextInt();
    int contador = 0;
    int suma = 0;
    int Natperfecto = 0;
    
    Natperfecto=num;
    for (contador=2; num>1; contador++) {
    if ((Natperfecto%contador)==0) {
        num=(Natperfecto/contador);
        suma=suma+num;}}
    if (suma==Natperfecto) 
    {System.out.println("El numero " + Natperfecto + " Es un numero natural perfecto");}
    else 
    {System.out.println("El numero " + Natperfecto + " No es un numero natural perfecto");}
    } 
}
