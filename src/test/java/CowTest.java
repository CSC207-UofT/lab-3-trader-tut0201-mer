import org.junit.*;

import static org.junit.Assert.*;

public class CowTest {
    Cow c;

    @Before
    public void setUp() throws Exception {
        c = new Cow();
    }
    @Test(timeout = 50)
    public void TestSound() {
        assertEquals("Moo!", c.sound());
    }

    @Test(timeout = 50)
    public void TestGetPrice() {
        assertEquals(20, c.getPrice());
    }

}
