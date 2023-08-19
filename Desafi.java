import java.util.Scanner;
    public class Desafi {
     public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String opcao = null;
     do {
        System.out.println("Qual é o seu nome?");
        String nomeDoAluno = scanner.nextLine();

        System.out.println("Me informe a suas três disciplinas: ");
        String nomeDaDisciplina = scanner.nextLine();

        String mensagemInical = """
                               Seja bem vindo(a) %s!
                               Esse é o seu calculador de média particula! 
                               """.formatted(nomeDoAluno);
        System.out.println(mensagemInical);
        System.out.println("Quais foram as notas das disciplinas? ");
        System.out.print("Primeira nota: ");
        double primeiraNota = scanner.nextDouble();

        System.out.print("Segunda nota: ");
        double segundaNota = scanner.nextDouble();

        System.out.print("Terceira nota: ");
        double terceiraNota = scanner.nextDouble();

        //calculo da média
        double media = (primeiraNota +segundaNota + terceiraNota ) / 3;

        if (media >= 7 ) {
            System.out.print("Você está aprovado!");
        }else{
            if (media < 5 ) {
                System.out.print("Você está reprovado!");
            }else {
                System.out.print("Você está de recuperação!");


                System.out.print("Você gostaria de calcular a média de outra disciplina?");
                String repetirOperação = scanner.nextLine();


            }
            }
         System.out.println("Deseja calcular a média em outra disciplina?");
         opcao = scanner.next();

        }while(opcao.equals("Sim"));

         System.out.print("Muito obrigada por utilizar a nossa plataforma!");
    }
}