public class Conta implements InterfaceConta{

    private static int SEQUENCIAL = 0;
    private static int AGENCIA_PADRAO = 1;
    private int agencia;
    private int numero;
    private float saldo;

    private Cliente cliente;

    public Conta(Cliente cliente) {
        this.cliente = cliente;
        this.agencia = AGENCIA_PADRAO;
        this.numero = SEQUENCIAL++;

    }

    void imprimirExtratoComum(){
        System.out.println(String.format("Titular: %s", this.cliente.getNome()));
        System.out.println(String.format("Agencia: %d", this.agencia));
        System.out.println(String.format("Numero: %d", this.numero));
        System.out.println(String.format("Saldo: %.2f", this.saldo));
    }


    @Override
    public void saque(float valor) {
        this.setSaldo(this.getSaldo() - valor);
    }

    @Override
    public void depositar(float valor) {
        this.setSaldo(this.getSaldo() + valor);
    }

    @Override
    public void transferir(float valor, Conta contaDestino) {
        this.saque(valor);
        contaDestino.depositar(valor);
    }

    public int getAgencia() {
        return agencia;
    }

    public int getNumero() {
        return numero;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }
}
