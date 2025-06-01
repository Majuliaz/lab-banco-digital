public class Main {
    public static void main(String[] args) {
        Banco banco = new Banco("Banco DIO");

        Cliente cliente1 = new Cliente("Maria");

        Conta cc = new ContaCorrente(cliente1);
        Conta cp = new ContaPoupanca(cliente1);

        banco.adicionarConta(cc);
        banco.adicionarConta(cp);

        cc.depositar(1000);
        cc.transferir(300, cp);

        cc.imprimirExtrato();
        cp.imprimirExtrato();

        System.out.println("Banco: " + banco.getNome());
        System.out.println("Total de contas no banco: " + banco.getContas().size());
    }
}
