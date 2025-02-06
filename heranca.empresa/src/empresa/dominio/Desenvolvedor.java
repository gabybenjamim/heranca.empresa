package empresa.dominio;

public class Desenvolvedor extends Funcionario{
	private String linguagem;
	
	public Desenvolvedor(String nome, int idade, double salario, String setor, Endereco endereco, String linguagem) {
		super(nome, idade, salario, setor, endereco);
		this.linguagem = linguagem;
		comissao();
	}
	
	public void imprimir() {
		super.imprimir();
		System.out.println("Linguagem: "+this.linguagem);
	}
	
	public String getLinguagem() {
		return linguagem;
	}
	
	public void setLinguagem(String linguagem) {
		this.linguagem = linguagem;
	}
	

}
