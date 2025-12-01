import java.util.ArrayList;

public class Giudice {
    private String pianetaDiArrivo;
    private int distanzaPianeta;
    private ArrayList<Astronave> astronavi;
    private ArrayList<Astronave> classifica;
    private boolean garaIniziata = false;
    private int tempoInizio;

    public Giudice (String pianetaDiArrivo, int distanzaPianeta) {
        this.pianetaDiArrivo = pianetaDiArrivo;
        this.distanzaPianeta = distanzaPianeta;
        this.astronavi = new ArrayList<>();
        this.classifica = new ArrayList<>();
    }

    public void aggiungiAstronave(Astronave a) {
        astronavi.add(a);
    }

    public void iniziaGara() {
        System.out.println("Gara iniziata: destinazione --> " + pianetaDiArrivo);
        System.out.println("Partecipanti: " + astronavi.size());

        for (Astronave a : astronavi) {
            a.start();
        }

        try {
            Thread.sleep(3000);

            garaIniziata = true;
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public int getDistanzaPianeta() {
        return distanzaPianeta;
    }

    public String getPianetaDiArrivo() {
        return pianetaDiArrivo;
    }
}