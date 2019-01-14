import Staff.Director;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DirectorTest {
    Director director;

    @Before
    public void before(){
        director = new Director(5, "The Department of Love", "Winston", "WI247295b", 100);

    }

    @Test
    public void hasBudget(){
        assertEquals(5, director.getBudget());
    }

    @Test
    public void canGetPayBonus(){
        assertEquals(2, director.payBonus());
    }


}
