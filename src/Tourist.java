interface Tourist {

    int budget = 0;

    void visit();

    void visit(Boracay boracay);
    void visit(Cebu cebu);
    void visit(Espana espana);
    void visit(Katipunan katipunan);
    void visit(Morato morato);
    void visit(Pureza pureza);

    default void visit(Locations locations) {
        System.out.println("Arrived on a location");
    };

    void checkBudget();
}