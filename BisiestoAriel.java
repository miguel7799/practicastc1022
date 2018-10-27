package bisiestoariel;

import java.util.Scanner;

public class BisiestoAriel {

    public static void main(String[] args) {
    
        Scanner Lector  = new Scanner(System.in);
        
        System.out.println("-Ano Bisiesto-");
        System.out.print("Introduce el ano: ");
        int ano = Lector.nextInt();
        
        int con1= 4;
        int con2= 100;
        int con3=400;
        
        if (ano%con1 != 0)
        {System.out.println(+ ano + " no es un ano biciesto");}
        else if ((ano%con1 == 0) && (ano%con2 != 0))
        {System.out.println(+ ano + " Es un ano biciesto");}  
        
        else if ((ano%con2 == 0) && (ano%con3 != 0))
        {System.out.println(+ ano + " no es un ano biciesto");}
                
        else if  ((ano%con2 == 0) && (ano%con3 == 0))
        {System.out.println(+ ano + " Es un ano biciesto");}     
        
    }
    
}
