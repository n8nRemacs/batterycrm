package com.fasterxml.jackson.core.io;

import java.util.Arrays;

/* compiled from: CharTypes.java */
/* loaded from: classes3.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public static final char[] f341144a;

    /* renamed from: b, reason: collision with root package name */
    public static final byte[] f341145b;

    /* renamed from: c, reason: collision with root package name */
    public static final int[] f341146c;

    /* renamed from: d, reason: collision with root package name */
    public static final int[] f341147d;

    /* renamed from: e, reason: collision with root package name */
    public static final int[] f341148e;

    /* renamed from: f, reason: collision with root package name */
    public static final int[] f341149f;

    /* renamed from: g, reason: collision with root package name */
    public static final int[] f341150g;

    /* renamed from: h, reason: collision with root package name */
    public static final int[] f341151h;

    /* renamed from: i, reason: collision with root package name */
    public static final int[] f341152i;

    /* compiled from: CharTypes.java */
    public static class a {

        /* renamed from: b, reason: collision with root package name */
        public static final a f341153b = new a();

        /* renamed from: a, reason: collision with root package name */
        public final int[][] f341154a = new int[128][];
    }

    static {
        char[] charArray = "0123456789ABCDEF".toCharArray();
        f341144a = charArray;
        int length = charArray.length;
        f341145b = new byte[length];
        for (int i12 = 0; i12 < length; i12++) {
            f341145b[i12] = (byte) f341144a[i12];
        }
        int[] iArr = new int[256];
        for (int i13 = 0; i13 < 32; i13++) {
            iArr[i13] = -1;
        }
        iArr[34] = 1;
        iArr[92] = 1;
        f341146c = iArr;
        int length2 = iArr.length;
        int[] iArr2 = new int[length2];
        System.arraycopy(iArr, 0, iArr2, 0, length2);
        for (int i14 = 128; i14 < 256; i14++) {
            iArr2[i14] = (i14 & 224) == 192 ? 2 : (i14 & 240) == 224 ? 3 : (i14 & 248) == 240 ? 4 : -1;
        }
        f341147d = iArr2;
        int[] iArr3 = new int[256];
        Arrays.fill(iArr3, -1);
        for (int i15 = 33; i15 < 256; i15++) {
            if (Character.isJavaIdentifierPart((char) i15)) {
                iArr3[i15] = 0;
            }
        }
        iArr3[64] = 0;
        iArr3[35] = 0;
        iArr3[42] = 0;
        iArr3[45] = 0;
        iArr3[43] = 0;
        f341148e = iArr3;
        int[] iArr4 = new int[256];
        System.arraycopy(iArr3, 0, iArr4, 0, 256);
        Arrays.fill(iArr4, 128, 128, 0);
        f341149f = iArr4;
        int[] iArr5 = new int[256];
        int[] iArr6 = f341147d;
        System.arraycopy(iArr6, 128, iArr5, 128, 128);
        Arrays.fill(iArr5, 0, 32, -1);
        iArr5[9] = 0;
        iArr5[10] = 10;
        iArr5[13] = 13;
        iArr5[42] = 42;
        f341150g = iArr5;
        int[] iArr7 = new int[256];
        System.arraycopy(iArr6, 128, iArr7, 128, 128);
        Arrays.fill(iArr7, 0, 32, -1);
        iArr7[32] = 1;
        iArr7[9] = 1;
        iArr7[10] = 10;
        iArr7[13] = 13;
        iArr7[47] = 47;
        iArr7[35] = 35;
        int[] iArr8 = new int[128];
        for (int i16 = 0; i16 < 32; i16++) {
            iArr8[i16] = -1;
        }
        iArr8[34] = 34;
        iArr8[92] = 92;
        iArr8[8] = 98;
        iArr8[9] = 116;
        iArr8[12] = 102;
        iArr8[10] = 110;
        iArr8[13] = 114;
        f341151h = iArr8;
        int[] iArr9 = new int[256];
        f341152i = iArr9;
        Arrays.fill(iArr9, -1);
        for (int i17 = 0; i17 < 10; i17++) {
            f341152i[i17 + 48] = i17;
        }
        for (int i18 = 0; i18 < 6; i18++) {
            int[] iArr10 = f341152i;
            int i19 = i18 + 10;
            iArr10[i18 + 97] = i19;
            iArr10[i18 + 65] = i19;
        }
    }

    public static int[] a(int i12) {
        int[] iArr = f341151h;
        if (i12 == 34) {
            return iArr;
        }
        int[][] iArr2 = a.f341153b.f341154a;
        int[] iArrCopyOf = iArr2[i12];
        if (iArrCopyOf == null) {
            iArrCopyOf = Arrays.copyOf(iArr, 128);
            if (iArrCopyOf[i12] == 0) {
                iArrCopyOf[i12] = -1;
            }
            iArr2[i12] = iArrCopyOf;
        }
        return iArrCopyOf;
    }
}
