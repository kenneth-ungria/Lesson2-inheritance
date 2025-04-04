public class inheritance {

    private String name;
    private int age;
    protected double salary;
    
    //Constructor
    public inheritance(String name, int age, double salary){
        this.name = name;
        this.age = age;
        this.salary = salary;
    }
    //Method for getting name
    public String getName(){
        return this.name;
    }
    //Method for getting age
    public int getAge(){
        return this.age;
    }
    //Method for getting salary
    public double getSalary(){
        return this.salary;
    }
    //Method for getting increasing salary
    public void raisedsalary(){
        this.salary = this.salary *1.2;
    }
    public static void main(String[] args){
        inheritance emp = new inheritance ("JuanDelaCruz", 30, 100000);
        System.out.println("Name:" + emp.getName());
        System.out.println("age:" + emp.getAge());

        emp.raisedsalary();
        System.out.println("New Salary after raise:" + emp.getSalary());
    }   

}

