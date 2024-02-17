import java.util.Scanner;

public class StringLength {
    public static void main(String[] args){
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Input Kata/String Pertama : ");
        String A = keyboard.nextLine();
        System.out.println("Input Kata/String Kedua : ");
        String B = keyboard.nextLine();

        int totalPanjang = A.length() + B.length();
        System.out.println("Total Seluruh Karakter : ");
        System.out.println(totalPanjang);

        String hasilBanding = (A.compareTo(B) > 0) ? "Oui" : "No";
        System.out.println("Apakah Karakter Pertama String A lebih besar dibanding String B? ");
        System.out.println(hasilBanding);

        String kapitalA = capitalizeFirstLetter(A);
        String kapitalB = capitalizeFirstLetter(B);
        System.out.println("Hasil Kedua String jika digabungkan : ");
        System.out.println(kapitalA + " " + kapitalB);

        keyboard.close();
    }

    private static String capitalizeFirstLetter(String str){
        if (str == null || str.isEmpty()){
            return str;
        }
        return Character.toUpperCase(str.charAt(0)) + str.substring(1);
    }
}
