package hospital;

public class Enfermeiro {
	private String nome;
	private String setor;
	private int coren;

	public Enfermeiro(String nome, String setor, int coren) {
		this.nome = nome;
		this.setor = setor;
		this.coren = coren;
	}

	// Getters e setters

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSetor() {
		return setor;
	}

	public void setSetor(String setor) {
		this.setor = setor;
	}

	public int getCoren() {
		return coren;
	}

	public void setCoren(int coren) {
		this.coren = coren;
	}

	// Método com passagem de parâmetro
	public void realizarCurativo(Paciente paciente, String tipoCurativo) {
		System.out.println("O enfermeiro " + this.nome + " realizou um curativo " + tipoCurativo + " no paciente "
				+ paciente.getNome());
	}
}
