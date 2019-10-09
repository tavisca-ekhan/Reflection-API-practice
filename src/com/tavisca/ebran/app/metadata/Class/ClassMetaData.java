package com.tavisca.ebran.app.metadata.Class;

import java.lang.reflect.Modifier;

public class ClassMetaData {
    public static void printMetaData() {
        Class baseClass = BaseClass.class;

        System.out.println
                ("================================\nPrinting Meta Data of BaseClass\n===========================");

        System.out.println("Name of the class is: " + baseClass.getName());

        System.out.println("Name of the super class is: " + baseClass.getSuperclass().getName());

        Class[] baseClassInterfaceList = baseClass.getInterfaces();

        for (Class interfaces : baseClassInterfaceList) System.out.print(interfaces.getName() + "   ");
        System.out.println();

        int baseClassModifier = baseClass.getModifiers();
        System.out.println("Access Modifers of base class are: " + Modifier.toString(baseClassModifier));

        System.out.println("=======================================================");
    }
}
