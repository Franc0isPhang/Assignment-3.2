public class ControlAssignment {
    public static void main (String args[]){
        // Task 1. Determine if a number is divisible by 3, 5 or both.
        int numToTest = 995;
        boolean isDivisible;
        if (numToTest %3==0 && numToTest %5==0){
        System.out.println("divisible by 3 and 5");}
        else if(numToTest %3==0){
            System.out.println("divisible by 3");
        }
        else if(numToTest %5==0){
            System.out.println("divisible by 5");
        }
        else {
            System.out.println("it is not divisible by 3 and 5");
        }
        // Add code here

        /* 
            Task 2. Given a sample budget, determine what to ride given the following conditions:
            - if budget is greater than 100, ride a taxi
            - if budget is between 50 to 100, ride train
            - if budget is between 20 to 49, ride bus
            - if budget is between 0 to 19, walk

            Reference: What is enum? https://www.w3schools.com/java/java_enums.asp
        */
        float budget = 72.7f;
        enum TransportMode {
            TAXI,
            TRAIN,
            BUS,
            WALK
        }

        TransportMode mode = TransportMode.WALK;
        int actualbudget=(int) budget;
        if (actualbudget >= 100){
            mode =TransportMode.TAXI;
            System.out.println("ride taxi");
        } else if (actualbudget <100 &&  actualbudget>=50 ){
            mode =TransportMode.TRAIN;
            System.out.println("ride train");
        } else if (actualbudget <50 && actualbudget >=20 ){
            mode =TransportMode.BUS;
            System.out.println("ride BUS");
        } else {
            mode = TransportMode.WALK;
            System.out.println("walk");
        }
        // Add code here

        /* 
         * Task 3. Use a switch case to determine the zodiac animal given a number from 1 to 12. (1 - rat, 2 - ox, 3 - tiger, etc.)
         * 
         * Code Challenge: Delcare and use enum for your zodiac
         * 
         */        

        int animalNumber = 7;

        String animalString="";

        switch(animalNumber){
            case 1:
            animalString="Rat";
            break;
            case 2:
            animalString="Ox";
            break;
            case 3:
            animalString="Tiger";
            break;
            case 4:
            animalString="Rabbit";
            break;
            case 5:
            animalString="Dragon";
            break;
            case 6:
            animalString="Snake";
            break;
            case 7:
            animalString="Horse";
            break;
            case 8:
            animalString="Goat";
            break;
            case 9:
            animalString="Pig";
            break;
            case 10:
            animalString="Monkey";
            break;
            case 11:
            animalString="Rooster";
            break;
            case 12:
            animalString="Dog";
            break;
        }

        System.out.println("Zodiac Animal:" + animalString);

        // Add code here
    }
}
