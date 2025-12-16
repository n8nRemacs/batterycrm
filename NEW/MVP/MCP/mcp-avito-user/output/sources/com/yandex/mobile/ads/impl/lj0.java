package com.yandex.mobile.ads.impl;

import java.util.Arrays;

/* loaded from: classes8.dex */
public final class lj0 {

    /* renamed from: a, reason: collision with root package name */
    public static final byte[] f387520a = {0, 0, 0, 1};

    /* renamed from: b, reason: collision with root package name */
    public static final float[] f387521b = {1.0f, 1.0f, 1.0909091f, 0.90909094f, 1.4545455f, 1.2121212f, 2.1818182f, 1.8181819f, 2.909091f, 2.4242425f, 1.6363636f, 1.3636364f, 1.939394f, 1.6161616f, 1.3333334f, 1.5f, 2.0f};

    /* renamed from: c, reason: collision with root package name */
    private static final Object f387522c = new Object();

    /* renamed from: d, reason: collision with root package name */
    private static int[] f387523d = new int[10];

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final int f387524a;

        /* renamed from: b, reason: collision with root package name */
        public final boolean f387525b;

        /* renamed from: c, reason: collision with root package name */
        public final int f387526c;

        /* renamed from: d, reason: collision with root package name */
        public final int f387527d;

        /* renamed from: e, reason: collision with root package name */
        public final int[] f387528e;

        /* renamed from: f, reason: collision with root package name */
        public final int f387529f;

        /* renamed from: g, reason: collision with root package name */
        public final float f387530g;

