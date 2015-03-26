package ua.epam.rd.TestDrivenDevelopmentTest;

/**
 * Hello world!
 *
 */
public class App 
{
	public double[] temperatures;
	
	public static double findTemperatureClosestToZero(double[] input) {		
		
		if (input == null) throw (new NullPointerException());
		
		if (input.length == 0) {
			return 0.0;
		}
		
		double result = Double.MAX_VALUE;
		
		for (double d : input) {
			if (d < -273.0) throw (new IllegalArgumentException());
			if ((Math.abs(d) - 0.0) <= Math.abs(result)) {
				if (Math.abs(d) == Math.abs(result)) {
					result = Math.max(d, result);
				} else {
					result = d;
				}
			}
		}
		
		return result;
	}
}
