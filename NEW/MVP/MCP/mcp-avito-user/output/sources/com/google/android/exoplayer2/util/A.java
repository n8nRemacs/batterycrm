package com.google.android.exoplayer2.util;

import java.util.Arrays;

/* compiled from: NalUnitUtil.java */
/* loaded from: classes6.dex */
public final class A {

    /* renamed from: a, reason: collision with root package name */
    public static final byte[] f348026a = {0, 0, 0, 1};

    /* renamed from: b, reason: collision with root package name */
    public static final float[] f348027b = {1.0f, 1.0f, 1.0909091f, 0.90909094f, 1.4545455f, 1.2121212f, 2.1818182f, 1.8181819f, 2.909091f, 2.4242425f, 1.6363636f, 1.3636364f, 1.939394f, 1.6161616f, 1.3333334f, 1.5f, 2.0f};

    /* renamed from: c, reason: collision with root package name */
    public static final Object f348028c = new Object();

    /* renamed from: d, reason: collision with root package name */
    public static int[] f348029d = new int[10];

    /* compiled from: NalUnitUtil.java */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final int f348030a;

        /* renamed from: b, reason: collision with root package name */
        public final boolean f348031b;

        /* renamed from: c, reason: collision with root package name */
        public final int f348032c;

        /* renamed from: d, reason: collision with root package name */
        public final int f348033d;

        /* renamed from: e, reason: collision with root package name */
        public final int[] f348034e;

        /* renamed from: f, reason: collision with root package name */
        public final int f348035f;

        /* renamed from: g, reason: collision with root package name */
        public final float f348036g;

