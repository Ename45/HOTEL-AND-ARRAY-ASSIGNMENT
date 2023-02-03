package graceClass;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ArrayOfIntegersTest {
    ArrayOfInteger aoi;

    @BeforeEach

    @Test
    void startAllMethodsWith(){
        aoi = new ArrayOfInteger();
//        assertNotNull(aoi);
    }

    @Test
    void numbersInArrayMultipliesItself(){
        aoi.numbersMultiplyItself();
        assertEquals("[4, 16, 36, 9, 25, 1]", aoi.numbersMultiplyItself());
    }

    @Test
    void sortNumbersInAscendingOrder(){
        aoi.ascendingOrder();
        assertEquals("[1, 2, 3, 4, 5, 6]", aoi.ascendingOrder());
    }

    @Test
    void sortNumbersInDescendingOrder(){
        aoi.descendingOrder();
        assertEquals("[6, 5, 4, 3, 2, 1]", aoi.descendingOrder());
    }
}
