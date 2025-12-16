package com.facebook.common.util;

import com.facebook.infer.annotation.Nullsafe;

/* compiled from: Hex.java */
@Nullsafe
/* loaded from: classes5.dex */
public class c {

    /* renamed from: a, reason: collision with root package name */
    public static final char[] f339865a = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};

    /* renamed from: b, reason: collision with root package name */
    public static final char[] f339866b = new char[256];

    /* renamed from: c, reason: collision with root package name */
    public static final char[] f339867c = new char[256];

    /* renamed from: d, reason: collision with root package name */
    public static final byte[] f339868d;

    static {
        for (int i12 = 0; i12 < 256; i12++) {
            char[] cArr = f339866b;
            char[] cArr2 = f339865a;
            cArr[i12] = cArr2[(i12 >> 4) & 15];
            f339867c[i12] = cArr2[i12 & 15];
        }
        f339868d = new byte[103];
        for (int i13 = 0; i13 <= 70; i13++) {
            f339868d[i13] = -1;
        }
        for (byte b12 = 0; b12 < 10; b12 = (byte) (b12 + 1)) {
            f339868d[b12 + 48] = b12;
        }
        for (byte b13 = 0; b13 < 6; b13 = (byte) (b13 + 1)) {
            byte[] bArr = f339868d;
            byte b14 = (byte) (b13 + 10);
            bArr[b13 + 65] = b14;
            bArr[b13 + 97] = b14;
        }
    }
}
