import java.util.Scanner;

public class DecisionBinaria implements LogicaDecision {
    public String tomarDecision() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("¿Qué deseas hacer?");
        System.out.println("A: No meterle un martillazo a Viktor y que todos sean felices");
        System.out.println("B: Darle el martillazo y armar una Rebelión contra el");
        //If you know, you know ;-;
        System.out.print("Selecciona A o B: ");
        String input = scanner.nextLine();
        return input.toUpperCase();
    }
}
