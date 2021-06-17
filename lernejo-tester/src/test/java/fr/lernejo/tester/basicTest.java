package fr.lernejo.tester;

import fr.lernejo.tester.api.TestMethod;

public class basicTest {

    @TestMethod
    public void ok() {

    }

    @TestMethod
    public void ko() {
        throw new IllegalStateException("nope ");
    }

    public void none() {

    }
}
