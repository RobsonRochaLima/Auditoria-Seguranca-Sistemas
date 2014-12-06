/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Cifrador_Vigenere;

import java.util.Scanner;

/**
 *
 * @author Robson Lima
 */
public class Cifrador_Vigenere {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        
        System.out.print("Digite a chave: ");
        String chave = ler.nextLine();
        
        System.out.print("Digite a palavra: ");
        String _palavra = ler.nextLine();
        
        //tirar os espaços da palavra digitada
        String palavra = _palavra.replaceAll(" ", "");
        
        Operacoes a = new Operacoes();
        Operacoes b = new Operacoes();
        
        String cript = a.criptografar(chave, palavra);
        String descript = b.descriptografar(chave, cript);
        
        System.out.println("Palavra Criptografada: " + cript);
        System.out.println("Palavra Descriptografada: " + descript);
        
        
        
        
        
    }
}
