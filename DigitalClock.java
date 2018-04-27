import acm.program.*;
import acm.graphics.*;
import java.awt.*;
import java.awt.event.*;

public class DigitalClock extends GraphicsProgram {
	private static final long serialVersionUID = 1L;
	private static final int WIN_WIDTH = 300;
	private static final int WIN_HEIGTH = 300;
	/*public class intToString {

		private int X;
		intToString(int x) {
			X = x;
		}
		public String convert() {
			String Y = Integer.toString(X);
			return (Y);
		}
	}
	intToString test = new intToString(5);
	
	
	intToString X = new intToString (5);*/
	int secUnd = 0;
	int secDec = 0;
	int minUnd = 0;
	int minDec = 0;
	int hrUnd = 0;
	int hrDec = 0;
	
	public void run () {
		setSize(WIN_WIDTH, WIN_HEIGTH);

		while (true) {

			String SecondsUnd = Integer.toString(secUnd);
			String SecondsDec = Integer.toString(secDec);
			String MinutesUnd = Integer.toString(minUnd);
			String MinutesDec = Integer.toString(minDec);
			String HourUnd = Integer.toString(hrUnd);
			String HourDec = Integer.toString(hrDec);
			
			GLabel fillSpace = new GLabel (":", 155, 65);
			fillSpace.setFont("OCRAExtended-20");
			GLabel fillSpace2 = new GLabel (":", 105, 65);
			fillSpace2.setFont("OCRAExtended-20");
			
			GLabel secGraphUnd = new GLabel (SecondsUnd, 190, 65);
			secGraphUnd.setFont("OCRAExtended-20");
			GLabel secGraphDec = new GLabel (SecondsDec, 170, 65);
			secGraphDec.setFont("OCRAExtended-20");
			GLabel minGraphUnd = new GLabel (MinutesUnd, 140, 65);
			minGraphUnd.setFont("OCRAExtended-20");
			GLabel minGraphDec = new GLabel (MinutesDec, 120, 65);
			minGraphDec.setFont("OCRAExtended-20");
			GLabel hrGraphUnd = new GLabel (HourUnd, 90, 65);
			hrGraphUnd.setFont("OCRAExtended-20");
			GLabel hrGraphDec = new GLabel (HourDec, 70, 65);
			hrGraphDec.setFont("OCRAExtended-20");

			
			GRect closeFramework = new GRect (65,40,140,35);
			GRect openFramework = new GRect (45,20,180,75);

			
			 add(secGraphUnd);
			 add(secGraphDec);
			 add(minGraphUnd);
			 add(minGraphDec);
			 add(hrGraphUnd);
			 add(hrGraphDec);
			 
			 add(fillSpace);
			 add(fillSpace2);
			 
			 add(closeFramework);
			 add(openFramework);
			
					pause(1000);
					secUnd ++;
					remove(secGraphUnd);
					while (secUnd == 10) {
						remove(secGraphDec);
						secDec ++;
						secUnd = 0;
						while (secDec == 6) {
							remove(minGraphUnd);
							minUnd ++;
							secDec = 0;
							while (minUnd == 10) {
								remove(minGraphDec);
								minDec ++;
								minUnd = 0;
								while (minDec == 6) {
									remove(hrGraphUnd);
									hrUnd ++;
									minDec = 0;
									while (hrDec == 1 && hrUnd == 3) {
										secUnd = 0;
										secDec = 0;
										minUnd = 0;
										minDec = 0;
										hrUnd = 1;
										hrDec = 0;
									}
																			
									while (hrUnd == 10) {
										remove(hrGraphDec);
										hrDec ++;
										hrUnd = 0;
										
									}
								}
							}
						}
					}
					remove(secGraphDec);
					remove(minGraphUnd);
					remove(minGraphDec);
					remove(hrGraphUnd);
					remove(hrGraphDec);

		}
		
	}
}
