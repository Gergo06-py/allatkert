public class Allat {
    private String nev = "névtelen";

    public void beallitNev(String nev) {
        if (nev.isEmpty()) {
            System.out.println("Hiba: nem adtál meg nevet!");
            System.exit(1);
        } else {
            this.nev = nev;
        }
    }

    public String lekerNev() {
        return nev;
    }

    public void hangotad(String hang) {
        System.out.println(hang);
    }
}
