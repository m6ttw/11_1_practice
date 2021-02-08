import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GuitarShopTest {
    GuitarShop guitarShop;

    @Before
    public void before(){
        guitarShop = new GuitarShop("Matt's Music", 20000);
    }

    @Test
    public void hasName(){
        assertEquals("Matt's Music", guitarShop.getName());
    }

    @Test
    public void hasTill(){
        assertEquals(20000, guitarShop.getTill());
    }
}
