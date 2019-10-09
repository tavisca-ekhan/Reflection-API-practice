package com.tavisca.ebran.app.metadata.Method;

import java.sql.SQLException;

public class MethodClass {

    public void methodAdd() throws ClassNotFoundException, ClassCastException {
        System.out.println("Demo method for Reflection API");
    }

    public String methodSearch(String searchString) throws ArithmeticException, InterruptedException {
        System.out.println("Demo method for Reflection API");
        return null;
    }

    public void methodDelete(String deleteString) throws SQLException {
        System.out.println("Demo method for Reflection API");
    }
}
