public class FizzyPrinter {
    public String printFizzy(int n, boolean toUpperCase) {
        StringBuilder result = new StringBuilder();

        if (n % 3 == 0 && n % 5 == 0 && n % 7 == 0) 
            result.append("Fizzbuzzbang");
         else if (n % 3 == 0 && n % 5 == 0) {
            result.append("Fizzbuzz");
        } else if (n % 3 == 0) {
            result.append("Fizz");
        } else if (n % 5 == 0) {
            result.append("Buzz");
        } else if (n % 7 == 0) {
            result.append("Bang");
        } else {
            result.append("Boom");
        }

        
        if (toUpperCase) {
            return result.toString().toUpperCase();
        }
        else return result.toString();
    }

   
    
}    
