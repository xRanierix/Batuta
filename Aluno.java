
public class Aluno {

	private String nome;
	private int id;
	private int idade;
	
	public Aluno(String nome, int id, int idade) {
        this.nome = nome;
        this.id = id;
        this.idade = idade;
    }
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getId() {
		return id;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}

	public String getDados()  {
      return "\nNome: " + nome + "\nId: " + id + "\nIdade: " + idade;
    }
}
