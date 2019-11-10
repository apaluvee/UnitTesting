import org.junit.Test;

import static org.junit.Assert.*;
import static org.assertj.core.api.Assertions.*;

public class EmployeeTest {

    Employee employee1 = new Employee("First1", "Last1", 1000, true, false);
    Employee employee2 = new Employee("First2", "Last2", 2000.0, false, true);
    //Employee employee3 = new Employee("", null, -2000.0, false, true);

    @Test
    public void annualSalary() {

        double result = employee1.annualSalary();
        assertThat(result).isEqualTo(12000);
    }

    @Test
    public void fullName() {

        String result = employee1.fullName();
        assertThat(result).isEqualTo("First1 Last1");

    }

    @Test
    public void numberOfVacationDaysEmployee1() {

        int result = employee1.numberOfVacationDays();
        assertThat(result).isEqualTo(28 + 20);
    }



}