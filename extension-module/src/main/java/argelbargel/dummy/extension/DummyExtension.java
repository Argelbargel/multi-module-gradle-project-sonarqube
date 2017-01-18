package argelbargel.dummy.extension;

import argelbargel.dummy.base.DummyBase;

public class DummyExtension extends DummyBase {
    public DummyExtension(String... names) {
        super(names);
    }

    @Override
    public String toString() {
        return "extension of " + super.toString();
    }
}
