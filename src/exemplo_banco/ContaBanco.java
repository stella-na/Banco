package exemplo_banco;
public class ContaBanco {
	//Atributos
	public int numConta;
	protected String tipo;
	private String dono;
	private float saldo;
	private boolean status;
	//Métodos Personalizados	
	public void abrirConta(String t) {
		this.setTipo(t);
		this.setStatus(true);
		if (t.equalsIgnoreCase("CC")) {
			this.setSaldo(50);
		} else if (t.equalsIgnoreCase("CP")) {
			this.setSaldo(150);
		}
		System.out.println("A conta de " + this.getDono() + " foi aberta");
	}
	public void fecharConta() {
		if (this.getStatus()) {
			if (this.getSaldo() > 0) {
				System.out.println("Conta com saldo positivo não pode ser fechada");
			}
			if (this.getSaldo() < 0) {
				System.out.println("Conta com saldo negativo não pode ser fechada");
			}
			if (this.getSaldo() == 0) {
				this.setStatus(false);
				System.out.println("Conta de " + this.getDono() + 
									" foi fechada com sucesso!!!");
			}
		}
	}
	public void depositar(float v) {
		if (this.getStatus()) {
			this.setSaldo(getSaldo() + v);
			System.out.println("Depósito realizado na conta de " + this.getDono());
		}
		else {
			System.out.println("Impossível Depositar");
		}
	}
	public void sacar(float v) {
		if (this.getStatus()) {
			if (this.getSaldo() >= v) {
				this.setSaldo(getSaldo() - v);
				System.out.println("Saque realizado por " + this.getDono());
			}
			else {
				System.out.println("Saldo Insuficiente");
			}
		}
		else {
			System.out.println("Impossível Sacar");
		}
	}
	public void pagarMensal() {
		if(this.getStatus()) {
			if (this.getTipo().equalsIgnoreCase("CP")) {
				this.setSaldo(this.getSaldo() - 20);
			}else if (this.getTipo().equalsIgnoreCase("CC")) {
				this.setSaldo(this.getSaldo() - 12);
			}
			System.out.println("Pagamento Realizado!!!\n"
					+ "Seu saldo atual é: R$ " + this.getSaldo() + " reais");
		}else {
			System.out.println("Não foi possível realizar o pagamento");
		}
	}
	public void status() {
		System.out.println("Conta: " + this.getNumConta() +
				           "\nTipo: " + this.getTipo() +
				           "\nDono: " + this.getDono() +
				           "\nSaldo: " + this.getSaldo() +
				           "\nStatus: " + this.getStatus());
		System.out.println("-------------------------------");
	}
	//Métodos Especiais
	public ContaBanco() {
		this.saldo = 0;
		this.status = false;
	}
	public int getNumConta() {
		return numConta;
	}
	public void setNumConta(int n) {
		this.numConta = n;
	}
	public String getTipo() {
		return this.tipo;
	}
	public void setTipo(String t) {
		this.tipo = t;
	}
	public String getDono() {
		return this.dono;
	}
	public void setDono(String d) {
		this.dono = d;
	}
	public float getSaldo() {
		return this.saldo;
	}
	public void setSaldo(float s) {
		this.saldo = s;
	}
	public boolean getStatus() {
		return this.status;
	}
	public void setStatus(boolean s) {
		this.status = s;
	}
}
