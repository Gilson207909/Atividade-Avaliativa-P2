
package biblioteca;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {//Classe Movimentação do diagrama UML
    	new CriaDiretorios();
    	Autores[] exemplo = new Autores[1];
    	exemplo[0] = new Autores("JJ. James");
        Livro l = new Livro(010101, "7 advogados e um cliente", exemplo , "ADV Books", "Direito civil");
        Exemplar e = new Exemplar(010101, "7 advogados e um cliente", exemplo , "ADV Books", "Direito civil", 100, 29, 04, 2021);
        Funcionario f = new Funcionario("ADV01", "Demolidor");      
        Biblioteca b = new Biblioteca();
        b.cadastrar(l);
        b.cadastrar(e);
        b.cadastrar(f);         
        
        String resposta = "";
        int i = 1;
        while (i != 0) {
            System.out.println("Pressione enter para iniciar.");
            Scanner tecla = new Scanner(System.in);           
            String comando = tecla.nextLine();
            b.executar(comando, b);           
            System.out.println("Continuar? sim[s] ou nao[n] :");
            resposta = tecla.nextLine();
            if (!resposta.equals("s")) {
                while ( (!resposta.equals("s")) && (!resposta.equals("n")) ) {
                    System.out.println("Digite [s] ou [n] :");
                    resposta = tecla.nextLine();                   
                }
            if (resposta.equals("n")) {
                break;
            } 
        }  
          
    }
        System.out.println("");
        System.out.println("Sistema encerrado."); 
    }
    
}
