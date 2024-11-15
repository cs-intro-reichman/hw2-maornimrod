public class TimeCalc {
    public static void main(String[] args) {
    //
    int hours = Integer.parseInt("" + args[0].charAt(0) + args[0].charAt(1));
    // 
    int minutes = Integer.parseInt("" + args[0].charAt(3) + args[0].charAt(4));   
    //check this
    int totalMinutes = Integer.parseInt(args[1]) + minutes + (hours*60);
    int totalHours = totalMinutes/60;

    int newHours = totalHours%24;
    int newMinutes = totalMinutes - (totalHours*60);
  

    if(newHours<10){
        System.out.print("0" + newHours +":");
    }
    else{
        System.out.print(newHours + ":");
    }
    if(newMinutes<10){
        //print the hour in the requiered format 
        System.out.print("0" + newMinutes);
    } else{
        System.out.print(newMinutes);
 }

   

 }
}
