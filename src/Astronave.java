import java.util.Scanner;

public class Astronave extends Thread{
    private String modello;
    private int id;
    private String nomePilota;
    private String destinazione;
    private Giudice g;

    public Astronave (String modello, int id, String nomePilota, String destinazione, Giudice g) {
        this.modello = modello;
        this.id = id;
        this.nomePilota = nomePilota;
        this.destinazione = destinazione;
        this.g = g;
    }

    @Override
    public void run() {
        System.out.println("Sono l'astronave: " + this.id + ", ed inizio la gara.");

        gareggia();
    }

    private void gareggia() {
        System.out.println("Inserisci il pianeta dove desideri andare:");

        Scanner sc = new Scanner(System.in);
        this.destinazione = sc.nextLine();

        //g.verifica();

        System.out.println("Ho scelto questa destinazione: " + this.destinazione);
    }
}
