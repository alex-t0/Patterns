package net.alext.creational.abstractFactory;

import net.alext.stuff.Foo2;
import net.alext.stuff.IFoo;

public class Foo2Factory implements IAbstractFactory {
    @Override
    public IFoo CreateFoo() {
        return new Foo2();
    }
}
