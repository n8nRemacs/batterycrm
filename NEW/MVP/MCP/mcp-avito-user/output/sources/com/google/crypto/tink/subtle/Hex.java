package com.google.crypto.tink.subtle;

/* loaded from: classes6.dex */
public final class Hex {
    private Hex() {
    }

    public static byte[] decode(String str) {
        if (str.length() % 2 != 0) {
            throw new IllegalArgumentException("Expected a string of even length");
        }
        int length = str.length() / 2;
        byte[] bArr = new byte[length];
        for (int i12 = 0; i12 < length; i12++) {
            int i13 = i12 * 2;
            int iDigit = Character.digit(str.charAt(i13), 16);
            int iDigit2 = Character.digit(str.charAt(i13 + 1), 16);
            if (iDigit == -1 || iDigit2 == -1) {
                throw new IllegalArgumentException("input is not hexadecimal");
            }
            bArr[i12] = (byte) ((iDigit * 16) + iDigit2);
        }
        return bArr;
    }

    public static String encode(byte[] bArr) {
        StringBuilder sb2 = new StringBuilder(bArr.length * 2);
        for (byte b12 : bArr) {
            int i12 = b12 & 255;
            sb2.append("0123456789abcdef".charAt(i12 / 16));
            sb2.append("0123456789abcdef".charAt(i12 % 16));
        }
        return sb2.toString();
    }
}
