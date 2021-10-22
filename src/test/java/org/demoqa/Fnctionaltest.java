package org.demoqa;


import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Fnctionaltest {

    @BeforeTest
    public void beforTest(){
        System.out.println("This is before test");
    }
    @Test
    public void testqa(){
        System.out.println("this is test");
    }

    @AfterTest
    public void aftertest(){
        System.out.println("This is after test");
    }
}
