package net.alext.creational.abstractFactory.client;

import net.alext.creational.abstractFactory.FooFactory;
import net.alext.creational.abstractFactory.IAbstractFactory;
import net.alext.stuff.Client;

public class FooClient implements Client {
    private IAbstractFactory _factory = new FooFactory();

    @Override
    public void Action() {

    }
}
