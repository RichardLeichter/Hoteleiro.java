public class Reserva {
    private Quarto quarto;
    private String nomeCliente;
    private int dias;


    public Reserva() {
        this.quarto = quarto;
        this.nomeCliente = nomeCliente;
        this.dias = dias;
    }

    public double calcularValor() {
        double preco = quarto.getPrecoDiaria() * dias;
        if(dias >= 10) {
            return preco -= preco * 0.1;
        }
        return preco;
    }

    public void confirmarReserva() {
        quarto.reservar();
    }
}
