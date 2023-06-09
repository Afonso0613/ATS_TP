/*
 * This file was automatically generated by EvoSuite
 * Tue May 16 18:13:56 GMT 2023
 */


import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class SmartCamera_ESTest extends SmartCamera_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      SmartCamera smartCamera0 = new SmartCamera(0, 0, (-1562), 0.0);
      SmartCamera smartCamera1 = smartCamera0.clone();
      smartCamera1.setTamanho(1901);
      boolean boolean0 = smartCamera1.equals(smartCamera0);
      assertEquals(1901.0, smartCamera1.getTamanho(), 0.01);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      SmartCamera smartCamera0 = new SmartCamera(0, 0, 0, 0);
      SmartCamera smartCamera1 = new SmartCamera(smartCamera0);
      smartCamera1.setY(238);
      boolean boolean0 = smartCamera0.equals(smartCamera1);
      assertEquals(238, smartCamera1.getY());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      SmartCamera smartCamera0 = new SmartCamera(0);
      SmartCamera smartCamera1 = new SmartCamera(smartCamera0);
      smartCamera0.setX(1);
      boolean boolean0 = smartCamera0.equals(smartCamera1);
      assertFalse(boolean0);
      assertEquals(1, smartCamera0.getX());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      SmartCamera smartCamera0 = new SmartCamera((-1131), (-1131), 1915, (-2860), 0.0, 0.0);
      smartCamera0.setY(1915);
      int int0 = smartCamera0.getY();
      assertEquals(1915, int0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      SmartCamera smartCamera0 = new SmartCamera((-802), (-802), (-542), 1113, 0.0, (-802));
      smartCamera0.setY((-2030));
      int int0 = smartCamera0.getY();
      assertEquals((-2030), int0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      SmartCamera smartCamera0 = new SmartCamera((-1131), (-1131), 1915, (-2860), 0.0, 0.0);
      int int0 = smartCamera0.getX();
      assertEquals(0.0, smartCamera0.getTamanho(), 0.01);
      assertEquals(0, smartCamera0.getY());
      assertEquals(0.0, smartCamera0.getConsumption(), 0.01);
      assertEquals(1915, int0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      SmartCamera smartCamera0 = new SmartCamera((-855));
      smartCamera0.setX((-855));
      int int0 = smartCamera0.getX();
      assertEquals((-855), int0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      SmartCamera smartCamera0 = new SmartCamera((-1131), (-1131), 1915, (-2860), 0.0, 0.0);
      double double0 = smartCamera0.getTamanho();
      assertEquals(0.0, double0, 0.01);
      assertEquals(1915, smartCamera0.getX());
      assertEquals(0.0, smartCamera0.getConsumption(), 0.01);
      assertEquals(0, smartCamera0.getY());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      SmartCamera smartCamera0 = new SmartCamera((-802), (-802), (-542), 1113, 0.0, (-802));
      assertEquals(0.0, smartCamera0.getTamanho(), 0.01);
      
      smartCamera0.setTamanho((-802));
      double double0 = smartCamera0.getTamanho();
      assertEquals((-802.0), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      SmartCamera smartCamera0 = new SmartCamera(0, 0, 0, 0, 1.0E-9);
      double double0 = smartCamera0.getConsumption();
      assertEquals(1.0E-9, double0, 0.01);
      assertEquals(0.0, smartCamera0.getTamanho(), 0.01);
      assertEquals(0, smartCamera0.getX());
      assertEquals(0, smartCamera0.getY());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      SmartCamera smartCamera0 = new SmartCamera();
      smartCamera0.setConsumption((-2322.166061));
      double double0 = smartCamera0.getConsumption();
      assertEquals((-2322.166061), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      SmartCamera smartCamera0 = new SmartCamera();
      smartCamera0.setConsumption(2);
      smartCamera0.turnOn();
      double double0 = smartCamera0.dailyConsumption();
      assertEquals(2.0, smartCamera0.getConsumption(), 0.01);
      assertEquals(2.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      SmartCamera smartCamera0 = new SmartCamera((-20));
      smartCamera0.setConsumption((-20));
      double double0 = smartCamera0.dailyConsumption();
      assertEquals((-20.0), smartCamera0.getConsumption(), 0.01);
      assertEquals((-20.0), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      SmartCamera smartCamera0 = new SmartCamera((-1), 125, 125, 125, (-1));
      smartCamera0.setY((-3566));
      smartCamera0.clone();
      assertEquals((-3566), smartCamera0.getY());
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      SmartCamera smartCamera0 = new SmartCamera((-4174), 0, 1141, 1141);
      smartCamera0.setX((-4174));
      smartCamera0.clone();
      assertEquals((-5.4340512940000005), smartCamera0.dailyConsumption(), 0.01);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      SmartCamera smartCamera0 = new SmartCamera();
      smartCamera0.setTamanho((-1281));
      smartCamera0.clone();
      assertEquals((-1281.0), smartCamera0.getTamanho(), 0.01);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      SmartCamera smartCamera0 = new SmartCamera(1390, (-5233.0), 1390, 110, 1.0, (-1609.595900434279));
      SmartCamera smartCamera1 = smartCamera0.clone();
      assertEquals(1.529E-4, smartCamera1.dailyConsumption(), 0.01);
      assertEquals(0.0, smartCamera0.getConsumption(), 0.01);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      SmartCamera smartCamera0 = new SmartCamera((-4174), 0, 1141, 1141);
      smartCamera0.setConsumption((-525.00977168906));
      smartCamera0.clone();
      assertEquals((-525.00977168906), smartCamera0.getConsumption(), 0.01);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      SmartCamera smartCamera0 = null;
      try {
        smartCamera0 = new SmartCamera((SmartCamera) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("SmartDevice", e);
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      SmartCamera smartCamera0 = new SmartCamera();
      double double0 = smartCamera0.dailyConsumption();
      assertEquals(0.0, smartCamera0.getConsumption(), 0.01);
      assertEquals(0.0, smartCamera0.getTamanho(), 0.01);
      assertEquals(0, smartCamera0.getX());
      assertEquals(0.0, double0, 0.01);
      assertEquals(0, smartCamera0.getY());
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      SmartCamera smartCamera0 = new SmartCamera((-1131), (-1131), 1915, (-2860), 0.0, 0.0);
      smartCamera0.turnOn();
      double double0 = smartCamera0.dailyConsumption();
      assertEquals(1915, smartCamera0.getX());
      assertEquals(0.0, smartCamera0.getTamanho(), 0.01);
      assertEquals(0.0, smartCamera0.getConsumption(), 0.01);
      assertEquals(0, smartCamera0.getY());
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      SmartCamera smartCamera0 = new SmartCamera(0);
      double double0 = smartCamera0.getConsumption();
      assertEquals(0.0, smartCamera0.getTamanho(), 0.01);
      assertEquals(0, smartCamera0.getY());
      assertEquals(0, smartCamera0.getX());
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      SmartCamera smartCamera0 = new SmartCamera((-1131), (-1131), 1915, (-2860), 0.0, 0.0);
      int int0 = smartCamera0.getY();
      assertEquals(0, int0);
      assertEquals(0.0, smartCamera0.getConsumption(), 0.01);
      assertEquals(0.0, smartCamera0.getTamanho(), 0.01);
      assertEquals(1915, smartCamera0.getX());
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      SmartCamera smartCamera0 = new SmartCamera((-2372), (-2372), 591, 1.0, (-2372));
      double double0 = smartCamera0.getTamanho();
      assertEquals(0.0, smartCamera0.dailyConsumption(), 0.01);
      assertEquals(1.0, double0, 0.01);
      assertEquals(591, smartCamera0.getY());
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      SmartCamera smartCamera0 = new SmartCamera((-1351), (-1351), 0, 0, 0);
      assertEquals(0, smartCamera0.getY());
      
      SmartCamera smartCamera1 = new SmartCamera((-1351));
      smartCamera0.setY((-1351));
      boolean boolean0 = smartCamera1.equals(smartCamera0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      SmartCamera smartCamera0 = new SmartCamera((-1351), (-1351), 0, 0, 0);
      SmartCamera smartCamera1 = new SmartCamera((-1351));
      boolean boolean0 = smartCamera1.equals(smartCamera0);
      assertTrue(boolean0);
      assertEquals(0.0, smartCamera0.getConsumption(), 0.01);
      assertEquals(0.0, smartCamera0.getTamanho(), 0.01);
      assertEquals(0.0, smartCamera1.getConsumption(), 0.01);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      SmartCamera smartCamera0 = new SmartCamera((-2143115225));
      SmartCamera smartCamera1 = new SmartCamera(125, 125, (-2143115225), 125);
      boolean boolean0 = smartCamera0.equals(smartCamera1);
      assertFalse(boolean0);
      assertEquals(125, smartCamera1.getX());
      assertEquals(0, smartCamera0.getY());
      assertEquals(0, smartCamera1.getY());
      assertEquals(125.0, smartCamera1.getTamanho(), 0.01);
      assertEquals(0.0, smartCamera0.getConsumption(), 0.01);
      assertEquals(0.0, smartCamera0.getTamanho(), 0.01);
      assertEquals(0, smartCamera0.getX());
      assertEquals(0.0, smartCamera1.getConsumption(), 0.01);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      SmartCamera smartCamera0 = new SmartCamera((-2143115225));
      boolean boolean0 = smartCamera0.equals("");
      assertEquals(0, smartCamera0.getY());
      assertEquals(0, smartCamera0.getX());
      assertEquals(0.0, smartCamera0.getTamanho(), 0.01);
      assertFalse(boolean0);
      assertEquals(0.0, smartCamera0.getConsumption(), 0.01);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      SmartCamera smartCamera0 = new SmartCamera((-2143115225));
      SmartCamera smartCamera1 = new SmartCamera((-2143115225), 125, 125, (-2143115225), 125);
      boolean boolean0 = smartCamera0.equals(smartCamera1);
      assertEquals(125.0, smartCamera1.getConsumption(), 0.01);
      assertFalse(boolean0);
      assertEquals(0, smartCamera0.getX());
      assertEquals(0, smartCamera0.getY());
      assertEquals(0.0, smartCamera0.getConsumption(), 0.01);
      assertEquals(0.0, smartCamera1.getTamanho(), 0.01);
      assertEquals(0.0, smartCamera0.getTamanho(), 0.01);
      assertEquals(125, smartCamera1.getY());
      assertEquals(125, smartCamera1.getX());
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      SmartCamera smartCamera0 = new SmartCamera((-45), (-45), (-45), (-45), (-45), (-45));
      boolean boolean0 = smartCamera0.equals(smartCamera0);
      assertEquals(0.0, smartCamera0.getConsumption(), 0.01);
      assertEquals(0.0, smartCamera0.getTamanho(), 0.01);
      assertTrue(boolean0);
      assertEquals(0, smartCamera0.getY());
      assertEquals(0, smartCamera0.getX());
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      SmartCamera smartCamera0 = new SmartCamera(0, 0, (-707), (-707), (-707));
      assertEquals(0.0, smartCamera0.getTamanho(), 0.01);
      assertEquals(0, smartCamera0.getX());
      assertEquals(0, smartCamera0.getY());
      assertEquals(0.0, smartCamera0.dailyConsumption(), 0.01);
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      SmartCamera smartCamera0 = new SmartCamera(2478, 2478, 2478, 2478);
      assertEquals(30.432238704000003, smartCamera0.dailyConsumption(), 0.01);
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      SmartCamera smartCamera0 = new SmartCamera((-2143115225), (-2143115225), (-2143115225), (-2143115225));
      assertEquals(0.0, smartCamera0.getTamanho(), 0.01);
      assertEquals(0.0, smartCamera0.dailyConsumption(), 0.01);
      assertEquals(0, smartCamera0.getX());
      assertEquals(0, smartCamera0.getY());
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      SmartCamera smartCamera0 = new SmartCamera(0, 0, (-439), 3307, (-2.143115227E9), 3307);
      smartCamera0.setTamanho((-2158));
      SmartCamera smartCamera1 = new SmartCamera(smartCamera0);
      smartCamera1.setTamanho(0);
      boolean boolean0 = smartCamera0.equals(smartCamera1);
      assertEquals((-2158.0), smartCamera0.getTamanho(), 0.01);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      SmartCamera smartCamera0 = new SmartCamera(0, 0, (-439), 3307, (-2.143115227E9), 3307);
      String string0 = smartCamera0.toString();
      assertEquals("SmartCamera{ id = 0 | on = true | installationCost = 0.0, x=0, y=3307, tamanho=0.0, consumption=3307.0}", string0);
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      SmartCamera smartCamera0 = new SmartCamera((-2404), 3083.009, 1, (-2404), (-2404), 1.0);
      SmartCamera smartCamera1 = smartCamera0.clone();
      assertEquals(0.0, smartCamera0.getTamanho(), 0.01);
      assertEquals(0, smartCamera1.getY());
      assertEquals(1, smartCamera1.getX());
      assertEquals(1.0, smartCamera1.dailyConsumption(), 0.01);
      assertTrue(smartCamera1.equals((Object)smartCamera0));
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      SmartCamera smartCamera0 = new SmartCamera();
      int int0 = smartCamera0.getX();
      assertEquals(0, smartCamera0.getY());
      assertEquals(0.0, smartCamera0.getTamanho(), 0.01);
      assertEquals(0.0, smartCamera0.getConsumption(), 0.01);
      assertEquals(0, int0);
  }
}
