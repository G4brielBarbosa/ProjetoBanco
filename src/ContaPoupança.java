public class ContaPoupança extends Conta{

    public ContaPoupança(Cliente cliente) {
        super(cliente);
    }

    void extratoContaPopupanca(){
        System.out.println("*********** Extrato Conta Poupança ***********");
        this.imprimirExtratoComum();
    }

}
