public class Kert {
    Maci maci;
    Macska mici;

    public void inditElet() {
        initObject();
        startMaci();
        startMici();
    }

    public void initObject() {
        maci = new Maci();
        mici = new Macska();
    }

    public void startMaci() {
        maci.hangotad("Brumm...");
        maci.mezgyujtes();
        // maci.nev = "Brumi";
    }

    public void startMici() {
        mici.hangotad("Miauu...");
        mici.dorombolas();
        // mici.nev = "aa";
        mici.beallitNev("Mici");
        // System.out.println(mici.nev);
        System.out.println(mici.lekerNev());
    }
}
