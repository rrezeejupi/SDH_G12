import java.util.Scanner;


public class DiagonalTranspositionCipher {

    // Encrypt the plaintext using diagonal transposition cipher
    public static String encrypt(String plaintext, int columns) {
        // Keep spaces and convert to uppercase
        plaintext = plaintext.toUpperCase();

        int length = plaintext.length();
        int rows = (int) Math.ceil((double) length / columns);

        // Fill the matrix
        char[][] matrix = new char[rows][columns];
        int index = 0;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                if (index < length) {
                    matrix[i][j] = plaintext.charAt(index++);
                } else {
                    matrix[i][j] = 'X'; // Padding character
                }
            }
        }

        // Diagonal read (top-left to bottom-right)
        StringBuilder ciphertext = new StringBuilder();
        for (int diag = 0; diag < rows + columns - 1; diag++) {
            int row = (diag < columns) ? 0 : diag - columns + 1;
            int col = (diag < columns) ? diag : columns - 1;

            while (row < rows && col >= 0) {
                ciphertext.append(matrix[row][col]);
                row++;
                col--;
            }
        }

        return ciphertext.toString();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter plaintext: ");
        String plaintext = scanner.nextLine();

        System.out.print("Enter number of columns: ");
        int columns = scanner.nextInt();

        String encrypted = encrypt(plaintext, columns);
        System.out.println("Encrypted Text: " + encrypted);
    }
}