import static org.junit.jupiter.api.Assertions.*;

class HappyNumberTest {

    @org.junit.jupiter.api.Test
    void sumDigits() {
        assertEquals(10, HappyNumber.sumDigits(1234, 10));
        assertEquals(25, HappyNumber.sumDigits(55555, 10));
        assertEquals(2, HappyNumber.sumDigits(20, 2));
    }
}