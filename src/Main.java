/*

 */


//import java.util.Scanner;
//public class Main {
//    static String ShuffleString(String word , int[] index){
//        char[] string = new char[index.length];
//        for (int start = 0; start < word.length(); start++){
//            string[index[start]] = word.charAt(start);
//        }
//        return String.valueOf(string);
//    }
//    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
//        System.out.println("Enter the word :");
//        String word = input.nextLine();
//        System.out.println("Enter the indicies :");
//        int[] indicies = new int[8];
//        System.out.println("Printing the result :");
//        System.out.println(ShuffleString(word , indicies));
//
//
//    }
//}


import java.util.Scanner;

public class Main {
    static String ShuffleString(String word, int[] indices) {
        char[] string = new char[indices.length];
        for (int start = 0; start < word.length(); start++) {
            string[indices[start]] = word.charAt(start);
        }
        return String.valueOf(string);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the word:");
        String word = input.nextLine();
        System.out.println("Enter the indices (separated by spaces):");

        // Read space-separated indices from user input
        String indicesInput = input.nextLine();
        String[] indicesStringArray = indicesInput.split(" ");
        int[] indices = new int[indicesStringArray.length];

        // Convert the input strings to integers
        for (int i = 0; i < indicesStringArray.length; i++) {
            indices[i] = Integer.parseInt(indicesStringArray[i]);
        }

        System.out.println("Printing the result:");
        System.out.println(ShuffleString(word, indices));
    }
}

