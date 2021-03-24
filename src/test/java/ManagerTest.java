import management.Manager;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ManagerTest {

    Manager manager;

    @Before
    public void before() {
        manager = new Manager("John", "JK465372H", 30000, "Development");
    }

    @Test
    public void managerHasName() {
        assertEquals("John", manager.getName());
    }

    @Test
    public void managerHasNiNumber() {
        assertEquals("JK465372H", manager.getNi());
    }

    @Test
    public void managerHasSalary() {
        assertEquals(30000, manager.getSalary(), 0.0);
    }

    @Test
    public void managerHasDeptName() {
        assertEquals("Development", manager.getDeptName());
    }

    @Test
    public void canRaiseSalary() {
        manager.raiseSalary(300);
        assertEquals(30300, manager.getSalary(), 0.0);
    }

    @Test
    public void canCalculatePayBonus() {
        assertEquals(300, manager.payBonus(), 0.0);
    }
}
