/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_practica_1;

import java.util.Scanner;

/**
 *
 * @author flac3
 */
public class EVA2_PRACTICA_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int numero;
        String texto;
        Scanner captu=new Scanner(System.in);
         System.out.println("Escribir un texto");
        
       texto = captu.nextLine();       
       System.out.println("numero");
       numero=captu.nextInt();
       
       for(int i = 0; i<=numero; i++)
           System.out.println(texto);
    
             
       
       
        
        
    }
    
}
