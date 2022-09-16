public class ContaCorrente extends Conta{

    public ContaCorrente(Cliente cliente) {
        super(cliente);
    }

    void extratoContaCorrente(){
        System.out.println("*********** Extrato Conta Corrente ***********");
        this.imprimirExtratoComum();
    }
}
