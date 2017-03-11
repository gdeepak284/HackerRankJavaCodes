/*
 After sailing the ocean for ages, Luffy the Pirate finally found the greatest treasure in the world, known as the One Piece. He wants to return to his village as the Pirate King, but he forgot its coordinates! Fortunately, he has a list containing the sequence of directions he took from his village to the location of the treasure.

Each  consists of some  and  describing the number of units he traveled along the respective and  axes when following . In other words, for each  in the list, Luffy traveled from some position  to position .

Given two long integers describing the One Piece treasure's cartesian coordinates, , and a list of the directions Luffy followed to get there, can you find the location of Luffy's village at ? Once you've located it, print two space-separated long integers describing the respective values of  and  on a new line.

Note: The directions describe the route Luffy took from his village at  to the treasure at  — they do not describe his route home.

Input Format

The first line contains two space-separated long integers describing the respective values of  and  (the location of the treasure). 
The second line contains an integer denoting  (the number of directions in his list). 
Each line  of the  subsequent lines contain two space-separated long integers describing the respective values of  and  for .

Output Format

Print two space-separated long integers describing the respective values of  and  (i.e., the coordinates of Luffy's village).

Sample Input 0

1 1
2
1 0
0 1
Sample Output 0

0 0

 */
package examples;

/**
 *
 * @author deepak
 */
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class BackToTheOrigin {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        long xt = in.nextLong();
        long yt = in.nextLong();
        int n = in.nextInt();
        long[][] direction = new long[n][2];
        for(int i=0; i < n; i++){
            for(int j=0; j < 2; j++){
                direction[i][j] = in.nextLong();
            }
        }
        for(int i=0;i<n;i++){
            xt=xt-direction[i][0];
            yt=yt-direction[i][1];
        }
        System.out.print(xt+" "+yt);
        
    }
}

