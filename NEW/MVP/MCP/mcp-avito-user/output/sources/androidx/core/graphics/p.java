package androidx.core.graphics;

import android.graphics.Path;
import androidx.annotation.RestrictTo;
import com.yandex.metrica.YandexMetricaDefaultValues;
import j.N;
import j.P;

/* compiled from: PathParser.java */
/* loaded from: classes.dex */
public final class p {

    /* compiled from: PathParser.java */
    public static class a {

        /* renamed from: a, reason: collision with root package name */
        public boolean f44780a;
    }

    public static boolean a(@P b[] bVarArr, @P b[] bVarArr2) {
        if (bVarArr == null || bVarArr2 == null || bVarArr.length != bVarArr2.length) {
            return false;
        }
        for (int i12 = 0; i12 < bVarArr.length; i12++) {
            b bVar = bVarArr[i12];
            char c12 = bVar.f44781a;
            b bVar2 = bVarArr2[i12];
            if (c12 != bVar2.f44781a || bVar.f44782b.length != bVar2.f44782b.length) {
                return false;
            }
        }
        return true;
    }

    public static float[] b(int i12, float[] fArr) {
        if (i12 < 0) {
            throw new IllegalArgumentException();
        }
        int length = fArr.length;
        if (length < 0) {
            throw new ArrayIndexOutOfBoundsException();
        }
        int iMin = Math.min(i12, length);
        float[] fArr2 = new float[i12];
        System.arraycopy(fArr, 0, fArr2, 0, iMin);
        return fArr2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0097 A[FALL_THROUGH] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x009f A[Catch: NumberFormatException -> 0x00b2, LOOP:3: B:25:0x006e->B:45:0x009f, LOOP_END, TryCatch #0 {NumberFormatException -> 0x00b2, blocks: (B:22:0x0054, B:24:0x0067, B:25:0x006e, B:27:0x0074, B:31:0x0080, B:45:0x009f, B:35:0x0089, B:40:0x0095, B:47:0x00a4, B:50:0x00b4, B:54:0x00bb, B:55:0x00be), top: B:70:0x0054 }] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00a4 A[Catch: NumberFormatException -> 0x00b2, TryCatch #0 {NumberFormatException -> 0x00b2, blocks: (B:22:0x0054, B:24:0x0067, B:25:0x006e, B:27:0x0074, B:31:0x0080, B:45:0x009f, B:35:0x0089, B:40:0x0095, B:47:0x00a4, B:50:0x00b4, B:54:0x00bb, B:55:0x00be), top: B:70:0x0054 }] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00bb A[Catch: NumberFormatException -> 0x00b2, TryCatch #0 {NumberFormatException -> 0x00b2, blocks: (B:22:0x0054, B:24:0x0067, B:25:0x006e, B:27:0x0074, B:31:0x0080, B:45:0x009f, B:35:0x0089, B:40:0x0095, B:47:0x00a4, B:50:0x00b4, B:54:0x00bb, B:55:0x00be), top: B:70:0x0054 }] */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00e1 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:83:0x009e A[SYNTHETIC] */
    @j.N
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static androidx.core.graphics.p.b[] c(@j.N java.lang.String r17) {
        /*
            Method dump skipped, instructions count: 278
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.graphics.p.c(java.lang.String):androidx.core.graphics.p$b[]");
    }

    @N
    public static Path d(@N String str) {
        Path path = new Path();
        try {
            b.b(c(str), path);
            return path;
        } catch (RuntimeException e12) {
            throw new RuntimeException("Error in parsing ".concat(str), e12);
        }
    }

    @N
    public static b[] e(@N b[] bVarArr) {
        b[] bVarArr2 = new b[bVarArr.length];
        for (int i12 = 0; i12 < bVarArr.length; i12++) {
            bVarArr2[i12] = new b(bVarArr[i12]);
        }
        return bVarArr2;
    }

    /* compiled from: PathParser.java */
    public static class b {

        /* renamed from: a, reason: collision with root package name */
        public char f44781a;

        /* renamed from: b, reason: collision with root package name */
        public final float[] f44782b;

        public b(char c12, float[] fArr) {
            this.f44781a = c12;
            this.f44782b = fArr;
        }

        public static void a(Path path, float f12, float f13, float f14, float f15, float f16, float f17, float f18, boolean z12, boolean z13) {
            double d12;
            double d13;
            double radians = Math.toRadians(f18);
            double dCos = Math.cos(radians);
            double dSin = Math.sin(radians);
            double d14 = f12;
            double d15 = f13;
            double d16 = (d15 * dSin) + (d14 * dCos);
            double d17 = d14;
            double d18 = f16;
            double d19 = d16 / d18;
            double d22 = f17;
            double d23 = ((d15 * dCos) + ((-f12) * dSin)) / d22;
            double d24 = d15;
            double d25 = f15;
            double d26 = ((d25 * dSin) + (f14 * dCos)) / d18;
            double d27 = ((d25 * dCos) + ((-f14) * dSin)) / d22;
            double d28 = d19 - d26;
            double d29 = d23 - d27;
            double d32 = (d19 + d26) / 2.0d;
            double d33 = (d23 + d27) / 2.0d;
            double d34 = (d29 * d29) + (d28 * d28);
            if (d34 == 0.0d) {
                return;
            }
            double d35 = (1.0d / d34) - 0.25d;
            if (d35 < 0.0d) {
                float fSqrt = (float) (Math.sqrt(d34) / 1.99999d);
                a(path, f12, f13, f14, f15, f16 * fSqrt, f17 * fSqrt, f18, z12, z13);
                return;
            }
            double dSqrt = Math.sqrt(d35);
            double d36 = d28 * dSqrt;
            double d37 = dSqrt * d29;
            if (z12 == z13) {
                d12 = d32 - d37;
                d13 = d33 + d36;
            } else {
                d12 = d32 + d37;
                d13 = d33 - d36;
            }
            double dAtan2 = Math.atan2(d23 - d13, d19 - d12);
            double dAtan22 = Math.atan2(d27 - d13, d26 - d12) - dAtan2;
            if (z13 != (dAtan22 >= 0.0d)) {
                dAtan22 = dAtan22 > 0.0d ? dAtan22 - 6.283185307179586d : dAtan22 + 6.283185307179586d;
            }
            double d38 = d12 * d18;
            double d39 = d13 * d22;
            double d42 = (d38 * dCos) - (d39 * dSin);
            double d43 = (d39 * dCos) + (d38 * dSin);
            int iCeil = (int) Math.ceil(Math.abs((dAtan22 * 4.0d) / 3.141592653589793d));
            double dCos2 = Math.cos(radians);
            double dSin2 = Math.sin(radians);
            double dCos3 = Math.cos(dAtan2);
            double dSin3 = Math.sin(dAtan2);
            double d44 = -d18;
            double d45 = d44 * dCos2;
            double d46 = d22 * dSin2;
            double d47 = (d45 * dSin3) - (d46 * dCos3);
            double d48 = d44 * dSin2;
            double d49 = d22 * dCos2;
            double d52 = (dCos3 * d49) + (dSin3 * d48);
            double d53 = d49;
            double d54 = dAtan22 / iCeil;
            int i12 = 0;
            while (i12 < iCeil) {
                double d55 = dAtan2 + d54;
                double dSin4 = Math.sin(d55);
                double dCos4 = Math.cos(d55);
                double d56 = d54;
                double d57 = (((d18 * dCos2) * dCos4) + d42) - (d46 * dSin4);
                double d58 = d53;
                double d59 = d42;
                double d62 = (d58 * dSin4) + (d18 * dSin2 * dCos4) + d43;
                double d63 = (d45 * dSin4) - (d46 * dCos4);
                double d64 = (dCos4 * d58) + (dSin4 * d48);
                double d65 = d55 - dAtan2;
                double dTan = Math.tan(d65 / 2.0d);
                double dSqrt2 = ((Math.sqrt(((dTan * 3.0d) * dTan) + 4.0d) - 1.0d) * Math.sin(d65)) / 3.0d;
                path.rLineTo(0.0f, 0.0f);
                path.cubicTo((float) ((d47 * dSqrt2) + d17), (float) ((d52 * dSqrt2) + d24), (float) (d57 - (dSqrt2 * d63)), (float) (d62 - (dSqrt2 * d64)), (float) d57, (float) d62);
                i12++;
                dAtan2 = d55;
                d48 = d48;
                dCos2 = dCos2;
                iCeil = iCeil;
                d52 = d64;
                d18 = d18;
                d47 = d63;
                d17 = d57;
                d24 = d62;
                d42 = d59;
                d54 = d56;
                d53 = d58;
            }
        }

        @RestrictTo
        @Deprecated
        public static void b(@N b[] bVarArr, @N Path path) {
            int i12;
            int i13;
            char c12;
            int i14;
            int i15;
            b bVar;
            float f12;
            float f13;
            float f14;
            float f15;
            float f16;
            float f17;
            float f18;
            float f19;
            float f22;
            float f23;
            float f24;
            float f25;
            b[] bVarArr2 = bVarArr;
            int i16 = 6;
            float[] fArr = new float[6];
            int length = bVarArr2.length;
            int i17 = 0;
            char c13 = 'm';
            while (i17 < length) {
                b bVar2 = bVarArr2[i17];
                char c14 = bVar2.f44781a;
                float f26 = fArr[0];
                float f27 = fArr[1];
                float f28 = fArr[2];
                float f29 = fArr[3];
                float f32 = fArr[4];
                float f33 = fArr[5];
                switch (c14) {
                    case 'A':
                    case 'a':
                        i12 = 7;
                        break;
                    case 'C':
                    case 'c':
                        i12 = i16;
                        break;
                    case 'H':
                    case 'V':
                    case 'h':
                    case 'v':
                        i12 = 1;
                        break;
                    case 'Q':
                    case 'S':
                    case 'q':
                    case 's':
                        i12 = 4;
                        break;
                    case YandexMetricaDefaultValues.DEFAULT_DISPATCH_PERIOD_SECONDS /* 90 */:
                    case 'z':
                        path.close();
                        path.moveTo(f32, f33);
                        f26 = f32;
                        f28 = f26;
                        f27 = f33;
                        f29 = f27;
                    default:
                        i12 = 2;
                        break;
                }
                float f34 = f32;
                float f35 = f33;
                float f36 = f26;
                float f37 = f27;
                int i18 = 0;
                while (true) {
                    float[] fArr2 = bVar2.f44782b;
                    if (i18 < fArr2.length) {
                        if (c14 != 'A') {
                            if (c14 != 'C') {
                                if (c14 == 'H') {
                                    i13 = i18;
                                    c12 = c14;
                                    i14 = i17;
                                    i15 = length;
                                    bVar = bVar2;
                                    path.lineTo(fArr2[i13], f37);
                                    f36 = fArr2[i13];
                                } else if (c14 == 'Q') {
                                    i13 = i18;
                                    c12 = c14;
                                    i14 = i17;
                                    i15 = length;
                                    bVar = bVar2;
                                    float f38 = fArr2[i13];
                                    int i19 = i13 + 1;
                                    float f39 = fArr2[i19];
                                    int i22 = i13 + 2;
                                    int i23 = i13 + 3;
                                    path.quadTo(f38, f39, fArr2[i22], fArr2[i23]);
                                    f12 = fArr2[i13];
                                    f13 = fArr2[i19];
                                    f36 = fArr2[i22];
                                    f37 = fArr2[i23];
                                } else if (c14 == 'V') {
                                    i13 = i18;
                                    c12 = c14;
                                    i14 = i17;
                                    i15 = length;
                                    bVar = bVar2;
                                    path.lineTo(f36, fArr2[i13]);
                                    f37 = fArr2[i13];
                                } else if (c14 != 'a') {
                                    if (c14 != 'c') {
                                        if (c14 != 'h') {
                                            if (c14 == 'q') {
                                                i13 = i18;
                                                float f42 = f37;
                                                float f43 = f36;
                                                int i24 = i13 + 1;
                                                int i25 = i13 + 2;
                                                int i26 = i13 + 3;
                                                path.rQuadTo(fArr2[i13], fArr2[i24], fArr2[i25], fArr2[i26]);
                                                float f44 = f43 + fArr2[i13];
                                                float f45 = fArr2[i24] + f42;
                                                float f46 = f43 + fArr2[i25];
                                                f37 = f42 + fArr2[i26];
                                                f29 = f45;
                                                f28 = f44;
                                                c12 = c14;
                                                i14 = i17;
                                                i15 = length;
                                                f36 = f46;
                                            } else if (c14 == 'v') {
                                                i13 = i18;
                                                path.rLineTo(0.0f, fArr2[i13]);
                                                f37 += fArr2[i13];
                                            } else if (c14 == 'L') {
                                                i13 = i18;
                                                int i27 = i13 + 1;
                                                path.lineTo(fArr2[i13], fArr2[i27]);
                                                f36 = fArr2[i13];
                                                f37 = fArr2[i27];
                                            } else if (c14 == 'M') {
                                                i13 = i18;
                                                f36 = fArr2[i13];
                                                f37 = fArr2[i13 + 1];
                                                if (i13 > 0) {
                                                    path.lineTo(f36, f37);
                                                } else {
                                                    path.moveTo(f36, f37);
                                                    f35 = f37;
                                                    f34 = f36;
                                                }
                                            } else if (c14 == 'S') {
                                                i13 = i18;
                                                float f47 = f37;
                                                float f48 = f36;
                                                if (c13 == 'c' || c13 == 's' || c13 == 'C' || c13 == 'S') {
                                                    f18 = (f47 * 2.0f) - f29;
                                                    f19 = (f48 * 2.0f) - f28;
                                                } else {
                                                    f19 = f48;
                                                    f18 = f47;
                                                }
                                                int i28 = i13 + 1;
                                                int i29 = i13 + 2;
                                                int i32 = i13 + 3;
                                                path.cubicTo(f19, f18, fArr2[i13], fArr2[i28], fArr2[i29], fArr2[i32]);
                                                float f49 = fArr2[i13];
                                                float f52 = fArr2[i28];
                                                f36 = fArr2[i29];
                                                f37 = fArr2[i32];
                                                f29 = f52;
                                                f28 = f49;
                                            } else if (c14 == 'T') {
                                                i13 = i18;
                                                float f53 = f37;
                                                float f54 = f36;
                                                if (c13 == 'q' || c13 == 't' || c13 == 'Q' || c13 == 'T') {
                                                    f14 = (f54 * 2.0f) - f28;
                                                    f15 = (f53 * 2.0f) - f29;
                                                } else {
                                                    f14 = f54;
                                                    f15 = f53;
                                                }
                                                int i33 = i13 + 1;
                                                path.quadTo(f14, f15, fArr2[i13], fArr2[i33]);
                                                f16 = fArr2[i13];
                                                f17 = fArr2[i33];
                                            } else if (c14 == 'l') {
                                                i13 = i18;
                                                int i34 = i13 + 1;
                                                path.rLineTo(fArr2[i13], fArr2[i34]);
                                                f36 += fArr2[i13];
                                                f37 += fArr2[i34];
                                            } else if (c14 == 'm') {
                                                i13 = i18;
                                                float f55 = fArr2[i13];
                                                f36 += f55;
                                                float f56 = fArr2[i13 + 1];
                                                f37 += f56;
                                                if (i13 > 0) {
                                                    path.rLineTo(f55, f56);
                                                } else {
                                                    path.rMoveTo(f55, f56);
                                                    f35 = f37;
                                                    f34 = f36;
                                                }
                                            } else if (c14 == 's') {
                                                if (c13 == 'c' || c13 == 's' || c13 == 'C' || c13 == 'S') {
                                                    float f57 = f36 - f28;
                                                    f22 = f37 - f29;
                                                    f23 = f57;
                                                } else {
                                                    f22 = 0.0f;
                                                    f23 = 0.0f;
                                                }
                                                int i35 = i18 + 1;
                                                int i36 = i18 + 2;
                                                int i37 = i18 + 3;
                                                i13 = i18;
                                                float f58 = f37;
                                                float f59 = f36;
                                                path.rCubicTo(f23, f22, fArr2[i18], fArr2[i35], fArr2[i36], fArr2[i37]);
                                                f14 = f59 + fArr2[i13];
                                                f15 = f58 + fArr2[i35];
                                                f16 = f59 + fArr2[i36];
                                                f17 = fArr2[i37] + f58;
                                            } else if (c14 != 't') {
                                                i13 = i18;
                                            } else {
                                                if (c13 == 'q' || c13 == 't' || c13 == 'Q' || c13 == 'T') {
                                                    f24 = f36 - f28;
                                                    f25 = f37 - f29;
                                                } else {
                                                    f25 = 0.0f;
                                                    f24 = 0.0f;
                                                }
                                                int i38 = i18 + 1;
                                                path.rQuadTo(f24, f25, fArr2[i18], fArr2[i38]);
                                                float f62 = f24 + f36;
                                                float f63 = f25 + f37;
                                                f36 += fArr2[i18];
                                                f37 += fArr2[i38];
                                                f29 = f63;
                                                i13 = i18;
                                                c12 = c14;
                                                i14 = i17;
                                                i15 = length;
                                                f28 = f62;
                                            }
                                            bVar = bVar2;
                                        } else {
                                            i13 = i18;
                                            path.rLineTo(fArr2[i13], 0.0f);
                                            f36 += fArr2[i13];
                                        }
                                        c12 = c14;
                                        i14 = i17;
                                        i15 = length;
                                        bVar = bVar2;
                                    } else {
                                        i13 = i18;
                                        float f64 = f37;
                                        float f65 = f36;
                                        int i39 = i13 + 2;
                                        int i42 = i13 + 3;
                                        int i43 = i13 + 4;
                                        int i44 = i13 + 5;
                                        path.rCubicTo(fArr2[i13], fArr2[i13 + 1], fArr2[i39], fArr2[i42], fArr2[i43], fArr2[i44]);
                                        f14 = f65 + fArr2[i39];
                                        f15 = f64 + fArr2[i42];
                                        f16 = f65 + fArr2[i43];
                                        f17 = fArr2[i44] + f64;
                                    }
                                    f29 = f15;
                                    f28 = f14;
                                    c12 = c14;
                                    i14 = i17;
                                    i15 = length;
                                    f36 = f16;
                                    f37 = f17;
                                    bVar = bVar2;
                                } else {
                                    i13 = i18;
                                    float f66 = f37;
                                    float f67 = f36;
                                    int i45 = i13 + 5;
                                    int i46 = i13 + 6;
                                    c12 = c14;
                                    i15 = length;
                                    bVar = bVar2;
                                    i14 = i17;
                                    a(path, f67, f66, fArr2[i45] + f67, fArr2[i46] + f66, fArr2[i13], fArr2[i13 + 1], fArr2[i13 + 2], fArr2[i13 + 3] != 0.0f, fArr2[i13 + 4] != 0.0f);
                                    f36 = f67 + fArr2[i45];
                                    f37 = f66 + fArr2[i46];
                                }
                                i18 = i13 + i12;
                                bVar2 = bVar;
                                length = i15;
                                c13 = c12;
                                c14 = c13;
                                i17 = i14;
                            } else {
                                i13 = i18;
                                c12 = c14;
                                i14 = i17;
                                i15 = length;
                                bVar = bVar2;
                                int i47 = i13 + 2;
                                int i48 = i13 + 3;
                                int i49 = i13 + 4;
                                int i52 = i13 + 5;
                                path.cubicTo(fArr2[i13], fArr2[i13 + 1], fArr2[i47], fArr2[i48], fArr2[i49], fArr2[i52]);
                                f36 = fArr2[i49];
                                f37 = fArr2[i52];
                                f12 = fArr2[i47];
                                f13 = fArr2[i48];
                            }
                            f28 = f12;
                            f29 = f13;
                            i18 = i13 + i12;
                            bVar2 = bVar;
                            length = i15;
                            c13 = c12;
                            c14 = c13;
                            i17 = i14;
                        } else {
                            i13 = i18;
                            c12 = c14;
                            i14 = i17;
                            i15 = length;
                            bVar = bVar2;
                            int i53 = i13 + 5;
                            int i54 = i13 + 6;
                            a(path, f36, f37, fArr2[i53], fArr2[i54], fArr2[i13], fArr2[i13 + 1], fArr2[i13 + 2], fArr2[i13 + 3] != 0.0f, fArr2[i13 + 4] != 0.0f);
                            f36 = fArr2[i53];
                            f37 = fArr2[i54];
                        }
                        f29 = f37;
                        f28 = f36;
                        i18 = i13 + i12;
                        bVar2 = bVar;
                        length = i15;
                        c13 = c12;
                        c14 = c13;
                        i17 = i14;
                    }
                }
                fArr[0] = f36;
                fArr[1] = f37;
                fArr[2] = f28;
                fArr[3] = f29;
                fArr[4] = f34;
                fArr[5] = f35;
                c13 = bVar2.f44781a;
                i17++;
                bVarArr2 = bVarArr;
                length = length;
                i16 = 6;
            }
        }

        public b(b bVar) {
            this.f44781a = bVar.f44781a;
            float[] fArr = bVar.f44782b;
            this.f44782b = p.b(fArr.length, fArr);
        }
    }
}
