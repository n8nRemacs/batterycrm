package com.huawei.updatesdk.a.a.d;

/* loaded from: classes7.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    private static char[] f363755a = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', '+', '/', '='};

    public static String a(byte[] bArr) {
        return a(bArr, bArr.length);
    }

    public static String a(byte[] bArr, int i12) {
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
            char[] cArr2 = f363755a;
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
        return String.valueOf(cArr);
    }
}
