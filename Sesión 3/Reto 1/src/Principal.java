public class Principal {
    public static void main(String[] args) {
        Pasajero pasajero = new Pasajero("Ana Martínez", "P#15465");

        Vuelo vuelo = new Vuelo("UX123", "París", "14:30");

        boolean reservado = vuelo.reservarAsiento(pasajero);
        if (reservado) {
            System.out.println("Reserva realizada con éxito.\n");
        } else {
            System.out.println("No se pudo realizar la reserva.\n");
        }

        System.out.println(vuelo.obtenerItinerario());

        System.out.println("Cancelando reserva...\n");
        vuelo.cancelarReserva();

        System.out.println(vuelo.obtenerItinerario());

        vuelo.reservarAsiento("Mario Gonzalez", "P#5548654");
        System.out.println(vuelo.obtenerItinerario());
    }
}