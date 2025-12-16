package com.huawei.hms.utils;

/* loaded from: classes7.dex */
public final class HEX {

    /* renamed from: a, reason: collision with root package name */
    public static final char[] f363683a = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};

    /* renamed from: b, reason: collision with root package name */
    public static final char[] f363684b = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};

    public static char[] a(byte[] bArr, char[] cArr) {
        char[] cArr2 = new char[bArr.length << 1];
        int i12 = 0;
        for (byte b12 : bArr) {
            int i13 = i12 + 1;
            cArr2[i12] = cArr[(b12 & 240) >>> 4];
            i12 += 2;
            cArr2[i13] = cArr[b12 & 15];
        }
        return cArr2;
    }

    public static char[] encodeHex(byte[] bArr) {
        return encodeHex(bArr, false);
    }

    public static String encodeHexString(byte[] bArr, boolean z12) {
        return new String(encodeHex(bArr, z12));
    }

    public static char[] encodeHex(byte[] bArr, boolean z12) {
        return a(bArr, z12 ? f363684b : f363683a);
    }
}
