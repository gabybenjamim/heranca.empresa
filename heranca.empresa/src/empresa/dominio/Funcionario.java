package empresa.dominio;

public class Funcionario {
	protected String nome;
	protected int idade;
	protected double salario;
	protected String setor;
	protected Endereco endereco;
	
	public void comissao() {
		this.salario = this.salario * 1.10; 
	}
	
	public Funcionario(String nome, int idade, double salario, String setor, Endereco endereco) {
		super();
		this.nome = nome;
		this.idade = idade;
		this.salario = salario;
		this.setor = setor;
		this.endereco = endereco;
	}
	
	public void imprimir() {
		System.out.println("Nome: "+this.nome+", Idade: "+this.idade);
		System.out.printf("Salário com comissão: %.2f \n",this.salario);
		System.out.println("Setor: "+this.setor);
		endereco.imprimir();
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public int getIdade() {
		return idade;
	}
	
	public void setIdade(int idade) {
		this.idade = idade;
	}
	
	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	public String getSetor() {
		return setor;
	}

	public void setSetor(String setor) {
		this.setor = setor;
	}

	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}

	
	

	
	
}
