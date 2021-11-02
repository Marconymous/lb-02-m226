public class SchulApp {
    static Fach f;
    static Schueler s;
    static Zeugnis z;

    public static void main(String[] args) {
        // Frage 4
        s = new Schueler("Muster", "Max");

        z = new Zeugnis(s);
        System.out.println(z.getSchuelerName());

        // Frage 5
        f = new Fach("Mathe");
        z.addFach(f);

        f = new Fach("Deutsch");
        z.addFach(f);

        for (int i = 0; i < 2; i++) {
            System.out.println(z.getFachName(i));
        }
    }
}
