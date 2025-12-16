package S01;

import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;

/* loaded from: classes7.dex */
public class b {
    public static byte[] a(int i12) {
        byte[] bArr = new byte[i12];
        try {
            SecureRandom.getInstanceStrong().nextBytes(bArr);
            return bArr;
        } catch (NoSuchAlgorithmException unused) {
            return new byte[0];
        }
    }

    public static String b(int i12) {
        return c.a(a(i12));
    }
}
