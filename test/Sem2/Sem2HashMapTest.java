/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Sem2;

import java.util.List;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Patrick
 */
public class Sem2HashMapTest
{

    public Sem2HashMapTest()
    {
    }

    @BeforeClass
    public static void setUpClass()
    {
    }

    @AfterClass
    public static void tearDownClass()
    {
    }

    @Before
    public void setUp()
    {
    }

    @After
    public void tearDown()
    {
    }

    /**
     * Test of get method, of class Sem2HashMap.
     */
    @Test
    public void testGet()
    {
        System.out.println("get");
        String key = null;
        Sem2HashMap instance = new Sem2HashMap();
        Address expResult = null;
        Address result = instance.get(key);
        assertEquals(expResult, result);
    }

    @Test
    public void testGet2()
    {
        System.out.println("get");
        String key = "asdasdasdasd";
        Sem2HashMap instance = new Sem2HashMap();
        Address expResult = null;
        Address result = instance.get(key);
        assertEquals(expResult, result);
    }

    @Test
    public void testPut() throws Exception
    {
        System.out.println("put");
        String key = "Test";
        Address value = new Address("testhammer 2");
        Sem2HashMap instance = new Sem2HashMap();
        instance.put(key, value);
    }

    /**
     * Test of put method, of class Sem2HashMap.
     */
    @Test
    public void testPut2() throws Exception
    {
        System.out.println("put");
        String key = "";
        Address value = new Address("testhammer 2");
        Sem2HashMap instance = new Sem2HashMap();
        instance.put(key, value);
        instance.put(key, new Address("Nowhere 9"));
    }

    /**
     * Test of containsKey method, of class Sem2HashMap.
     */
    @Test
    public void testContainsKeyFalse()
    {
        System.out.println("containsKey");
        String key = "";
        Sem2HashMap instance = new Sem2HashMap();
        boolean expResult = false;
        boolean result = instance.containsKey(key);
        assertEquals(expResult, result);
    }

    @Test
    public void testContainsKeyTrue() throws Exception
    {
        System.out.println("containsKey");
        String key = "test";
        Sem2HashMap instance = new Sem2HashMap();
        instance.put(key, new Address("testhammer 2"));
        boolean expResult = true;
        boolean result = instance.containsKey(key);
        assertEquals(expResult, result);
    }

    /**
     * Test of size method, of class Sem2HashMap.
     */
    @Test
    public void testSize()
    {
        System.out.println("size");
        Sem2HashMap instance = new Sem2HashMap();
        int expResult = 0;
        int result = instance.size();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    @Test
    public void testSize1() throws Exception
    {
        System.out.println("size");
        Sem2HashMap instance = new Sem2HashMap();
        instance.put("joe", new Address("Lolhammer 2"));
        int expResult = 1;
        int result = instance.size();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    @Test
    public void testCollision() throws Exception
    {
        {
            System.out.println("collision");
            Sem2HashMap instance = new Sem2HashMap();
            instance.put("Lars", new Address("Street1"));
            instance.put("Donald", new Address("Street2"));
            String expResult = "Street1";
            String result = instance.get("Lars").getStreet();
            assertEquals(expResult, result);
        }
    }

    @Test
    public void testExtension() throws Exception
    {
        Sem2HashMap hm = new Sem2HashMap();
        String key = "Joe";
        String nKey = null;
        hm.put("Lars", new Address("Street1"));
        hm.put("Donald", new Address("Street2"));
        hm.put(key, new Address("Nowhere 9"));
        hm.put("test1", new Address("Nowhere 10"));
        hm.put("test2", new Address("Nowhere 10"));
        hm.put("test3", new Address("Nowhere 10"));
        hm.put("test4", new Address("Nowhere 13"));
        hm.put("test5", new Address("Nowhere 14"));
        hm.put("test6", new Address("Nowhere 15"));
        hm.put("test7", new Address("Nowhere 16"));
        hm.put("test8", new Address("Nowhere 17"));
        hm.put("test9", new Address("Nowhere 18"));
        hm.put("test10", new Address("Nowhere 19"));
        hm.put("test11", new Address("Nowhere 20"));
        hm.put("test12", new Address("Nowhere 21"));
        hm.put("test13", new Address("Nowhere 21"));
    }

    /**
     * Test of values method, of class Sem2HashMap.
     */
    @Test
    public void testValues()
    {
        System.out.println("values");
        Sem2HashMap instance = new Sem2HashMap();
        List<Address> expResult = null;
        List<Address> result = instance.values();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

}
