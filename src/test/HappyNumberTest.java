import static org.junit.jupiter.api.Assertions.*;

class HappyNumberTest {

    @org.junit.jupiter.api.Test
    void sumSquareDigits() {
        assertEquals(30, HappyNumber.sumSquareDigits(1234, 10));
        assertEquals(125, HappyNumber.sumSquareDigits(55555, 10));
        assertEquals(2, HappyNumber.sumSquareDigits(20, 2));
    }

    @org.junit.jupiter.api.Test
    void is10Happy() {
        assertTrue(HappyNumber.isHappy(1, 10));
        assertTrue(HappyNumber.isHappy(673, 10));
        assertTrue(HappyNumber.isHappy(989, 10));
        assertFalse(HappyNumber.isHappy(2, 10));
        assertFalse(HappyNumber.isHappy(339, 10));
    }

    @org.junit.jupiter.api.Test
    void is6Happy() {
        assertTrue(HappyNumber.isHappy(254, 6));
        assertFalse(HappyNumber.isHappy(851, 6));
    }
}