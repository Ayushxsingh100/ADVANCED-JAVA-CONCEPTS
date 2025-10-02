package CWH_12;

class question2_p0 extends Thread {
    public void run() {
        while (true) {
            try {
                Thread.sleep(10);
            } catch (Exception e) {
                System.out.println(e);
            }
            System.out.println("good morning");
        }
    }
}

class question2_p1 extends Thread {
    public void run() {
        while (true) {
            try {
                Thread.sleep(5000); // Add a sleep here to yield control
            } catch (Exception e) {
                System.out.println(e);
            }
            System.out.println("welcome");
        }
    }
}

public class CWH_12_Q2 {
    public static void main(String[] args) {
        question2_p0 ay = new question2_p0();
        question2_p1 us = new question2_p1();

        ay.start();
        us.start();
    }
}