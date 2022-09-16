import java.util.List;

public class Banco {
    private String nome;
    private List<Conta> contas;

    void imprimirContas(){
        for(int i = 0; i < contas.size(); i++){
            System.out.println(contas.get(i));
        }
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<Conta> getContas() {
        return contas;
    }

    public void setContas(List<Conta> contas) {
        this.contas = contas;
    }


}
