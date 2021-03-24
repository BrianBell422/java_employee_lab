import org.junit.Test;
import techStaff.Developer;
import org.junit.Before;

import static org.junit.Assert.assertEquals;

public class DeveloperTest {

    Developer developer;

    @Before
    public void before() {
        developer = new Developer("James", "JD994657B", 20000);
    }

    @Test
    public void developerHasName() {
        assertEquals("James", developer.getName());
    }

    @Test
    public void developerHasNiNumber() {
        assertEquals("JD994657B", developer.getNi());
    }

    @Test
    public void developerHasSalary() {
        assertEquals(20000, developer.getSalary(), 0.0);
    }

    @Test
    public void canRaiseSalary() {
        developer.raiseSalary(100);
        assertEquals(20100, developer.getSalary(), 0.0);
    }

    @Test
    public void canCalculatePAyBonus() {
        assertEquals(200, developer.payBonus(), 0.0);
    }



}
