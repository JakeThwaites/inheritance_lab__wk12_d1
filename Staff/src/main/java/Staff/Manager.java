package Staff;

public class Manager extends Employee {
    private String deptName;

    public Manager(String deptName, String name, String niNumber, int salary){
        super(name, niNumber, salary);
        this.deptName = deptName;
    }

    public String getDepartmentName() {
        return deptName;
    }

}
