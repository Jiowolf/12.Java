package java_week_1;

public class challenge_4 {
    public static void main(String[] args){
        int arr_lenght = 8;
        int arr_max = 255;
        int arr_min = 0;
        int[] arr = new int [arr_lenght];
        int random = (int)(Math.random() * arr_max+1);

        for(int i = 0;i < arr_lenght; i++){
            arr.add(random);
        }


    }


}
