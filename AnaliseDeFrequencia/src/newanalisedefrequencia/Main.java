/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package newanalisedefrequencia;

import java.util.Scanner;

/**
 *
 * @author Anderson
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        boolean stop = true;
        int opt;
        String letra_a, letra_b;
        
        String textoCodificado = "g5Bt5 t54yvtz3v4A5 wrG t53 7Bv r9 6v995r9 9v 9z4Ar3\n" +
                                    "58xB2y59r9. dBzA5 t54yvtz3v4A5, 7Bv 9v 9z4Ar3\n" +
                                    "yB3z2uv9. Vy r99z3 7Bv r9 v96zxr9 9v3 x8r59 v8xBv3\n" +
                                    "uv9uv4y59r3v4Av r trsvtr 6r8r 5 tvB, v47Br4A5 r9\n" +
                                    "tyvzr9 r9 srzEr3 6r8r r Av88r, 9Br 3rv.\n" +
                                    "cv54r8u5 Ur mz4tz";
        
        Frequencia f = new Frequencia();
        f.listarFrequencia();
        char letraMaisFrequente = f.analisarFrequencia(textoCodificado);
        
        System.out.println("Letra mais frequente: " + letraMaisFrequente);
        System.out.println("======Texto a ser decifrado ========\n" + textoCodificado);
        System.out.println("====================================");

        while(stop == true){
            opt = 1;
            
            //Laço para receber letras a serem trocadas pelo usuario
            switch(opt){
                case 1:
                {
                    System.out.print("\nTrocar letra: ");
                    letra_a = ler.nextLine();
                    System.out.print("pela letra: ");
                    letra_b = ler.nextLine();
                    
                    textoCodificado = f.trocar(textoCodificado, letra_a, letra_b);
                    System.out.println("\n======================================"
                            + "\ntexto: " + textoCodificado);
                  
                    break;
                }
               
            }
        }
    }
}
