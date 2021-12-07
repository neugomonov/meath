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
public class PaymentModelTest {

    public PaymentModelTest() {
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
     * Test of isDbConnected method, of class PaymentModel.
     */
    @Test
    public void testIsDbConnected() {
        System.out.println("isDbConnected");
        PaymentModel instance = new PaymentModel();
        boolean expResult = true;
        boolean result = instance.isDbConnected();
        assertEquals(expResult, result);
    }

    /**
     * Test of isPaymentOnline method, of class PaymentModel.
     */
    @Test
    public void testIsPaymentOnline() throws Exception {
        System.out.println("isPaymentOnline");
        PaymentModel instance = new PaymentModel();
        boolean expResult = false;
        boolean result = instance.isPaymentOnline();
        assertEquals(expResult, result);
    }

    /**
     * Test of update_payment_status_to_confirmed method, of class PaymentModel.
     */
    @Test
    public void testUpdate_payment_status_to_confirmed() throws Exception {
        System.out.println("update_payment_status_to_confirmed");
        PaymentModel instance = new PaymentModel();
        instance.update_payment_status_to_confirmed();
    }

    /**
     * Test of update_status_to_payment_confirmed method, of class PaymentModel.
     */
    @Test
    public void testUpdate_status_to_payment_confirmed() {
        System.out.println("update_status_to_payment_confirmed");
        PaymentModel instance = new PaymentModel();
        instance.update_status_to_payment_confirmed();
    }

}
