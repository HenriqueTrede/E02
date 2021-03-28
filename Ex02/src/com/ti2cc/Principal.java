package com.ti2cc;
import java.util.*;

public class Principal {
	public static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		DAO dao = new DAO();
		
		dao.conectar();
		
		int num;
		System.out.println("Menu");
		System.out.println("Digite 1 para Listar");
		System.out.println("Digite 2 para inserir");
		System.out.println("Digite 3 para Excluir");
		System.out.println("Digite 4 para Atualizar");
		System.out.println("Digite 5 para Sair");
		
		do {
			num = sc.nextInt();
			
			switch(num) {
			case 1:
				//Mostrar jogadores do sexo masculino		
				System.out.println("==== Mostrar jogadores do sexo masculino === ");
				Jogador[] jogadores = dao.getJogadoresMasculinos();
				for(int i = 0; i < jogadores.length; i++) {
					System.out.println(jogadores[i].toString());
				}
				
				break;
			
			case 2:
				//Inserir um elemento na tabela
				System.out.print("Digite os dados");
				System.out.print("id: ");
				int id = sc.nextInt();
				System.out.print("nome: ");
				String nome = sc.nextLine();
				System.out.print("time: ");
				String time = sc.nextLine();
				System.out.print("sexo: ");
				char sexo = sc.nextLine().charAt(0);
				
				Jogador jogador = new Jogador(id, nome, time,sexo);
				if(dao.inserirJogador(jogador) == true) {
					System.out.println("Inserção com sucesso -> " + jogador.toString());
				}
				
				break;
				
			case 3:
				//Excluir jogador
				System.out.print("Digite o numero da Id do jogador que gostaria de excluir");
				 int excluir = sc.nextInt();
				dao.excluirJogador(jogador.getId());
				
				break;
				
			case 4:
				//Atualizar jogador
				System.out.print("Digite os novos dados");
				System.out.print("id: ");
				int Nid = sc.nextInt();
				System.out.print("nome: ");
				String Nnome = sc.nextLine();
				System.out.print("time: ");
				String Ntime = sc.nextLine();
				System.out.print("sexo: ");
				char Nsexo = sc.nextLine().charAt(0);
				jogador.setTime("novo time");
				dao.atualizarJogador(jogador);
				
				break;
				
			default: break;
			}
		
		}while(num != 5);
		
		dao.close();
	}
}
