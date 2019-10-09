package com.tavisca.ebran.app.metadata.Method;

import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

public class MethodMetaData {
    public static void printMetaData() {
        MethodClass methodClass = new MethodClass();
        Class methodClassObj = methodClass.getClass();

        System.out.println
                ("================================\nPrinting Meta Data of Method\n===========================");

        Method[] methods = methodClassObj.getDeclaredMethods();
        for (Method method : methods) {
            System.out.println("Name of the method: " + method.getName());

            System.out.println("Return type of methods: " + method.getReturnType());

            int modifiers = methodClassObj.getModifiers();
            System.out.println("Method access modifiers are: " + Modifier.toString(modifiers));

            Class[] methodParamList = method.getParameterTypes();
            System.out.print("Method parameter types are: ");
            for (Class param : methodParamList) System.out.print(param.getName() + " ");
            System.out.println();

            Class[] methodExceptionList = method.getExceptionTypes();
            System.out.print("Method exceptions are: ");
            for (Class exception : methodExceptionList) System.out.print(exception.getName() + " ");
            System.out.println();

            System.out.println("************************************************");
        }

        System.out.println("=======================================================");
    }
}
