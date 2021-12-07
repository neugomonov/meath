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
public class LoginModelTest {
    
    public LoginModelTest() {
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
     * Test of isDbConnected method, of class LoginModel.
     */
    @Test
    public void testIsDbConnected() {
        System.out.println("isDbConnected");
        LoginModel instance = new LoginModel();
        boolean expResult = true;
        boolean result = instance.isDbConnected();
        assertEquals(expResult, result);
    }

    /**
     * Test of isLogin method, of class LoginModel.
     */
    @Test
    public void testIsLogin() throws Exception {
        System.out.println("isLogin");
        int userid = 2;
        String pass = "123123";
        LoginModel instance = new LoginModel();
        boolean expResult = true;
        boolean result = instance.isLogin(userid, pass);
        assertEquals(expResult, result);
    }

    /**
     * Test of isAdmin method, of class LoginModel.
     */
    @Test
    public void testIsAdmin() throws Exception {
        System.out.println("isAdmin");
        int userid = 1;
        String pass = "123123";
        LoginModel instance = new LoginModel();
        boolean expResult = true;
        boolean result = instance.isAdmin(userid, pass);
        assertEquals(expResult, result);
    }
    
}
