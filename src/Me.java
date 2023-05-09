public class Me implements Tourist {

    static int budget = 1000;

    public void visit() {
        System.out.println("Enjoying my stay");
    }

    public void visit(Boracay boracay) {
        if(budget >= 100){
            budget = budget - boracay.airFare;
        if(budget >= 100 ){
            System.out.println("i had a good time");
        } else{
            System.out.println("kapos budget");
        }

        checkBudget();
        }

        else {
            System.out.println("pass no money");
        }
        

        

    }

    public void visit(Cebu cebu) {
        if(budget >= 100){
            budget = budget - cebu.airFare;
        if(budget >= 100){
            System.out.println("malayo masyado pero goods");
        }
        else{
            System.out.println("no money");
        }
        checkBudget();
        }

        else {
            System.out.println("pass no money");
        }
        
    }

    public void visit(Espana espana) {
        if(budget >= 100){
            budget = budget - espana.airFare;
        if(budget >= 100){
            System.out.println("malayo masyado pero goods");
        }
        else{
            System.out.println("no money");
        }
        checkBudget();
        }

        else {
            System.out.println("pass no money");
        }
        
    }

    public void visit(Katipunan katipunan) {
        if(budget >= 100){
            budget = budget - katipunan.airFare;
        if(budget >= 100){
            System.out.println("malayo masyado pero goods");
        }
        else{
            System.out.println("no money");
        }
        checkBudget();
        }

        else {
            System.out.println("pass no money");
        }
        
    }

    public void visit(Morato morato) {
        if(budget >= 100){
            budget = budget - morato.airFare;
        if(budget >= 100){
            System.out.println("malayo masyado pero goods");
        }
        else{
            System.out.println("no money");
        }
        checkBudget();
        }

        else {
            System.out.println("pass no money");
        }
        
    }

    public void visit(Pureza pureza) {
        if(budget >= 100){
            budget = budget - pureza.airFare;
        if(budget >= 100){
            System.out.println("malayo masyado pero goods");
        }
        else{
            System.out.println("no money");
        }
        checkBudget();
        }

        else {
            System.out.println("pass no money");
        }
        
    }

    public void checkBudget() {
        System.out.println("my budget is " + budget);
    }

}