        public a(int i12, boolean z12, int i13, int i14, int[] iArr, int i15, int i16, int i17, float f12) {
            this.f348030a = i12;
            this.f348031b = z12;
            this.f348032c = i13;
            this.f348033d = i14;
            this.f348034e = iArr;
            this.f348035f = i15;
            this.f348036g = f12;
        }
    }

    /* compiled from: NalUnitUtil.java */
    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        public final int f348037a;

        /* renamed from: b, reason: collision with root package name */
        public final boolean f348038b;

        public b(int i12, int i13, boolean z12) {
            this.f348037a = i13;
            this.f348038b = z12;
        }
    }

    /* compiled from: NalUnitUtil.java */
    public static final class c {

        /* renamed from: a, reason: collision with root package name */
        public final int f348039a;

        /* renamed from: b, reason: collision with root package name */
        public final int f348040b;

        /* renamed from: c, reason: collision with root package name */
        public final int f348041c;

        /* renamed from: d, reason: collision with root package name */
        public final int f348042d;

        /* renamed from: e, reason: collision with root package name */
        public final int f348043e;

        /* renamed from: f, reason: collision with root package name */
        public final int f348044f;

        /* renamed from: g, reason: collision with root package name */
        public final float f348045g;

        /* renamed from: h, reason: collision with root package name */
        public final boolean f348046h;

        /* renamed from: i, reason: collision with root package name */
        public final boolean f348047i;

        /* renamed from: j, reason: collision with root package name */
        public final int f348048j;

        /* renamed from: k, reason: collision with root package name */
        public final int f348049k;

        /* renamed from: l, reason: collision with root package name */
        public final int f348050l;

        /* renamed from: m, reason: collision with root package name */
        public final boolean f348051m;

        public c(int i12, int i13, int i14, int i15, int i16, int i17, float f12, boolean z12, boolean z13, int i18, int i19, int i22, boolean z14) {
            this.f348039a = i12;
            this.f348040b = i13;
            this.f348041c = i14;
            this.f348042d = i15;
            this.f348043e = i16;
            this.f348044f = i17;
            this.f348045g = f12;
            this.f348046h = z12;
            this.f348047i = z13;
            this.f348048j = i18;
            this.f348049k = i19;
            this.f348050l = i22;
            this.f348051m = z14;
        }
    }

    public static void a(boolean[] zArr) {
        zArr[0] = false;
        zArr[1] = false;
        zArr[2] = false;
    }

    public static int b(byte[] bArr, int i12, int i13, boolean[] zArr) {
        int i14 = i13 - i12;
        C36585a.d(i14 >= 0);
        if (i14 == 0) {
            return i13;
        }
        if (zArr[0]) {
            a(zArr);
            return i12 - 3;
        }
        if (i14 > 1 && zArr[1] && bArr[i12] == 1) {
            a(zArr);
            return i12 - 2;
        }
        if (i14 > 2 && zArr[2] && bArr[i12] == 0 && bArr[i12 + 1] == 1) {
            a(zArr);
            return i12 - 1;
        }
        int i15 = i13 - 1;
        int i16 = i12 + 2;
        while (i16 < i15) {
            byte b12 = bArr[i16];
            if ((b12 & 254) == 0) {
                int i17 = i16 - 2;
                if (bArr[i17] == 0 && bArr[i16 - 1] == 0 && b12 == 1) {
                    a(zArr);
                    return i17;
                }
                i16 -= 2;
            }
            i16 += 3;
        }
        zArr[0] = i14 <= 2 ? !(i14 != 2 ? !(zArr[1] && bArr[i15] == 1) : !(zArr[2] && bArr[i13 + (-2)] == 0 && bArr[i15] == 1)) : bArr[i13 + (-3)] == 0 && bArr[i13 + (-2)] == 0 && bArr[i15] == 1;
        zArr[1] = i14 <= 1 ? zArr[2] && bArr[i15] == 0 : bArr[i13 + (-2)] == 0 && bArr[i15] == 0;
        zArr[2] = bArr[i15] == 0;
        return i13;
    }

    public static a c(int i12, int i13, byte[] bArr) {
        G g12 = new G(bArr, i12 + 2, i13);
        int i14 = 4;
        g12.j(4);
        int iE2 = g12.e(3);
        g12.i();
        int iE3 = g12.e(2);
        boolean zD2 = g12.d();
        int iE4 = g12.e(5);
        int i15 = 0;
        for (int i16 = 0; i16 < 32; i16++) {
            if (g12.d()) {
                i15 |= 1 << i16;
            }
        }
        int i17 = 6;
        int[] iArr = new int[6];
        for (int i18 = 0; i18 < 6; i18++) {
            iArr[i18] = g12.e(8);
        }
        int iE5 = g12.e(8);
        int i19 = 0;
        for (int i22 = 0; i22 < iE2; i22++) {
            if (g12.d()) {
                i19 += 89;
            }
            if (g12.d()) {
                i19 += 8;
            }
        }
        g12.j(i19);
        if (iE2 > 0) {
            g12.j((8 - iE2) * 2);
        }
        g12.f();
        int iF2 = g12.f();
        if (iF2 == 3) {
            g12.i();
        }
        int iF3 = g12.f();
        int iF4 = g12.f();
        if (g12.d()) {
            int iF5 = g12.f();
            int iF6 = g12.f();
            int iF7 = g12.f();
            int iF8 = g12.f();
            iF3 -= (iF5 + iF6) * ((iF2 == 1 || iF2 == 2) ? 2 : 1);
            iF4 -= (iF7 + iF8) * (iF2 == 1 ? 2 : 1);
        }
        int i23 = iF4;
        int i24 = iF3;
        g12.f();
        g12.f();
        int iF9 = g12.f();
        for (int i25 = g12.d() ? 0 : iE2; i25 <= iE2; i25++) {
            g12.f();
            g12.f();
            g12.f();
        }
        g12.f();
        g12.f();
        g12.f();
        g12.f();
        g12.f();
        g12.f();
        if (g12.d() && g12.d()) {
            int i26 = 0;
            while (i26 < i14) {
                int i27 = 0;
                while (i27 < i17) {
                    if (g12.d()) {
                        int iMin = Math.min(64, 1 << ((i26 << 1) + 4));
                        if (i26 > 1) {
                            g12.g();
                        }
                        for (int i28 = 0; i28 < iMin; i28++) {
                            g12.g();
                        }
                    } else {
                        g12.f();
                    }
                    i27 += i26 == 3 ? 3 : 1;
                    i17 = 6;
                }
                i26++;
                i14 = 4;
                i17 = 6;
            }
        }
        g12.j(2);
        if (g12.d()) {
            g12.j(8);
            g12.f();
            g12.f();
            g12.i();
        }
        int iF10 = g12.f();
        boolean zD3 = false;
        int i29 = 0;
        for (int i32 = 0; i32 < iF10; i32++) {
            if (i32 != 0) {
                zD3 = g12.d();
            }
            if (zD3) {
                g12.i();
                g12.f();
                for (int i33 = 0; i33 <= i29; i33++) {
                    if (!g12.d()) {
                        g12.i();
                    }
                }
            } else {
                int iF11 = g12.f();
                int iF12 = g12.f();
                int i34 = iF11 + iF12;
                for (int i35 = 0; i35 < iF11; i35++) {
                    g12.f();
                    g12.i();
                }
                for (int i36 = 0; i36 < iF12; i36++) {
                    g12.f();
                    g12.i();
                }
                i29 = i34;
            }
        }
        if (g12.d()) {
            for (int i37 = 0; i37 < g12.f(); i37++) {
                g12.j(iF9 + 5);
            }
        }
        g12.j(2);
        float f12 = 1.0f;
        if (g12.d()) {
            if (g12.d()) {
                int iE6 = g12.e(8);
                if (iE6 == 255) {
                    int iE7 = g12.e(16);
                    int iE8 = g12.e(16);
                    if (iE7 != 0 && iE8 != 0) {
                        f12 = iE7 / iE8;
                    }
                } else if (iE6 < 17) {
                    f12 = f348027b[iE6];
                }
            }
            if (g12.d()) {
                g12.i();
            }
            if (g12.d()) {
                g12.j(4);
                if (g12.d()) {
                    g12.j(24);
                }
            }
            if (g12.d()) {
                g12.f();
                g12.f();
            }
            g12.i();
            if (g12.d()) {
                i23 *= 2;
            }
        }
        return new a(iE3, zD2, iE4, i15, iArr, iE5, i24, i23, f12);
    }

    /* JADX WARN: Removed duplicated region for block: B:63:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x014c  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x015f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.google.android.exoplayer2.util.A.c d(int r22, int r23, byte[] r24) {
        /*
            Method dump skipped, instructions count: 370
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.util.A.d(int, int, byte[]):com.google.android.exoplayer2.util.A$c");
    }

    public static int e(int i12, byte[] bArr) {
        int i13;
        synchronized (f348028c) {
            int i14 = 0;
            int i15 = 0;
            while (i14 < i12) {
                while (true) {
                    if (i14 >= i12 - 2) {
                        i14 = i12;
                        break;
                    }
                    try {
                        if (bArr[i14] == 0 && bArr[i14 + 1] == 0 && bArr[i14 + 2] == 3) {
                            break;
                        }
                        i14++;
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                if (i14 < i12) {
                    int[] iArr = f348029d;
                    if (iArr.length <= i15) {
                        f348029d = Arrays.copyOf(iArr, iArr.length * 2);
                    }
                    f348029d[i15] = i14;
                    i14 += 3;
                    i15++;
                }
            }
            i13 = i12 - i15;
            int i16 = 0;
            int i17 = 0;
            for (int i18 = 0; i18 < i15; i18++) {
                int i19 = f348029d[i18] - i17;
                System.arraycopy(bArr, i17, bArr, i16, i19);
                int i22 = i16 + i19;
                int i23 = i22 + 1;
                bArr[i22] = 0;
                i16 = i22 + 2;
                bArr[i23] = 0;
                i17 += i19 + 3;
            }
            System.arraycopy(bArr, i17, bArr, i16, i13 - i16);
        }
        return i13;
    }
}
