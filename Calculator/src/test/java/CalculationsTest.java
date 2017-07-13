import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertEquals;

public class CalculationsTest {


    @Test
    void testAdd() {

        Calculations calculations = new Calculations();

        int result = calculations.add(1,2);

        assertEquals(result, 3);
    }
}
