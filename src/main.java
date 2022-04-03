
public class main {

	public static void main(String[] args) {
		Cliente Vitor = new Cliente();
		Vitor.setNome("Vitor");
		
		Conta cc = new ContaCorrente(Vitor);
		cc.depositar(100);
		
		Conta poupanca = new ContaPoupanca(Vitor);
		
		cc.transferir(100, poupanca);
				
		cc.imprimirExtrato();
		poupanca.imprimirExtrato();
	}

}
