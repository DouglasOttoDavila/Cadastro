package cadastro;

import java.util.ArrayList;

public class ListaEnderecos {

    private ArrayList<Endereco> enderecos;

    public ListaEnderecos() {
        enderecos = new ArrayList<Endereco>();
    }

    public ArrayList<Endereco> getEnderecos() {
        return enderecos;
    }

    public void setEnderecos(ArrayList<Endereco> enderecos) {
        this.enderecos = enderecos;
    }

    @Override
    public String toString() {
        return "Lista de Endereços: " + enderecos + "\n";
    }

    public void adicionarEndereco(Endereco end) {
        this.enderecos.add(end);
    }

    public void apagarTudo() {
        this.enderecos.clear();
    }

    public int obterQuantidadeEnderecos() {
        return this.enderecos.size();
    }

}
