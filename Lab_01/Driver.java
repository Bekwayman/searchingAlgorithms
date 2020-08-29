package Lab_01;
import java.io.*;
import java.util.*;

public class Driver{
    public static void main(String args[]){
        Random rand = new Random();
        int keys[];
        keys = new int[1000];  
        int x = 0;
        int count = 0;
        File numberFile = new File("./input_1000.txt");

        try(Scanner readFile = new Scanner(numberFile)) {
            while(readFile.hasNextInt()){
                x = readFile.nextInt();
                keys[count] = x;
                count++;
            }
            readFile.close();
            //Arrays.sort(array);
        } catch (Exception e) {
            e.printStackTrace(System.err);
        }

        int array2[];
        array2 = new int[33554432]; 
        
        int n=16;
        long startTime;
        long endTime;
        long duration;

        while((Math.log(n) / Math.log(2)) <= 25){
            for(int i=0;i<n;i++){
                array2[i] = rand.nextInt(n+1);
            }

            //Linear search in array

            startTime = System.nanoTime();
            searchAlgorithm.linearSearch(array2, keys, n-1);
            endTime = System.nanoTime();
            duration = (endTime - startTime)/1000000;

            System.out.println("linear search for array size of "+ n +" took: " + duration + "ms");
            Arrays.sort(array2);

            //Binary search in array size 16

            startTime = System.nanoTime();
            searchAlgorithm.binarySearch(array2, 0, n-1, keys);
            endTime = System.nanoTime();
            duration = (endTime - startTime)/1000000;

            System.out.println("binary search for array size of "+ n +" took: " + duration + "ms");
            System.out.println("________________________________________________________________");
            n=n*2;
        }





/*
        for(int i=0;i<array2.length;i++)
        {
            array2[i] = rand.nextInt(n);
        }

        //Linear search in array size 16

        long startTime = System.nanoTime();
        searchAlgorithm.linearSearch(array2, keys, n);
        long endTime = System.nanoTime();
        long duration = (endTime - startTime)/1000000;

        System.out.println("linear search for array size of "+ n +" took: " + duration + "ms");
        Arrays.sort(array2);

        //Binary search in array size 16

        startTime = System.nanoTime();
        searchAlgorithm.binarySearch(array2, 0, n, keys);
        endTime = System.nanoTime();
        duration = (endTime - startTime)/1000000;

        System.out.println("binary search for array size of "+ n +" took: " + duration + "ms");

        
        System.out.println("________________________________________________________________");
        //Linear search in array size 32
        n=n*2;
        startTime = System.nanoTime();
        searchAlgorithm.linearSearch(array2, keys, n);
        endTime = System.nanoTime();
        duration = (endTime - startTime)/1000000;

        System.out.println("linear search for array size of "+ n +" took: " + duration + "ms");
        Arrays.sort(array2);

        //Binary search in array size 32

        startTime = System.nanoTime();
        searchAlgorithm.binarySearch(array2, 0, n, keys);
        endTime = System.nanoTime();
        duration = (endTime - startTime)/1000000;

        System.out.println("binary search for array size of "+ n +" took: " + duration + "ms");
        */
    }
}