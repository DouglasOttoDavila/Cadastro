package cadastro;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) throws Exception {

        Commons com = new Commons();

        Scanner scan = new Scanner(System.in);

        ListaEnderecos le = new ListaEnderecos();
        ListaPessoas lp = new ListaPessoas();

        int opcao = 0;

        while (opcao >= 0) {
            System.out.println("| Cadastro de Pessoas e Endereços |");
            System.out.println("1 - Cadastrar Pessoa");
            System.out.println("2 - Visualizar Pessoas");
            System.out.println("3 - Visualizar Endereços");
            System.out.println("4 - Ver quantidade de Pessoas");
            System.out.println("5 - Ver quantidade de Endereços");
            System.out.println("6 - Apagar todas as Pessoas");
            System.out.println("7 - Apagar todos os Endereços");
            System.out.println("8 - Sair");

            opcao = scan.nextInt();

            switch (opcao) {
                case 1:
                    com.limparTela();
                    Pessoa pe = new Pessoa();
                    com.limparTela();
                    System.out.println("Digite o nome: ");
                    scan.nextLine();
                    String nome = scan.nextLine();
                    pe.setNome(nome);
                    com.limparTela();
                    System.out.println("Digite a idade: ");
                    int idade = scan.nextInt();
                    pe.setIdade(idade);
                    com.limparTela();
                    System.out.println("Digite o sexo: M - Masculino / F - Feminino");
                    char sexo = scan.next().charAt(0);
                    pe.setSexo(sexo);
                    com.limparTela();
                    Endereco en = new Endereco();
                    System.out.println("Digite o logradouro: ");
                    scan.nextLine();
                    String logradouro = scan.nextLine();
                    en.setLogradouro(logradouro);
                    com.limparTela();
                    System.out.println("Digite o complemento: ");
                    String complemento = scan.nextLine();
                    en.setComplemento(complemento);
                    com.limparTela();
                    System.out.println("Digite o número: ");
                    int numero = scan.nextInt();
                    en.setNumero(numero);
                    com.limparTela();
                    System.out.println("Digite o CEP:");
                    scan.nextLine();
                    String cep = scan.nextLine();
                    en.setCep(cep);
                    pe.setEnd(en);
                    le.adicionarEndereco(en);
                    lp.adicionarPessoa(pe);
                    com.limparTela();
                    System.out.println("Contato cadastrado com sucesso!");
                    com.aguardaInput();
                    break;
                case 2:
                    if (lp.getPessoas().isEmpty()) {
                        com.limparTela();
                        System.out.println("Não há pessoas cadastradas.");
                        com.aguardaInput();
                    } else {
                        com.limparTela();
                        System.out.println(lp);
                        com.aguardaInput();
                    }
                    break;
                case 3:
                    if (le.getEnderecos().isEmpty()) {
                        com.limparTela();
                        System.out.println("Não há endereços cadastrados.");
                        com.aguardaInput();
                    } else {
                        com.limparTela();
                        System.out.println(le);
                        com.aguardaInput();
                    }
                    break;
                case 4:
                    com.limparTela();
                    System.out.println("Existe(m) " + lp.obterQuantidadeDePessoas() + " pessoa(s) cadastrada(s).");
                    com.aguardaInput();
                    break;
                case 5:
                    com.limparTela();
                    System.out.println("Existe(m) " + le.obterQuantidadeEnderecos() + " endereço(s) cadastrado(s).");
                    com.aguardaInput();
                    break;
                case 6:
                    if (lp.getPessoas().isEmpty()) {
                        com.limparTela();
                        System.out.println("Não há pessoas para excluir.");
                        com.aguardaInput();
                    } else {
                        com.limparTela();
                        System.out.println(
                                "ATENÇÃO!\nConfirma a remoção de todos as PESSOAS do sistema?\n1 - Sim\n2 - Não");
                        int exclusao = scan.nextInt();
                        if (exclusao == 1) {
                            lp.apagarTudo();
                            System.out.println("Pessoas excluídas com sucesso!");
                            com.aguardaInput();
                        } else {
                            com.limparTela();
                            System.out.println("Operação cancelada.");
                            com.aguardaInput();
                        }
                    }
                    break;
                case 7:
                    if (le.getEnderecos().isEmpty()) {
                        com.limparTela();
                        System.out.println("Não há endereços para excluir.");
                        com.aguardaInput();
                    } else {
                        com.limparTela();
                        System.out.println(
                                "ATENÇÃO!\nConfirma a remoção de todos os ENDEREÇOS do sistema?\n1 - Sim\n2 - Não");
                        int exclusao = scan.nextInt();
                        if (exclusao == 1) {
                            le.apagarTudo();
                            System.out.println("Endereços excluídos com sucesso!");
                            com.aguardaInput();
                        } else {
                            com.limparTela();
                            System.out.println("Operação cancelada.");
                            com.aguardaInput();
                        }
                    }
                    break;
                case 8:
                    com.limparTela();
                    System.out.println("Sistema encerrado.");
                    opcao = -1;
                    com.aguardaInput();
                    break;
                default:
                    com.limparTela();
                    System.out.println("Opção inválida.");
                    com.aguardaInput();
                    break;
            }
        }
        scan.close();
    }
}
