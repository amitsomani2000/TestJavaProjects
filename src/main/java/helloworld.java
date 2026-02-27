package main.java;

public class helloworld {
    public static void main(String[] args) {
        System.out.println("hello World from Amit ");
        System.out.println("This is the output from :" +  getCount());
        System.out.println("=================");
        System.out.println("I am Currently Phase 2: " + getPhase()); 
    }

    private static double getCount(){
        return Math.random() * 10000 ;
    };

    private static String getPhase(){
        return "phase2";
    }
}

