package staff;

public abstract class Employee {

    private String name;
    private String ni;
    private double salary;

    public Employee(String name, String ni, double salary) {
        this.name = name;
        this.ni = ni;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNi() {
        return ni;
    }

    public void setNi(String ni) {
        this.ni = ni;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void raiseSalary (double raiseAmount) {
        if(raiseAmount > 0) {
            this.salary += raiseAmount;
        }
    }

    public double payBonus() {
       return (this.salary / 100) * 1;
    }

    public String changeName(String name) {
        if(name != ""){
            setName(name);
        }
        return this.name;
    }
}
