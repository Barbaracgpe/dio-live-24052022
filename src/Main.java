public class Main {

    public static void main(String[] args) {
        Cliente barbara = new Cliente();
        barbara.setNome("barbara");


        Conta cc = new ContaCorrente(barbara);
        Conta poupança = new ContaPoupança(barbara);

        cc.depositar(800);
        cc.transferir(350, poupança);

        cc.imprimirExtrato();
        poupança.imprimirExtrato();
    }
}
