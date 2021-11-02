public class Schueler {
    private String name;
    private String vorname;

    public Schueler(String meinName, String meinVorname) {
        this.name = meinName;
        this.vorname = meinVorname;
    }

    public String getName() {
        return name;
    }

    public String getVorname() {
        return vorname;
    }

    public String getNameVorname() {
        return name + " " + vorname;
    }
}
