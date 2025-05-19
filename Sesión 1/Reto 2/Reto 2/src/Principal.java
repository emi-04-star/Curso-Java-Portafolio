public class Principal {
    public static void main(String[] args) {
        Entrada entrada1 = new Entrada("Concierto de Lady Gaga", 800.00);
        Entrada entrada2 = new Entrada("Obra de Teatro", 450.50);

        entrada1.mostrarInformacion();
        entrada2.mostrarInformacion();

    }
}