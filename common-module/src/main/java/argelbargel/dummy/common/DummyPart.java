package argelbargel.dummy.common;

import java.util.Objects;

public class DummyPart {
    private final String name;

    public DummyPart(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        DummyPart part = (DummyPart) o;
        return Objects.equals(name, part.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }
}
