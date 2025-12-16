package RW0;

import com.facebook.infer.annotation.Nullsafe;
import java.io.UnsupportedEncodingException;

/* compiled from: ImageFormatCheckerUtils.java */
@Nullsafe
/* loaded from: classes10.dex */
public class e {
    public static byte[] a(String str) {
        try {
            return str.getBytes("ASCII");
        } catch (UnsupportedEncodingException e12) {
            throw new RuntimeException("ASCII not found!", e12);
        }
    }

    public static boolean b(byte[] bArr, byte[] bArr2, int i12) {
        bArr2.getClass();
        if (bArr2.length + i12 > bArr.length) {
            return false;
        }
        for (int i13 = 0; i13 < bArr2.length; i13++) {
            if (bArr[i12 + i13] != bArr2[i13]) {
                return false;
            }
        }
        return true;
    }
}
