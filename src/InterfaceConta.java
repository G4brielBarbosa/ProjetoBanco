public interface InterfaceConta {

    void saque(float valor);
    void depositar(float valor);
    void transferir(float valor, Conta contaDestino);

}
