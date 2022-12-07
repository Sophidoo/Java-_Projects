

import main.Arithmetric;
import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertEquals;

class ArithmetricTest {

    @Test
    void twoplustwoshouldbfour() {
        var arm = new Arithmetric();
        assertEquals(4,arm.add(2, 2));
    }
    @Test
    void twoplustwoshouldbfourl() {
        var arm = new Arithmetric();
        assertEquals( 4,arm.add(2, 2));
    }


}