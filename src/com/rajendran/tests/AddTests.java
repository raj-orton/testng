package com.rajendran.tests;

import com.rajendran.sources.Add;

import org.testng.Assert;
import org.testng.annotations.Test;

@Test(groups = "integration")
public class AddTests {

    @Test
    public void testAddOne() throws InterruptedException {
        System.out.println("Enter add one");
        Assert.assertEquals(Add.plusOne(0), 1);
        System.out.println("Exit add one");
        Thread.sleep(5000);
    }

    @Test
    public void testAddTwo() throws InterruptedException {
        System.out.println("Enter add two");
        Assert.assertEquals(Add.plusTwo(0), 2);
        System.out.println("Exit add two");
        Thread.sleep(5000);
    }

}
