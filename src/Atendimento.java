import java.util.Scanner;

public class Atendimento {
    public static void main(String[] args){
    int idade=0;
    String nome;
    double peso=0;

    Scanner teclado = new Scanner(System.in);
    System.out.println("Seja bem vindo(a) a nossa clínica! Faça seu cadastro abaixo:");
    System.out.println("Digite em ordem. Idade, peso e nome: ");
    idade = teclado.nextInt();
    peso=teclado.nextDouble();
    nome=teclado.next();


    System.out.println("Nome: "+ nome);
    System.out.println("Idade: "+ idade);
    System.out.println("Peso: "+peso);

    if (idade<18){
        System.out.println("Menor de idade. Solicite um responsável");
    }
    else if (idade<65){
        System.out.println("Adulto");
    }
    else {
        System.out.println("Adulto Idoso");
    }
    }
}
