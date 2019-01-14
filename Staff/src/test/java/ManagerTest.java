import Staff.Employee;
import Staff.Manager;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ManagerTest {
    Manager manager;

    @Before
    public void before(){
        manager = new Manager("The Department of Truth", "Jane", "AB123456z", 100);
    }

    @Test
    public void canGetName(){
        assertEquals("Jane", manager.getName());
    }

    @Test
    public void canGetNiNumber(){
        assertEquals("AB123456z", manager.getNiNumber());
    }

    @Test
    public void canGetSalary(){
        assertEquals(100, manager.getSalary());
    }

    @Test
    public void canGetDepartmentName(){
        assertEquals("The Department of Truth", manager.getDepartmentName());
    }

    @Test
    public void canRaiseSalary(){
        assertEquals(100, manager.getSalary());
        manager.raiseSalary(10);
        assertEquals(110, manager.getSalary());
    }

    @Test
    public void canPayBonus(){
        assertEquals(1, manager.payBonus());
    }

}
