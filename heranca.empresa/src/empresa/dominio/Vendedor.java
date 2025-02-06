package empresa.dominio;

public class Vendedor extends Funcionario{
	private int quantidadeVendas;
	
	public Vendedor(String nome, int idade, double salario, String setor, Endereco endereco, int quantidadeVendas) {
		super(nome, idade, salario, setor, endereco);
		this.quantidadeVendas = quantidadeVendas;
		comissao();
	}
	
	public void imprimir() {
		super.imprimir();
		System.out.println("Quantidade de vendas: "+this.quantidadeVendas);
	}
	
	public int getQuantidadeVendas() {
		return quantidadeVendas;
	}
	
	public void setQuantidadeVendas(int quantidadeVendas){
		this.quantidadeVendas = quantidadeVendas;
	}
	

}
