/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package meathadmin;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author neugo
 */
public class AdminModelTest {
    
    public AdminModelTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of isDbConnected method, of class AdminModel.
     */
    @Test
    public void testIsDbConnected() {
        System.out.println("isDbConnected");
        AdminModel instance = new AdminModel();
        boolean expResult = true;
        boolean result = instance.isDbConnected();
        assertEquals(expResult, result);
    }

    /**
     * Test of isAdd method, of class AdminModel.
     */
    @Test
    public void testIsAdd() throws Exception {
        System.out.println("isAdd");
        String fname = "";
        String lname = "";
        String pass = "";
        AdminModel instance = new AdminModel();
        instance.isAdd(fname, lname, pass);
    }
    
}
