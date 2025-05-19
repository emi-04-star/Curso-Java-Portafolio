public class Narrador {
    public static void main(String[] args) {

        PaqueteNarrativo paquete = new PaqueteNarrativo("Inicio del viaje de Jayce");

        TransicionHistoria transicion = new TransicionSimple();
        GestorDialogo dialogo = new DialogoTexto();
        LogicaDecision decision = new DecisionBinaria();

        dialogo.mostrarDialogo(paquete);
        String accion = decision.tomarDecision();
        transicion.realizarTransicion(accion);
    }
}
