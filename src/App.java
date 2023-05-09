public class App {
    public static void main(String[] args) throws Exception {
        
        Me myself = new Me();

        Locations boracay = new Boracay();
        Locations cebu = new Cebu();
        Locations espana = new Espana();
        Locations katipunan = new Katipunan();
        Locations morato = new Morato();
        Locations pureza = new Pureza();

        boracay.accept(myself);
        cebu.accept(myself);
        espana.accept(myself);
        katipunan.accept(myself);
        morato.accept(myself);
        pureza.accept(myself);
    }
}
