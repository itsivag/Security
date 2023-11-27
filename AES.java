import java.security.*;
import javax.crypto.*;

public class AES {

    public static void main(String[] args) throws NoSuchAlgorithmException, NoSuchPaddingException, InvalidKeyException, IllegalBlockSizeException, BadPaddingException {

        SecretKey s = KeyGenerator.getInstance("AES").generateKey();
        Cipher c = Cipher.getInstance("AES/ECB/PKCS5Padding");

        String pt = "Plain Text!";

        //encryption
        c.init(Cipher.ENCRYPT_MODE, s);
        byte[] encryptedText = c.doFinal(pt.getBytes());
        System.out.println("Encrypted Text => " + new String(encryptedText));

        //decryption
        c.init(Cipher.DECRYPT_MODE, s);
        byte[] decryptedText = c.doFinal(encryptedText);
        System.out.println("Decrypted Text => " + new String(decryptedText));
    }
}
