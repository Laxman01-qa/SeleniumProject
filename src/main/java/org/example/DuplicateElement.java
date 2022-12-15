package org.example;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class DuplicateElement {
    @BeforeMethod
    public void testMethod(){
        System.out.println("Before Method");
    }
    @BeforeClass
    @Test
    public void testClass(){
        System.out.println("Before Class");
    }
    @AfterMethod
    public void tearDown(){
        System.out.println("After Method");
    }
}