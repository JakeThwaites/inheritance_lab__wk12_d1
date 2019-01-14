package Staff;

public class Director extends Manager{
    int budget;

    public Director(int budget, String deptName, String name, String niNumber, int salary){
        super(deptName, name, niNumber, salary);
        this.budget = budget;
    }

    public int getBudget(){
        return budget;
    }

    public int payBonus(){
        return getSalary() / 50;
    }
}
