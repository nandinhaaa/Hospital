package hospital;

public class Internacao {
	private static int contadorInternacoes = 0;

	private int id;
	private Paciente paciente;
	private Medico medicoResponsavel;
	private Enfermeiro enfermeiroResponsavel;
	private String motivoInternacao;
	private double valorDiaInternacao;
	private int quantidadeDiasInternacao;

	public Internacao(Paciente paciente, Medico medicoResponsavel, Enfermeiro enfermeiroResponsavel,
			String motivoInternacao, double valorDiaInternacao, int quantidadeDiasInternacao) {
		this.id = ++contadorInternacoes;
		this.paciente = paciente;
		this.medicoResponsavel = medicoResponsavel;
		this.enfermeiroResponsavel = enfermeiroResponsavel;
		this.motivoInternacao = motivoInternacao;
		this.valorDiaInternacao = valorDiaInternacao;
		this.quantidadeDiasInternacao = quantidadeDiasInternacao;
	}

	public int getId() {
		return id;
	}

	public Paciente getPaciente() {
		return paciente;
	}

	public Medico getMedicoResponsavel() {
		return medicoResponsavel;
	}

	public Enfermeiro getEnfermeiroResponsavel() {
		return enfermeiroResponsavel;
	}

	public String getMotivoInternacao() {
		return motivoInternacao;
	}

	public double getValorDiaInternacao() {
		return valorDiaInternacao;
	}

	public int getQuantidadeDiasInternacao() {
		return quantidadeDiasInternacao;
	}

	public double getValorTotalInternacao() {
		return valorDiaInternacao * quantidadeDiasInternacao;
	}

	public void mostrarRelatorio() {
		System.out.println("Relatório de internação:");
		System.out.println("ID da internação: " + getId());
		System.out.println("Paciente: " + getPaciente().getNome());
		System.out.println("Médico responsável: " + getMedicoResponsavel().getNome());
		System.out.println("Enfermeiro responsável: " + getEnfermeiroResponsavel().getNome());
		System.out.println("Motivo da internação: " + getMotivoInternacao());
		System.out.println("Valor da diária: R$ " + getValorDiaInternacao());
		System.out.println("Quantidade de dias de internação: " + getQuantidadeDiasInternacao());
		System.out.println("Valor total da internação: R$ " + getValorTotalInternacao());
	}

}
