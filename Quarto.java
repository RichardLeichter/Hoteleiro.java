public class Quarto {
    private int numero;
    private double precoDiaria;
    private boolean disponivel;

    public Quarto(int numero, double precoDiaria) {
        this.numero = numero;
        this.precoDiaria = precoDiaria;
        this.disponivel = true;
    }

    public int getNumero() {
        return this.numero;
    }

    public double getPrecoDiaria() {
        return this.precoDiaria;
    }

    public void reservar() {
        if(disponivel) {
            disponivel = false;
        } else {
            System.out.println("Quarto já está ocupado.");
        }
    }

    public void liberar() {
        if (!disponivel) {
            disponivel = true;
        } else {
            System.out.println("Quarto já está disponível.");
        }
    }

    @Override
    public String toString() {
        return "Quarto [numero=" + numero + ", precoDiaria=" + precoDiaria + ", disponivel=" + disponivel + "]";
    }
}