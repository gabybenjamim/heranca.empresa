package empresa.teste;

import empresa.dominio.Desenvolvedor;
import empresa.dominio.Endereco;
import empresa.dominio.Gerente;
import empresa.dominio.Vendedor;

public class FuncionarioTeste {
	public static void main(String[] args) {
		Endereco endGerente = new Endereco("Rua Nova", "59826-301", 30);
		Gerente gerente = new Gerente("Maria", 19, 3750.60, "gerente", endGerente, 3);
		
		Endereco endDesenvolvedor = new Endereco("Rua 2", "15480-655", 40);
		Desenvolvedor desenvolvedor = new Desenvolvedor("Joao Pedro", 19, 25300.58, "Desenvolvedor", endDesenvolvedor, "Java");
		
		Endereco endVendedor = new Endereco("Rua 15", "74830-651", 50);
		Vendedor vendedor = new Vendedor("Gabrielly", 19, 3559.25, "Vendas", endVendedor, 10);
		
		gerente.imprimir();
		System.out.println();
		desenvolvedor.imprimir();
		System.out.println();
		vendedor.imprimir();
		
		
	}

}
