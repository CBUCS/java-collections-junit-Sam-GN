import org.junit.Test;
import org.junit.jupiter.api.*;

public class MainTest {



    @Test
    public void notNull(){
        Assertions.assertNotNull(main.list);
    }

    @Test
    public void add() {
        Assertions.assertTrue(main.add(1));
    }

    @Test
    public void contains(){
        main.add(1);
        Assertions.assertTrue(main.contain(1));

    }

    public void size(){
        main.add(1);
        Assertions.assertEquals(1,main.size());
    }

    @Test
    public void remove() {
        main.add(1);
        Assertions.assertEquals(1,main.remove(0));
    }

}
