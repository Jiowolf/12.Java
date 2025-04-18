package java_week_1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class challenge_5 {
    public static void main(String[] args){
        try {
            File myObj = new File("chal_5.txt");
            Scanner myReader = new Scanner(myObj);

            String mot = "";

            try{
                Scanner prompt = new Scanner(System.in);
                System.out.println("Enter un mot");
                String temp_mot = prompt.nextLine();
                prompt.close();
                mot = temp_mot;
            }catch(Exception e){
                System.out.println("Un mot .... you had ONE job,.... One");
            }

            int total_count = 0;
            while (myReader.hasNextLine()) {
                String data = myReader.nextLine();
                // System.out.println(data);

                String regex = "[,\\.\\s\\'']";
                String[] arrText = data.split(regex);

                int count = 0;
                for(int i = 0; i < arrText.length ;i++){
                    if(arrText[i].equals(mot)){
                        count++;
                    }
                }
                System.out.println("Il y a " + count +" fois le mot "+ mot + " dans la phrase.");
                total_count = total_count + count;
            }
            System.out.println("Il y a " + total_count +" fois le mot "+ mot + " dans le texte.");
            myReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("Mais ou qu'il est le fichier ?");
        }
    }
}
