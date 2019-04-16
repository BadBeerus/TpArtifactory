package com.wunderit;

import org.junit.Test;
import org.junit.Ignore;
import static org.junit.Assert.*;

/**
 * Unit test for simple App.
 */
public class AppTest { 

    @Test
    public void test() throws Exception {int a = 1;
    assertEquals(a, 1);}
    
    @Ignore @Test
    public void test2() throws Exception {assertEquals(true, true);
    }

    @Test
    public void test3() throws Exception {assertEquals(false, true);
    }

}
