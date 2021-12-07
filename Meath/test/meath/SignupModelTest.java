/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package meath;

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
public class SignupModelTest {

    public SignupModelTest() {
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
     * Test of isDbConnected method, of class SignupModel.
     */
    @Test
    public void testIsDbConnected() {
        System.out.println("isDbConnected");
        SignupModel instance = new SignupModel();
        boolean expResult = true;
        boolean result = instance.isDbConnected();
        assertEquals(expResult, result);
    }

    /**
     * Test of isEmail method, of class SignupModel.
     */
    @Test
    public void testIsEmail() throws Exception {
        System.out.println("isEmail");
        String email = "egorvoronov228@gmail.com";
        SignupModel instance = new SignupModel();
        boolean expResult = true;
        boolean result = instance.isEmail(email);
        assertEquals(expResult, result);
    }

}
