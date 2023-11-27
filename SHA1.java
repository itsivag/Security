import java.math.BigInteger;
import java.security.*;

public class SHA1 {

    public static void main(String[] args) throws NoSuchAlgorithmException {
        MessageDigest md = MessageDigest.getInstance("SHA-1");
        byte[] msg = md.digest("Plain Text".getBytes());

        BigInteger no = new BigInteger(1, msg);

        // Convert message digest into hex value
        String hashtext = no.toString(16);

        // Add preceding 0s to make it 32 bit
        while (hashtext.length() < 32) {
            hashtext = "0" + hashtext;
        }

        System.out.println("Hash value obtained : " + hashtext);
    }
}
