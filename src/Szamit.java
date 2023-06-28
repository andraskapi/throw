public class Szamit {

    public void duplaz(double szam) throws NegativSzamException {
        if (szam < 0) {
            throw new NegativSzamException("Negatív szám");
        } else {
            System.out.println(szam * 2);
        }
    }
}
