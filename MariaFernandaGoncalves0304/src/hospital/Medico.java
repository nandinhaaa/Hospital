package hospital;

public class Medico {

	private String nome;
	private String especialidade;

	public Medico() {
	}

	public Medico(String nome, String especialidade) {
		this.nome = nome;
		this.especialidade = especialidade;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEspecialidade() {
		return especialidade;
	}

	public void setEspecialidade(String especialidade) {
		this.especialidade = especialidade;
	}

	public void realizarConsulta(Paciente paciente, String motivoConsulta) {
		System.out.println("O médico " + this.nome + " realizou a consulta do paciente " + paciente.getNome()
				+ " com o seguinte motivo: " + motivoConsulta);
	}
}
