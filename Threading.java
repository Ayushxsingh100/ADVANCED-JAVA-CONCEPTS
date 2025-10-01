package CWH_12;
 
// q1.) write a program to print "good morning and welcome " continiously
// on the screen in java using thread.

class question1 extends Thread{
 public void run(){
    while(true){
        System.out.println("good morning");
    }
 }
}

class question2 extends Thread{
 public void run(){
    while(true){
        System.out.println("welcome");
    }
 }
}

public class CWH_12_Q1 {
public static void main(String[] args) {
    question1 p1 = new question1();
    question2 p2 = new question2();
     p1.start();
     p2.start();

}
}
