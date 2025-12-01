public class Astronave extends Thread{
    private String modello;
    private int idAstronave;
    private String nomePilota;
    private String destinazione;
    private Giudice giudice;
    private int distanzaMancante = 0;
    private int velocità;
    private boolean inGara = true;

    public Astronave (String modello, int idAstronave, String nomePilota, String destinazione, Giudice giudice, int velocità) {
        this.modello = modello;
        this.idAstronave = idAstronave;
        this.nomePilota = nomePilota;
        this.destinazione = destinazione;
        this.giudice = giudice;
        this.velocità = velocità;
    }

    @Override
    public void run() {
        System.out.println("Astronave: " + modello + " (Pilota: " + nomePilota + ") pronta per " + destinazione + "!");


        gareggia();
    }

    private void gareggia() {
        while (inGara && distanzaMancante < giudice.getDistanzaPianeta()) {
            try {
                Thread.sleep(5000);

                distanzaMancante += velocità;

                if (distanzaMancante >= giudice.getDistanzaPianeta()) {
                    distanzaMancante = giudice.getDistanzaPianeta();
                    System.out.println("L'astronave " + modello + " è arrivata su " + destinazione + " !!!");
                    inGara = false;
                } else {
                    System.out.println("All'astronave " + modello + " (Pilota: " + nomePilota + ") " + (giudice.getDistanzaPianeta() - distanzaMancante));
                }
            } catch (InterruptedException e) {
                inGara = false;
            }
        }

    }

    public int getIdAstronave() {
        return idAstronave;
    }

    public String getModello() {
        return modello;
    }

    public String getNomePilota() {
        return nomePilota;
    }

    public String getDestinazione() {
        return destinazione;
    }

    public int getDistanzaMancante() {
        return distanzaMancante;
    }

    public int getVelocità() {
        return velocità;
    }
}