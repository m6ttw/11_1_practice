import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GuitarTest {
    Guitar stratocaster;
    Guitar telecaster;
    Guitar lesPaul;

    @Before
    public void before(){
        stratocaster = new Guitar("Fender", "Stratocaster", 1200);
        telecaster = new Guitar("Fender", "Telecaster", 1000);
        lesPaul = new Guitar("Gibson", "Les Paul", 2000);
    }

    @Test
    public void hasMake(){
        assertEquals("Fender", stratocaster.getMake());
    }

}
