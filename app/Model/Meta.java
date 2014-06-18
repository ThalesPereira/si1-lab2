package Model;

public class Meta {

	private final int MuitoBaixa = 1;
	private final int Baixa = 2;
	private final int Media = 3;
	private final int Alta = 4;
	private final int MuitoAlta = 5;
	private String nomeDaMeta, descricao;
	private int prioridade, semana;

	public Meta(String nome, String descricao, int prioridade, int semana){

		nomeDaMeta = nome;
		this.prioridade = prioridade;
		this.descricao = descricao;
		this.semana = semana;
	}

	public String getNomeDaMeta() {
		return nomeDaMeta;
	}

	public void setNome(String nome) throws MetaException {
		if (nome == null || nome.equals("")) {
			throw new MetaException("Nome inválido");
		}
		this.nomeDaMeta = nomeDaMeta;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public int getPrioridade() {
		return prioridade;
	}

	public void setPrioridade(int prioridade) {
		this.prioridade = prioridade;
	}

	public int getSemana() {
		return semana;
	}

	public void setSemana(int semana) {
		this.semana = semana;
	}



}
