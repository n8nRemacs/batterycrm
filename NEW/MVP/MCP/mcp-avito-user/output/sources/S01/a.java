package S01;

import android.annotation.SuppressLint;
import java.io.UnsupportedEncodingException;

/* loaded from: classes7.dex */
public class a {
    @SuppressLint({"NewApi"})
    public static byte[] a(String str, String str2, String str3, byte[] bArr, int i12, boolean z12) throws UnsupportedEncodingException {
        byte[] bArrB = c.b(str);
        byte[] bArrB2 = c.b(str2);
        byte[] bArrB3 = c.b(str3);
        int length = bArrB.length;
        int length2 = bArrB2.length;
        int length3 = bArrB3.length;
        if (length2 < length) {
            length = length2;
        }
        if (length3 >= length) {
            length3 = length;
        }
        if (!(bArr.length >= 16) || !(length3 >= 16)) {
            throw new IllegalArgumentException("key length must be more than 128bit.");
        }
        char[] cArr = new char[length3];
        for (int i13 = 0; i13 < length3; i13++) {
            cArr[i13] = (char) ((bArrB[i13] ^ bArrB2[i13]) ^ bArrB3[i13]);
        }
        return !z12 ? O01.c.a(cArr, bArr, i12 * 8, false) : O01.c.a(cArr, bArr, i12 * 8, true);
    }
}
