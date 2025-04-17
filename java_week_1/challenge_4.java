package java_week_1;

import java.util.Arrays;
import java.util.Scanner;

public class challenge_4 {
    public static void main(String[] args){
        int arr_length = 6;
        try {
        Scanner temp_arr_length = new Scanner(System.in);
        System.out.println("Enter max arr lenght");
        arr_length = temp_arr_length.nextInt();
        temp_arr_length.close();
        } catch (Exception e) {
        System.out.println("that's not a number, the array length's gonna be 6 So");
        }
        
        // int arr_length = 8;
        int arr_max = 255;
        // int arr_min = 0;
        int[] arr = new int [arr_length];
        // int[] temp_arr = {6,2,0,8};

        for(int i = 0;i < arr.length; i++){
            arr[i] = (int)(Math.random() * (arr_max+1));
        }

        for(int j = 0; j < arr.length; j++){
            try{
                if(j==0){
                    System.out.println(arr[0]/arr[0]);
                }else{
                    System.out.println(arr[j]/arr[j-1]);
                }
            }catch(Exception e){
                System.out.println("HAAAAAAAAAAAAA! Comment ça diviser par 0? You FOOL!");
            }
        }

        System.out.println(Arrays.toString(arr));
    }


}
