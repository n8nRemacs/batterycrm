package androidx.compose.ui.graphics;

import androidx.compose.runtime.F3;
import androidx.compose.ui.graphics.T;
import j.InterfaceC42156l;
import j.InterfaceC42167x;
import kotlin.Metadata;

/* compiled from: Color.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"ui-graphics_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class V {
    /* JADX WARN: Removed duplicated region for block: B:108:0x0159  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0160  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x016d  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0172  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x01ab  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x01b2  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x010d  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0115  */
    @androidx.compose.runtime.F3
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final long a(float r20, float r21, float r22, float r23, @Y61.k androidx.compose.ui.graphics.colorspace.c r24) {
        /*
            Method dump skipped, instructions count: 476
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.graphics.V.a(float, float, float, float, androidx.compose.ui.graphics.colorspace.c):long");
    }

    @F3
    public static final long b(@InterfaceC42156l int i12) {
        long j12 = i12;
        int i13 = kotlin.w0.f410662c;
        long j13 = j12 << 32;
        T.a aVar = T.f39320b;
        return j13;
    }

    @F3
    public static final long c(@j.F int i12, @j.F int i13, @j.F int i14, @j.F int i15) {
        return b(((i12 & 255) << 16) | ((i15 & 255) << 24) | ((i13 & 255) << 8) | (i14 & 255));
    }

    @F3
    public static final long d(long j12) {
        long j13 = j12 << 32;
        int i12 = kotlin.w0.f410662c;
        T.a aVar = T.f39320b;
        return j13;
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00e4  */
    @androidx.compose.runtime.F3
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final long f(float r18, float r19, float r20, float r21, @Y61.k androidx.compose.ui.graphics.colorspace.c r22) {
        /*
            Method dump skipped, instructions count: 342
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.graphics.V.f(float, float, float, float, androidx.compose.ui.graphics.colorspace.c):long");
    }

    @F3
    public static final long g(long j12, long j13) {
        float f12;
        float f13;
        long jB2 = T.b(j12, T.g(j13));
        float fE2 = T.e(j13);
        float fE3 = T.e(jB2);
        float f14 = 1.0f - fE3;
        float f15 = (fE2 * f14) + fE3;
        float fI2 = T.i(jB2);
        float fI3 = T.i(j13);
        float f16 = 0.0f;
        if (f15 == 0.0f) {
            f12 = 0.0f;
        } else {
            f12 = (((fI3 * fE2) * f14) + (fI2 * fE3)) / f15;
        }
        float fH2 = T.h(jB2);
        float fH3 = T.h(j13);
        if (f15 == 0.0f) {
            f13 = 0.0f;
        } else {
            f13 = (((fH3 * fE2) * f14) + (fH2 * fE3)) / f15;
        }
        float f17 = T.f(jB2);
        float f18 = T.f(j13);
        if (f15 != 0.0f) {
            f16 = (((f18 * fE2) * f14) + (f17 * fE3)) / f15;
        }
        return f(f12, f13, f16, f15, T.g(j13));
    }

    @F3
    public static final long h(long j12, long j13, @InterfaceC42167x float f12) {
        androidx.compose.ui.graphics.colorspace.f.f39390a.getClass();
        androidx.compose.ui.graphics.colorspace.m mVar = androidx.compose.ui.graphics.colorspace.f.f39414y;
        long jB2 = T.b(j12, mVar);
        long jB3 = T.b(j13, mVar);
        float fE2 = T.e(jB2);
        float fI2 = T.i(jB2);
        float fH2 = T.h(jB2);
        float f13 = T.f(jB2);
        float fE3 = T.e(jB3);
        float fI3 = T.i(jB3);
        float fH3 = T.h(jB3);
        float f14 = T.f(jB3);
        if (f12 < 0.0f) {
            f12 = 0.0f;
        }
        if (f12 > 1.0f) {
            f12 = 1.0f;
        }
        return T.b(f(E0.e.b(fI2, fI3, f12), E0.e.b(fH2, fH3, f12), E0.e.b(f13, f14, f12), E0.e.b(fE2, fE3, f12), mVar), T.g(j13));
    }

    @F3
    public static final float i(long j12) {
        androidx.compose.ui.graphics.colorspace.c cVarG = T.g(j12);
        long j13 = cVarG.f39387b;
        androidx.compose.ui.graphics.colorspace.b.f39380b.getClass();
        if (!androidx.compose.ui.graphics.colorspace.b.a(j13, androidx.compose.ui.graphics.colorspace.b.f39381c)) {
            C22285t0.a("The specified color must be encoded in an RGB color space. The supplied color space is " + ((Object) androidx.compose.ui.graphics.colorspace.b.b(cVarG.f39387b)));
        }
        double dI2 = T.i(j12);
        androidx.compose.ui.graphics.colorspace.o oVar = ((androidx.compose.ui.graphics.colorspace.r) cVarG).f39460p;
        double dA2 = oVar.a(dI2);
        float fA2 = (float) ((oVar.a(T.f(j12)) * 0.0722d) + (oVar.a(T.h(j12)) * 0.7152d) + (dA2 * 0.2126d));
        if (fA2 < 0.0f) {
            fA2 = 0.0f;
        }
        if (fA2 > 1.0f) {
            return 1.0f;
        }
        return fA2;
    }

    @F3
    @InterfaceC42156l
    public static final int j(long j12) {
        androidx.compose.ui.graphics.colorspace.f.f39390a.getClass();
        long jB2 = T.b(j12, androidx.compose.ui.graphics.colorspace.f.f39395f) >>> 32;
        int i12 = kotlin.w0.f410662c;
        return (int) jB2;
    }
}
