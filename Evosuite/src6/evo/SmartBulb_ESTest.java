/*
 * This file was automatically generated by EvoSuite
 * Tue May 16 14:42:21 GMT 2023
 */


import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class SmartBulb_ESTest extends SmartBulb_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      SmartBulb smartBulb0 = new SmartBulb();
      String string0 = smartBulb0.toString();
      assertEquals("SmartBulb{ id = 0 | on = false | installationCost = 0.0, tone=1, dimension=0.0, consumption=0.0}", string0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      SmartBulb smartBulb0 = new SmartBulb(0, (-2096.168443426263), 2975.56235457, (-3031.376));
      SmartBulb smartBulb1 = smartBulb0.clone();
      smartBulb1.setConsumption(3736.303);
      boolean boolean0 = smartBulb1.equals(smartBulb0);
      assertEquals(3736.303, smartBulb1.getConsumption(), 0.01);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      SmartBulb smartBulb0 = new SmartBulb(0);
      SmartBulb smartBulb1 = new SmartBulb(smartBulb0);
      smartBulb1.setDimension(2);
      boolean boolean0 = smartBulb0.equals(smartBulb1);
      assertEquals(2.0, smartBulb1.getDimension(), 0.01);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      SmartBulb smartBulb0 = new SmartBulb(0, 0, 0, 0);
      SmartBulb smartBulb1 = smartBulb0.clone();
      smartBulb1.setTone(2);
      boolean boolean0 = smartBulb1.equals(smartBulb0);
      //  // Unstable assertion: assertEquals(1, smartBulb0.getTone());
      //  // Unstable assertion: assertEquals(2, smartBulb1.getTone());
      //  // Unstable assertion: assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      SmartBulb smartBulb0 = new SmartBulb(2, 0, 0, 0);
      double double0 = smartBulb0.dailyConsumption();
      assertEquals(0.0, double0, 0.01);
      assertEquals(0.0, smartBulb0.getConsumption(), 0.01);
      assertEquals(0.0, smartBulb0.getDimension(), 0.01);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      SmartBulb smartBulb0 = new SmartBulb();
      int int0 = smartBulb0.getTone();
      assertEquals(1, int0);
      assertEquals(0.0, smartBulb0.getDimension(), 0.01);
      assertEquals(0.0, smartBulb0.getConsumption(), 0.01);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      SmartBulb smartBulb0 = new SmartBulb((-1), (-1), (-1), (-1));
      smartBulb0.setTone((-1));
      int int0 = smartBulb0.getTone();
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      SmartBulb smartBulb0 = new SmartBulb((-123), 49, (double) 49, 1.0);
      double double0 = smartBulb0.getDimension();
      assertEquals(1.0, smartBulb0.getConsumption(), 0.01);
      assertEquals(49.0, double0, 0.01);
      assertEquals(2, smartBulb0.getTone());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      SmartBulb smartBulb0 = new SmartBulb(2, 891.320302597, (-996.936), (-1557.609753096251));
      double double0 = smartBulb0.getDimension();
      assertEquals((-996.936), double0, 0.01);
      assertEquals((-1557.5097530962512), smartBulb0.dailyConsumption(), 0.01);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      SmartBulb smartBulb0 = new SmartBulb(3848, 0.0, 3848, 2149.2347);
      double double0 = smartBulb0.getConsumption();
      assertEquals(1, smartBulb0.getTone());
      assertEquals(2149.2347, double0, 0.01);
      assertEquals(3848.0, smartBulb0.getDimension(), 0.01);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      SmartBulb smartBulb0 = new SmartBulb(1917);
      smartBulb0.setConsumption((-2096.08));
      double double0 = smartBulb0.getConsumption();
      assertEquals((-2096.08), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      SmartBulb smartBulb0 = new SmartBulb(0, (double) 0, (double) 0, (-1288.651953956391));
      double double0 = smartBulb0.dailyConsumption();
      assertEquals((-1288.5519539563911), double0, 0.01);
      assertEquals(0.0, smartBulb0.getDimension(), 0.01);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      SmartBulb smartBulb0 = new SmartBulb((-1), (-1), (-1), (-1));
      smartBulb0.setInstallationCost(45.797394);
      SmartBulb smartBulb1 = smartBulb0.clone();
      //  // Unstable assertion: assertEquals((-1.0), smartBulb1.getDimension(), 0.01);
      //  // Unstable assertion: assertEquals((-1.0), smartBulb1.getConsumption(), 0.01);
      //  // Unstable assertion: assertEquals(1, smartBulb1.getTone());
      //  // Unstable assertion: assertTrue(smartBulb1.equals((Object)smartBulb0));
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      SmartBulb smartBulb0 = null;
      try {
        smartBulb0 = new SmartBulb((SmartBulb) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("SmartDevice", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      SmartBulb smartBulb0 = new SmartBulb((-2622));
      double double0 = smartBulb0.getConsumption();
      assertEquals(0.0, smartBulb0.getDimension(), 0.01);
      assertEquals(1, smartBulb0.getTone());
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      SmartBulb smartBulb0 = new SmartBulb(1, 0, (double) 0, 1243.0);
      int int0 = smartBulb0.getTone();
      assertEquals(0, int0);
      assertEquals(0.0, smartBulb0.getDimension(), 0.01);
      assertEquals(1243.0, smartBulb0.getConsumption(), 0.01);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      SmartBulb smartBulb0 = new SmartBulb(1, 0, (double) 0, 1243.0);
      double double0 = smartBulb0.getDimension();
      assertEquals(0.0, double0, 0.01);
      assertEquals(1243.0, smartBulb0.getConsumption(), 0.01);
      assertEquals(0, smartBulb0.getTone());
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      SmartBulb smartBulb0 = new SmartBulb(182, 0, 182, 182);
      SmartBulb smartBulb1 = new SmartBulb(182, 2, 0, 2);
      boolean boolean0 = smartBulb0.equals(smartBulb1);
      //  // Unstable assertion: assertEquals(0.0, smartBulb1.getDimension(), 0.01);
      //  // Unstable assertion: assertEquals(182.0, smartBulb0.getDimension(), 0.01);
      //  // Unstable assertion: assertEquals(2.1, smartBulb1.dailyConsumption(), 0.01);
      //  // Unstable assertion: assertEquals(182.0, smartBulb0.dailyConsumption(), 0.01);
      //  // Unstable assertion: assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      SmartBulb smartBulb0 = new SmartBulb();
      SmartBulb smartBulb1 = new SmartBulb();
      boolean boolean0 = smartBulb0.equals(smartBulb1);
      assertEquals(0.0, smartBulb1.getDimension(), 0.01);
      assertEquals(0.0, smartBulb1.getConsumption(), 0.01);
      assertEquals(1, smartBulb1.getTone());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      SmartBulb smartBulb0 = new SmartBulb(0, (double) 0, (double) 0, (-1288.651953956391));
      Object object0 = new Object();
      boolean boolean0 = smartBulb0.equals(object0);
      assertFalse(boolean0);
      assertEquals(0.0, smartBulb0.getDimension(), 0.01);
      assertEquals((-1288.5519539563911), smartBulb0.dailyConsumption(), 0.01);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      SmartBulb smartBulb0 = new SmartBulb(182, 0, 182, 182);
      boolean boolean0 = smartBulb0.equals(smartBulb0);
      assertEquals(182.0, smartBulb0.getDimension(), 0.01);
      assertEquals(182.0, smartBulb0.dailyConsumption(), 0.01);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      SmartBulb smartBulb0 = new SmartBulb();
      smartBulb0.turnOn();
      SmartBulb smartBulb1 = new SmartBulb();
      boolean boolean0 = smartBulb0.equals(smartBulb1);
      assertEquals(0.1, smartBulb0.dailyConsumption(), 0.01);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      SmartBulb smartBulb0 = new SmartBulb();
      double double0 = smartBulb0.dailyConsumption();
      assertEquals(0.0, smartBulb0.getDimension(), 0.01);
      assertEquals(0.0, smartBulb0.getConsumption(), 0.01);
      assertEquals(0.0, double0, 0.01);
      assertEquals(1, smartBulb0.getTone());
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      SmartBulb smartBulb0 = new SmartBulb();
      smartBulb0.turnOn();
      double double0 = smartBulb0.dailyConsumption();
      assertEquals(0.1, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      SmartBulb smartBulb0 = new SmartBulb();
      smartBulb0.setDimension(2);
      SmartBulb smartBulb1 = new SmartBulb();
      boolean boolean0 = smartBulb0.equals(smartBulb1);
      assertEquals(2.0, smartBulb0.getDimension(), 0.01);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      SmartBulb smartBulb0 = new SmartBulb(182, 0, 182, 182);
      SmartBulb smartBulb1 = smartBulb0.clone();
      assertEquals(182.0, smartBulb1.dailyConsumption(), 0.01);
      assertEquals(182.0, smartBulb1.getDimension(), 0.01);
      assertEquals(182.0, smartBulb0.getDimension(), 0.01);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      SmartBulb smartBulb0 = new SmartBulb((-1892), 258, (double) (-1892), 2652.1135831702);
      smartBulb0.setTone((-238));
      smartBulb0.clone();
      assertEquals((-238), smartBulb0.getTone());
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      SmartBulb smartBulb0 = new SmartBulb(182, 0, 182, 182);
      String string0 = smartBulb0.toString();
      assertEquals("SmartBulb{ id = 182 | on = true | installationCost = 0.0, tone=0, dimension=182.0, consumption=182.0}", string0);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      SmartBulb smartBulb0 = new SmartBulb((-2146891498), (-2146891498), (-2146891498), (-2146891498));
      SmartBulb smartBulb1 = new SmartBulb(smartBulb0);
      assertEquals(0.0, smartBulb1.getConsumption(), 0.01);
      
      smartBulb1.setConsumption(1);
      boolean boolean0 = smartBulb0.equals(smartBulb1);
      assertFalse(boolean0);
  }
}
