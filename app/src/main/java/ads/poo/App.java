package ads.poo;

import java.time.LocalDate;
import java.util.Scanner;

public class App {
    private Agenda agenda = new Agenda();
    private Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        App app = new App();
        app.menu();
        app.scanner.close();
    }

    private void menu() {
        boolean sair = false;
        String nome;
        String sobrenome;
        String rotulo;
        String valor;
        int index;

        do {
            System.out.println("Menu:\n");
            System.out.println("1. Adicionar Contato\n");
            System.out.println("2. Buscar Contato\n");
            System.out.println("3. Remover Contato\n");
            System.out.println("4. Adicionar Telefone\n");
            System.out.println("5. Adicionar Email\n");
            System.out.println("6. Atualizar Telefone\n");
            System.out.println("7. Atualizar Email\n");
            System.out.println("8. Remover Telefone\n");
            System.out.println("9. Remover Email\n");
            System.out.println("0. Sair");

            String opcao = scanner.nextLine();
            switch (opcao) {
                case "1":
                    System.out.print("Nome: ");
                    nome = scanner.nextLine();
                    System.out.print("Sobrenome: ");
                    sobrenome = scanner.nextLine();
                    System.out.println("Data de nascimento (aaaa-mm-dd): ");
                    LocalDate dataNasc = LocalDate.parse(scanner.nextLine());
                    agenda.addContato(new Contato(nome, sobrenome, dataNasc));
                    break;
                case "2":
                    System.out.print("Nome: ");
                    nome = scanner.nextLine();
                    System.out.print("Sobrenome: ");
                    sobrenome = scanner.nextLine();
                    System.out.println(agenda.findContato(nome, sobrenome));
                    break;
                case "3":
                    System.out.print("Contatos disponíveis:\n");
                    for (int i = 0; i < agenda.getContatos().size(); i++) { 
                        System.out.print(i + " - " + agenda.getContatos().get(i).getNome());
                    }
                    System.out.print("Índice do contato: ");
                    index = Integer.parseInt(scanner.nextLine());
                    agenda.removeContato(index);
                    break;
                case "4":
                    System.out.print("Contatos disponíveis:\n");
                    for (int i = 0; i < agenda.getContatos().size(); i++) { 
                        System.out.print(i + " - " + agenda.getContatos().get(i).getNome());
                    }
                    System.out.print("Tipo de telefone: ");
                    rotulo = scanner.nextLine();
                    System.out.print("Telefone: ");
                    valor = scanner.nextLine();
                    System.out.print("Índice do contato: ");
                    index = Integer.parseInt(scanner.nextLine());
                    agenda.addTelefone(rotulo, valor, index);
                    break;
                case "5":
                    System.out.print("Contatos disponíveis:\n");
                    for (int i = 0; i < agenda.getContatos().size(); i++) { 
                        System.out.print(i + " - " + agenda.getContatos().get(i).getNome());
                    }
                    System.out.print("Tipo de email: ");
                    rotulo = scanner.nextLine();
                    System.out.print("Email: ");
                    valor = scanner.nextLine();
                    System.out.print("Índice do contato: ");
                    index = Integer.parseInt(scanner.nextLine());
                    agenda.addEmail(rotulo, valor, index);
                    break;
                case "6":
                    System.out.print("Contatos disponíveis:\n");
                    for (int i = 0; i < agenda.getContatos().size(); i++) { 
                        System.out.print(i + " - " + agenda.getContatos().get(i).getNome());
                    }
                    System.out.print("Tipo do telefone novo: ");
                    rotulo = scanner.nextLine();
                    System.out.print("Novo telefone: ");
                    valor = scanner.nextLine();
                    System.out.print("Índice do contato: ");
                    index = Integer.parseInt(scanner.nextLine());
                    agenda.updateTelefone(rotulo, valor, index);
                    break;
                case "7":
                    System.out.print("Contatos disponíveis:\n");
                    for (int i = 0; i < agenda.getContatos().size(); i++) { 
                        System.out.print(i + " - " + agenda.getContatos().get(i).getNome());
                    }
                    System.out.print("Tipo do email novo: ");
                    rotulo = scanner.nextLine();
                    System.out.print("Novo email: ");
                    valor = scanner.nextLine();
                    System.out.print("Índice do contato: ");
                    index = Integer.parseInt(scanner.nextLine());
                    agenda.updateEmail(rotulo, valor, index);
                    break;
                case "8":
                    System.out.print("Contatos disponíveis:\n");
                    for (int i = 0; i < agenda.getContatos().size(); i++) { 
                        System.out.print(i + " - " + agenda.getContatos().get(i).getNome());
                    }
                    System.out.print("Tipo do telefone: ");
                    rotulo = scanner.nextLine();
                    System.out.print("Índice do contato: ");
                    index = Integer.parseInt(scanner.nextLine());
                    agenda.removeTelefone(rotulo, index);
                    break;
                case "9":
                    System.out.print("Contatos disponíveis:\n");
                    for (int i = 0; i < agenda.getContatos().size(); i++) {
                        System.out.print(i + " - " + agenda.getContatos().get(i).getNome());
                    }
                    System.out.print("Tipo do email: ");
                    rotulo = scanner.nextLine();
                    System.out.print("Índice do contato: ");
                    index = Integer.parseInt(scanner.nextLine());
                    agenda.removeEmail(rotulo, index);
                    break;
                case "0":
                    sair = true;
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
                    break;
            }
        } while (!sair);
    }
}
