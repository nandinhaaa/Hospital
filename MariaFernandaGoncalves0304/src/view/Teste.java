package view;

import hospital.*;
import java.util.*;

public class Teste {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Digite o nome do paciente:");
		String nome = sc.nextLine();

		System.out.println("Digite o CPF do paciente:");
		String cpf = sc.nextLine();

		System.out.println("Digite o email do paciente:");
		String email = sc.nextLine();

		System.out.println("Digite o endereço do paciente:");
		String endereco = sc.nextLine();

		Paciente paciente1 = new Paciente(nome, cpf, email, endereco);

		Medico medico1 = new Medico("Dra. Nanda", "Pediatria");
		Enfermeiro enfermeiro1 = new Enfermeiro("Enf. Tulio", "Coren12345678", 123456);

		Internacao internacao1 = new Internacao(paciente1, medico1, enfermeiro1, "Virose", 100.0, 2);
		System.out.println("");
		
		List<Internacao> listaInternacao = new ArrayList<>();
		listaInternacao.add(internacao1);

		for (Internacao internacao : listaInternacao) {
			internacao.mostrarRelatorio();
		}

		sc.close();
	}
}
