public class Main {
    public static void main(String[] args) {
        Giudice g = new Giudice("Marte", 150);

        Astronave a1 = new Astronave("Apollo X", 1, "Giacomo", "Marte", g, 12);
        Astronave a2 = new Astronave("StarShip", 2, "Massimo", "Marte", g, 10);
        Astronave a3 = new Astronave("Falcon Heavy", 3, "Simone", "Marte", g, 15);
        Astronave a4 = new Astronave("Enterprise", 4, "Lorenzo", "Marte", g, 8);

        g.aggiungiAstronave(a1);
        g.aggiungiAstronave(a2);
        g.aggiungiAstronave(a3);
        g.aggiungiAstronave(a4);

        g.iniziaGara();
    }
}