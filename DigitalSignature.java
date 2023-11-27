import java.math.BigInteger;
import java.security.*;

public class DigitalSignature {
    public static void main(String[] args) throws NoSuchAlgorithmException, InvalidKeyException, SignatureException {
        KeyPairGenerator key = KeyPairGenerator.getInstance("DSA");
        key.initialize(2048);

        PrivateKey pvtKey = key.generateKeyPair().getPrivate();

        Signature sign = Signature.getInstance("SHA256withDSA");
        sign.initSign(pvtKey);

        byte[] b = "Plain text".getBytes();
        sign.update(b);

        byte[] signature = sign.sign();
        System.out.println(new String(signature));
    }
}
