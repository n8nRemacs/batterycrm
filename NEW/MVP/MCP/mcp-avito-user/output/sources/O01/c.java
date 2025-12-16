package O01;

import java.security.NoSuchAlgorithmException;
import java.security.spec.InvalidKeySpecException;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.PBEKeySpec;

/* loaded from: classes7.dex */
public abstract class c {
    public static byte[] a(char[] cArr, byte[] bArr, int i12, boolean z12) {
        try {
            return (z12 ? SecretKeyFactory.getInstance("PBKDF2WithHmacSHA256") : SecretKeyFactory.getInstance("PBKDF2WithHmacSHA1")).generateSecret(new PBEKeySpec(cArr, bArr, 10000, i12)).getEncoded();
        } catch (NoSuchAlgorithmException e12) {
            e = e12;
            e.getMessage();
            return new byte[0];
        } catch (InvalidKeySpecException e13) {
            e = e13;
            e.getMessage();
            return new byte[0];
        }
    }
}
