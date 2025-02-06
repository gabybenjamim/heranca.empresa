package empresa.dominio;

public class Gerente extends Funcionario{
	private int funcionarioSobSupervisao;
	
	public Gerente(String nome, int idade, double salario, String setor, Endereco endereco, int funcionarioSobSupervisao) {
		super(nome, idade, salario, setor, endereco);
		this.funcionarioSobSupervisao = funcionarioSobSupervisao;
		comissao();
	}
	
	public void imprimir() {
		super.imprimir();
		System.out.println("Funcionarios sob supervisão: "+this.funcionarioSobSupervisao);
	}
	
	public int getFuncionarioSobSupervisao(){
		return funcionarioSobSupervisao;
	}
	
	public void setFuncionarioSobSupervisao(int funcionarioSobSupervisao) {
		this.funcionarioSobSupervisao = funcionarioSobSupervisao;
	}

}
