/*
 * This file was automatically generated by EvoSuite
 * Tue May 16 18:00:28 GMT 2023
 */


import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class CasaInteligente_ESTest extends CasaInteligente_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      CasaInteligente casaInteligente0 = new CasaInteligente("]f M|T^q4I", 125, "");
      CasaInteligente casaInteligente1 = new CasaInteligente("com.oracle.xmlns.internal.webservices.jaxws_databinding.XmlWebMethod", (-1686));
      boolean boolean0 = casaInteligente0.equals(casaInteligente1);
      assertEquals(125, casaInteligente0.getOwnerNIF());
      assertEquals((-1686), casaInteligente1.getOwnerNIF());
      assertFalse(boolean0);
      assertEquals("]f M|T^q4I", casaInteligente0.getOwnerName());
      assertEquals("", casaInteligente0.getSupplier());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      CasaInteligente casaInteligente0 = new CasaInteligente("1Q<+XA", (-1691), "com.oracle.xmlns.internal.webservices.jaxws_databinding.XmlServiceMode");
      SmartBulb smartBulb0 = new SmartBulb(0, 0.0, 0.0, 0.0);
      casaInteligente0.addSmartDevice((-1691), "1Q<+XA", smartBulb0);
      casaInteligente0.setSmartDeviceOnOff((-1691), false);
      assertEquals(0, casaInteligente0.getOwnerNIF());
      assertEquals("1Q<+XA", casaInteligente0.getOwnerName());
      assertEquals("com.oracle.xmlns.internal.webservices.jaxws_databinding.XmlServiceMode", casaInteligente0.getSupplier());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      CasaInteligente casaInteligente0 = new CasaInteligente("1Q<+XA", (-1691), "com.oracle.xmlns.internal.webservices.jaxws_databinding.XmlServiceMode");
      SmartBulb smartBulb0 = new SmartBulb(0, 0.0, 0.0, 0.0);
      casaInteligente0.addSmartDevice((-1691), "1Q<+XA", smartBulb0);
      double double0 = casaInteligente0.getTotalConsumption();
      assertEquals(0, casaInteligente0.getOwnerNIF());
      assertEquals("1Q<+XA", casaInteligente0.getOwnerName());
      assertEquals("com.oracle.xmlns.internal.webservices.jaxws_databinding.XmlServiceMode", casaInteligente0.getSupplier());
      assertEquals(0.1, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      CasaInteligente casaInteligente0 = new CasaInteligente("[Casa Inteligente] : Dono = ", (-611));
      casaInteligente0.setSupplier("%)E-+U");
      casaInteligente0.getSupplier();
      assertEquals((-611), casaInteligente0.getOwnerNIF());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      CasaInteligente casaInteligente0 = new CasaInteligente("", 1551);
      casaInteligente0.setSupplier("");
      casaInteligente0.getSupplier();
      assertEquals(1551, casaInteligente0.getOwnerNIF());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      CasaInteligente casaInteligente0 = new CasaInteligente("R#nA0gMuN<T", 0, "R#nA0gMuN<T");
      casaInteligente0.getOwnerName();
      assertEquals(0, casaInteligente0.getOwnerNIF());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      CasaInteligente casaInteligente0 = new CasaInteligente("", 0, "");
      casaInteligente0.getOwnerName();
      assertEquals(0, casaInteligente0.getOwnerNIF());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      CasaInteligente casaInteligente0 = new CasaInteligente("q&M|/3U2L_E:>P:/zZ", 0, "q&M|/3U2L_E:>P:/zZ");
      int int0 = casaInteligente0.getOwnerNIF();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      CasaInteligente casaInteligente0 = new CasaInteligente("", 1551);
      int int0 = casaInteligente0.getOwnerNIF();
      assertEquals(1551, int0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      CasaInteligente casaInteligente0 = new CasaInteligente("CasaInteligente", (-1));
      casaInteligente0.setLocations((Map<String, List<Integer>>) null);
      casaInteligente0.getLocations();
      assertEquals((-1), casaInteligente0.getOwnerNIF());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      CasaInteligente casaInteligente0 = new CasaInteligente("1SN:Jy%cK?|>(9.yH", (-1404));
      SmartCamera smartCamera0 = new SmartCamera((-2332), 0, (-209), (-1404));
      casaInteligente0.addSmartDevice((-1404), "Tk5:aOTpTqf,Fz?{", smartCamera0);
      casaInteligente0.getLocations();
      assertEquals((-1404), casaInteligente0.getOwnerNIF());
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      CasaInteligente casaInteligente0 = new CasaInteligente();
      casaInteligente0.setDevices((Map<Integer, SmartDevice>) null);
      casaInteligente0.getDevices();
      assertEquals(0, casaInteligente0.getOwnerNIF());
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      CasaInteligente casaInteligente0 = new CasaInteligente("", 3227);
      SmartBulb smartBulb0 = new SmartBulb(3227);
      casaInteligente0.addSmartDevice(3227, ". *t<,TS'Py9U", smartBulb0);
      casaInteligente0.getDevices();
      assertEquals(3227, casaInteligente0.getOwnerNIF());
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      CasaInteligente casaInteligente0 = new CasaInteligente("com.oracle.xmlns.internal.webservices.jaxws_databinding.XmlWebService", 125);
      HashMap<Integer, SmartDevice> hashMap0 = new HashMap<Integer, SmartDevice>();
      Integer integer0 = new Integer(125);
      SmartCamera smartCamera0 = new SmartCamera(125, 125, 125, 125, 125, 125);
      hashMap0.put(integer0, smartCamera0);
      casaInteligente0.setDevices(hashMap0);
      SmartDevice smartDevice0 = casaInteligente0.getDevice(125);
      assertNotNull(smartDevice0);
      assertEquals(125, casaInteligente0.getOwnerNIF());
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      CasaInteligente casaInteligente0 = new CasaInteligente("f;.", (-180));
      SmartSpeaker smartSpeaker0 = new SmartSpeaker(" ; ", "");
      casaInteligente0.addSmartDevice((-180), "", smartSpeaker0);
      SmartDevice smartDevice0 = casaInteligente0.getDevice((-180));
      assertNotNull(smartDevice0);
      assertEquals((-180), casaInteligente0.getOwnerNIF());
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      CasaInteligente casaInteligente0 = new CasaInteligente();
      Double double0 = new Double((-33));
      SmartSpeaker smartSpeaker0 = new SmartSpeaker((-1718), (-33), "3@@1aK=BqA~*M", double0);
      casaInteligente0.addSmartDevice((-1), "3@@1aK=BqA~*M", smartSpeaker0);
      SmartDevice smartDevice0 = casaInteligente0.getDevice((-1));
      assertEquals(0, casaInteligente0.getOwnerNIF());
      assertNotNull(smartDevice0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      CasaInteligente casaInteligente0 = new CasaInteligente("com.oracle.xmlns.internal.webservices.jaxws_databinding.XmlWebEndpoint", 2262, "com.oracle.xmlns.internal.webservices.jaxws_databinding.XmlWebEndpoint");
      CasaInteligente casaInteligente1 = casaInteligente0.clone();
      assertEquals(2262, casaInteligente0.getOwnerNIF());
      assertEquals(2262, casaInteligente1.getOwnerNIF());
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      CasaInteligente casaInteligente0 = new CasaInteligente("PAYLOAD", 1, "Z}b~HYr&$L");
      casaInteligente0.setOwnerNIF((-1233));
      casaInteligente0.clone();
      assertEquals((-1233), casaInteligente0.getOwnerNIF());
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      CasaInteligente casaInteligente0 = new CasaInteligente("", 0, "");
      // Undeclared exception!
      try { 
        casaInteligente0.setAllOnLocation("", false);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("CasaInteligente", e);
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      CasaInteligente casaInteligente0 = new CasaInteligente();
      Map<Integer, SmartDevice> map0 = casaInteligente0.getDevices();
      HashMap<Integer, SmartDevice> hashMap0 = new HashMap<Integer, SmartDevice>(map0);
      Integer integer0 = new Integer(1540);
      hashMap0.put(integer0, (SmartDevice) null);
      casaInteligente0.setDevices(hashMap0);
      // Undeclared exception!
      try { 
        casaInteligente0.setAllOn(true);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("CasaInteligente", e);
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      CasaInteligente casaInteligente0 = new CasaInteligente("", 1, "");
      Integer integer0 = new Integer(1);
      // Undeclared exception!
      try { 
        casaInteligente0.roomHasDevice("", integer0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      CasaInteligente casaInteligente0 = new CasaInteligente();
      casaInteligente0.setLocations((Map<String, List<Integer>>) null);
      // Undeclared exception!
      try { 
        casaInteligente0.hasRoom("com.oracle.xmlns.internal.webservices.jaxws_databinding.XmlHandlerChain");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
      }
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      CasaInteligente casaInteligente0 = new CasaInteligente();
      HashMap<Integer, SmartDevice> hashMap0 = new HashMap<Integer, SmartDevice>();
      Integer integer0 = Integer.valueOf(0);
      hashMap0.put(integer0, (SmartDevice) null);
      casaInteligente0.setDevices(hashMap0);
      // Undeclared exception!
      try { 
        casaInteligente0.getTotalConsumption();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("CasaInteligente", e);
      }
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      CasaInteligente casaInteligente0 = new CasaInteligente("2", (-854));
      casaInteligente0.setDevices((Map<Integer, SmartDevice>) null);
      // Undeclared exception!
      try { 
        casaInteligente0.getDevice((-854));
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("CasaInteligente", e);
      }
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      CasaInteligente casaInteligente0 = new CasaInteligente((String) null, (-4417));
      casaInteligente0.setDevices((Map<Integer, SmartDevice>) null);
      Integer integer0 = new Integer((-2325));
      // Undeclared exception!
      try { 
        casaInteligente0.existsDevice(integer0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
      }
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      CasaInteligente casaInteligente0 = new CasaInteligente();
      CasaInteligente casaInteligente1 = new CasaInteligente("", 0);
      // Undeclared exception!
      try { 
        casaInteligente1.equals(casaInteligente0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
      }
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      CasaInteligente casaInteligente0 = new CasaInteligente("LAf8hg$X{,|]zi0>", 1479);
      SmartCamera smartCamera0 = new SmartCamera(0, 711, (-3478), 1.0, 1479);
      casaInteligente0.setLocations((Map<String, List<Integer>>) null);
      // Undeclared exception!
      try { 
        casaInteligente0.addSmartDevice(1479, (String) null, smartCamera0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
      }
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      CasaInteligente casaInteligente0 = new CasaInteligente("N+4zfu", 0);
      casaInteligente0.setLocations((Map<String, List<Integer>>) null);
      // Undeclared exception!
      try { 
        casaInteligente0.addRoom("com.oracle.webservices.internal.api.EnvelopeStyleFeature");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("CasaInteligente", e);
      }
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      CasaInteligente casaInteligente0 = null;
      try {
        casaInteligente0 = new CasaInteligente((CasaInteligente) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("CasaInteligente", e);
      }
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      CasaInteligente casaInteligente0 = new CasaInteligente(", channel=", (-2681));
      casaInteligente0.getLocations();
      assertEquals((-2681), casaInteligente0.getOwnerNIF());
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      CasaInteligente casaInteligente0 = new CasaInteligente("", 1551);
      casaInteligente0.getSupplier();
      assertEquals(1551, casaInteligente0.getOwnerNIF());
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      CasaInteligente casaInteligente0 = new CasaInteligente((String) null, 1852);
      casaInteligente0.getOwnerName();
      assertEquals(1852, casaInteligente0.getOwnerNIF());
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      CasaInteligente casaInteligente0 = new CasaInteligente("f;.", (-180));
      int int0 = casaInteligente0.getOwnerNIF();
      assertEquals((-180), int0);
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      CasaInteligente casaInteligente0 = new CasaInteligente();
      CasaInteligente casaInteligente1 = new CasaInteligente(casaInteligente0);
      HashMap<String, List<Integer>> hashMap0 = new HashMap<String, List<Integer>>();
      casaInteligente1.setLocations(hashMap0);
      assertTrue(casaInteligente0.equals((Object)casaInteligente1));
      
      casaInteligente0.addSmartDevice(17, "Ws", (SmartDevice) null);
      boolean boolean0 = casaInteligente0.equals(casaInteligente1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      CasaInteligente casaInteligente0 = new CasaInteligente();
      casaInteligente0.setOwnerNIF(11);
      CasaInteligente casaInteligente1 = new CasaInteligente("", 11, "");
      casaInteligente0.addSmartDevice(125, "", (SmartDevice) null);
      boolean boolean0 = casaInteligente0.equals(casaInteligente1);
      assertEquals(11, casaInteligente0.getOwnerNIF());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      CasaInteligente casaInteligente0 = new CasaInteligente();
      casaInteligente0.setOwnerNIF(17);
      CasaInteligente casaInteligente1 = new CasaInteligente("", 17);
      boolean boolean0 = casaInteligente0.equals(casaInteligente1);
      assertEquals(17, casaInteligente0.getOwnerNIF());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      CasaInteligente casaInteligente0 = new CasaInteligente();
      CasaInteligente casaInteligente1 = new CasaInteligente(casaInteligente0);
      assertTrue(casaInteligente1.equals((Object)casaInteligente0));
      
      casaInteligente1.setOwnerName("M");
      boolean boolean0 = casaInteligente1.equals(casaInteligente0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      CasaInteligente casaInteligente0 = new CasaInteligente();
      CasaInteligente casaInteligente1 = new CasaInteligente();
      casaInteligente0.setOwnerNIF(5);
      boolean boolean0 = casaInteligente1.equals(casaInteligente0);
      assertEquals(5, casaInteligente0.getOwnerNIF());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      CasaInteligente casaInteligente0 = new CasaInteligente();
      CasaInteligente casaInteligente1 = new CasaInteligente(casaInteligente0);
      boolean boolean0 = casaInteligente0.equals(casaInteligente1);
      assertEquals(0, casaInteligente1.getOwnerNIF());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      CasaInteligente casaInteligente0 = new CasaInteligente("SmartBulb{", 0, "SmartBulb{");
      boolean boolean0 = casaInteligente0.equals((Object) null);
      assertEquals(0, casaInteligente0.getOwnerNIF());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      CasaInteligente casaInteligente0 = new CasaInteligente();
      boolean boolean0 = casaInteligente0.equals(casaInteligente0);
      assertTrue(boolean0);
      assertEquals(0, casaInteligente0.getOwnerNIF());
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      CasaInteligente casaInteligente0 = new CasaInteligente("`16@Kd:rWgs!v1,acGm]", (-193));
      SmartBulb smartBulb0 = new SmartBulb();
      boolean boolean0 = casaInteligente0.equals(smartBulb0);
      assertEquals((-193), casaInteligente0.getOwnerNIF());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      CasaInteligente casaInteligente0 = new CasaInteligente("PAYLOAD", 1, "Z}b~HYr&$L");
      Double double0 = new Double((-1.0));
      SmartSpeaker smartSpeaker0 = new SmartSpeaker(2, 2, ", x=", double0);
      casaInteligente0.addSmartDevice((-1233), ",_[ /=", smartSpeaker0);
      double double1 = casaInteligente0.getTotalConsumption();
      assertEquals("PAYLOAD", casaInteligente0.getOwnerName());
      assertEquals(1, casaInteligente0.getOwnerNIF());
      assertEquals((-1.0), double1, 0.01);
      assertEquals("Z}b~HYr&$L", casaInteligente0.getSupplier());
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      CasaInteligente casaInteligente0 = new CasaInteligente();
      double double0 = casaInteligente0.getTotalConsumption();
      assertEquals(0, casaInteligente0.getOwnerNIF());
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      CasaInteligente casaInteligente0 = new CasaInteligente();
      casaInteligente0.addSmartDevice(17, "Ws", (SmartDevice) null);
      Integer integer0 = new Integer(17);
      boolean boolean0 = casaInteligente0.roomHasDevice("Ws", integer0);
      assertEquals(0, casaInteligente0.getOwnerNIF());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      CasaInteligente casaInteligente0 = new CasaInteligente("`16@Kd:rWgs!v1,acGm]", (-193));
      casaInteligente0.addRoom("[Casa Inteligente] : Dono = `16@Kd:rWgs!v1,acGm] | NIF = -193 | Fornecedor = null ; ");
      boolean boolean0 = casaInteligente0.roomHasDevice("[Casa Inteligente] : Dono = `16@Kd:rWgs!v1,acGm] | NIF = -193 | Fornecedor = null ; ", (Integer) 2);
      assertFalse(boolean0);
      assertEquals((-193), casaInteligente0.getOwnerNIF());
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      CasaInteligente casaInteligente0 = new CasaInteligente();
      Double double0 = new Double((-33));
      SmartSpeaker smartSpeaker0 = new SmartSpeaker((-1718), (-33), "3@@1aK=BqA~*M", double0);
      casaInteligente0.addSmartDevice((-1), "3@@1aK=BqA~*M", smartSpeaker0);
      boolean boolean0 = casaInteligente0.hasRoom("3@@1aK=BqA~*M");
      assertEquals(0, casaInteligente0.getOwnerNIF());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      CasaInteligente casaInteligente0 = new CasaInteligente("`16@Kd:rWgs!v1,acGm]", (-193));
      boolean boolean0 = casaInteligente0.hasRoom("G%;'6grww oLFk;%f");
      assertFalse(boolean0);
      assertEquals((-193), casaInteligente0.getOwnerNIF());
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      CasaInteligente casaInteligente0 = new CasaInteligente("[Casa Inteligente] : Dono = ", 931, "[Casa Inteligente] : Dono = ");
      SmartBulb smartBulb0 = new SmartBulb();
      casaInteligente0.addSmartDevice(931, "[Casa Inteligente] : Dono = ", smartBulb0);
      casaInteligente0.setAllOnLocation("[Casa Inteligente] : Dono = ", false);
      assertEquals(931, casaInteligente0.getOwnerNIF());
  }

  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      CasaInteligente casaInteligente0 = new CasaInteligente("`16@Kd:rWgs!v1,acGm]", (-193));
      SmartBulb smartBulb0 = new SmartBulb();
      casaInteligente0.addSmartDevice(0, "`16@Kd:rWgs!v1,acGm]", smartBulb0);
      casaInteligente0.setAllOn(false);
      assertEquals((-193), casaInteligente0.getOwnerNIF());
  }

  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      CasaInteligente casaInteligente0 = new CasaInteligente("`16@Kd:rWgs!v1,acGm]", (-193));
      SmartBulb smartBulb0 = new SmartBulb();
      casaInteligente0.addSmartDevice(0, "`16@Kd:rWgs!v1,acGm]", smartBulb0);
      casaInteligente0.addSmartDevice((-193), "`16@Kd:rWgs!v1,acGm]", smartBulb0);
      assertEquals((-193), casaInteligente0.getOwnerNIF());
  }

  @Test(timeout = 4000)
  public void test51()  throws Throwable  {
      CasaInteligente casaInteligente0 = new CasaInteligente("`16@Kd:rWgs!v1,acGm]", (-193));
      SmartBulb smartBulb0 = new SmartBulb();
      casaInteligente0.addSmartDevice(0, "`16@Kd:rWgs!v1,acGm]", smartBulb0);
      boolean boolean0 = casaInteligente0.existsDevice((Integer) 0);
      assertTrue(boolean0);
      assertEquals((-193), casaInteligente0.getOwnerNIF());
  }

  @Test(timeout = 4000)
  public void test52()  throws Throwable  {
      CasaInteligente casaInteligente0 = new CasaInteligente("[Casa Inteligente] : Dono = ", 4095, "[Casa Inteligente] : Dono = ");
      boolean boolean0 = casaInteligente0.existsDevice((Integer) 2);
      assertFalse(boolean0);
      assertEquals(4095, casaInteligente0.getOwnerNIF());
  }

  @Test(timeout = 4000)
  public void test53()  throws Throwable  {
      CasaInteligente casaInteligente0 = new CasaInteligente("", 0);
      casaInteligente0.addRoom("v0XzbFUK{k+~8nV*Kl");
      Integer integer0 = new Integer(0);
      casaInteligente0.addToRoom("v0XzbFUK{k+~8nV*Kl", integer0);
      assertEquals(0, casaInteligente0.getOwnerNIF());
  }

  @Test(timeout = 4000)
  public void test54()  throws Throwable  {
      CasaInteligente casaInteligente0 = new CasaInteligente("com.oracle.xmlns.internal.webservices.jaxws_databinding.XmlWebEndpoint", 2262, "com.oracle.xmlns.internal.webservices.jaxws_databinding.XmlWebEndpoint");
      Integer integer0 = new Integer(0);
      // Undeclared exception!
      try { 
        casaInteligente0.addToRoom("Y8z", integer0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("CasaInteligente", e);
      }
  }

  @Test(timeout = 4000)
  public void test55()  throws Throwable  {
      CasaInteligente casaInteligente0 = new CasaInteligente("SmartBulb{", 0, "SmartBulb{");
      CasaInteligente casaInteligente1 = casaInteligente0.clone();
      assertEquals(0, casaInteligente1.getOwnerNIF());
  }

  @Test(timeout = 4000)
  public void test56()  throws Throwable  {
      CasaInteligente casaInteligente0 = new CasaInteligente("SmartBulb{", 0, "SmartBulb{");
      casaInteligente0.getDevice(1);
      assertEquals(0, casaInteligente0.getOwnerNIF());
  }

  @Test(timeout = 4000)
  public void test57()  throws Throwable  {
      CasaInteligente casaInteligente0 = new CasaInteligente("cQp)Av^Wkw=M#.,", 1, "cQp)Av^Wkw=M#.,");
      // Undeclared exception!
      try { 
        casaInteligente0.setSmartDeviceOnOff(1, true);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("CasaInteligente", e);
      }
  }

  @Test(timeout = 4000)
  public void test58()  throws Throwable  {
      CasaInteligente casaInteligente0 = new CasaInteligente();
      String string0 = casaInteligente0.toString();
      assertEquals("[Casa Inteligente] : Dono =  | NIF = 0 | Fornecedor =  ; ", string0);
  }
}
