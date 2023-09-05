public class App {
    public static void main(String[] args) throws Exception {
        Maci maci = new Maci();
        Macska mici = new Macska();
        maci.hangotad("Brumm...");
        maci.mezgyujtes();
        // maci.nev = "Brumi";

        mici.hangotad("Miauu...");
        mici.dorombolas();
        // mici.nev = "aa";
        mici.beallitNev("Mici");
        // System.out.println(mici.nev);
        System.out.println(mici.lekerNev());
    }
}
