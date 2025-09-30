package CWH_11;
 // creating a class monkey with methods -> jump() , bite() ...... 
 // creating the class human that inherits monkey class .......
 // creating a interface basicanimal that implements monkey class .....
 // use polymorphism 
     class monkey{
        // both methods 

        void jump(){
            System.out.println("monkey is jumping");

        }

        void bite(){
            System.out.println(" monkey is biting ");
        }
        
    }

    interface basicanimal{
        void eat();
        void sleep();
    }

    class human extends monkey implements basicanimal{

       public void eat(){
        System.out.println("eating");
       };
        public void sleep(){
            System.out.println("sleeping");
        };
        void read(){
            System.out.println("reading !");
        }
    }

public class cwh_11_q2 {
     public static void main(String[] args) {
        // before applying polymorphism 
        human ayush = new human();
        ayush.eat();
        ayush.sleep();
        ayush.bite();
        ayush.jump();
        ayush.read();

        monkey M = new human();
        // M is an object of human but made as a reference of monkey 
        // conclusion --> so M cant use the methods of human that are not is monkey

        M.bite();
        M.jump();
        
     }

}
