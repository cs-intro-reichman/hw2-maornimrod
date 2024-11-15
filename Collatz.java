// Demonstrates the Collatz conjecture.
public class Collatz {
	public static void main(String args[]) {
	    int timesRun = Integer.parseInt(args[0]);
		String VorC = args[1];
		int sequence, counter;
		
		for (int i = 0; i < timesRun; i++) {
			sequence = i+1;
			counter = 0;
			do {
				counter++;
				if("v".equals(VorC)){
					System.out.print(sequence+ " ");
				}
				if(sequence%2==0){
					sequence /=2;
				}
				else{
					sequence = (sequence*3) +1;
				}
			} while (sequence>1); 				
			System.out.print(sequence+ " ");

			if("v".equals(VorC)){
				System.out.println("(" + (counter+1) + ")");
			}
		}
		System.out.println("Every one of the first " + timesRun + " hailstone sequences reached 1.");

	}
}
