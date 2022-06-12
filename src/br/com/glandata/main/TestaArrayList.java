package br.com.glandata.main;

import java.util.ArrayList;
import java.util.Scanner;

public class TestaArrayList {
	public static void main(String[] args) {

		ArrayList<String> agenda = new ArrayList<String>();
		agenda.add("Giancarlo;1198745201");
		agenda.add("Amanda;11888889999");
		agenda.add("Alessandra;11999997777");
		agenda.add("Kelly;11999994444");
		agenda.add("Camila;11999995555");

		System.out.println(agenda);

		System.out.println("Percorrendo os contatos \"N\" da agenda usando índice");
		int n = agenda.size();
		for (int i = 0; i < n; i++) {
			System.out.printf("Elemento %d - %s\n", i + 1, agenda.get(i));
		}

		try (Scanner ler = new Scanner(System.in)) {
			System.out.println("\nInforma a posição a ser excluída: ");
			int x = ler.nextInt();
			agenda.remove(x);
		} catch (Exception e) {
			e.getStackTrace();
		}

		System.out.println("Percorrendo os contatos \"N\" da agenda usando enhanced for");

		for (String contato : agenda) {
			System.out.println(contato);
		}
	}
}
