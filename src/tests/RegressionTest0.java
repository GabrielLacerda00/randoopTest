package tests;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest0 {

    public static boolean debug = false;

    @Test
    public void test01() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test01");
        p1.Calculator calculator0 = new p1.Calculator();
        java.lang.Class<?> wildcardClass1 = calculator0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test02() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test02");
        p1.Calculator calculator0 = new p1.Calculator();
        p1.MyObj myObj1 = null;
        p1.MyObj myObj2 = calculator0.testComplex(myObj1);
        int int5 = calculator0.multiply((int) '#', (int) (short) 1);
        p1.MyObj myObj6 = null;
        p1.MyObj myObj7 = calculator0.testComplex(myObj6);
        // The following exception was thrown during execution in test generation
        try {
            float float10 = calculator0.division((int) '4', 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: / by zero");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(myObj2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 35 + "'", int5 == 35);
        org.junit.Assert.assertNull(myObj7);
    }

    @Test
    public void test03() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test03");
        p1.Calculator calculator0 = new p1.Calculator();
        p1.MyObj myObj1 = null;
        p1.MyObj myObj2 = calculator0.testComplex(myObj1);
        int int5 = calculator0.multiply((int) '#', (int) (byte) 10);
        float float8 = calculator0.division(35, (int) (byte) -1);
        float float11 = calculator0.division((int) 'a', (int) (short) 100);
        int int14 = calculator0.subtract(35, 35);
        org.junit.Assert.assertNull(myObj2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 350 + "'", int5 == 350);
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + (-35.0f) + "'", float8 == (-35.0f));
        org.junit.Assert.assertTrue("'" + float11 + "' != '" + 0.0f + "'", float11 == 0.0f);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test04() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test04");
        p1.Calculator calculator0 = new p1.Calculator();
        p1.MyObj myObj1 = null;
        p1.MyObj myObj2 = calculator0.testComplex(myObj1);
        int int5 = calculator0.multiply((int) '#', (int) (short) 1);
        p1.MyObj myObj6 = null;
        p1.MyObj myObj7 = calculator0.testComplex(myObj6);
        int int10 = calculator0.multiply(100, 100);
        java.lang.Class<?> wildcardClass11 = calculator0.getClass();
        org.junit.Assert.assertNull(myObj2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 35 + "'", int5 == 35);
        org.junit.Assert.assertNull(myObj7);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10000 + "'", int10 == 10000);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test05() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test05");
        p1.Calculator calculator0 = new p1.Calculator();
        p1.MyObj myObj1 = null;
        p1.MyObj myObj2 = calculator0.testComplex(myObj1);
        int int5 = calculator0.multiply((int) '#', (int) (byte) 10);
        float float8 = calculator0.division(35, (int) (byte) -1);
        int int11 = calculator0.multiply((int) ' ', (int) (byte) 10);
        p1.MyObj myObj12 = null;
        p1.MyObj myObj13 = calculator0.testComplex(myObj12);
        float float16 = calculator0.division(10000, 10000);
        org.junit.Assert.assertNull(myObj2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 350 + "'", int5 == 350);
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + (-35.0f) + "'", float8 == (-35.0f));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 320 + "'", int11 == 320);
        org.junit.Assert.assertNull(myObj13);
        org.junit.Assert.assertTrue("'" + float16 + "' != '" + 1.0f + "'", float16 == 1.0f);
    }

    @Test
    public void test06() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test06");
        p1.Calculator calculator0 = new p1.Calculator();
        int int3 = calculator0.subtract((int) (byte) 10, (int) (short) 1);
        float float6 = calculator0.division(52, 10);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 9 + "'", int3 == 9);
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 5.0f + "'", float6 == 5.0f);
    }

    @Test
    public void test07() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test07");
        p1.Calculator calculator0 = new p1.Calculator();
        p1.MyObj myObj1 = null;
        p1.MyObj myObj2 = calculator0.testComplex(myObj1);
        int int5 = calculator0.multiply((int) '#', (int) (byte) 10);
        float float8 = calculator0.division(35, (int) (byte) -1);
        int int11 = calculator0.multiply((int) ' ', (int) (byte) 10);
        p1.MyObj myObj12 = null;
        p1.MyObj myObj13 = calculator0.testComplex(myObj12);
        float float16 = calculator0.division((int) (short) 1, 100);
        int int19 = calculator0.multiply((int) (short) 100, (int) (short) -1);
        org.junit.Assert.assertNull(myObj2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 350 + "'", int5 == 350);
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + (-35.0f) + "'", float8 == (-35.0f));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 320 + "'", int11 == 320);
        org.junit.Assert.assertNull(myObj13);
        org.junit.Assert.assertTrue("'" + float16 + "' != '" + 0.0f + "'", float16 == 0.0f);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-100) + "'", int19 == (-100));
    }

    @Test
    public void test08() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test08");
        p1.Calculator calculator0 = new p1.Calculator();
        p1.MyObj myObj1 = null;
        p1.MyObj myObj2 = calculator0.testComplex(myObj1);
        int int5 = calculator0.multiply((int) '#', (int) (short) 1);
        p1.MyObj myObj6 = null;
        p1.MyObj myObj7 = calculator0.testComplex(myObj6);
        p1.MyObj myObj8 = null;
        p1.MyObj myObj9 = calculator0.testComplex(myObj8);
        p1.MyObj myObj10 = null;
        p1.MyObj myObj11 = calculator0.testComplex(myObj10);
        org.junit.Assert.assertNull(myObj2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 35 + "'", int5 == 35);
        org.junit.Assert.assertNull(myObj7);
        org.junit.Assert.assertNull(myObj9);
        org.junit.Assert.assertNull(myObj11);
    }

    @Test
    public void test09() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test09");
        p1.Calculator calculator0 = new p1.Calculator();
        p1.MyObj myObj1 = null;
        p1.MyObj myObj2 = calculator0.testComplex(myObj1);
        int int5 = calculator0.subtract((int) (short) 10, (int) (byte) 10);
        java.lang.Class<?> wildcardClass6 = calculator0.getClass();
        org.junit.Assert.assertNull(myObj2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test10() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test10");
        p1.Calculator calculator0 = new p1.Calculator();
        p1.MyObj myObj1 = null;
        p1.MyObj myObj2 = calculator0.testComplex(myObj1);
        int int5 = calculator0.multiply((int) '#', (int) (short) 1);
        java.lang.Class<?> wildcardClass6 = calculator0.getClass();
        org.junit.Assert.assertNull(myObj2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 35 + "'", int5 == 35);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test11() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test11");
        p1.Calculator calculator0 = new p1.Calculator();
        p1.MyObj myObj1 = null;
        p1.MyObj myObj2 = calculator0.testComplex(myObj1);
        int int5 = calculator0.multiply((int) '#', (int) (byte) 10);
        float float8 = calculator0.division(35, (int) (byte) -1);
        int int11 = calculator0.multiply((int) ' ', (int) (byte) 10);
        p1.MyObj myObj12 = null;
        p1.MyObj myObj13 = calculator0.testComplex(myObj12);
        float float16 = calculator0.division((int) (short) 1, 100);
        java.lang.Class<?> wildcardClass17 = calculator0.getClass();
        org.junit.Assert.assertNull(myObj2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 350 + "'", int5 == 350);
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + (-35.0f) + "'", float8 == (-35.0f));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 320 + "'", int11 == 320);
        org.junit.Assert.assertNull(myObj13);
        org.junit.Assert.assertTrue("'" + float16 + "' != '" + 0.0f + "'", float16 == 0.0f);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test12() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test12");
        p1.Calculator calculator0 = new p1.Calculator();
        int int3 = calculator0.subtract((int) (byte) 10, (int) (short) 1);
        int int6 = calculator0.subtract((int) (short) -1, (int) (short) 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 9 + "'", int3 == 9);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
    }

    @Test
    public void test13() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test13");
        p1.Calculator calculator0 = new p1.Calculator();
        p1.MyObj myObj1 = null;
        p1.MyObj myObj2 = calculator0.testComplex(myObj1);
        int int5 = calculator0.multiply((int) '#', (int) (byte) 10);
        float float8 = calculator0.division(35, (int) (byte) -1);
        float float11 = calculator0.division((int) 'a', (int) (short) 100);
        int int14 = calculator0.subtract((int) (byte) 1, 0);
        float float17 = calculator0.division((int) (short) 100, (int) '#');
        org.junit.Assert.assertNull(myObj2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 350 + "'", int5 == 350);
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + (-35.0f) + "'", float8 == (-35.0f));
        org.junit.Assert.assertTrue("'" + float11 + "' != '" + 0.0f + "'", float11 == 0.0f);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + float17 + "' != '" + 2.0f + "'", float17 == 2.0f);
    }

    @Test
    public void test14() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test14");
        p1.Calculator calculator0 = new p1.Calculator();
        p1.MyObj myObj1 = null;
        p1.MyObj myObj2 = calculator0.testComplex(myObj1);
        int int5 = calculator0.multiply((int) '#', (int) (byte) 10);
        float float8 = calculator0.division(35, (int) (byte) -1);
        int int11 = calculator0.multiply((int) ' ', (int) (byte) 10);
        // The following exception was thrown during execution in test generation
        try {
            float float14 = calculator0.division((int) (byte) -1, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: / by zero");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(myObj2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 350 + "'", int5 == 350);
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + (-35.0f) + "'", float8 == (-35.0f));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 320 + "'", int11 == 320);
    }

    @Test
    public void test15() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test15");
        p1.Calculator calculator0 = new p1.Calculator();
        p1.MyObj myObj1 = null;
        p1.MyObj myObj2 = calculator0.testComplex(myObj1);
        int int5 = calculator0.subtract((int) (short) 10, (int) (byte) 10);
        int int8 = calculator0.subtract((int) '4', (int) (byte) 0);
        int int11 = calculator0.multiply(10, (int) '4');
        int int14 = calculator0.subtract((int) (short) -1, 10);
        int int17 = calculator0.multiply((int) (byte) 100, (-1));
        org.junit.Assert.assertNull(myObj2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 52 + "'", int8 == 52);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 520 + "'", int11 == 520);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-11) + "'", int14 == (-11));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-100) + "'", int17 == (-100));
    }

    @Test
    public void test16() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test16");
        p1.Calculator calculator0 = new p1.Calculator();
        p1.MyObj myObj1 = null;
        p1.MyObj myObj2 = calculator0.testComplex(myObj1);
        int int5 = calculator0.subtract((int) (short) 10, (int) (byte) 10);
        int int8 = calculator0.subtract((int) '4', (int) (byte) 0);
        int int11 = calculator0.multiply(10, (int) '4');
        float float14 = calculator0.division(0, 100);
        int int17 = calculator0.subtract((-1), (int) (short) 100);
        org.junit.Assert.assertNull(myObj2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 52 + "'", int8 == 52);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 520 + "'", int11 == 520);
        org.junit.Assert.assertTrue("'" + float14 + "' != '" + 0.0f + "'", float14 == 0.0f);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-101) + "'", int17 == (-101));
    }

    @Test
    public void test17() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test17");
        p1.Calculator calculator0 = new p1.Calculator();
        p1.MyObj myObj1 = null;
        p1.MyObj myObj2 = calculator0.testComplex(myObj1);
        int int5 = calculator0.multiply((int) '#', (int) (byte) 10);
        float float8 = calculator0.division(35, (int) (byte) -1);
        int int11 = calculator0.multiply((int) ' ', (int) (byte) 10);
        int int14 = calculator0.multiply(9, (int) (byte) 10);
        int int17 = calculator0.subtract(100, (int) (short) 100);
        org.junit.Assert.assertNull(myObj2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 350 + "'", int5 == 350);
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + (-35.0f) + "'", float8 == (-35.0f));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 320 + "'", int11 == 320);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 90 + "'", int14 == 90);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
    }

    @Test
    public void test18() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test18");
        p1.Calculator calculator0 = new p1.Calculator();
        p1.MyObj myObj1 = null;
        p1.MyObj myObj2 = calculator0.testComplex(myObj1);
        int int5 = calculator0.multiply((int) '#', (int) (byte) 10);
        float float8 = calculator0.division(35, (int) (byte) -1);
        int int11 = calculator0.multiply((int) ' ', (int) (byte) 10);
        p1.MyObj myObj12 = null;
        p1.MyObj myObj13 = calculator0.testComplex(myObj12);
        float float16 = calculator0.division((int) (short) 1, 100);
        int int19 = calculator0.multiply(350, (int) (byte) 100);
        java.lang.Class<?> wildcardClass20 = calculator0.getClass();
        org.junit.Assert.assertNull(myObj2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 350 + "'", int5 == 350);
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + (-35.0f) + "'", float8 == (-35.0f));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 320 + "'", int11 == 320);
        org.junit.Assert.assertNull(myObj13);
        org.junit.Assert.assertTrue("'" + float16 + "' != '" + 0.0f + "'", float16 == 0.0f);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 35000 + "'", int19 == 35000);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test19() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test19");
        p1.Calculator calculator0 = new p1.Calculator();
        p1.MyObj myObj1 = null;
        p1.MyObj myObj2 = calculator0.testComplex(myObj1);
        int int5 = calculator0.subtract((int) (short) 10, (int) (byte) 10);
        int int8 = calculator0.subtract((int) '4', (int) (byte) 0);
        int int11 = calculator0.multiply(10, (int) '4');
        int int14 = calculator0.subtract((int) (short) -1, 10);
        int int17 = calculator0.multiply((-101), 10000);
        org.junit.Assert.assertNull(myObj2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 52 + "'", int8 == 52);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 520 + "'", int11 == 520);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-11) + "'", int14 == (-11));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1010000) + "'", int17 == (-1010000));
    }

    @Test
    public void test20() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test20");
        p1.Calculator calculator0 = new p1.Calculator();
        p1.MyObj myObj1 = null;
        p1.MyObj myObj2 = calculator0.testComplex(myObj1);
        int int5 = calculator0.multiply((int) '#', (int) (byte) 10);
        float float8 = calculator0.division(35, (int) (byte) -1);
        int int11 = calculator0.multiply((int) ' ', (int) (byte) 10);
        float float14 = calculator0.division((int) '4', (-101));
        org.junit.Assert.assertNull(myObj2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 350 + "'", int5 == 350);
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + (-35.0f) + "'", float8 == (-35.0f));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 320 + "'", int11 == 320);
        org.junit.Assert.assertTrue("'" + float14 + "' != '" + 0.0f + "'", float14 == 0.0f);
    }

    @Test
    public void test21() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test21");
        p1.Calculator calculator0 = new p1.Calculator();
        p1.MyObj myObj1 = null;
        p1.MyObj myObj2 = calculator0.testComplex(myObj1);
        // The following exception was thrown during execution in test generation
        try {
            float float5 = calculator0.division((int) (byte) -1, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: / by zero");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(myObj2);
    }

    @Test
    public void test22() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test22");
        p1.Calculator calculator0 = new p1.Calculator();
        p1.MyObj myObj1 = null;
        p1.MyObj myObj2 = calculator0.testComplex(myObj1);
        int int5 = calculator0.multiply((int) '#', (int) (byte) 10);
        float float8 = calculator0.division(35, (int) (byte) -1);
        p1.MyObj myObj9 = null;
        p1.MyObj myObj10 = calculator0.testComplex(myObj9);
        int int13 = calculator0.multiply((-101), 90);
        int int16 = calculator0.subtract((-1010000), (int) '4');
        int int19 = calculator0.subtract((int) (short) 1, (int) (short) 0);
        org.junit.Assert.assertNull(myObj2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 350 + "'", int5 == 350);
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + (-35.0f) + "'", float8 == (-35.0f));
        org.junit.Assert.assertNull(myObj10);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-9090) + "'", int13 == (-9090));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1010052) + "'", int16 == (-1010052));
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
    }

    @Test
    public void test23() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test23");
        p1.Calculator calculator0 = new p1.Calculator();
        p1.MyObj myObj1 = null;
        p1.MyObj myObj2 = calculator0.testComplex(myObj1);
        int int5 = calculator0.multiply((int) '#', (int) (short) 1);
        p1.MyObj myObj6 = null;
        p1.MyObj myObj7 = calculator0.testComplex(myObj6);
        p1.MyObj myObj8 = null;
        p1.MyObj myObj9 = calculator0.testComplex(myObj8);
        int int12 = calculator0.subtract((int) (byte) 1, (int) (short) 10);
        org.junit.Assert.assertNull(myObj2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 35 + "'", int5 == 35);
        org.junit.Assert.assertNull(myObj7);
        org.junit.Assert.assertNull(myObj9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-9) + "'", int12 == (-9));
    }

    @Test
    public void test24() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test24");
        p1.Calculator calculator0 = new p1.Calculator();
        p1.MyObj myObj1 = null;
        p1.MyObj myObj2 = calculator0.testComplex(myObj1);
        int int5 = calculator0.multiply((int) '#', (int) (short) 1);
        p1.MyObj myObj6 = null;
        p1.MyObj myObj7 = calculator0.testComplex(myObj6);
        p1.MyObj myObj8 = null;
        p1.MyObj myObj9 = calculator0.testComplex(myObj8);
        float float12 = calculator0.division((int) '#', (int) (byte) 10);
        java.lang.Class<?> wildcardClass13 = calculator0.getClass();
        org.junit.Assert.assertNull(myObj2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 35 + "'", int5 == 35);
        org.junit.Assert.assertNull(myObj7);
        org.junit.Assert.assertNull(myObj9);
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + 3.0f + "'", float12 == 3.0f);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test25() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test25");
        p1.Calculator calculator0 = new p1.Calculator();
        p1.MyObj myObj1 = null;
        p1.MyObj myObj2 = calculator0.testComplex(myObj1);
        int int5 = calculator0.subtract((int) (short) 10, (int) (byte) 10);
        int int8 = calculator0.subtract((int) '4', (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            float float11 = calculator0.division((int) (short) 0, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: / by zero");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(myObj2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 52 + "'", int8 == 52);
    }

    @Test
    public void test26() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test26");
        p1.Calculator calculator0 = new p1.Calculator();
        p1.MyObj myObj1 = null;
        p1.MyObj myObj2 = calculator0.testComplex(myObj1);
        int int5 = calculator0.subtract((int) (short) 10, (int) (byte) 10);
        int int8 = calculator0.multiply((-1010000), (int) (short) 10);
        org.junit.Assert.assertNull(myObj2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-10100000) + "'", int8 == (-10100000));
    }

    @Test
    public void test27() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test27");
        p1.Calculator calculator0 = new p1.Calculator();
        int int3 = calculator0.subtract((int) (byte) 10, (int) (short) 1);
        float float6 = calculator0.division((int) (short) 1, (-9090));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 9 + "'", int3 == 9);
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 0.0f + "'", float6 == 0.0f);
    }

    @Test
    public void test28() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test28");
        p1.Calculator calculator0 = new p1.Calculator();
        p1.MyObj myObj1 = null;
        p1.MyObj myObj2 = calculator0.testComplex(myObj1);
        int int5 = calculator0.multiply((int) '#', (int) (short) 1);
        float float8 = calculator0.division((int) (byte) 10, 100);
        p1.MyObj myObj9 = null;
        p1.MyObj myObj10 = calculator0.testComplex(myObj9);
        java.lang.Class<?> wildcardClass11 = calculator0.getClass();
        org.junit.Assert.assertNull(myObj2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 35 + "'", int5 == 35);
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 0.0f + "'", float8 == 0.0f);
        org.junit.Assert.assertNull(myObj10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test29() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test29");
        p1.Calculator calculator0 = new p1.Calculator();
        p1.MyObj myObj1 = null;
        p1.MyObj myObj2 = calculator0.testComplex(myObj1);
        int int5 = calculator0.subtract((int) (short) 10, (int) (byte) 10);
        int int8 = calculator0.subtract((int) '4', (int) (byte) 0);
        int int11 = calculator0.multiply(10, (int) '4');
        int int14 = calculator0.subtract((int) (short) -1, 10);
        p1.MyObj myObj15 = null;
        p1.MyObj myObj16 = calculator0.testComplex(myObj15);
        org.junit.Assert.assertNull(myObj2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 52 + "'", int8 == 52);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 520 + "'", int11 == 520);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-11) + "'", int14 == (-11));
        org.junit.Assert.assertNull(myObj16);
    }

    @Test
    public void test30() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test30");
        p1.Calculator calculator0 = new p1.Calculator();
        p1.MyObj myObj1 = null;
        p1.MyObj myObj2 = calculator0.testComplex(myObj1);
        int int5 = calculator0.multiply((int) '#', (int) (byte) 10);
        float float8 = calculator0.division(35, (int) (byte) -1);
        int int11 = calculator0.multiply((int) (short) 10, 0);
        java.lang.Class<?> wildcardClass12 = calculator0.getClass();
        org.junit.Assert.assertNull(myObj2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 350 + "'", int5 == 350);
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + (-35.0f) + "'", float8 == (-35.0f));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test31() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test31");
        p1.Calculator calculator0 = new p1.Calculator();
        p1.MyObj myObj1 = null;
        p1.MyObj myObj2 = calculator0.testComplex(myObj1);
        int int5 = calculator0.multiply((int) '#', (int) (byte) 10);
        float float8 = calculator0.division(35, (int) (byte) -1);
        p1.MyObj myObj9 = null;
        p1.MyObj myObj10 = calculator0.testComplex(myObj9);
        int int13 = calculator0.multiply((-101), 90);
        int int16 = calculator0.multiply((int) (byte) 0, (int) '4');
        org.junit.Assert.assertNull(myObj2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 350 + "'", int5 == 350);
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + (-35.0f) + "'", float8 == (-35.0f));
        org.junit.Assert.assertNull(myObj10);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-9090) + "'", int13 == (-9090));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test32() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test32");
        p1.Calculator calculator0 = new p1.Calculator();
        p1.MyObj myObj1 = null;
        p1.MyObj myObj2 = calculator0.testComplex(myObj1);
        int int5 = calculator0.multiply((int) '#', (int) (short) 1);
        p1.MyObj myObj6 = null;
        p1.MyObj myObj7 = calculator0.testComplex(myObj6);
        p1.MyObj myObj8 = null;
        p1.MyObj myObj9 = calculator0.testComplex(myObj8);
        int int12 = calculator0.multiply((int) (short) 100, 90);
        org.junit.Assert.assertNull(myObj2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 35 + "'", int5 == 35);
        org.junit.Assert.assertNull(myObj7);
        org.junit.Assert.assertNull(myObj9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 9000 + "'", int12 == 9000);
    }

    @Test
    public void test33() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test33");
        p1.Calculator calculator0 = new p1.Calculator();
        p1.MyObj myObj1 = null;
        p1.MyObj myObj2 = calculator0.testComplex(myObj1);
        int int5 = calculator0.multiply((int) '#', (int) (byte) 10);
        float float8 = calculator0.division(35, (int) (byte) -1);
        float float11 = calculator0.division((int) 'a', (int) (short) 100);
        int int14 = calculator0.subtract((int) (byte) 1, 0);
        java.lang.Class<?> wildcardClass15 = calculator0.getClass();
        org.junit.Assert.assertNull(myObj2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 350 + "'", int5 == 350);
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + (-35.0f) + "'", float8 == (-35.0f));
        org.junit.Assert.assertTrue("'" + float11 + "' != '" + 0.0f + "'", float11 == 0.0f);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test34() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test34");
        p1.Calculator calculator0 = new p1.Calculator();
        p1.MyObj myObj1 = null;
        p1.MyObj myObj2 = calculator0.testComplex(myObj1);
        int int5 = calculator0.multiply((int) '#', (int) (byte) 10);
        float float8 = calculator0.division(35, (int) (byte) -1);
        p1.MyObj myObj9 = null;
        p1.MyObj myObj10 = calculator0.testComplex(myObj9);
        int int13 = calculator0.multiply((-101), 90);
        int int16 = calculator0.subtract((-1010000), (int) '4');
        int int19 = calculator0.multiply(9, (int) (byte) 0);
        org.junit.Assert.assertNull(myObj2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 350 + "'", int5 == 350);
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + (-35.0f) + "'", float8 == (-35.0f));
        org.junit.Assert.assertNull(myObj10);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-9090) + "'", int13 == (-9090));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1010052) + "'", int16 == (-1010052));
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
    }

    @Test
    public void test35() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test35");
        p1.Calculator calculator0 = new p1.Calculator();
        p1.MyObj myObj1 = null;
        p1.MyObj myObj2 = calculator0.testComplex(myObj1);
        int int5 = calculator0.multiply((int) '#', (int) (short) 1);
        float float8 = calculator0.division((int) (short) 100, (int) '#');
        float float11 = calculator0.division(350, (int) ' ');
        int int14 = calculator0.multiply((int) (byte) 1, (int) (short) 1);
        org.junit.Assert.assertNull(myObj2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 35 + "'", int5 == 35);
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 2.0f + "'", float8 == 2.0f);
        org.junit.Assert.assertTrue("'" + float11 + "' != '" + 10.0f + "'", float11 == 10.0f);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
    }

    @Test
    public void test36() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test36");
        p1.Calculator calculator0 = new p1.Calculator();
        p1.MyObj myObj1 = null;
        p1.MyObj myObj2 = calculator0.testComplex(myObj1);
        int int5 = calculator0.multiply((int) '#', (int) (byte) 10);
        float float8 = calculator0.division(35, (int) (byte) -1);
        int int11 = calculator0.multiply((int) ' ', (int) (byte) 10);
        p1.MyObj myObj12 = null;
        p1.MyObj myObj13 = calculator0.testComplex(myObj12);
        int int16 = calculator0.subtract((int) (byte) 10, (-100));
        org.junit.Assert.assertNull(myObj2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 350 + "'", int5 == 350);
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + (-35.0f) + "'", float8 == (-35.0f));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 320 + "'", int11 == 320);
        org.junit.Assert.assertNull(myObj13);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 110 + "'", int16 == 110);
    }

    @Test
    public void test37() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test37");
        p1.Calculator calculator0 = new p1.Calculator();
        p1.MyObj myObj1 = null;
        p1.MyObj myObj2 = calculator0.testComplex(myObj1);
        int int5 = calculator0.multiply((int) '#', (int) (byte) 10);
        float float8 = calculator0.division(35, (int) (byte) -1);
        p1.MyObj myObj9 = null;
        p1.MyObj myObj10 = calculator0.testComplex(myObj9);
        int int13 = calculator0.multiply((-101), 90);
        java.lang.Class<?> wildcardClass14 = calculator0.getClass();
        org.junit.Assert.assertNull(myObj2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 350 + "'", int5 == 350);
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + (-35.0f) + "'", float8 == (-35.0f));
        org.junit.Assert.assertNull(myObj10);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-9090) + "'", int13 == (-9090));
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test38() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test38");
        p1.Calculator calculator0 = new p1.Calculator();
        p1.MyObj myObj1 = null;
        p1.MyObj myObj2 = calculator0.testComplex(myObj1);
        int int5 = calculator0.multiply((int) '#', (int) (short) 1);
        p1.MyObj myObj6 = null;
        p1.MyObj myObj7 = calculator0.testComplex(myObj6);
        int int10 = calculator0.multiply(100, 100);
        float float13 = calculator0.division((-9090), 1);
        int int16 = calculator0.multiply((int) (byte) 100, (int) (short) 1);
        float float19 = calculator0.division((int) '4', (-10100000));
        org.junit.Assert.assertNull(myObj2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 35 + "'", int5 == 35);
        org.junit.Assert.assertNull(myObj7);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10000 + "'", int10 == 10000);
        org.junit.Assert.assertTrue("'" + float13 + "' != '" + (-9090.0f) + "'", float13 == (-9090.0f));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 100 + "'", int16 == 100);
        org.junit.Assert.assertTrue("'" + float19 + "' != '" + 0.0f + "'", float19 == 0.0f);
    }

    @Test
    public void test39() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test39");
        p1.Calculator calculator0 = new p1.Calculator();
        int int3 = calculator0.subtract((int) (byte) 10, (int) (short) 1);
        int int6 = calculator0.subtract((int) ' ', 10000);
        int int9 = calculator0.multiply((-9), 320);
        java.lang.Class<?> wildcardClass10 = calculator0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 9 + "'", int3 == 9);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-9968) + "'", int6 == (-9968));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-2880) + "'", int9 == (-2880));
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test40() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test40");
        p1.Calculator calculator0 = new p1.Calculator();
        p1.MyObj myObj1 = null;
        p1.MyObj myObj2 = calculator0.testComplex(myObj1);
        int int5 = calculator0.multiply((int) '#', (int) (short) 1);
        float float8 = calculator0.division(9, 35);
        p1.MyObj myObj9 = null;
        p1.MyObj myObj10 = calculator0.testComplex(myObj9);
        org.junit.Assert.assertNull(myObj2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 35 + "'", int5 == 35);
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 0.0f + "'", float8 == 0.0f);
        org.junit.Assert.assertNull(myObj10);
    }

    @Test
    public void test41() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test41");
        p1.Calculator calculator0 = new p1.Calculator();
        p1.MyObj myObj1 = null;
        p1.MyObj myObj2 = calculator0.testComplex(myObj1);
        int int5 = calculator0.subtract((int) (short) 10, (int) (byte) 10);
        int int8 = calculator0.subtract((int) '4', (int) (byte) 0);
        int int11 = calculator0.subtract(0, 0);
        org.junit.Assert.assertNull(myObj2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 52 + "'", int8 == 52);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test42() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test42");
        p1.Calculator calculator0 = new p1.Calculator();
        int int3 = calculator0.subtract((int) (byte) 10, (int) (short) 1);
        int int6 = calculator0.subtract((int) ' ', 10000);
        p1.MyObj myObj7 = null;
        p1.MyObj myObj8 = calculator0.testComplex(myObj7);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 9 + "'", int3 == 9);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-9968) + "'", int6 == (-9968));
        org.junit.Assert.assertNull(myObj8);
    }

    @Test
    public void test43() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test43");
        p1.Calculator calculator0 = new p1.Calculator();
        p1.MyObj myObj1 = null;
        p1.MyObj myObj2 = calculator0.testComplex(myObj1);
        int int5 = calculator0.multiply((int) '#', (int) (byte) 10);
        float float8 = calculator0.division(35, (int) (byte) -1);
        p1.MyObj myObj9 = null;
        p1.MyObj myObj10 = calculator0.testComplex(myObj9);
        java.lang.Class<?> wildcardClass11 = calculator0.getClass();
        org.junit.Assert.assertNull(myObj2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 350 + "'", int5 == 350);
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + (-35.0f) + "'", float8 == (-35.0f));
        org.junit.Assert.assertNull(myObj10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test44() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test44");
        p1.Calculator calculator0 = new p1.Calculator();
        p1.MyObj myObj1 = null;
        p1.MyObj myObj2 = calculator0.testComplex(myObj1);
        int int5 = calculator0.subtract((int) (short) 10, (int) (byte) 10);
        int int8 = calculator0.subtract((int) '4', (int) (byte) 0);
        int int11 = calculator0.multiply(10, (int) '4');
        float float14 = calculator0.division(0, 100);
        float float17 = calculator0.division(320, (int) (byte) 10);
        org.junit.Assert.assertNull(myObj2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 52 + "'", int8 == 52);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 520 + "'", int11 == 520);
        org.junit.Assert.assertTrue("'" + float14 + "' != '" + 0.0f + "'", float14 == 0.0f);
        org.junit.Assert.assertTrue("'" + float17 + "' != '" + 32.0f + "'", float17 == 32.0f);
    }

    @Test
    public void test45() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test45");
        p1.Calculator calculator0 = new p1.Calculator();
        p1.MyObj myObj1 = null;
        p1.MyObj myObj2 = calculator0.testComplex(myObj1);
        int int5 = calculator0.subtract((int) (short) 10, (int) (byte) 10);
        int int8 = calculator0.subtract((int) '4', (int) (byte) 0);
        int int11 = calculator0.multiply(10, (int) '4');
        float float14 = calculator0.division(0, 100);
        p1.MyObj myObj15 = null;
        p1.MyObj myObj16 = calculator0.testComplex(myObj15);
        org.junit.Assert.assertNull(myObj2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 52 + "'", int8 == 52);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 520 + "'", int11 == 520);
        org.junit.Assert.assertTrue("'" + float14 + "' != '" + 0.0f + "'", float14 == 0.0f);
        org.junit.Assert.assertNull(myObj16);
    }

    @Test
    public void test46() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test46");
        p1.Calculator calculator0 = new p1.Calculator();
        p1.MyObj myObj1 = null;
        p1.MyObj myObj2 = calculator0.testComplex(myObj1);
        int int5 = calculator0.multiply((int) '#', (int) (short) 1);
        p1.MyObj myObj6 = null;
        p1.MyObj myObj7 = calculator0.testComplex(myObj6);
        p1.MyObj myObj8 = null;
        p1.MyObj myObj9 = calculator0.testComplex(myObj8);
        int int12 = calculator0.multiply((-1010000), 1);
        p1.MyObj myObj13 = null;
        p1.MyObj myObj14 = calculator0.testComplex(myObj13);
        org.junit.Assert.assertNull(myObj2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 35 + "'", int5 == 35);
        org.junit.Assert.assertNull(myObj7);
        org.junit.Assert.assertNull(myObj9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1010000) + "'", int12 == (-1010000));
        org.junit.Assert.assertNull(myObj14);
    }

    @Test
    public void test47() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test47");
        p1.Calculator calculator0 = new p1.Calculator();
        p1.MyObj myObj1 = null;
        p1.MyObj myObj2 = calculator0.testComplex(myObj1);
        int int5 = calculator0.multiply((int) '#', (int) (byte) 10);
        float float8 = calculator0.division(35, (int) (byte) -1);
        int int11 = calculator0.multiply((int) ' ', (int) (byte) 10);
        p1.MyObj myObj12 = null;
        p1.MyObj myObj13 = calculator0.testComplex(myObj12);
        java.lang.Class<?> wildcardClass14 = calculator0.getClass();
        org.junit.Assert.assertNull(myObj2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 350 + "'", int5 == 350);
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + (-35.0f) + "'", float8 == (-35.0f));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 320 + "'", int11 == 320);
        org.junit.Assert.assertNull(myObj13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test48() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test48");
        p1.Calculator calculator0 = new p1.Calculator();
        p1.MyObj myObj1 = null;
        p1.MyObj myObj2 = calculator0.testComplex(myObj1);
        int int5 = calculator0.multiply((int) '#', (int) (byte) 10);
        float float8 = calculator0.division(35, (int) (byte) -1);
        float float11 = calculator0.division((int) 'a', (int) (short) 100);
        int int14 = calculator0.multiply(90, (int) ' ');
        org.junit.Assert.assertNull(myObj2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 350 + "'", int5 == 350);
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + (-35.0f) + "'", float8 == (-35.0f));
        org.junit.Assert.assertTrue("'" + float11 + "' != '" + 0.0f + "'", float11 == 0.0f);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2880 + "'", int14 == 2880);
    }

    @Test
    public void test49() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test49");
        p1.Calculator calculator0 = new p1.Calculator();
        p1.MyObj myObj1 = null;
        p1.MyObj myObj2 = calculator0.testComplex(myObj1);
        int int5 = calculator0.multiply((int) '#', (int) (byte) 10);
        float float8 = calculator0.division(35, (int) (byte) -1);
        float float11 = calculator0.division((int) 'a', (int) (short) 100);
        int int14 = calculator0.subtract((int) (byte) 1, 0);
        int int17 = calculator0.subtract((int) (short) 100, (int) (short) 100);
        org.junit.Assert.assertNull(myObj2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 350 + "'", int5 == 350);
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + (-35.0f) + "'", float8 == (-35.0f));
        org.junit.Assert.assertTrue("'" + float11 + "' != '" + 0.0f + "'", float11 == 0.0f);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
    }

    @Test
    public void test50() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test50");
        p1.Calculator calculator0 = new p1.Calculator();
        p1.MyObj myObj1 = null;
        p1.MyObj myObj2 = calculator0.testComplex(myObj1);
        int int5 = calculator0.subtract((int) (short) 10, (int) (byte) 10);
        int int8 = calculator0.subtract((int) '4', (int) (byte) 0);
        int int11 = calculator0.multiply(10, (int) '4');
        p1.MyObj myObj12 = null;
        p1.MyObj myObj13 = calculator0.testComplex(myObj12);
        org.junit.Assert.assertNull(myObj2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 52 + "'", int8 == 52);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 520 + "'", int11 == 520);
        org.junit.Assert.assertNull(myObj13);
    }

    @Test
    public void test51() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test51");
        p1.Calculator calculator0 = new p1.Calculator();
        p1.MyObj myObj1 = null;
        p1.MyObj myObj2 = calculator0.testComplex(myObj1);
        int int5 = calculator0.multiply((int) '#', (int) (short) 1);
        p1.MyObj myObj6 = null;
        p1.MyObj myObj7 = calculator0.testComplex(myObj6);
        int int10 = calculator0.multiply(100, 100);
        float float13 = calculator0.division(35, (int) (byte) 10);
        java.lang.Class<?> wildcardClass14 = calculator0.getClass();
        org.junit.Assert.assertNull(myObj2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 35 + "'", int5 == 35);
        org.junit.Assert.assertNull(myObj7);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10000 + "'", int10 == 10000);
        org.junit.Assert.assertTrue("'" + float13 + "' != '" + 3.0f + "'", float13 == 3.0f);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test52() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test52");
        p1.Calculator calculator0 = new p1.Calculator();
        p1.MyObj myObj1 = null;
        p1.MyObj myObj2 = calculator0.testComplex(myObj1);
        int int5 = calculator0.multiply((int) '#', (int) (short) 1);
        float float8 = calculator0.division((int) (short) 100, (int) '#');
        p1.MyObj myObj9 = null;
        p1.MyObj myObj10 = calculator0.testComplex(myObj9);
        int int13 = calculator0.multiply((int) (short) 10, (int) 'a');
        org.junit.Assert.assertNull(myObj2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 35 + "'", int5 == 35);
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 2.0f + "'", float8 == 2.0f);
        org.junit.Assert.assertNull(myObj10);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 970 + "'", int13 == 970);
    }

    @Test
    public void test53() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test53");
        p1.Calculator calculator0 = new p1.Calculator();
        p1.MyObj myObj1 = null;
        p1.MyObj myObj2 = calculator0.testComplex(myObj1);
        int int5 = calculator0.multiply((int) '#', (int) (byte) 10);
        float float8 = calculator0.division(35, (int) (byte) -1);
        int int11 = calculator0.multiply((int) ' ', (int) (byte) 10);
        int int14 = calculator0.subtract(0, (-9090));
        org.junit.Assert.assertNull(myObj2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 350 + "'", int5 == 350);
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + (-35.0f) + "'", float8 == (-35.0f));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 320 + "'", int11 == 320);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 9090 + "'", int14 == 9090);
    }

    @Test
    public void test54() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test54");
        p1.Calculator calculator0 = new p1.Calculator();
        p1.MyObj myObj1 = null;
        p1.MyObj myObj2 = calculator0.testComplex(myObj1);
        int int5 = calculator0.multiply((int) '#', (int) (byte) 10);
        float float8 = calculator0.division(35, (int) (byte) -1);
        int int11 = calculator0.multiply((int) ' ', (int) (byte) 10);
        int int14 = calculator0.multiply(9, (int) (byte) 10);
        float float17 = calculator0.division((-1010052), (-2880));
        org.junit.Assert.assertNull(myObj2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 350 + "'", int5 == 350);
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + (-35.0f) + "'", float8 == (-35.0f));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 320 + "'", int11 == 320);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 90 + "'", int14 == 90);
        org.junit.Assert.assertTrue("'" + float17 + "' != '" + 350.0f + "'", float17 == 350.0f);
    }

    @Test
    public void test55() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test55");
        p1.Calculator calculator0 = new p1.Calculator();
        float float3 = calculator0.division((-9090), (-9968));
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 0.0f + "'", float3 == 0.0f);
    }

    @Test
    public void test56() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test56");
        p1.Calculator calculator0 = new p1.Calculator();
        p1.MyObj myObj1 = null;
        p1.MyObj myObj2 = calculator0.testComplex(myObj1);
        int int5 = calculator0.subtract((int) (short) 10, (int) (byte) 10);
        int int8 = calculator0.subtract((int) '4', (int) (byte) 0);
        int int11 = calculator0.multiply(10, (int) '4');
        java.lang.Class<?> wildcardClass12 = calculator0.getClass();
        org.junit.Assert.assertNull(myObj2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 52 + "'", int8 == 52);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 520 + "'", int11 == 520);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test57() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test57");
        p1.Calculator calculator0 = new p1.Calculator();
        p1.MyObj myObj1 = null;
        p1.MyObj myObj2 = calculator0.testComplex(myObj1);
        int int5 = calculator0.multiply((int) '#', (int) (byte) 10);
        float float8 = calculator0.division(35, (int) (byte) -1);
        p1.MyObj myObj9 = null;
        p1.MyObj myObj10 = calculator0.testComplex(myObj9);
        // The following exception was thrown during execution in test generation
        try {
            float float13 = calculator0.division(35000, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: / by zero");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(myObj2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 350 + "'", int5 == 350);
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + (-35.0f) + "'", float8 == (-35.0f));
        org.junit.Assert.assertNull(myObj10);
    }

    @Test
    public void test58() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test58");
        p1.Calculator calculator0 = new p1.Calculator();
        int int3 = calculator0.subtract((int) (byte) 10, (int) (short) 1);
        int int6 = calculator0.subtract((int) ' ', 10000);
        int int9 = calculator0.multiply((-9), 320);
        int int12 = calculator0.subtract((int) (short) 10, (-9090));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 9 + "'", int3 == 9);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-9968) + "'", int6 == (-9968));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-2880) + "'", int9 == (-2880));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 9100 + "'", int12 == 9100);
    }

    @Test
    public void test59() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test59");
        p1.Calculator calculator0 = new p1.Calculator();
        p1.MyObj myObj1 = null;
        p1.MyObj myObj2 = calculator0.testComplex(myObj1);
        int int5 = calculator0.multiply((int) '#', (int) (byte) 10);
        java.lang.Class<?> wildcardClass6 = calculator0.getClass();
        org.junit.Assert.assertNull(myObj2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 350 + "'", int5 == 350);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test60() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test60");
        p1.Calculator calculator0 = new p1.Calculator();
        p1.MyObj myObj1 = null;
        p1.MyObj myObj2 = calculator0.testComplex(myObj1);
        int int5 = calculator0.subtract((int) (short) 10, (int) (byte) 10);
        float float8 = calculator0.division((int) '#', (-9090));
        java.lang.Class<?> wildcardClass9 = calculator0.getClass();
        org.junit.Assert.assertNull(myObj2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 0.0f + "'", float8 == 0.0f);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test61() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test61");
        p1.Calculator calculator0 = new p1.Calculator();
        p1.MyObj myObj1 = null;
        p1.MyObj myObj2 = calculator0.testComplex(myObj1);
        int int5 = calculator0.multiply((int) '#', (int) (short) 1);
        p1.MyObj myObj6 = null;
        p1.MyObj myObj7 = calculator0.testComplex(myObj6);
        p1.MyObj myObj8 = null;
        p1.MyObj myObj9 = calculator0.testComplex(myObj8);
        java.lang.Class<?> wildcardClass10 = calculator0.getClass();
        org.junit.Assert.assertNull(myObj2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 35 + "'", int5 == 35);
        org.junit.Assert.assertNull(myObj7);
        org.junit.Assert.assertNull(myObj9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }
}

