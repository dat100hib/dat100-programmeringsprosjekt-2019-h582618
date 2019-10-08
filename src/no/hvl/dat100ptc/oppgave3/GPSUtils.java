package no.hvl.dat100ptc.oppgave3;

import static java.lang.Math.*;

import no.hvl.dat100ptc.TODO;
import no.hvl.dat100ptc.oppgave1.GPSPoint;

public class GPSUtils {

	public static double findMax(double[] da) {

		double max  = da[0];
		
		
		for (double d : da) {
			max = Math.max(d, max);
		}
		
		
		return max; 	
	}

	public static double findMin(double[] da) {

		double min = da[0];

		
		for (double d : da) {
			min = Math.min(d, min);
			
		}
        return min;
	}

	public static double[] getLatitudes(GPSPoint[] gpspoints) {

	 double [] latitudes = new double [gpspoints.length];
	 
	 for(int i = 0; i < latitudes.length; i++ ) {
		 latitudes[i] = gpspoints[i].getLatitude();
	 }
	 return latitudes;
	}

	public static double[] getLongitudes(GPSPoint[] gpspoints) {
		 double [] longitudes = new double [gpspoints.length];
		 
		 for(int i = 0; i < longitudes.length; i++ ) {
			 longitudes[i] = gpspoints[i].getLongitude();
		 }
		 return longitudes;
	
	}

	private static int R = 6371000; // jordens radius

	public static double distance(GPSPoint gpspoint1, GPSPoint gpspoint2) {

		double latitude1, latitude2;

		latitude1 = Math.toRadians(gpspoint1.getLatitude());
		latitude2 = Math.toRadians(gpspoint2.getLatitude());
		Double deltaLatitude = latitude1-latitude2;
		
		Double deltaLongitude = (Math.toRadians(gpspoint1.getLongitude())-Math.toRadians(gpspoint2.getLongitude()));
		
		Double a = Math.pow((Math.sin(deltaLatitude/2)), 2) + (Math.cos(latitude1) * (Math.cos(latitude2) * 
				Math.pow((Math.sin(deltaLongitude/2)), 2)));
		
		Double c = 2 * Math.atan2(Math.sqrt(a), Math.sqrt(1-a));
		
		return R * c;
		
		
		
	}

	public static double speed(GPSPoint gpspoint1, GPSPoint gpspoint2) {
			
	  double speed =  (distance(gpspoint1, gpspoint2)/(gpspoint2.getTime()-gpspoint1.getTime())*3.6);

	  
	  
		return speed;

	}

	public static String formatTime(int secs) {

		String timestr;
		String TIMESEP = ":";

		

	}
	private static int TEXTWIDTH = 10;

	public static String formatDouble(double d) {

		String str;

		// TODO - START

		throw new UnsupportedOperationException(TODO.method());

		// TODO - SLUTT
		
	}
}
