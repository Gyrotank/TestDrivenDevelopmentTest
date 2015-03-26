package ua.epam.rd.TestDrivenDevelopmentTest;

import static org.junit.Assert.assertEquals;

import org.junit.Assert.*;
import org.junit.Test;

import junit.framework.TestCase;

/**
 * Unit test for simple App.
 */
public class AppTest 
    
{
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
   
    /**
     * Rigourous Test :-)
     */
    @Test
    public void testFindTemperatureClosestToZeroArrayEmptyZero()
    {
    	double[] arr = {};
    	double expRes = 0.0;
    	
    	assertEquals(expRes, App.findTemperatureClosestToZero(arr), 0.0);
    }
    
    @Test(expected = NullPointerException.class)
    public void testFindTemperatureClosestToZeroArrayNullException()
    {
    	double[] arr = null;
    	    	
    	App.findTemperatureClosestToZero(arr);
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testFindTemperatureClosestToZeroLessThenAbsoluteZeroException()
    {
    	double[] arr = {-273.5};
    	    	
    	App.findTemperatureClosestToZero(arr);
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testFindTemperatureClosestToZeroLessThenAbsoluteZeroAfterZeroException()
    {
    	double[] arr = {0.0, -273.5};
    	    	
    	App.findTemperatureClosestToZero(arr);
    }
    
    @Test
    public void testFindTemperatureClosestToZeroAbsoluteZeroAbsoluteZero()
    {
    	double[] arr = {-273.0};
    	double expRes = -273.0;
    	    	
    	assertEquals(expRes, App.findTemperatureClosestToZero(arr), 0.0);
    }
    
    @Test
    public void testFindTemperatureClosestToZeroZeroZero()
    {
    	double[] arr = {0.0};
    	double expRes = 0.0;
    	    	
    	assertEquals(expRes, App.findTemperatureClosestToZero(arr), 0.0);
    }
    
    @Test
    public void testFindTemperatureClosestToZeroAllGreaterThanZero()
    {
    	double[] arr = {3.0, 5.0, 1.1};
    	double expRes = 1.1;
    	    	
    	assertEquals(expRes, App.findTemperatureClosestToZero(arr), 0.0);
    }
    
    @Test
    public void testFindTemperatureClosestToZeroAllLessThanZero()
    {
    	double[] arr = {-3.0, -5.0, -1.1};
    	double expRes = -1.1;
    	    	
    	assertEquals(expRes, App.findTemperatureClosestToZero(arr), 0.0);
    }
    
    @Test
    public void testFindTemperatureClosestToZeroMixedValues()
    {
    	double[] arr = {-3.0, 5.0, 1.1};
    	double expRes = 1.1;
    	    	
    	assertEquals(expRes, App.findTemperatureClosestToZero(arr), 0.0);
    }
    
    @Test
    public void testFindTemperatureClosestToZeroMixedValuesEqualLesserFirst()
    {
    	double[] arr = {-1.1, 5.0, 1.1};
    	double expRes = 1.1;
    	    	
    	assertEquals(expRes, App.findTemperatureClosestToZero(arr), 0.0);
    }
    
    @Test
    public void testFindTemperatureClosestToZeroMixedValuesEqualBiggerFirst()
    {
    	double[] arr = {1.1, 5.0, -1.1};
    	double expRes = 1.1;
    	    	
    	assertEquals(expRes, App.findTemperatureClosestToZero(arr), 0.0);
    }
}
