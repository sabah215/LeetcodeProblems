/** 
 * Forward declaration of guess API.
 * @param  num   your guess
 * @return 	     -1 if num is lower than the guess number
 *			      1 if num is higher than the guess number
 *               otherwise return 0
 * int guess(int num);
 */

public class Solution extends GuessGame {
    public int guessNumber(int n) {
            
            int s = 0;
            int e = n-1;
            int m = 0;

        
        while (s <= e){
            
            m = s + (e-s)/2;
                
            if(guess(m) == 0)
                return m;
            
            else if(guess(m) == -1)
                e = m - 1;
            
            else if(guess(m) == 1)
                s = m + 1;
        }
        
   
       return n; 
    }
}