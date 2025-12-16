package androidx.media3.container;

import androidx.media3.common.C23101l;
import androidx.media3.common.util.C23110a;
import androidx.media3.common.util.J;
import androidx.media3.common.util.s;
import java.util.Arrays;

/* compiled from: NalUnitUtil.java */
@J
/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public static final byte[] f48118a = {0, 0, 0, 1};

    /* renamed from: b, reason: collision with root package name */
    public static final float[] f48119b = {1.0f, 1.0f, 1.0909091f, 0.90909094f, 1.4545455f, 1.2121212f, 2.1818182f, 1.8181819f, 2.909091f, 2.4242425f, 1.6363636f, 1.3636364f, 1.939394f, 1.6161616f, 1.3333334f, 1.5f, 2.0f};

    /* renamed from: c, reason: collision with root package name */
    public static final Object f48120c = new Object();

    /* renamed from: d, reason: collision with root package name */
    public static int[] f48121d = new int[10];

    /* compiled from: NalUnitUtil.java */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final int f48122a;

        /* renamed from: b, reason: collision with root package name */
        public final boolean f48123b;

        /* renamed from: c, reason: collision with root package name */
        public final int f48124c;

        /* renamed from: d, reason: collision with root package name */
        public final int f48125d;

        /* renamed from: e, reason: collision with root package name */
        public final int[] f48126e;

        /* renamed from: f, reason: collision with root package name */
        public final int f48127f;

        /* renamed from: g, reason: collision with root package name */
        public final int f48128g;

        /* renamed from: h, reason: collision with root package name */
        public final int f48129h;

        /* renamed from: i, reason: collision with root package name */
        public final float f48130i;

        /* renamed from: j, reason: collision with root package name */
        public final int f48131j;

        /* renamed from: k, reason: collision with root package name */
        public final int f48132k;

        /* renamed from: l, reason: collision with root package name */
        public final int f48133l;

        public a(int i12, boolean z12, int i13, int i14, int[] iArr, int i15, int i16, int i17, float f12, int i18, int i19, int i22) {
            this.f48122a = i12;
            this.f48123b = z12;
            this.f48124c = i13;
            this.f48125d = i14;
            this.f48126e = iArr;
            this.f48127f = i15;
            this.f48128g = i16;
            this.f48129h = i17;
            this.f48130i = f12;
            this.f48131j = i18;
            this.f48132k = i19;
            this.f48133l = i22;
        }
    }

    /* compiled from: NalUnitUtil.java */
    /* renamed from: androidx.media3.container.b$b, reason: collision with other inner class name */
    public static final class C1819b {

        /* renamed from: a, reason: collision with root package name */
        public final int f48134a;

        /* renamed from: b, reason: collision with root package name */
        public final boolean f48135b;

        public C1819b(int i12, int i13, boolean z12) {
            this.f48134a = i13;
            this.f48135b = z12;
        }
    }

    /* compiled from: NalUnitUtil.java */
    public static final class c {

        /* renamed from: a, reason: collision with root package name */
        public final int f48136a;

        /* renamed from: b, reason: collision with root package name */
        public final int f48137b;

        /* renamed from: c, reason: collision with root package name */
        public final int f48138c;

        /* renamed from: d, reason: collision with root package name */
        public final int f48139d;

        /* renamed from: e, reason: collision with root package name */
        public final int f48140e;

        /* renamed from: f, reason: collision with root package name */
        public final int f48141f;

        /* renamed from: g, reason: collision with root package name */
        public final float f48142g;

        /* renamed from: h, reason: collision with root package name */
        public final boolean f48143h;

        /* renamed from: i, reason: collision with root package name */
        public final boolean f48144i;

        /* renamed from: j, reason: collision with root package name */
        public final int f48145j;

        /* renamed from: k, reason: collision with root package name */
        public final int f48146k;

        /* renamed from: l, reason: collision with root package name */
        public final int f48147l;

        /* renamed from: m, reason: collision with root package name */
        public final boolean f48148m;

        /* renamed from: n, reason: collision with root package name */
        public final int f48149n;

        /* renamed from: o, reason: collision with root package name */
        public final int f48150o;

        /* renamed from: p, reason: collision with root package name */
        public final int f48151p;

        public c(int i12, int i13, int i14, int i15, int i16, int i17, float f12, boolean z12, boolean z13, int i18, int i19, int i22, boolean z14, int i23, int i24, int i25) {
            this.f48136a = i12;
            this.f48137b = i13;
            this.f48138c = i14;
            this.f48139d = i15;
            this.f48140e = i16;
            this.f48141f = i17;
            this.f48142g = f12;
            this.f48143h = z12;
            this.f48144i = z13;
            this.f48145j = i18;
            this.f48146k = i19;
            this.f48147l = i22;
            this.f48148m = z14;
            this.f48149n = i23;
            this.f48150o = i24;
            this.f48151p = i25;
        }
    }

    public static void a(boolean[] zArr) {
        zArr[0] = false;
        zArr[1] = false;
        zArr[2] = false;
    }

    public static int b(byte[] bArr, int i12, int i13, boolean[] zArr) {
        int i14 = i13 - i12;
        C23110a.g(i14 >= 0);
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
        int i14;
        float f12;
        int i15;
        int i16;
        int i17;
        int iG2;
        int i18;
        int i19;
        int i22;
        int[] iArr;
        int i23;
        androidx.media3.container.c cVar = new androidx.media3.container.c(bArr, i12 + 2, i13);
        int i24 = 4;
        cVar.j(4);
        int iE2 = cVar.e(3);
        cVar.i();
        int iE3 = cVar.e(2);
        boolean zD2 = cVar.d();
        int iE4 = cVar.e(5);
        int i25 = 0;
        int i26 = 0;
        while (true) {
            i14 = 1;
            if (i26 >= 32) {
                break;
            }
            if (cVar.d()) {
                i25 |= 1 << i26;
            }
            i26++;
        }
        int i27 = 6;
        int[] iArr2 = new int[6];
        for (int i28 = 0; i28 < 6; i28++) {
            iArr2[i28] = cVar.e(8);
        }
        int iE5 = cVar.e(8);
        int i29 = 0;
        for (int i32 = 0; i32 < iE2; i32++) {
            if (cVar.d()) {
                i29 += 89;
            }
            if (cVar.d()) {
                i29 += 8;
            }
        }
        cVar.j(i29);
        if (iE2 > 0) {
            cVar.j((8 - iE2) * 2);
        }
        cVar.f();
        int iF2 = cVar.f();
        if (iF2 == 3) {
            cVar.i();
        }
        int iF3 = cVar.f();
        int iF4 = cVar.f();
        if (cVar.d()) {
            int iF5 = cVar.f();
            int iF6 = cVar.f();
            int iF7 = cVar.f();
            int iF8 = cVar.f();
            iF3 -= (iF5 + iF6) * ((iF2 == 1 || iF2 == 2) ? 2 : 1);
            iF4 -= (iF7 + iF8) * (iF2 == 1 ? 2 : 1);
        }
        int i33 = iF4;
        int i34 = iF3;
        cVar.f();
        cVar.f();
        int iF9 = cVar.f();
        for (int i35 = cVar.d() ? 0 : iE2; i35 <= iE2; i35++) {
            cVar.f();
            cVar.f();
            cVar.f();
        }
        cVar.f();
        cVar.f();
        cVar.f();
        cVar.f();
        cVar.f();
        cVar.f();
        if (cVar.d() && cVar.d()) {
            int i36 = 0;
            while (i36 < i24) {
                int i37 = 0;
                while (i37 < i27) {
                    if (cVar.d()) {
                        int iMin = Math.min(64, 1 << ((i36 << 1) + 4));
                        if (i36 > 1) {
                            cVar.g();
                        }
                        for (int i38 = 0; i38 < iMin; i38++) {
                            cVar.g();
                        }
                    } else {
                        cVar.f();
                    }
                    i37 += i36 == 3 ? 3 : 1;
                    i27 = 6;
                }
                i36++;
                i24 = 4;
                i27 = 6;
            }
        }
        cVar.j(2);
        if (cVar.d()) {
            cVar.j(8);
            cVar.f();
            cVar.f();
            cVar.i();
        }
        int iF10 = cVar.f();
        int i39 = 0;
        int[] iArr3 = new int[0];
        int[] iArrCopyOf = new int[0];
        int iB2 = -1;
        int i42 = -1;
        int i43 = -1;
        while (i39 < iF10) {
            if (i39 == 0 || !cVar.d()) {
                i18 = iF10;
                i19 = iE4;
                i22 = i25;
                iArr = iArr2;
                i23 = iE5;
                int iF11 = cVar.f();
                int iF12 = cVar.f();
                int[] iArr4 = new int[iF11];
                int i44 = 0;
                while (i44 < iF11) {
                    iArr4[i44] = (i44 > 0 ? iArr4[i44 - 1] : 0) - (cVar.f() + 1);
                    cVar.i();
                    i44++;
                }
                int[] iArr5 = new int[iF12];
                int i45 = 0;
                while (i45 < iF12) {
                    iArr5[i45] = cVar.f() + 1 + (i45 > 0 ? iArr5[i45 - 1] : 0);
                    cVar.i();
                    i45++;
                }
                i14 = 1;
                iArr3 = iArr4;
                iArrCopyOf = iArr5;
                i43 = iF11;
                i42 = iF12;
            } else {
                int i46 = i43 + i42;
                int iF13 = (1 - ((cVar.d() ? 1 : 0) * 2)) * (cVar.f() + 1);
                i18 = iF10;
                int i47 = i46 + 1;
                i23 = iE5;
                boolean[] zArr = new boolean[i47];
                iArr = iArr2;
                for (int i48 = 0; i48 <= i46; i48++) {
                    if (cVar.d()) {
                        zArr[i48] = true;
                    } else {
                        zArr[i48] = cVar.d();
                    }
                }
                int[] iArr6 = new int[i47];
                int[] iArr7 = new int[i47];
                int i49 = 0;
                for (int i52 = i42 - 1; i52 >= 0; i52--) {
                    int i53 = iArrCopyOf[i52] + iF13;
                    if (i53 < 0 && zArr[i43 + i52]) {
                        iArr6[i49] = i53;
                        i49++;
                    }
                }
                if (iF13 < 0 && zArr[i46]) {
                    iArr6[i49] = iF13;
                    i49++;
                }
                i22 = i25;
                int i54 = i49;
                i19 = iE4;
                for (int i55 = 0; i55 < i43; i55++) {
                    int i56 = iArr3[i55] + iF13;
                    if (i56 < 0 && zArr[i55]) {
                        iArr6[i54] = i56;
                        i54++;
                    }
                }
                int[] iArrCopyOf2 = Arrays.copyOf(iArr6, i54);
                int i57 = 0;
                for (int i58 = i43 - 1; i58 >= 0; i58--) {
                    int i59 = iArr3[i58] + iF13;
                    if (i59 > 0 && zArr[i58]) {
                        iArr7[i57] = i59;
                        i57++;
                    }
                }
                if (iF13 > 0 && zArr[i46]) {
                    iArr7[i57] = iF13;
                    i57++;
                }
                int i62 = i57;
                for (int i63 = 0; i63 < i42; i63++) {
                    int i64 = iArrCopyOf[i63] + iF13;
                    if (i64 > 0 && zArr[i43 + i63]) {
                        iArr7[i62] = i64;
                        i62++;
                    }
                }
                iArrCopyOf = Arrays.copyOf(iArr7, i62);
                i43 = i54;
                i42 = i62;
                i14 = 1;
                iArr3 = iArrCopyOf2;
            }
            i39++;
            iF10 = i18;
            iE5 = i23;
            iArr2 = iArr;
            i25 = i22;
            iE4 = i19;
        }
        int i65 = iE4;
        int i66 = i25;
        int[] iArr8 = iArr2;
        int i67 = iE5;
        if (cVar.d()) {
            int iF14 = cVar.f();
            for (int i68 = 0; i68 < iF14; i68++) {
                cVar.j(iF9 + 5);
            }
        }
        cVar.j(2);
        float f13 = 1.0f;
        if (cVar.d()) {
            if (cVar.d()) {
                int iE6 = cVar.e(8);
                if (iE6 == 255) {
                    int iE7 = cVar.e(16);
                    int iE8 = cVar.e(16);
                    if (iE7 != 0 && iE8 != 0) {
                        f13 = iE7 / iE8;
                    }
                } else if (iE6 < 17) {
                    f13 = f48119b[iE6];
                } else {
                    s.g();
                }
            }
            if (cVar.d()) {
                cVar.i();
            }
            if (cVar.d()) {
                cVar.j(3);
                i16 = cVar.d() ? i14 : 2;
                if (cVar.d()) {
                    int iE9 = cVar.e(8);
                    int iE10 = cVar.e(8);
                    cVar.j(8);
                    iB2 = C23101l.b(iE9);
                    iG2 = C23101l.g(iE10);
                } else {
                    iG2 = -1;
                }
            } else {
                i16 = -1;
                iG2 = -1;
            }
            if (cVar.d()) {
                cVar.f();
                cVar.f();
            }
            cVar.i();
            if (cVar.d()) {
                i33 *= 2;
            }
            f12 = f13;
            i15 = i33;
            i17 = iB2;
            iB2 = iG2;
        } else {
            f12 = 1.0f;
            i15 = i33;
            i16 = -1;
            i17 = -1;
        }
        return new a(iE3, zD2, i65, i66, iArr8, i67, i34, i15, f12, i17, i16, iB2);
    }

    /* JADX WARN: Removed duplicated region for block: B:108:0x01bc A[PHI: r17
  0x01bc: PHI (r17v7 float) = (r17v6 float), (r17v11 float) binds: [B:81:0x0142, B:98:0x0180] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x013a  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0144  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static androidx.media3.container.b.c d(int r23, int r24, byte[] r25) {
        /*
            Method dump skipped, instructions count: 461
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.container.b.d(int, int, byte[]):androidx.media3.container.b$c");
    }

    public static int e(int i12, byte[] bArr) {
        int i13;
        synchronized (f48120c) {
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
                    int[] iArr = f48121d;
                    if (iArr.length <= i15) {
                        f48121d = Arrays.copyOf(iArr, iArr.length * 2);
                    }
                    f48121d[i15] = i14;
                    i14 += 3;
                    i15++;
                }
            }
            i13 = i12 - i15;
            int i16 = 0;
            int i17 = 0;
            for (int i18 = 0; i18 < i15; i18++) {
                int i19 = f48121d[i18] - i17;
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
