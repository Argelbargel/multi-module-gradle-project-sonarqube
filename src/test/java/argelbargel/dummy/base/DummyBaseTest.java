package argelbargel.dummy.base;

import argelbargel.dummy.common.DummyPart;
import org.junit.Test;

import static java.util.Arrays.asList;
import static org.junit.Assert.*;

public class DummyBaseTest {
    @Test
    public void testGetParts() {
        DummyBase subject = new DummyBase("a", "b", "c");
        assertEquals(subject.getParts(), asList(new DummyPart("a"), new DummyPart("b"), new DummyPart("c")));
    }


    @Test
    public void testToString() {
        DummyBase subject = new DummyBase("a", "b", "c");
        assertEquals("dummy containing parts a b c ", subject.toString());
    }
}