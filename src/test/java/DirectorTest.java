import management.Director;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DirectorTest {

    Director director;

    @Before
    public void before() {
        director = new Director("Brian", "JK643487D", 50000, "Director", 100000);
    }

    @Test
    public void directorHasName() {
        assertEquals("Brian", director.getName());
    }

    @Test
    public void directorHasNiNumber() {
        assertEquals("JK643487D", director.getNi());
    }

    @Test
    public void directorHasSalary() {
        assertEquals(50000, director.getSalary(), 0.0);
    }

    @Test
    public void directorHasDeptName() {
        assertEquals("Director", director.getDeptName());
    }

    @Test
    public void directorHasBudget() {
        assertEquals(100000, director.getBudget(), 0.0);
    }

    @Test
    public void canRaiseSalary() {
        director.raiseSalary(5000);
        assertEquals(55000, director.getSalary(), 0.0);
    }

    @Test
    public void canCalculatePayBonus() {
        assertEquals(1000, director.payBonus(), 0.0);
    }

    @Test
    public void canNotHaveNegativeNumberForRaiseSalary() {
        director.raiseSalary(-1);
        assertEquals(50000, director.getSalary(), 0.0);
    }

    @Test
    public void directorNameChanged() {
        director.changeName("Barbara");
        assertEquals("Barbara", director.getName());
    }

    @Test
    public void directorNameHasNotChanged() {
        director.changeName("");
        assertEquals("Brian", director.getName());
    }
}
