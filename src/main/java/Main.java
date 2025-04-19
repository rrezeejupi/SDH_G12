import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String choice;

        while (true) {
            System.out.println("\n📜 Choose an option:");
            System.out.println("1. Encrypt with Beaufort Cipher");
            System.out.println("2. Decrypt with Beaufort Cipher");
            System.out.println("3. Encrypt with Diagonal Transposition Cipher");
            System.out.println("4. Decrypt with Diagonal Transposition Cipher");
            System.out.println("X. Exit");
            System.out.print("Your choice: ");
            choice = scanner.nextLine().trim().toUpperCase();

            if (choice.equals("X")) {
                System.out.println("Exiting... Goodbye!");
                break;
            }

            String plaintext, key;

            switch (choice) {
                case "1":
                    System.out.print("Enter plaintext: ");
                    plaintext = scanner.nextLine();
                    System.out.print("Enter key: ");
                    key = scanner.nextLine();
                    String encryptedBeaufort = BeaufortCipher.encrypt(plaintext, key);
                    System.out.println("Encrypted (Beaufort): " + encryptedBeaufort);
                    break;

                case "2":
                    System.out.print("Enter ciphertext: ");
                    plaintext = scanner.nextLine();
                    System.out.print("Enter key: ");
                    key = scanner.nextLine();
//                    String decryptedBeaufort = BeaufortCipher.decrypt(plaintext, key);
//                    System.out.println("Decrypted (Beaufort): " + decryptedBeaufort);
                    break;

                case "3":
                    System.out.print("Enter plaintext: ");
                    plaintext = scanner.nextLine();
                    System.out.print("Enter key (a number): ");
                    int numKeyEncrypt = Integer.parseInt(scanner.nextLine());
                    String encryptedTransposition = DiagonalTranspositionCipher.encrypt(plaintext, numKeyEncrypt);
                    System.out.println("Encrypted (Transposition): " + encryptedTransposition);
                    break;

                case "4":
                    System.out.print("Enter ciphertext: ");
                    plaintext = scanner.nextLine();
                    System.out.print("Enter key (a number): ");
                    int numKeyDecrypt = Integer.parseInt(scanner.nextLine());
//                    String decryptedTransposition = DiagonalTranspositionCipher.decrypt(plaintext, numKeyDecrypt);
//                    System.out.println("Decrypted (Transposition): " + decryptedTransposition);
                    break;

                default:
                    System.out.println("Invalid choice. Try again.");
            }
        }

        scanner.close();
    }
}
