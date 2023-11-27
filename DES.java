import java.security.*;
import javax.crypto.*;

public class DES {
    public static void main(String[] args) throws NoSuchAlgorithmException, NoSuchPaddingException, InvalidKeyException, IllegalBlockSizeException, BadPaddingException {

        SecretKey s = KeyGenerator.getInstance("DES").generateKey();
        Cipher c = Cipher.getInstance("DES/ECB/PKCS5Padding");

        String pt = "Plain Text!";

        //encryption
        c.init(Cipher.ENCRYPT_MODE, s);
        byte[] encryptedBytes = c.doFinal(pt.getBytes());
        System.out.println("Encrypted Text => " + new String(encryptedBytes) + '\n');

        //decryption
        c.init(Cipher.DECRYPT_MODE, s);
        byte[] decryptedBytes = c.doFinal(encryptedBytes);
        System.out.println("Decrypted Test => " + new String(decryptedBytes));

    }
}
