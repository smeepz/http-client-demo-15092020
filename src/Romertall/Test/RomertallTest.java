package Romertall.Test;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RomertallTest {

    @Test
    void shouldConvertToI() {
        assertEquals("I", toRoman(1));
    }
    private String toRoman(int i) {
        return "I";
    }
}

