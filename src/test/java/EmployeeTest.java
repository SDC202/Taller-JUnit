import org.junit.Test;
import java.time.LocalDate;
import static org.junit.Assert.*;
import org.junit.Assume;

public class EmployeeTest {

    @Test
    public void testCSWorkerInUSD_EvenMonth() {
        Employee employee = new Employee(1000, "USD", 0.1f, EmployeeType.Worker);
        assertEquals(1000, employee.cs(), 0.01);
    }
    
    @Test
    public void tetsCSWorkerInUSD_OddMonth() {
        Employee employee = new Employee(1000, "USD", 0.1f, EmployeeType.Worker);
        // Suponiendo que el mes es impar, debería agregar el décimo
        float expectedSalary = 1000 + (386.0f / 12 * 2);
        assertEquals(expectedSalary, employee.cs(), 0.01);
    }

    @Test
    public void testCSWorkerInOtherCurrency_EvenMonth() {
        Employee employee = new Employee(1000, "EUR", 0.1f, EmployeeType.Worker);
        // Restando 5% por cambio de moneda
        float expectedSalary = 1000 * 0.95f;
        assertEquals(expectedSalary, employee.cs(), 0.01);
    }

    @Test
    public void testCSWorkerInOtherCurrency_OddMonth() {
        Employee employee = new Employee(1000, "EUR", 0.1f, EmployeeType.Worker);
        // Restando 5% por cambio de moneda y agregando el décimo
        float expectedSalary = 1000 * 0.95f + (386.0f / 12 * 2);
        assertEquals(expectedSalary, employee.cs(), 0.01);
    }

    @Test
    public void testCSManagerInUSD_OddMonth() {
        Employee employee = new Employee(2000, "USD", 0.2f, EmployeeType.Manager);
        float expectedSalary = 2000 + 0.7f * 0.2f + (386.0f / 12 * 2);
        assertEquals(expectedSalary, employee.cs(), 0.01);
    }

    @Test
    public void testCalculateYearBonusWorkerUSD() {
        Employee employee = new Employee(1000, "USD", 0.1f, EmployeeType.Worker);
        assertEquals(386.0f, employee.CalculateYearBonus(), 0.01);
    }

    @Test
    public void testCalculateYearBonusManagerOtherCurrency() {
        Employee employee = new Employee(2000, "EUR", 0.2f, EmployeeType.Manager);
        float expectedBonus = 2000 * 0.95f + 386.0f * 1.0f;
        assertEquals(expectedBonus, employee.CalculateYearBonus(), 0.01);
    }

    @Test
    public void testCalculateYearBonusSupervisorUSD() {
        Employee employee = new Employee(1500, "USD", 0.15f, EmployeeType.Supervisor);
        float expectedBonus = 1500 + 386.0f * 0.5f;
        assertEquals(expectedBonus, employee.CalculateYearBonus(), 0.01);
    }
}