import java.util.Scanner;

public class DefineType{
    public static void main(String[] args){
        int count;
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Input the Number: ");
        count = keyboard.nextInt();
        
        String[] countNum = new String[count];

        

        for (int a = 0; a < count; a++) {
            countNum[a] = keyboard.next();
        }

        for (int a = 0; a < count; a++) {
            long longMin = -9223372036854775808L;
            long longMax = 9223372036854775807L;
            int intMin = -2147483648;
            int intMax = 2147483647;
            short shortMin = -32768;
            short shortMax = 32767;
            

            try {
                long parseLong = Long.parseLong(countNum[a]);
                System.out.println(parseLong + " can be fitted in:");
                if (parseLong >= longMin && parseLong <= longMax){
                    System.out.println("long");
                    if (parseLong >= intMin && parseLong<=intMax){
                        System.out.println("int");
                        if (parseLong >= shortMin && parseLong <= shortMax){
                            System.out.println("short");
                        }
                    } 
                }
            } catch (Exception e){
                System.out.println(countNum[a] + " can't be fitted anywhere");
            }
        }

        keyboard.close();
    
}
}