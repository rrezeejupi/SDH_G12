
    public class BeaufortCipherDecrypt {
        public static void main(String[] args) {
          
        public static String decrypt(String ciphertext, String key) {
            StringBuilder plaintext = new StringBuilder();
            ciphertext = ciphertext.toUpperCase();
            key = key.toUpperCase();
    
            int keyIndex = 0;
            for (int i = 0; i < ciphertext.length(); i++) {
                char c = ciphertext.charAt(i);
    
                if (Character.isLetter(c)) {
                    char k = key.charAt(keyIndex % key.length());
    
                    int p = (k - c + 26) % 26;
                    char plainChar = (char) ('A' + p);
                    plaintext.append(plainChar);
    
                    keyIndex++;
                } else {
                    plaintext.append(c);
                }
            }
    
            return plaintext.toString();
        }
    }

}
