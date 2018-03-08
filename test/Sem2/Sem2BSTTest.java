/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Sem2;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Andreas Heick Laptop
 */
public class Sem2BSTTest
{
    
    public Sem2BSTTest()
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

    @Test
    public void testContainsKey()
    {
        System.out.println("containsKey");
        String key = "";
        Sem2BST instance = new Sem2BST();
        boolean expResult = false;
        boolean result = instance.containsKey(key);
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    @Test
    public void testGet()
    {
        System.out.println("get");
        String key = "";
        Sem2BST instance = new Sem2BST();
        Address expResult = null;
        Address result = instance.get(key);
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    @Test
    public void testPut()
    {
        System.out.println("put");
        String key = "";
        Address value = null;
        Sem2BST instance = new Sem2BST();
        instance.put(key, value);
        fail("The test case is a prototype.");
    }

    @Test
    public void testSize()
    {
        System.out.println("size");
        Sem2BST instance = new Sem2BST();
        int expResult = 0;
        int result = instance.size();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }
    
}
