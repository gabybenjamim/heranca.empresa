package empresa.dominio;

public class Endereco {
	protected String rua;
	protected String cep;
	protected int numero;
	
	public Endereco(String rua, String cep, int numero) {
		this.rua = rua;
		this.cep = cep;
		this.numero = numero;
	}
	
	public void imprimir() {
		System.out.println("Rua: "+this.rua+", Cep: "+this.cep+", Número: "+this.numero);
	}
	
	public String getRua() {
		return rua;
	}
	
	public void setRua(String rua) {
		this.rua = rua;
	}
	
	public String getCep() {
		return cep;
	}
	
	public void setCep(String cep) {
		this.cep = cep;
	}
	
	public int getNumero() {
		return numero;
	}
	
	public void setNumero(int numero) {
		this.numero = numero;
	}
	
	
	
	

}
