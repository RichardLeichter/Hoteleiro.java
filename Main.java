
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        System.out.println("Seja bem vindo(a) ao Garden!");
        Scanner sc = new Scanner(System.in);

        Cliente cliente = new Cliente();

        System.out.println("Por favor, para continuar precisamos de alguns dados!");
        System.out.print("Nome: ");
        String nome = sc.nextLine();
        System.out.print("CPF: ");
        String cpf = sc.nextLine();
        System.out.print("Telefone: ");
        String telefone = sc.nextLine();

        System.out.println("Bem vindo! " + cliente.nomeCliente());



        Hotel hotel = new Hotel("Garden", "Rua 1");

        Quarto quarto1 = new Quarto(1, 60.00);
        Quarto quarto2 = new Quarto(2, 60.00);
        Quarto quarto3 = new Quarto(3, 60.00);
        Quarto quarto4 = new Quarto(4, 60.00);
        Quarto quarto5 = new Quarto(5, 60.00);

        hotel.adicionarQuarto(quarto1);
        hotel.adicionarQuarto(quarto2);
        hotel.adicionarQuarto(quarto3);
        hotel.adicionarQuarto(quarto4);
        hotel.adicionarQuarto(quarto5);

        System.out.println("Quartos disponiveis: ");
        System.out.println(hotel.listarQuartos());

        System.out.print("Escolha o número do quarto: ");
        int numeroQuarto = sc.nextInt();


        Reserva reserva = new Reserva();

        System.out.println("Por quantos dias desejá ficar? ");
        int dias = sc.nextInt();

        double precoDiaria = 60.00;
        double valorTotal = dias * precoDiaria;
        if (dias > 10) {
            valorTotal *= 0.9;
        }

        System.out.println("Valor total da estadia: R$" + valorTotal);


    }
}