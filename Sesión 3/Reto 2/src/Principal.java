public class Principal {
    public static void main(String[] args) {
        Factura FacturaConRFC = new Factura(2500.0, "Servicio de consultoría", "ABCC010101XYZ");

        Factura FacturaSinRFC = new Factura(1800.0, "Reparación de equipo", null);

        System.out.println(FacturaConRFC.getResumen());
        System.out.println(FacturaSinRFC.getResumen());
    }
}