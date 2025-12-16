package h01;

/* renamed from: h01.a, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public class C40757a {

    /* renamed from: a, reason: collision with root package name */
    public static final byte[] f396973a = {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 62, -1, -1, -1, 63, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, -1, -1, -1, -1, -1, -1, -1, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, -1, -1, -1, -1, -1, -1, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50, 51, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1};

    public static byte[] a(String str) {
        byte[] bArr;
        int length = str.length();
        int i12 = 0;
        while (true) {
            int length2 = str.length();
            bArr = f396973a;
            if (i12 >= length2) {
                break;
            }
            char cCharAt = str.charAt(i12);
            if (cCharAt > 255 || bArr[cCharAt] < 0) {
                length--;
            }
            i12++;
        }
        int i13 = (length / 4) * 3;
        int i14 = length % 4;
        if (i14 == 3) {
            i13 += 2;
        }
        if (i14 == 2) {
            i13++;
        }
        byte[] bArr2 = new byte[i13];
        int i15 = 0;
        int i16 = 0;
        int i17 = 0;
        for (int i18 = 0; i18 < str.length(); i18++) {
            char cCharAt2 = str.charAt(i18);
            byte b12 = cCharAt2 > 255 ? (byte) -1 : bArr[cCharAt2];
            if (b12 >= 0) {
                int i19 = i17 + 6;
                i16 = (i16 << 6) | b12;
                if (i19 >= 8) {
                    i17 -= 2;
                    bArr2[i15] = (byte) ((i16 >> i17) & 255);
                    i15++;
                } else {
                    i17 = i19;
                }
            }
        }
        return i15 != i13 ? new byte[0] : bArr2;
    }
}
