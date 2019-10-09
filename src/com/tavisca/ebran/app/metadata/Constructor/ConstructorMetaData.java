package com.tavisca.ebran.app.metadata.Constructor;

import java.lang.reflect.Constructor;
import java.lang.reflect.Modifier;

public class ConstructorMetaData {
    public static void printMetaData() {
        Class constructorObj = ConstructorClass.class;

        System.out.println
                ("================================\nPrinting Meta Data of Constructor\n===========================");

        Constructor[] constructors = constructorObj.getConstructors();
        for (Constructor constructor : constructors) {
            System.out.println("Constrictor name: " + constructor.getName());

            int modifiers = constructor.getModifiers();
            System.out.println("Constructor modifiers: " + Modifier.toString(modifiers));

            Class[] paramList = constructor.getParameterTypes();
            System.out.print("Constructor parameters are: ");
            for (Class param : paramList) System.out.print(param.getName() + " ");
            System.out.println();

            Class[] exceptionList = constructor.getExceptionTypes();
            System.out.print("Exceptions are: ");
            for (Class exception : exceptionList) System.out.print(exception.getName() + " ");
            System.out.println();

            System.out.println("***************************************");
        }

        System.out.println("=======================================================");
    }
}
