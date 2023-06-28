public class Program {
    public static void main(String[] args) throws Exception {
        Szamit szamit = new Szamit();

        System.out.println(szamit.duplaz(5));

        try {
           szamit.duplaz(-3.8);
        }catch (NegativSzamException exception){
            System.out.println(exception.getMessage());
        }

    }
}
