public class Fach {
    public static final int MAX_NOTEN = 10;
    private String bezeichnung;
    private float[] noten;
    private int notenCounter = 0;

    public Fach(String bezeichnung) {
        this.bezeichnung = bezeichnung;

        noten = new float[MAX_NOTEN];
    }

    public String getBezeichnung() {
        return bezeichnung;
    }

    public boolean addNote(float note) {
        if (notenCounter + 1 >= MAX_NOTEN || notenCounter < 0) return false;

        noten[notenCounter] = note;
        return true;
    }

    public int getAnzahlNoten() {
        return notenCounter;
    }

    public float getNotenwert(int index) {
        if (index < 0 || index >= MAX_NOTEN) return -1f;

        return noten[index];
    }
}
