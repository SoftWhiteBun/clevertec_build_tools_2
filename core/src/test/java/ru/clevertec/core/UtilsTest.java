package ru.clevertec.core;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class UtilsTest {
    @Test
    public void testIsAllPositiveNumbers() {
        assertTrue(Utils.isAllPositiveNumbers("86", "79"));
        assertFalse(Utils.isAllPositiveNumbers("4", "-79"));
        assertFalse(Utils.isAllPositiveNumbers("2", "abc"));
    }
}
