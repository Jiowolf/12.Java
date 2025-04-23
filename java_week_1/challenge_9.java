package java_week_1;

import java.util.Scanner;
import java.io.FileWriter;
import java.io.BufferedWriter;

public class challenge_9 {
    public static void main(String[] args){
    
        String randotoArr = randomaizer(prompt());

        writer(randotoArr);
    }

    public static String randomaizer(int scanNum){
        String[] firstnameArr = {
            "Alice", "Bob", "Charlie", "David", "Emma", "Finn", "Grace", "Henry", "Isla", "Jack",
            "Olivia", "Noah", "Sophia", "Liam", "Ava", "William", "Mia", "James", "Charlotte", "Benjamin",
            "Amelia", "Lucas", "Harper", "Elijah", "Evelyn", "Oliver", "Abigail", "Ethan", "Sofia", "Jackson"
        };

        String[] lastnameArr = {
            "Dupont", "Martin", "Durand", "Lefebvre", "Garcia", "Moreau", "Thomas", "Petit", "Dubois", "Leroy",
            "Michel", "Richard", "Boyer", "Garnier", "Simon", "Bertrand", "Lambert", "Fournier", "Girard", "Bonnet",
            "Rousseau", "Gonzalez", "David", "Moulin", "Vincent", "Boucher", "Marchand", "Blanc", "Rodriguez", "Guerin",
            "Faure", "Perez", "Lacroix", "Brun", "Leclerc", "Renaud", "Meunier", "Andre", "Barbier", "Joly"
        };

        String[] reasonArr = {"Appointment","Visit"};

        String[] departementArr = {
            "Cardiology", "Radiology", "Pediatrics", "Geriatrics", "Pulmonology"
        };

        String csvConstruct = "Firstname, LastName, Reason, Departement, Visite Date \n";


        for(int i = 0; i < scanNum; i++ ){

            String randConstruct = firstnameArr[(int)(Math.random()*29)]+", "+lastnameArr[(int)(Math.random()*39)]+ ", "+reasonArr[(int)(Math.random()*1)]+ ", "+departementArr[(int)(Math.random()*4)]+", "+ (int)(Math.random()*30)+"/03/2025 \n";

            csvConstruct = csvConstruct + randConstruct;
        }

        return csvConstruct;
    }

    public static int prompt(){
        Scanner prompt = new Scanner(System.in);

        while (true) {
            
            System.out.println("entrez le nombre d'entré du tableu voulu.");
            try{
                int nmbPrompt = prompt.nextInt();
                
                prompt.close();
                return nmbPrompt;
                
            }catch(Exception e) {
                System.out.println("Erreur : " + e.getMessage());
                prompt.next();
            }
        }
    }

    public static void writer(String text){
        try {
            FileWriter fw = new FileWriter("challenge_9.csv");
            BufferedWriter writer = new BufferedWriter(fw);
            
            writer.write(text);
            
            writer.close();
        } catch (Exception e) {
            System.out.println("Erreur : " + e.getMessage());
        }
    }
}
