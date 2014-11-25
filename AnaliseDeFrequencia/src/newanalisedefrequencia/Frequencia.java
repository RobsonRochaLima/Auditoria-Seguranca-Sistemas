/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package newanalisedefrequencia;

/**
 *
 * @author Anderson
 */
public class Frequencia {
    int quantidade, quantAux= 0;
    char letra, letraAux;
        
    //Analisa a frequencia das letras
    public char analisarFrequencia(String texto){         
        String _texto = removerEspaco(texto);
        
        System.out.println("Letra: Frequencia");
        for(int i=0; i<_texto.length(); i++){
            for(int j=0; j<_texto.length(); j++){
                if(_texto.charAt(i) == _texto.charAt(j)){
                    quantidade += 1;
                    letra = _texto.charAt(i);
                }
            }
            System.out.println(letra + ":" + quantidade);
            if(quantidade > quantAux){ //verifica qual é a mais frequente no texto
                quantAux = quantidade;
                letraAux = letra;
            }
            quantidade = 0;
        }
        return letraAux;
    }
    
    //REMOVE OS ESPAÇOS ENTRE UMA PALAVRA E OUTRA
    public String removerEspaco(String texto){
        String textoSemEspaco = "";
        
        for (int i = 0; i < texto.length(); i++) {
            textoSemEspaco = texto.replaceAll(" ", "");
        }
        return textoSemEspaco;
    }
    
    //REALIZA A TROCA DE UMA LETRA POR OUTRA NA FRASE
    public String trocar(String texto, String a, String _b){
        String b = _b.toUpperCase();
        
        return texto.replaceAll(a, b); // troca 'a' pela letra 'b'
    }
    
    //apresenta a lista de letras com a porcentagem de frequencia
    public void listarFrequencia(){
        System.out.println("========================TABELA DE FREQUENCIA===========================================\n"+
                    "        A: 14.63%       N: 5.05%        C: 3.88%        H: 1.28%        J: 0.40%\n" +
                    "	E: 12.57%       D: 4.99%        L: 2.78%        Q: 1.20%        X: 0.21%\n" +
                    "	O: 10.73%       M: 4.74%        P: 2.52%        B: 1.04%        K: 0.02%\n" +
                    "	S: 7.81%        U: 4.63%        V: 1.67%        F: 1.02%        W: 0.01%\n" +
                    "	R: 6.53%	T: 4.34%        G: 1.30%        Z: 0.47%        Y: 0.01%\n" +
                    "	I: 6.18%\n"
                + "========================================================================================\n");
    }
    
}

