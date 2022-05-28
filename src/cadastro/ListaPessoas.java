package cadastro;

import java.util.ArrayList;

public class ListaPessoas {

    private ArrayList<Pessoa> pessoas;

    public ListaPessoas() {
        pessoas = new ArrayList<Pessoa>();
    }

    public ArrayList<Pessoa> getPessoas() {
        return pessoas;
    }

    public void setPessoas(ArrayList<Pessoa> pessoas) {
        this.pessoas = pessoas;
    }

    @Override
    public String toString() {
        return "Lista de Pessoas: " + pessoas;
    }

    public void adicionarPessoa(Pessoa pe) {
        this.pessoas.add(pe);
    }

    public void apagarTudo() {
        this.pessoas.clear();
    }

    public int obterQuantidadeDePessoas() {
        return this.pessoas.size();
    }

}
