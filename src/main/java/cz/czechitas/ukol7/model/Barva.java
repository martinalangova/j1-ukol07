package cz.czechitas.ukol7.model;

public enum Barva {
    Cerna ("černá"),
    Modra ("modrá"),
    Fialova ("fialová"),
    Cervena ("červená"),
    Ruzova ("růžová"),
    Zelena ("zelená"),
    Zluta ("žlutá"),
    Oranzova ("oranžová"),
    Bila ("bílá"),
    ;

    private final String text;

    Barva (String text) {
        this.text = text;
    }

    public String getText() {
        return text;
    }

}
