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
public class MenuModelTest {
    
    public MenuModelTest() {
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
     * Test of isDbConnected method, of class MenuModel.
     */
    @Test
    public void testIsDbConnected() {
        System.out.println("isDbConnected");
        MenuModel instance = new MenuModel();
        boolean expResult = true;
        boolean result = instance.isDbConnected();
        assertEquals(expResult, result);
    }

    /**
     * Test of check_if_added_to_cart method, of class MenuModel.
     */
    @Test
    public void testCheck_if_added_to_cart() throws Exception {
        System.out.println("check_if_added_to_cart");
        int menuId = 1;
        MenuModel instance = new MenuModel();
        boolean expResult = false;
        boolean result = instance.check_if_added_to_cart(menuId);
        assertEquals(expResult, result);
    }

    /**
     * Test of cart_add method, of class MenuModel.
     */
    @Test
    public void testCart_add() throws Exception {
        System.out.println("cart_add");
        int menuId = 1;
        MenuModel instance = new MenuModel();
        instance.cart_add(menuId);
    }

    /**
     * Test of increment_qnt method, of class MenuModel.
     */
    @Test
    public void testIncrement_qnt() throws Exception {
        System.out.println("increment_qnt");
        int menuId = 1;
        MenuModel instance = new MenuModel();
        instance.increment_qnt(menuId);
    }

    /**
     * Test of check_if_pass_equal_to_old method, of class MenuModel.
     */
    @Test
    public void testCheck_if_pass_equal_to_old() throws Exception {
        System.out.println("check_if_pass_equal_to_old");
        String oldpass = "123123";
        MenuModel instance = new MenuModel();
        boolean expResult = false;
        boolean result = instance.check_if_pass_equal_to_old(oldpass);
        assertEquals(expResult, result);
    }

    /**
     * Test of update_password method, of class MenuModel.
     */
    @Test
    public void testUpdate_password() {
        System.out.println("update_password");
        String newpass = "123123";
        MenuModel instance = new MenuModel();
        instance.update_password(newpass);
    }

    /**
     * Test of update_status_to_confirmed method, of class MenuModel.
     */
    @Test
    public void testUpdate_status_to_confirmed() {
        System.out.println("update_status_to_confirmed");
        MenuModel instance = new MenuModel();
        instance.update_status_to_confirmed();
    }

    /**
     * Test of isItemInCart method, of class MenuModel.
     */
    @Test
    public void testIsItemInCart() {
        System.out.println("isItemInCart");
        MenuModel instance = new MenuModel();
        boolean expResult = false;
        boolean result = instance.isItemInCart();
        assertEquals(expResult, result);
    }

    /**
     * Test of copy_to_payment method, of class MenuModel.
     */
    @Test
    public void testCopy_to_payment() {
        System.out.println("copy_to_payment");
        MenuModel instance = new MenuModel();
        instance.copy_to_payment();
    }
    
}
