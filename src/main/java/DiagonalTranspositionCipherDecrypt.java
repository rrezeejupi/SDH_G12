import java.util.Scanner;

public class DiagonalTranspositionCipherDecrypt {

    public static String decrypt(String ciphertext, int columns) {
        int length = ciphertext.length();
        int rows = (int) Math.ceil((double) length / columns);

        char[][] matrix = new char[rows][columns];

        // Track pozicionet ne matrice duke perdorur mbushjen diagonale
        int[][] positions = new int[rows][columns];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                positions[i][j] = -1;
            }
        }

        int count = 0;
        for (int diag = 0; diag < rows + columns - 1; diag++) {
            int row = (diag < columns) ? 0 : diag - columns + 1;
            int col = (diag < columns) ? diag : columns - 1;

            while (row < rows && col >= 0) {
                positions[row][col] = count++;
                row++;
                col--;
            }
        }

        // Mbushja e matrices
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                int pos = positions[i][j];
                if (pos != -1 && pos < ciphertext.length()) {
                    matrix[i][j] = ciphertext.charAt(pos);
                }
            }
        }

        //Leximi i matrices rresht per rresht per rikonstruktimin e palintekstit
        StringBuilder plaintext = new StringBuilder();
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                plaintext.append(matrix[i][j]);
            }
        }

        // Heq karakteret 'X' ne fund
        int lastIndex = plaintext.length() - 1;
        while (lastIndex >= 0 && plaintext.charAt(lastIndex) == 'X') {
            plaintext.deleteCharAt(lastIndex--);
        }

        return plaintext.toString();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter ciphertext: ");
        String ciphertext = scanner.nextLine();

        System.out.print("Enter number of columns: ");
        int columns = scanner.nextInt();

        String decryptedText = decrypt(ciphertext, columns);
        System.out.println("Decrypted Text: " + decryptedText);
    }
}
