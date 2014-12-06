/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package cifra.de.cesar;

/**
 *
 * @author Robson Lima
 */
public class Operacoes {
    
    public String criptografar(String palavra, int k){ 
      int tam = palavra.length();
      String aux = "";
      String alfa = "abcdefghijklmnopqrstuvxwyz"; 
       
      for (int i=0; i<tam; i++) {
              // Digitei Z
             //       122         + 1 = 123
            if((palavra.charAt(i) + k) > 'z'){  // passou de Z 
                int dif = palavra.charAt(i) + k; //122 + 1 = 123
               // System.out.println(palavra.charAt(i) + k);
                               //A = 97 a = 65    +  123 - 122 -1 = 0 
                aux = aux + (char)(alfa.charAt(0) + (dif - 122 - 1));
                //System.out.println("alfa(0) " + alfa.charAt(0));
             }else{
                                  //   A             + 1
                aux = aux + (char)(palavra.charAt(i) + k);
            }
      }
      return (aux);
    }
                                            
     public String descriptografar(String palavra, int k) {
      int tam = palavra.length();
      String aux = "";
      
      for (int i=0; i<tam; i++) {
          //     a = 97        + 1 <  97
          if(palavra.charAt(i) - k < 'a'){
              //        122 -       97
              int dif = 'z' - palavra.charAt(i); 
              //                      97           + 25 = 
              aux = aux + (char)(palavra.charAt(i) + dif);
         }else{
              //             a: 97        + 1
              aux = aux + (char)(palavra.charAt(i) - k);
          }

      }
      return (aux);
    }
    
    
    
}

//aux = aux + (char)(palavra.charAt(i) - k);
