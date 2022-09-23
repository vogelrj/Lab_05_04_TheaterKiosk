public class Lab_05_04_TheaterKiosk {
    public static void main(String[] args){
        //Class DrinkAge
        //	Main()
        //		num LEGAL_AGE = 21
        // 		num userAge = 0
        //		output “What is your age?”
        //		input userAge
        //		if userAge >= LEGAL_AGE then
        //			output “Please get a wristband”
        //		end if
        //	return
        //end class
        int LEGAL_AGE = 21;
        int userAge = 2;
        System.out.println("What is your age?");
        System.out.println("My age is " + userAge + ".");
        if (userAge >= LEGAL_AGE){
            System.out.println("You get a wristband.");
        }
    }
}
