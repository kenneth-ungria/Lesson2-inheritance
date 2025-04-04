public class Salesperson extends inheritance{

    private double commissionPercentage;

    //Contructor
    public Salesperson(String name, double salary, int age, double commissionPercentage) {
        super(name, age, salary);

        this.commissionPercentage = commissionPercentage;
    }

    public double getCommissionPercentage(){
        return this.commissionPercentage;
    }

    public void raisedCommission() {
        if (this.commissionPercentage < .30) {
            this.commissionPercentage = this.commissionPercentage * 1.2;
        }
    }
}