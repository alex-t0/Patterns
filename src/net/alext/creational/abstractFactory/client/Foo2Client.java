package net.alext.creational.abstractFactory.client;

import net.alext.creational.abstractFactory.Foo2Factory;
import net.alext.creational.abstractFactory.IAbstractFactory;
import net.alext.stuff.Client;

public class Foo2Client implements Client {
    private IAbstractFactory _factory = new Foo2Factory();

    @Override
    public void Action() {
        _factory.CreateFoo().ReturnInteger();
    }
}
