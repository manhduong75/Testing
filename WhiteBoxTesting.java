import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Whiteboxtesting {
    @Test
    void testcase1() {
        Person p = new Person(-7, "NORMAL");
        assertEquals(-1, p.account(p));
    }

    @Test
    void testcase2() {
        Person p = new Person(6, "NORMAL");
        assertEquals(2000000, p.account(p));
    }

    @Test
    void testcase3() {
        Person p = new Person(8, "VIP");
        assertEquals(4000000, p.account(p));
    }

    @Test
    void testcase4() {
        Person p = new Person(25, "VIP");
        assertEquals(5000000, p.account(p));
    }

    @Test
    void testcase5() {
        Person p = new Person(28, "NORMAL");
        assertEquals(3200000, p.account(p));
    }
}