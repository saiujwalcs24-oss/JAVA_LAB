import java.util.*;

class WrongAge extends Exception {
    public WrongAge(String age){
        super(age);
    }
}


class Father {
    int age;
    Father(int age) throws WrongAge {
        if ( age < 0 ){
            throw new WrongAge("age cannot be negative!");
        }
        this.age = age;
    }
}
class Son extends Father{
    int SonAge;
    Son(int sonAge ,int fatherAge) throws WrongAge{
        super(fatherAge);
        if(sonAge > super.age){
            throw new WrongAge("Son's age cannot be more than father's age!");
        }
    }
}
class Main{
    public static void main(String[] args) {
        try{
        Scanner sc = new Scanner(System.in);
        int sonAge ,fatherAge;
        System.out.print("enter father's age: ");
        fatherAge = sc.nextInt();
         Father A = new Father(fatherAge);
        System.out.print("enter son's age: ");
        sonAge = sc.nextInt();


        Son B = new Son(sonAge,fatherAge);
        } 
        catch(WrongAge wa){
            System.out.println(wa);
        }
    }
}



