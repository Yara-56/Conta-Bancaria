import java.util.Scanner;
public class contaBancaria {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);

        String nome = "Yara Lacerda Moraes";
        String tipoDaConta = "Conta Corrente";
        double saldo = 159.99;

        String informacoesDoCliente = """
                                        
                Bem vindo(a) %s ao seu banco virtual!
                Tipo de conta: %s
                Seu saldo na conta é de: %f\s
                       """.formatted(nome, tipoDaConta, saldo);

        System.out.print(informacoesDoCliente);
        int opcaoEscolhida;
        do {
            System.out.printf("\n");
            System.out.println("O que gostaria de fazer hoje? ");
            System.out.println(" 1 - Consultar saldo.");
            System.out.println(" 2 - Receber valor.");
            System.out.println(" 3 - Transferir valor.");
            System.out.println(" 4 - Sair.");
            System.out.println("                  ");
            System.out.println("Digite a opção desejada: ");
            opcaoEscolhida = leitura.nextInt();
            double saldoAtual = saldo;

            if (opcaoEscolhida == 1) {
                System.out.println("Seu saldo atualizado é de: " + saldoAtual);

            } else if (opcaoEscolhida == 2) {
                System.out.println(" Quanto foi recebido? ");
                double valor = leitura.nextDouble();
                saldo += valor;
                System.out.printf("Seu novo saldo é " + saldo);

            } else if (opcaoEscolhida == 3) {
                System.out.println("Quanto você gostaria de transferir?");
                int valor = leitura.nextInt();
                if (valor > saldo) {
                    System.out.printf("Você não tem saldo para realizar a transferência.");
                } else {
                    saldo -= valor;
                    System.out.printf("Seu novo saldo é " + saldo);
                }

            } else if (opcaoEscolhida == 4) {
                System.out.println("Saindo.");
                break;
            }

        } while (opcaoEscolhida != 4);

    }
}
