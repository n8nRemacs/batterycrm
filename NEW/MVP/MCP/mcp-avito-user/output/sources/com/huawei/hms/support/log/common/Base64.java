package com.huawei.hms.support.log.common;

/* loaded from: classes7.dex */
public final class Base64 {

    /* renamed from: a, reason: collision with root package name */
    public static final char[] f363655a = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', '+', '/', '='};

    /* renamed from: b, reason: collision with root package name */
    public static final byte[] f363656b = {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 62, -1, -1, -1, 63, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, -1, -1, -1, -1, -1, -1, -1, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, -1, -1, -1, -1, -1, -1, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50, 51, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1};

    public static int a(String str) {
        int length = str.length();
        for (int i12 = 0; i12 < str.length(); i12++) {
            char cCharAt = str.charAt(i12);
            if (cCharAt > 255 || f363656b[cCharAt] < 0) {
                length--;
            }
        }
        return length;
    }

    public static byte[] decode(String str) {
        int iA2 = a(str);
        int i12 = (iA2 / 4) * 3;
        int i13 = iA2 % 4;
        if (i13 == 3) {
            i12 += 2;
        }
        if (i13 == 2) {
            i12++;
        }
        byte[] bArr = new byte[i12];
        int i14 = 0;
        int i15 = 0;
        int i16 = 0;
        for (int i17 = 0; i17 < str.length(); i17++) {
            char cCharAt = str.charAt(i17);
            byte b12 = cCharAt > 255 ? (byte) -1 : f363656b[cCharAt];
            if (b12 >= 0) {
                int i18 = i16 + 6;
                i15 = (i15 << 6) | b12;
                if (i18 >= 8) {
                    i16 -= 2;
                    bArr[i14] = (byte) (255 & (i15 >> i16));
                    i14++;
                } else {
                    i16 = i18;
                }
            }
        }
        return i14 != i12 ? new byte[0] : bArr;
    }

    public static String encode(byte[] bArr) {
        return encode(bArr, bArr.length);
    }

    public static String encode(byte[] bArr, int i12) {
        boolean z12;
        char[] cArr = new char[((i12 + 2) / 3) * 4];
        int i13 = 0;
        int i14 = 0;
        while (i13 < i12) {
            int i15 = (bArr[i13] & 255) << 8;
            int i16 = i13 + 1;
            boolean z13 = true;
            if (i16 < i12) {
                i15 |= bArr[i16] & 255;
                z12 = true;
            } else {
                z12 = false;
            }
            int i17 = i15 << 8;
            int i18 = i13 + 2;
            if (i18 < i12) {
                i17 |= bArr[i18] & 255;
            } else {
                z13 = false;
            }
            int i19 = i14 + 3;
            char[] cArr2 = f363655a;
            int i22 = 64;
            cArr[i19] = cArr2[z13 ? i17 & 63 : 64];
            int i23 = i17 >> 6;
            int i24 = i14 + 2;
            if (z12) {
                i22 = i23 & 63;
            }
            cArr[i24] = cArr2[i22];
            cArr[i14 + 1] = cArr2[(i17 >> 12) & 63];
            cArr[i14] = cArr2[(i17 >> 18) & 63];
            i13 += 3;
            i14 += 4;
        }
        return new String(cArr);
    }
}
