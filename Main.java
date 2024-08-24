
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        System.out.print("Digite seu nome: ");
        Scanner sc = new Scanner(System.in);

        String nomeCliente;
        nomeCliente = sc.next();
        System.out.println("Seja bem vindo(a) ao Garden! " + nomeCliente);


        Hotel hotel = new Hotel("Garden", "Rua 1");
        Quarto quarto1 = new Quarto(1, 50.0);
        Quarto quarto2 = new Quarto(2, 50.0);
        Quarto quarto3 = new Quarto(3, 50.0);
        Quarto quarto4 = new Quarto(4, 50.0);
        Quarto quarto5 = new Quarto(5, 50.0);


        hotel.adicionarQuarto(quarto1);
        hotel.adicionarQuarto(quarto2);
        hotel.adicionarQuarto(quarto3);
        hotel.adicionarQuarto(quarto4);
        hotel.adicionarQuarto(quarto5);

        System.out.println("Quartos disponiveis: ");
        System.out.println(hotel.listarQuartos());
    }
}