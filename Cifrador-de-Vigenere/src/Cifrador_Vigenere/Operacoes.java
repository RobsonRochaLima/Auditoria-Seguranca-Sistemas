/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Cifrador_Vigenere;

import sun.security.util.Length;

/**
 *
 * @author Robson Lima
 */
public class Operacoes {
    //                          
    public char rotacionar(int num){ 
      int dif;
      char caractere;
      String alfabeto = "abcdefghijklmnopqrstuvxwyz";
      
        if(num >122){
            dif = (num - 122) - 1; // 124 - 122 = 2
            caractere = (char)alfabeto.charAt(dif);
            return caractere;
        }
        return (char)num;
        
     }
   
    
    public char criptografarLetra(char letra, char k){
        int m1,k1;
        
        m1 = (letra + k); 
        k1 = (m1 - 97); 
     
        //recebe a letra maior que 'z' rotacionada
        char rotacionado = rotacionar(k1);
       
        return rotacionado;        
    }
    
    public String criptografar(String chave, String palavra){
       int j, i;
       String key = igualarChave(chave, palavra);
       int num;
       String aux="";
       
        for(i = 0; i < palavra.length(); i++){
            num = criptografarLetra(palavra.charAt(i),key.charAt(i));
            aux = aux + (char)num; //cancatena a palavra criptografada   
        }
        
        return aux;
    }
    
    public String igualarChave(String chave, String palavra){
       int i, j=0;
       int tam = palavra.length() - chave.length();
       String c = chave;
       
       for(i = 0; i < tam; i++){
         
           if(i >= chave.length()){                  
                    c = c + (char)chave.charAt(j);
                    j++;
                    if(j >= chave.length()){
                        j=0;
                    }
           }else{
                if((chave.charAt(i) % 2) == 0){
                    c = c + (char)chave.charAt(i);
                    //System.out.println(c + " : " + i); 
                }else{  
                    c = c + (char)chave.charAt(i);
                    //System.out.println(c + " : " + i);   
                }
            }
       }
       return c;
    }
    
    //=================DESCRIPTOGRAFANDO==========================================================
    //                                      ab          acce
    public String descriptografar(String chave, String palavra){
        String aux="", chave_igual;
        int i=0, num;
        //igualar tamanho da chave e palavra ex: abab e acce
        //tranforna em numero ex: a = 97
        chave_igual = igualarChave(chave, palavra); // abab
        
        
            for(i = 0; i < palavra.length(); i++){
                num = descriptografarLetra(palavra.charAt(i),chave_igual.charAt(i));               
                aux = aux + (char)num; //cancatena a palavra criptografada                   
            }

        return aux;
        
    }
    
    public char rotacionarVolta(int num){
        int caractere;
        
        if(num < 97){
            caractere = num + 26;           
            return (char)caractere;
        }else{
            return (char)num;
        }
    }
    
    public int descriptografarLetra(char palavra, char k){
        int m1, k1;
        
        m1 = palavra + 97;
        k1 = (m1 - k);  
        
        char rotacionado = rotacionarVolta(k1);
        
        return rotacionado;
        
    }
       

}