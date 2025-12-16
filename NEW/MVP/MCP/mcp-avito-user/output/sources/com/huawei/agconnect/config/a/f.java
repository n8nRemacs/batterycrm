package com.huawei.agconnect.config.a;

/* loaded from: classes7.dex */
public class f {

    /* renamed from: a, reason: collision with root package name */
    public static final char[] f363151a = "0123456789ABCDEF".toCharArray();

    public static String a(byte[] bArr) {
        StringBuilder sb2 = new StringBuilder(bArr.length * 2);
        for (byte b12 : bArr) {
            char[] cArr = f363151a;
            sb2.append(cArr[(b12 >> 4) & 15]);
            sb2.append(cArr[b12 & 15]);
        }
        return sb2.toString();
    }

    public static byte[] b(String str) {
        char[] charArray = str.toCharArray();
        if ((charArray.length & 1) != 0) {
            throw new IllegalArgumentException("Odd number of characters.");
        }
        byte[] bArr = new byte[charArray.length >> 1];
        int i12 = 0;
        int i13 = 0;
        while (i12 < charArray.length) {
            int iDigit = Character.digit(charArray[i12], 16);
            if (iDigit == -1) {
                throw new IllegalArgumentException(AK.c.g(i12, "Illegal hexadecimal character at index "));
            }
            int i14 = i12 + 1;
            int iDigit2 = Character.digit(charArray[i14], 16);
            if (iDigit2 == -1) {
                throw new IllegalArgumentException(AK.c.g(i14, "Illegal hexadecimal character at index "));
            }
            i12 += 2;
            bArr[i13] = (byte) (((iDigit << 4) | iDigit2) & 255);
            i13++;
        }
        return bArr;
    }
}
