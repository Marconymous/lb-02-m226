public class SchulApp {
    static Fach f;
    static Schueler s;
    static Zeugnis z;

    public static void main(String[] args) {
        s = new Schueler("Muster", "Max");

        z = new Zeugnis(s);

        System.out.println(z.getSchuelerName());
    }
}
