// import statements
import java.io.*;
import java.util.*;

public class PriorityQueueLab {
    public static void main(String[]args)
    {
        Scanner scan = null;
        PriorityQueue<Integer> pQueue = new PriorityQueue<Integer>();

        try{
        
        
            //scan file
            scan = new Scanner(new File("RandIntegers.txt"));

            //add ints from scanned file to pqueue
            while(scan.hasNextInt()){
                pQueue.add(scan.nextInt());
            }
        

    
        }catch(FileNotFoundException e){
            System.out.println("yo bih broke for a bit"+ e);
        }catch(Exception e){

            System.out.println("ERROR: "+e);
        }

        while(!pQueue.isEmpty()){
            System.out.println(pQueue.remove() + "\n");
        }
        //System.out.println(pQueue);
}
}

