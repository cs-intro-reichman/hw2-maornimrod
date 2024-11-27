// Computes an approximation of PI.
public class CalcPi {
	public static void main(String [] args) { 
	    int run = Integer.parseInt(args[0]);
		double sum=0;

		for (int i = 0; i < run; i++) {
			if(i%2 ==0){
				sum += (double) (1.0/(2*i+1));				
			}
			else{
				sum -= (double) (1.0/(2*i+1));
			}
		}
		System.out.println("pi according to Java: "+ Math.PI);
		System.out.println("pi, approximated:     "+ (sum*4));
	}
}
