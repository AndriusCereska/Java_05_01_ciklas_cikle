package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	System.out.println("Iveskite eilučių kiekį ir stulpelių kiekį");
	Scanner sc = new Scanner(System.in);
    int eilutes = sc.nextInt();
    int stulpeliai= sc.nextInt();
    for(int i =0; i<eilutes;i++){
        for( int j=0; j<stulpeliai; j++){
            System.out.print("#");

        }System.out.println();
    }
    }
}
