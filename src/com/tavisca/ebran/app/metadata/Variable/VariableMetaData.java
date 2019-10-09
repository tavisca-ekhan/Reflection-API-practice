package com.tavisca.ebran.app.metadata.Variable;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

public class VariableMetaData {
    public static void printMetaData() throws IllegalAccessException {
        VariableClass variableClass = new VariableClass();
        Class variableObjVar = variableClass.getClass();

        Field[] fieldsVar = variableObjVar.getDeclaredFields();

        System.out.println
                ("================================\nPrinting Meta Data of Variable\n===========================");

        for (Field field : fieldsVar) {
            System.out.println("Variable name: " + field.getName());
            System.out.println("Datatypes of the variable: " + field.getType());

            int modifiers = field.getModifiers();
            System.out.println("Access modifiers of the Variable are: " + Modifier.toString(modifiers));

            System.out.println("Value of the variable is: " + field.get(field) + "\n");
            System.out.println("****************************************************");
        }

        System.out.println("=======================================================");
    }
}
