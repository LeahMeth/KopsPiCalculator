package kops.PiCalculator;

public class PiCalculator {


	public double calculate(long iterations) {
		double pi = 0;
		//int operator = 1;
		//double calc;
		double numerator = 4, denominator;
		boolean pos = true;
		
		for(int i = 0; i < iterations; i++){
			//calc = operator*(4/(i*2 +1));
			//pi += calc;
			//operator = operator * (-1);
			denominator = i*2+1;
			if(pos){
				
				pi += numerator/denominator;
				pos = false;
			}
			else{
				pi -= numerator/denominator;
				pos = true;
			}
		}
		return pi;
	}

}
