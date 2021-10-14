package Familia36;

import java.util.*;

public class estoqueJava 
{
	public static void main(String[] args) 
	{
		int op;
		Scanner ler = new Scanner (System.in);
		
		ArrayList<String> estoque = new ArrayList();
		
		do
		{
			System.out.println("\n----------------------------------------------------------");
			System.out.println("\n(1) Deseja adicionar produtos ao estoque?");
			System.out.println("\n(2) Deseja remover produtos do estoque?");
			System.out.println("\n(3) Deseja atualizar produtos do estoque?");
			System.out.println("\n(4) Deseja mostrar todos os produtos do estoque?");
			System.out.println("\n(0) Deseja sair do programa ?");
			System.out.println("\n----------------------------------------------------------");
			
			System.out.println("\nDigite sua opção");
			
			op = ler.nextInt();
			
			switch(op)
			{
			case 1:
				ler.nextLine();
				System.out.println("\nDigite o produto para adicionar ao estoque: ");
				String produto = ler.nextLine();
				estoque.add(produto);
				break;
				
			case 2:
				ler.nextLine();
				System.out.println("\nDigite o produto para remover do estoque: ");
				String produtor = ler.nextLine();
				if(estoque.contains(produtor))
				{
					estoque.remove(produtor);
				}
				
				else 
				{ 
					System.out.print("\n Este produto não existe no estoque!"); 
				}
				
				break;
				
			case 3:
				ler.nextLine();
				System.out.println("\nDigite o produto que quer atualizar: ");
				String verifica = ler.nextLine();
				System.out.println("\nDigite o nome do produto que entrará no lugar do" +verifica+":");
				String novo = ler.nextLine();
				
				if(estoque.contains(verifica))
				{
					estoque.remove(verifica);
					estoque.add(novo);
				}
				else
				{
					System.out.println("\nProduto não existente no estoque: ");
				}
				break;
				
			case 4:
				ler.nextLine();
				System.out.println("\nProdutos do estoque: ");
				System.out.println(estoque);
				break;
				default:
					System.out.println("\nOpção inválida:");
			}
		}
		
		while(op!=0);
	}
}
