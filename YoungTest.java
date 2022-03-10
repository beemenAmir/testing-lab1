import org.junit.Test;

import static org.junit.Assert.*;

public class YoungTest {

    @Test
    public void main() {
        Young young = new Young();
assertEquals("YES", Young.main(2,1,2,1,-1,-2,-1));

        assertEquals("NO", Young.main(3,4,2,1,3,4,5,6,7,0));

        assertEquals("YES", Young.main(3,4,2,1,-2,-1,-1,-2,-1,0));
    }
}