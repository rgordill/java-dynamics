package com.sample.java;

/**
 * Hello world!
 *
 */
public class Sleep 
{
    public static void main( String[] args ) throws InterruptedException
    {
        System.out.println( "Starting Sleep loop" );

        while(true){
            Thread.sleep(1000);
        }
    }
}
