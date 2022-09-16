public class Main {
    public static void main(String[] args) {

        Cliente charlotte = new Cliente();
        charlotte.setNome("Charlotte");


        Cliente ivy = new Cliente();
        ivy.setNome("Ivy");

        ContaCorrente cc = new ContaCorrente(charlotte);
        ContaPoupança cp = new ContaPoupança(ivy);

        cp.setSaldo(2000.f);
        cc.setSaldo(5674.67f);

        cp.extratoContaPopupanca();
        cc.extratoContaCorrente();
    }
}