package cadastro;

public class Pessoa {

    private String nome;
    private int idade;
    private char sexo;

    Endereco end = new Endereco();

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public Endereco getEnd() {
        return end;
    }

    public void setEnd(Endereco end) {
        this.end = end;
    }

    @Override
    public String toString() {
        return "\n|Nome: " + nome + "\n|Idade: " + idade + "\n|Sexo: " + sexo + end + "\n";
    }

}
