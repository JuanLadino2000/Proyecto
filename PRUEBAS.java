import acm.program.*;
import acm.util.RandomGenerator;

import java.util.Random;

public class PRUEBAS extends ConsoleProgram {
	
	public void run() {
	
	RandomGenerator X = RandomGenerator.getInstance();
	double Y = X.nextDouble(0,1.5);
	println("Generate number: " + Y);
	}
}