        public a(int i12, boolean z12, int i13, int i14, int[] iArr, int i15, int i16, int i17, float f12) {
            this.f387524a = i12;
            this.f387525b = z12;
            this.f387526c = i13;
            this.f387527d = i14;
            this.f387528e = iArr;
            this.f387529f = i15;
            this.f387530g = f12;
        }
    }

    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        public final int f387531a;

        /* renamed from: b, reason: collision with root package name */
        public final int f387532b;

        /* renamed from: c, reason: collision with root package name */
        public final boolean f387533c;

        public b(int i12, int i13, boolean z12) {
            this.f387531a = i12;
            this.f387532b = i13;
            this.f387533c = z12;
        }
    }

    public static final class c {

        /* renamed from: a, reason: collision with root package name */
        public final int f387534a;

        /* renamed from: b, reason: collision with root package name */
        public final int f387535b;

        /* renamed from: c, reason: collision with root package name */
        public final int f387536c;

        /* renamed from: d, reason: collision with root package name */
        public final int f387537d;

        /* renamed from: e, reason: collision with root package name */
        public final int f387538e;

        /* renamed from: f, reason: collision with root package name */
        public final int f387539f;

        /* renamed from: g, reason: collision with root package name */
        public final float f387540g;

        /* renamed from: h, reason: collision with root package name */
        public final boolean f387541h;

        /* renamed from: i, reason: collision with root package name */
        public final boolean f387542i;

        /* renamed from: j, reason: collision with root package name */
        public final int f387543j;

        /* renamed from: k, reason: collision with root package name */
        public final int f387544k;

        /* renamed from: l, reason: collision with root package name */
        public final int f387545l;

        /* renamed from: m, reason: collision with root package name */
        public final boolean f387546m;

        public c(int i12, int i13, int i14, int i15, int i16, int i17, float f12, boolean z12, boolean z13, int i18, int i19, int i22, boolean z14) {
            this.f387534a = i12;
            this.f387535b = i13;
            this.f387536c = i14;
            this.f387537d = i15;
            this.f387538e = i16;
            this.f387539f = i17;
            this.f387540g = f12;
            this.f387541h = z12;
            this.f387542i = z13;
            this.f387543j = i18;
            this.f387544k = i19;
            this.f387545l = i22;
            this.f387546m = z14;
        }
    }

    public static int a(int i12, byte[] bArr) {
        int i13;
        synchronized (f387522c) {
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
                    int[] iArr = f387523d;
                    if (iArr.length <= i15) {
                        f387523d = Arrays.copyOf(iArr, iArr.length * 2);
                    }
                    f387523d[i15] = i14;
                    i14 += 3;
                    i15++;
                }
            }
            i13 = i12 - i15;
            int i16 = 0;
            int i17 = 0;
            for (int i18 = 0; i18 < i15; i18++) {
                int i19 = f387523d[i18] - i17;
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

    /* JADX WARN: Removed duplicated region for block: B:63:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x016e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.yandex.mobile.ads.impl.lj0.c b(byte[] r22, int r23, int r24) {
        /*
            Method dump skipped, instructions count: 379
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.mobile.ads.impl.lj0.b(byte[], int, int):com.yandex.mobile.ads.impl.lj0$c");
    }

    public static a a(byte[] bArr, int i12, int i13) {
        int i14;
        int i15;
        int i16;
        int[] iArr;
        int i17;
        boolean z12;
        int[] iArrCopyOf;
        qr0 qr0Var = new qr0(bArr, i12 + 2, i13);
        int i18 = 4;
        qr0Var.d(4);
        int iB2 = qr0Var.b(3);
        qr0Var.e();
        int iB3 = qr0Var.b(2);
        boolean zB2 = qr0Var.b();
        int iB4 = qr0Var.b(5);
        int i19 = 0;
        for (int i22 = 0; i22 < 32; i22++) {
            if (qr0Var.b()) {
                i19 |= 1 << i22;
            }
        }
        int i23 = 6;
        int[] iArr2 = new int[6];
        for (int i24 = 0; i24 < 6; i24++) {
            iArr2[i24] = qr0Var.b(8);
        }
        int iB5 = qr0Var.b(8);
        int i25 = 0;
        for (int i26 = 0; i26 < iB2; i26++) {
            if (qr0Var.b()) {
                i25 += 89;
            }
            if (qr0Var.b()) {
                i25 += 8;
            }
        }
        qr0Var.d(i25);
        if (iB2 > 0) {
            qr0Var.d((8 - iB2) * 2);
        }
        qr0Var.d();
        int iD2 = qr0Var.d();
        if (iD2 == 3) {
            qr0Var.e();
        }
        int iD3 = qr0Var.d();
        int iD4 = qr0Var.d();
        if (qr0Var.b()) {
            int iD5 = qr0Var.d();
            int iD6 = qr0Var.d();
            int iD7 = qr0Var.d();
            int iD8 = qr0Var.d();
            iD3 -= (iD5 + iD6) * ((iD2 == 1 || iD2 == 2) ? 2 : 1);
            iD4 -= (iD7 + iD8) * (iD2 == 1 ? 2 : 1);
        }
        int i27 = iD4;
        int i28 = iD3;
        qr0Var.d();
        qr0Var.d();
        int iD9 = qr0Var.d();
        for (int i29 = qr0Var.b() ? 0 : iB2; i29 <= iB2; i29++) {
            qr0Var.d();
            qr0Var.d();
            qr0Var.d();
        }
        qr0Var.d();
        qr0Var.d();
        qr0Var.d();
        qr0Var.d();
        qr0Var.d();
        qr0Var.d();
        if (qr0Var.b() && qr0Var.b()) {
            int i32 = 0;
            while (i32 < i18) {
                int i33 = 0;
                while (i33 < i23) {
                    if (!qr0Var.b()) {
                        qr0Var.d();
                    } else {
                        int iMin = Math.min(64, 1 << ((i32 << 1) + 4));
                        if (i32 > 1) {
                            qr0Var.c();
                        }
                        for (int i34 = 0; i34 < iMin; i34++) {
                            qr0Var.c();
                        }
                    }
                    i33 += i32 == 3 ? 3 : 1;
                    i23 = 6;
                }
                i32++;
                i18 = 4;
                i23 = 6;
            }
        }
        qr0Var.d(2);
        if (qr0Var.b()) {
            qr0Var.d(8);
            qr0Var.d();
            qr0Var.d();
            qr0Var.e();
        }
        int iD10 = qr0Var.d();
        int[] iArr3 = new int[0];
        int[] iArr4 = new int[0];
        int i35 = -1;
        int i36 = 0;
        int iD11 = -1;
        while (i36 < iD10) {
            if (i36 != 0 && qr0Var.b()) {
                int i37 = i35 + iD11;
                int iD12 = (1 - ((qr0Var.b() ? 1 : 0) * 2)) * (qr0Var.d() + 1);
                i14 = iD10;
                int i38 = i37 + 1;
                i17 = iB5;
                boolean[] zArr = new boolean[i38];
                iArr = iArr2;
                for (int i39 = 0; i39 <= i37; i39++) {
                    if (!qr0Var.b()) {
                        zArr[i39] = qr0Var.b();
                    } else {
                        zArr[i39] = true;
                    }
                }
                int[] iArr5 = new int[i38];
                int[] iArr6 = new int[i38];
                int i42 = 0;
                for (int i43 = iD11 - 1; i43 >= 0; i43--) {
                    int i44 = iArr4[i43] + iD12;
                    if (i44 < 0 && zArr[i35 + i43]) {
                        iArr5[i42] = i44;
                        i42++;
                    }
                }
                if (iD12 < 0 && zArr[i37]) {
                    iArr5[i42] = iD12;
                    i42++;
                }
                i16 = i19;
                int i45 = i42;
                i15 = iB4;
                for (int i46 = 0; i46 < i35; i46++) {
                    int i47 = iArr3[i46] + iD12;
                    if (i47 < 0 && zArr[i46]) {
                        iArr5[i45] = i47;
                        i45++;
                    }
                }
                int[] iArrCopyOf2 = Arrays.copyOf(iArr5, i45);
                int i48 = 0;
                for (int i49 = i35 - 1; i49 >= 0; i49--) {
                    int i52 = iArr3[i49] + iD12;
                    if (i52 > 0 && zArr[i49]) {
                        iArr6[i48] = i52;
                        i48++;
                    }
                }
                if (iD12 > 0 && zArr[i37]) {
                    iArr6[i48] = iD12;
                    i48++;
                }
                int i53 = i48;
                for (int i54 = 0; i54 < iD11; i54++) {
                    int i55 = iArr4[i54] + iD12;
                    if (i55 > 0 && zArr[i35 + i54]) {
                        iArr6[i53] = i55;
                        i53++;
                    }
                }
                iArrCopyOf = Arrays.copyOf(iArr6, i53);
                iD11 = i53;
                iArr3 = iArrCopyOf2;
                i35 = i45;
                z12 = true;
            } else {
                i14 = iD10;
                i15 = iB4;
                i16 = i19;
                iArr = iArr2;
                i17 = iB5;
                int iD13 = qr0Var.d();
                iD11 = qr0Var.d();
                iArr3 = new int[iD13];
                for (int i56 = 0; i56 < iD13; i56++) {
                    iArr3[i56] = qr0Var.d() + 1;
                    qr0Var.e();
                }
                z12 = true;
                int[] iArr7 = new int[iD11];
                for (int i57 = 0; i57 < iD11; i57++) {
                    iArr7[i57] = qr0Var.d() + 1;
                    qr0Var.e();
                }
                i35 = iD13;
                iArrCopyOf = iArr7;
            }
            i36++;
            iB5 = i17;
            iArr2 = iArr;
            i19 = i16;
            iB4 = i15;
            iArr4 = iArrCopyOf;
            iD10 = i14;
        }
        int i58 = iB4;
        int i59 = i19;
        int[] iArr8 = iArr2;
        int i62 = iB5;
        if (qr0Var.b()) {
            for (int i63 = 0; i63 < qr0Var.d(); i63++) {
                qr0Var.d(iD9 + 5);
            }
        }
        qr0Var.d(2);
        float f12 = 1.0f;
        if (qr0Var.b()) {
            if (qr0Var.b()) {
                int iB6 = qr0Var.b(8);
                if (iB6 == 255) {
                    int iB7 = qr0Var.b(16);
                    int iB8 = qr0Var.b(16);
                    if (iB7 != 0 && iB8 != 0) {
                        f12 = iB7 / iB8;
                    }
                } else {
                    float[] fArr = f387521b;
                    if (iB6 < 17) {
                        f12 = fArr[iB6];
                    } else {
                        j90.a("Unexpected aspect_ratio_idc value: ", iB6, "NalUnitUtil");
                    }
                }
            }
            if (qr0Var.b()) {
                qr0Var.e();
            }
            if (qr0Var.b()) {
                qr0Var.d(4);
                if (qr0Var.b()) {
                    qr0Var.d(24);
                }
            }
            if (qr0Var.b()) {
                qr0Var.d();
                qr0Var.d();
            }
            qr0Var.e();
            if (qr0Var.b()) {
                i27 *= 2;
            }
        }
        return new a(iB3, zB2, i58, i59, iArr8, i62, i28, i27, f12);
    }

    public static int a(byte[] bArr, int i12, int i13, boolean[] zArr) {
        int i14 = i13 - i12;
        db.b(i14 >= 0);
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

    public static void a(boolean[] zArr) {
        zArr[0] = false;
        zArr[1] = false;
        zArr[2] = false;
    }
}
