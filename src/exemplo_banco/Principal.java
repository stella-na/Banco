package exemplo_banco;
public class Principal {

	public static void main(String[] args) {
		ContaBanco c1 = new ContaBanco();
		
		c1.setNumConta(1111);
		c1.setDono("João");
		
		c1.abrirConta("cc");
		c1.status();
		
		ContaBanco c2 = new ContaBanco();
		
		c2.setNumConta(2222);
		c2.setDono("Maria");
		
		c2.abrirConta("cp");
		c2.status();
		
		c1.depositar(100);
		//c1.sacar(200);
		c1.sacar(120);
		c1.pagarMensal();
		c1.status();
		
		c2.sacar(120);
		c2.pagarMensal();
		c2.depositar(100);
		c2.fecharConta();
		c2.status();
		

	}

}
