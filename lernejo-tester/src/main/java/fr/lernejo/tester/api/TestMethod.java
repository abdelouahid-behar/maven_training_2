package fr.lernejo.tester.api;

import java.lang.annotation.Retention;
import java.lang.annotation.ElementType;
import java.lang.annotation.Target;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME) // (1)
@Target(ElementType.METHOD) // (2)
public @interface TestMethod {
}
