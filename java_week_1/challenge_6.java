package java_week_1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class challenge_6 {
    public static void main(String[] args){
        int total_count = 0;
        char lettre = ' ';
        try {
            File myObj = new File("chal_5.txt");
            Scanner myReader = new Scanner(myObj);

            try{
                Scanner prompt = new Scanner(System.in);
                System.out.println("Enter une lettre");
                String temp_letter = prompt.nextLine();
                prompt.close();
                lettre = temp_letter.charAt(0);
            }catch(Exception e){
                System.out.println("Une lettre .... juste une lettre bon dieu, tiens voila le nombre d'espace alors");
            }
            
            while (myReader.hasNextLine()) {
                String data = myReader.nextLine();
                // System.out.println(data);
                int count = 0;
                
                int index = data.indexOf(lettre);
                while (index > 0) {
                    count++;
                    index = data.indexOf(lettre, index + 1 );
                }
                System.out.println("Il y a " + count +" "+ lettre + " dans la phrase.");
                total_count = total_count+count;
            }
            
            System.out.println("Il y a " + total_count +" "+ lettre + " dans le texte.");
            myReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("Mais ou qu'il est le fichier ?");
        }
    }
}