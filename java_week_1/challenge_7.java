package java_week_1;

import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.io.BufferedReader;
import java.util.Scanner;

public class challenge_7 {
    public static void main(String[] args){
        List<List<String>> arrClass = arrCreate();

        System.out.println(arrClass.get(0));
    }
    
    private static List<List<String>> arrCreate(){
        List<List<String>> classArr = new ArrayList<>();
        try {
    
            File file = new File("challege_7.csv");
            BufferedReader reader = new BufferedReader(new FileReader(file));
    
            String line;
            while ((line = reader.readLine()) != null) {
                
                String[] values = line.split(",");
                classArr.add(Arrays.asList(values));
                
            }
            
            reader.close();
        } catch(Exception e) {
            System.out.println("Erreur : " + e.getMessage());
        }
        
        // System.out.println(classArr);
        return classArr; 

    }

}
