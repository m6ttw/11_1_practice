import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CustomerTest {
    Customer customer;

    @Before
    public void before(){
        customer = new Customer(1800);
    }

    @Test
    public void hasMoney(){
        assertEquals(1800, customer.getBankBalance());
    }
}
