/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sharepricehandler;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author msin63
 */
public class SharePriceHandlerTest {
    
    public SharePriceHandlerTest() {
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
     * Test of loadCompanies method, of class SharePriceHandler.
     */
    @Test
    public void testLoadCompanies() throws Exception {
        System.out.println("loadCompanies");
        SharePriceHandler instance = new SharePriceHandler();
        instance.loadCompanies();
        
    }

    /**
     * Test of processCompanies method, of class SharePriceHandler.
     */
    @Test
    public void testProcessCompanies() {
        System.out.println("processCompanies");
        SharePriceHandler instance = new SharePriceHandler();
        instance.processCompanies();
    
    }

    /**
     * Test of main method, of class SharePriceHandler.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        SharePriceHandler.main(args);

    }
    
}
