package hospital;

public class Paciente {
	private String nome;
	private String cpf;
	private String email;
	private String endereco;

	public Paciente(String nome, String cpf, String email, String endereco) {
		this.nome = nome;
		this.cpf = cpf;
		this.email = endereco;
		this.endereco = endereco;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	// Método com passagem de parâmetro
	public void realizarConsulta(String sintomas) {
		System.out.println("O paciente " + this.nome + " realizou uma consulta. Sintomas apresentados: " + sintomas);
	}
}
