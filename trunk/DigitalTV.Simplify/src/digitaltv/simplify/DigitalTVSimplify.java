/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package digitaltv.simplify;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author ebabayan1
 */

public class DigitalTVSimplify {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.print("What is your name: ");
        BufferedReader input;
        try{
            input = new BufferedReader(new InputStreamReader(System.in));
            String message = input.readLine();
            System.out.println("Welcome to Digital TV Broadcasting application: " + message);
        }catch(IOException e){
            System.out.println(e.getMessage());
            System.exit(1);
        }
    }
}
