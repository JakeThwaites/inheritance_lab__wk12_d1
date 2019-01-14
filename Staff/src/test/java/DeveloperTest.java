import Staff.Developer;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DeveloperTest {

    Developer developer;

    @Before
    public void before(){
        developer = new Developer("Balthazar", "JJ892456Z", 200);
    }

    @Test
    public void canGetName(){
        assertEquals("Balthazar", developer.getName());
    }


}
