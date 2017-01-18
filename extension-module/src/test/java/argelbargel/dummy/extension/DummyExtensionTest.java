package argelbargel.dummy.extension;

import argelbargel.dummy.common.DummyPart;
import org.junit.Test;

import static java.util.Arrays.asList;
import static org.junit.Assert.*;

public class DummyExtensionTest {
    @Test
    public void testToString() {
        DummyExtension subject = new DummyExtension("a", "b", "c");
        assertEquals("extension of dummy containing parts a b c ", subject.toString());
    }

}