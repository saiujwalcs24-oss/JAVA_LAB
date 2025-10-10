import java.util.*; 

class quadratic{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter values of a : ");
        Double a = sc.nextDouble();

        System.out.println("Enter values of b : ");
        Double b = sc.nextDouble();

        System.out.println("Enter values of c : ");
        Double c = sc.nextDouble();

        Double discriminant = b*b - 4*a*c;

        if ( discriminant > 0 )
        {
            Double root_one = (-b + Math.sqrt(discriminant) ) / (2*a) ;
            Double root_two = (-b - Math.sqrt(discriminant) ) / (2*a) ;
            
            System.out.println("The roots of quadratic equation " + root_one + " and " + root_two);

        } else if (discriminant == 0){
            Double root_one = -b  / (2*a) ;
            Double root_two = -b / (2*a) ;
            
            System.out.println("The roots of quadratic equation " + root_one + " and " + root_two); 
        } else {
            Double real_part = - b / (2*a) ;
            Double imaginary_part =  ( Math.sqrt(-discriminant) / 2*a )  ;
            System.out.println("The imaginary roots of equation are " + real_part + " + " + imaginary_part + "i" + " and " + real_part + " - " 
            + imaginary_part + "i"
    );
        }
        
    }
}