package com.tavisca.ebran.app;

import com.tavisca.ebran.app.metadata.Class.ClassMetaData;
import com.tavisca.ebran.app.metadata.Constructor.ConstructorMetaData;
import com.tavisca.ebran.app.metadata.Method.MethodMetaData;
import com.tavisca.ebran.app.metadata.Variable.VariableMetaData;

public class App {
    public static void main(String[] args) throws IllegalAccessException {

        // Printing Meta data of Class
        ClassMetaData.printMetaData();

        // Printing Meta data of Variable
        VariableMetaData.printMetaData();

        // Printing Meta data of Method
        MethodMetaData.printMetaData();

        // Printing Meta data of Constructor
        ConstructorMetaData.printMetaData();
    }
}
