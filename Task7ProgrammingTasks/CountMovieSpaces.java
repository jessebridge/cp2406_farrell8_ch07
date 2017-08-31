import java.util.*;
public class CountMovieSpaces {

    public static void main(String[] args) {
        int x, count;
        count = 0;
        Scanner userinput = new Scanner(System.in);
        System.out.println("Enter a movie title ");
        String movietitle = userinput.nextLine();
        int lengthOfMovieTitle = movietitle.length();
        for(x = 0; x < lengthOfMovieTitle;++x){
            if(movietitle.charAt(x)== ' '){
                count+=1;

        }
        }
        System.out.println("there are " + count + " amount of spaces");
    }
}
