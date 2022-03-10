import static org.junit.Assert.*;

public class WatermelonTest {

    @org.junit.Test
    public void isDivisible() {
        Watermelon watermelon = new Watermelon(0);
        assertEquals(null,watermelon.isDivisible());


        Watermelon watermelon1 = new Watermelon(1);
        assertEquals("NO",watermelon1.isDivisible());


        Watermelon watermelon2 = new Watermelon(2);
        assertEquals("NO",watermelon2.isDivisible());


        Watermelon watermelon3 = new Watermelon(4);
        assertEquals("YES",watermelon3.isDivisible());


        Watermelon watermelon4 = new Watermelon(6);
        assertEquals("YES",watermelon4.isDivisible());


        Watermelon watermelon5 = new Watermelon(101);
        assertEquals(null,watermelon5.isDivisible());
    }
}
