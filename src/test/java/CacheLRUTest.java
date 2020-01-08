import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CacheLRUTest {

    @Test
    @DisplayName("Check true/false")
    void put() {
        CacheLRU<Object, Object> test = new CacheLRU<>(1);
        {
            assertFalse(test.put(1, "Demo"));
        }
        {
            test.put(1, "Demo");
            assertTrue(test.put(1, "Demo"));
        }
        {
            test.put(2, "Betta");
            assertEquals("Betta", test.get(2));
        }
    }

    @Test
    @DisplayName("Check not null/null")
    void get() {
        CacheLRU<Object, Object> test = new CacheLRU<>(1);
        {
            assertNull(test.get(1));
        }
        {
            test.put(1, "Demo");
            assertEquals("Demo", test.get(1));
        }
    }
}