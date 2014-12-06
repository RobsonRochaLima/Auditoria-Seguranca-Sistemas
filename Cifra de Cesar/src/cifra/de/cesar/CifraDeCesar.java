/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package cifra.de.cesar;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Robson Lima
 */
public class CifraDeCesar {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // TODO code application logic here
        Scanner enter = new Scanner(System.in);
        int k;
        String palavra;
        
        System.out.print("Digite a palavra para criptografar: ");
        palavra = enter.nextLine();
        
        System.out.print("Digite o valor de K: ");
        k = enter.nextInt();
        
        
        Operacoes a = new Operacoes();
        Operacoes b = new Operacoes();
        
        String cript = a.criptografar(palavra, k);
        String descript = b.descriptografar(cript, k);
        
        System.out.println("Texto criptrografado: " + cript);
        System.out.println("Texto descriptrografado: " + descript);
        
        
        
        
        
       
        
         
        
        
        
    }
}
