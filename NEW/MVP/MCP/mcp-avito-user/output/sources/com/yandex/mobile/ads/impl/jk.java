package com.yandex.mobile.ads.impl;

import java.util.List;
import java.util.Locale;

/* loaded from: classes8.dex */
public final class jk {

    /* renamed from: a, reason: collision with root package name */
    private static final byte[] f386894a = {0, 0, 0, 1};

    /* renamed from: b, reason: collision with root package name */
    private static final String[] f386895b = {"", "A", "B", "C"};

    public static boolean a(List<byte[]> list) {
        return list.size() == 1 && list.get(0).length == 1 && list.get(0)[0] == 1;
    }

    public static String a(int i12, boolean z12, int i13, int i14, int[] iArr, int i15) {
        Object[] objArr = {f386895b[i12], Integer.valueOf(i13), Integer.valueOf(i14), Character.valueOf(z12 ? 'H' : 'L'), Integer.valueOf(i15)};
        int i16 = pc1.f388768a;
        StringBuilder sb2 = new StringBuilder(String.format(Locale.US, "hvc1.%s%d.%X.%c%d", objArr));
        int length = iArr.length;
        while (length > 0 && iArr[length - 1] == 0) {
            length--;
        }
        for (int i17 = 0; i17 < length; i17++) {
            sb2.append(String.format(".%02X", Integer.valueOf(iArr[i17])));
        }
        return sb2.toString();
    }

    public static byte[] a(byte[] bArr, int i12, int i13) {
        byte[] bArr2 = new byte[i13 + 4];
        System.arraycopy(f386894a, 0, bArr2, 0, 4);
        System.arraycopy(bArr, i12, bArr2, 4, i13);
        return bArr2;
    }
}
