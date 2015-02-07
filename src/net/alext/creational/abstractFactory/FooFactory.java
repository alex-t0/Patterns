package net.alext.creational.abstractFactory;

import net.alext.stuff.Foo;
import net.alext.stuff.IFoo;

public class FooFactory implements IAbstractFactory {
    @Override
    public IFoo CreateFoo() {
        return new Foo();
    }
}
