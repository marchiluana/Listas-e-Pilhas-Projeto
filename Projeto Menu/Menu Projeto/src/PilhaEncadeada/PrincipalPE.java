package PilhaEncadeada;

import java.util.Scanner;

public class PrincipalPE
{
	public void PE()

	{
  
		Scanner teclado = new Scanner (System.in);
		
		Pilha pilha = new Pilha();
		
		int opcao = 0;
		
		do 
		{
		    System.out.println("\n\n ### MENU PILHA ENCADEADA ###");
		    System.out.println("\n ==============================");
		    System.out.println(" |     1 - Inserir Pessoa     |");
		    System.out.println(" |     no Topo                |");
		    System.out.println(" |     2 - Remover Pessoa     |");
		    System.out.println(" |     do Topo                |");
		    System.out.println(" |     3 - Exibir Pessoa      |");
		    System.out.println(" |     do Topo                |");
		    System.out.println(" |     4 - Voltar             |");
		    System.out.println(" |     0 - Sair               |");
		    System.out.println(" ==============================\n");
		
		    System.out.print("Op��o -> ");
		    opcao = teclado.nextInt();
		
		    switch(opcao)
		    {
		        case 1:
		            pilha.push();
		            break;
		
		        case 2:
		            pilha.pop();
		            break;
		
		        case 3:
		            pilha.exibirPessoas();;
		            break;
		
		        case 4:
		        	return;
		            
		        case 0:
		        	break;
		
		        default:
		            System.out.println("Op��o Inv�lida!");
		                break;
	        }
	
	    }while (opcao != 0);
	
	    teclado.close();
	}
}