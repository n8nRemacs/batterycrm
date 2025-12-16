package androidx.compose.foundation.text;

import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: TextLayoutResultProxy.kt */
@androidx.compose.runtime.internal.P
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/foundation/text/Q2;", "", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class Q2 {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final androidx.compose.ui.text.o0 f30513a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.l
    public androidx.compose.ui.layout.A f30514b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.l
    public androidx.compose.ui.layout.A f30515c;

    public Q2(androidx.compose.ui.text.o0 o0Var, androidx.compose.ui.layout.A a12, androidx.compose.ui.layout.A a13, int i12, C42822w c42822w) {
        a12 = (i12 & 2) != 0 ? null : a12;
        a13 = (i12 & 4) != 0 ? null : a13;
        this.f30513a = o0Var;
        this.f30514b = a12;
        this.f30515c = a13;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final long a(long r7) {
        /*
            r6 = this;
            androidx.compose.ui.layout.A r0 = r6.f30514b
            if (r0 == 0) goto L1f
            boolean r1 = r0.m()
            if (r1 == 0) goto L16
            androidx.compose.ui.layout.A r1 = r6.f30515c
            if (r1 == 0) goto L14
            r2 = 1
            l0.j r0 = r1.P(r0, r2)
            goto L1d
        L14:
            r0 = 0
            goto L1d
        L16:
            l0.j$a r0 = l0.j.f413388e
            r0.getClass()
            l0.j r0 = l0.j.f413389f
        L1d:
            if (r0 != 0) goto L26
        L1f:
            l0.j$a r0 = l0.j.f413388e
            r0.getClass()
            l0.j r0 = l0.j.f413389f
        L26:
            r1 = 32
            long r2 = r7 >> r1
            int r2 = (int) r2
            float r3 = java.lang.Float.intBitsToFloat(r2)
            float r4 = r0.f413390a
            int r3 = (r3 > r4 ? 1 : (r3 == r4 ? 0 : -1))
            if (r3 >= 0) goto L36
            goto L45
        L36:
            float r3 = java.lang.Float.intBitsToFloat(r2)
            float r4 = r0.f413392c
            int r3 = (r3 > r4 ? 1 : (r3 == r4 ? 0 : -1))
            if (r3 <= 0) goto L41
            goto L45
        L41:
            float r4 = java.lang.Float.intBitsToFloat(r2)
        L45:
            r2 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r7 = r7 & r2
            int r7 = (int) r7
            float r8 = java.lang.Float.intBitsToFloat(r7)
            float r5 = r0.f413391b
            int r8 = (r8 > r5 ? 1 : (r8 == r5 ? 0 : -1))
            if (r8 >= 0) goto L57
            goto L66
        L57:
            float r8 = java.lang.Float.intBitsToFloat(r7)
            float r5 = r0.f413393d
            int r8 = (r8 > r5 ? 1 : (r8 == r5 ? 0 : -1))
            if (r8 <= 0) goto L62
            goto L66
        L62:
            float r5 = java.lang.Float.intBitsToFloat(r7)
        L66:
            int r7 = java.lang.Float.floatToRawIntBits(r4)
            long r7 = (long) r7
            int r0 = java.lang.Float.floatToRawIntBits(r5)
            long r4 = (long) r0
            long r7 = r7 << r1
            long r0 = r4 & r2
            long r7 = r7 | r0
            l0.g$a r0 = l0.g.f413384b
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.Q2.a(long):long");
    }

    public final int b(long j12, boolean z12) {
        if (z12) {
            j12 = a(j12);
        }
        return this.f30513a.f42527b.g(d(j12));
    }

    public final boolean c(long j12) {
        long jD2 = d(a(j12));
        float fIntBitsToFloat = Float.intBitsToFloat((int) (4294967295L & jD2));
        androidx.compose.ui.text.o0 o0Var = this.f30513a;
        int iE2 = o0Var.f42527b.e(fIntBitsToFloat);
        int i12 = (int) (jD2 >> 32);
        return Float.intBitsToFloat(i12) >= o0Var.g(iE2) && Float.intBitsToFloat(i12) <= o0Var.h(iE2);
    }

    public final long d(long j12) {
        androidx.compose.ui.layout.A a12;
        androidx.compose.ui.layout.A a13 = this.f30514b;
        if (a13 == null) {
            return j12;
        }
        if (!a13.m()) {
            a13 = null;
        }
        if (a13 == null || (a12 = this.f30515c) == null) {
            return j12;
        }
        androidx.compose.ui.layout.A a14 = a12.m() ? a12 : null;
        return a14 == null ? j12 : a13.z(a14, j12);
    }

    public final long e(long j12) {
        androidx.compose.ui.layout.A a12;
        androidx.compose.ui.layout.A a13 = this.f30514b;
        if (a13 == null) {
            return j12;
        }
        if (!a13.m()) {
            a13 = null;
        }
        if (a13 == null || (a12 = this.f30515c) == null) {
            return j12;
        }
        androidx.compose.ui.layout.A a14 = a12.m() ? a12 : null;
        return a14 == null ? j12 : a14.z(a13, j12);
    }
}
