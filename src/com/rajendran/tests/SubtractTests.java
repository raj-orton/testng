package com.rajendran.tests;

import com.rajendran.sources.Subtract;
import org.testng.Assert;
import org.testng.annotations.Test;

@Test(groups = "integration")
public class SubtractTests {

    @Test
    public void testSubOne() throws InterruptedException {
        System.out.println("Enter sub one");
        Assert.assertEquals(Subtract.subOne(0), -1);
        System.out.println("Exit sub one");
        Thread.sleep(5000);
    }

    @Test
    public void testSubTwo() throws InterruptedException {
        System.out.println("Enter sub two");
        Assert.assertEquals(Subtract.subTwo(0), -2);
        System.out.println("Exit sub two");
        Thread.sleep(5000);
    }

}
