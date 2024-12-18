// Tests the distribution generated by Java's Math.random() function.
public  class  TestRandom {
	public static void main(String[]  args) {
	   int N = Integer.parseInt(args[0]);

	   int countAbove =0;
	   int countBelow =0;
	   double rndNumber;
	   
	   //counting the times for >0.5 and <=0.5
	   for(int i = 0; i<N; i++){
		rndNumber = Math.random();
		if(rndNumber> 0.5){
			countAbove++;
		}
		else{
			countBelow++;
		}
	   }

	   System.out.println("> 0.5: " + countAbove+ " times");
	   System.out.println("<= 0.5: " + countBelow+ " times");

	   //calculating the ratio by dividing the numbers
	   if (countAbove >0 && countBelow > 0) {
		   double ratio = (double) countAbove / countBelow;
		   if(ratio>1){
			ratio = 1 - (ratio-1);
		   }
		   System.out.println("Ratio: " + ratio);
	   }


	}
}
