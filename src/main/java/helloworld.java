package main.java;

public class helloworld {
    public static void main(String[] args) {
        System.out.println("hello World from Amit ");
        System.out.println("This is the output from :" +  getCount());
    }

    private static double getCount(){
        return Math.random() * 10000 ;
    };

}

