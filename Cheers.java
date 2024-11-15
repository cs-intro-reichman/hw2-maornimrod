// Prints a crowd cheering output.
public class Cheers {
        public static void main(String[] args) {
	    String str = args[0].toUpperCase();
            boolean printed = false;
            int timesprint = Integer.parseInt(args[1]);
            String letters = "AEFHILMNORSX";

            for (int i = 0; i < str.length(); i++) {

                for( int j = 0; j<letters.length(); j++){
                        if(str.charAt(i) == letters.charAt(j)){
                               System.out.println("Give me an "+ str.charAt(i) +": "+ str.charAt(i) +"!");
                               printed = true;
                               break;
                       }
                }
                if(!printed){
                        System.out.println("Give me a  "+ str.charAt(i) +": "+ str.charAt(i) +"!");                       
                }
                printed = false;
                
            }
            System.out.println("What does that spell?");
            for (int i = 0; i < timesprint; i++) {
                System.out.println(str + "!!!");
            }

        }
}
