import org.junit.Before;
import org.junit.Test;
import staff.Employee;
import techStaff.DatabaseAdmin;

import static org.junit.Assert.assertEquals;

public class DatabaseAdminTest {

    DatabaseAdmin databaseAdmin;

    @Before
    public void before() {
        databaseAdmin = new DatabaseAdmin("Harrison", "JK674587D", 40000);
    }

    @Test
    public void databaseAdminHasName() {
        assertEquals("Harrison", databaseAdmin.getName());
    }

    @Test
    public void databaseAdminHasNi() {
        assertEquals("JK674587D", databaseAdmin.getNi());
    }

    @Test
    public void databaseAdminHasSalary() {
        assertEquals(40000, databaseAdmin.getSalary(), 0.0);
    }

    @Test
    public void canRaiseSalary() {
        databaseAdmin.raiseSalary(400);
        assertEquals(40400, databaseAdmin.getSalary(), 0.0);
    }

    @Test
    public void canCalculatePayBonus() {
        assertEquals(400, databaseAdmin.payBonus(), 0.0);
    }
}
