package org.demoqa;


import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class FnctionalTest {

    @BeforeTest
    public void beforTest(){
        System.out.println("This is before test");
    }
    @Test
    public void testqa(){
        System.out.println("this is test");
    }

    @Test
    public void newTest(){
        System.out.println("this is second test");
    }


    @AfterTest
    public void aftertest(){
        System.out.println("This is after test");
    }
}
