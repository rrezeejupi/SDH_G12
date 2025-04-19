public class BeaufortCipher {

    public static String encrypt(String plaintext, String key) {
        StringBuilder ciphertext = new StringBuilder();
        plaintext = plaintext.toUpperCase();
        key = key.toUpperCase();

        int keyIndex = 0;
        for (int i = 0; i < plaintext.length(); i++) {
            char p = plaintext.charAt(i);

            if (Character.isLetter(p)) {
                char k = key.charAt(keyIndex % key.length());

                int c = (k - p + 26) % 26;
                char cipherChar = (char) ('A' + c);
                ciphertext.append(cipherChar);

                keyIndex++;
            } else {
                ciphertext.append(p);
            }
        }

        return ciphertext.toString();
    }
}
