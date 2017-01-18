package argelbargel.dummy.base;

import argelbargel.dummy.common.DummyPart;

import java.util.ArrayList;
import java.util.Collection;

public class DummyBase {
    private final Collection<DummyPart> parts;

    public DummyBase(String... names) {
        parts = new ArrayList<>(names.length);
        for (String name : names) {
            parts.add(new DummyPart(name));
        }
    }

    public Collection<DummyPart> getParts() {
        return parts;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("dummy containing parts ");
        parts.forEach(p -> sb.append(p).append(" "));
        return sb.toString();
    }
}
