public class TransicionSimple implements TransicionHistoria {
    public void realizarTransicion(String decision) {
        if (decision.equalsIgnoreCase("A")) {
            System.out.println("Jayce decide que todos sean felices...");
        } else {
            System.out.println("Jayce decide armar una rebelión y pelear con Viktor...");
        }
    }
}
