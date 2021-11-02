public class Zeugnis {
    public static final int MAX_FAECHER = 10;
    private Schueler schueler;
    private Fach[] faecher;
    private int fachCounter = 0;

    public Zeugnis(Schueler schueler) {
        this.schueler = schueler;
        faecher = new Fach[MAX_FAECHER];
    }

    public String getSchuelerName() {
        return schueler.getNameVorname();
    }

    public boolean addFach(Fach fach) {
        if (fachCounter + 1 >= MAX_FAECHER || fachCounter < 0) return false;

        faecher[fachCounter++] = fach;

        return true;
    }

    public Fach getFach(int index) {
        if (index < 0 ||index >= MAX_FAECHER) return null;

        return faecher[index];
    }

    public String getFachName(int index) {
        if (index < 0 ||index >= MAX_FAECHER) return null;

        return faecher[index].getBezeichnung();
    }

    public String printZeugnis() {
        return null;
    }
}
