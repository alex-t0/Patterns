package net.alext.stuff;

import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;

public class Foo2 implements IFoo {

    @Override
    public Integer ReturnInteger() {
        try {
            return SecureRandom.getInstanceStrong().ints(1).sum();
        } catch (NoSuchAlgorithmException e) {
            return 0;
        }
    }
}
