public class Szamit {

    public double duplaz(double szam) throws NegativSzamException {
        if (szam < 0) {
            throw new NegativSzamException("Negatív szám");
        } else {
            return szam * 2;
        }
    }
}
