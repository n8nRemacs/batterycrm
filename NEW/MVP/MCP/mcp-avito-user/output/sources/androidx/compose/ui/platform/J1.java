package androidx.compose.ui.platform;

import kotlin.Metadata;
import l0.g;

/* compiled from: NestedScrollInteropConnection.android.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"ui_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
@X41.i
/* loaded from: classes.dex */
public final class J1 {
    public static final int a(long j12) {
        int i12 = Math.abs(Float.intBitsToFloat((int) (j12 >> 32))) >= 0.5f ? 1 : 0;
        return Math.abs(Float.intBitsToFloat((int) (j12 & 4294967295L))) >= 0.5f ? i12 | 2 : i12;
    }

    public static final long b(int[] iArr, long j12) {
        long jFloatToRawIntBits = (Float.floatToRawIntBits(Float.intBitsToFloat((int) (j12 >> 32)) >= 0.0f ? kotlin.ranges.s.c(iArr[0] * (-1.0f), Float.intBitsToFloat(r1)) : kotlin.ranges.s.a(iArr[0] * (-1.0f), Float.intBitsToFloat(r1))) << 32) | (Float.floatToRawIntBits(Float.intBitsToFloat((int) (j12 & 4294967295L)) >= 0.0f ? kotlin.ranges.s.c(iArr[1] * (-1.0f), Float.intBitsToFloat(r9)) : kotlin.ranges.s.a(iArr[1] * (-1.0f), Float.intBitsToFloat(r9))) & 4294967295L);
        g.a aVar = l0.g.f413384b;
        return jFloatToRawIntBits;
    }

    public static final int c(int i12) {
        androidx.compose.ui.input.nestedscroll.i.f40105b.getClass();
        return !androidx.compose.ui.input.nestedscroll.i.a(i12, androidx.compose.ui.input.nestedscroll.i.f40106c) ? 1 : 0;
    }

    public static final int d(float f12) {
        return ((int) (f12 >= 0.0f ? Math.ceil(f12) : Math.floor(f12))) * (-1);
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x001b  */
    @androidx.compose.runtime.InterfaceC22132o
    @Y61.k
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final androidx.compose.ui.platform.I1 e(@Y61.l androidx.compose.runtime.A r3) {
        /*
            androidx.compose.runtime.J3 r0 = androidx.compose.ui.platform.AndroidCompositionLocals_androidKt.f41073f
            java.lang.Object r0 = r3.o(r0)
            android.view.View r0 = (android.view.View) r0
            boolean r1 = r3.B(r0)
            java.lang.Object r2 = r3.t()
            if (r1 != 0) goto L1b
            androidx.compose.runtime.A$a r1 = androidx.compose.runtime.A.f37866a
            r1.getClass()
            androidx.compose.runtime.A$a$a r1 = androidx.compose.runtime.A.a.f37868b
            if (r2 != r1) goto L23
        L1b:
            androidx.compose.ui.platform.I1 r2 = new androidx.compose.ui.platform.I1
            r2.<init>(r0)
            r3.H(r2)
        L23:
            androidx.compose.ui.platform.I1 r2 = (androidx.compose.ui.platform.I1) r2
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.platform.J1.e(androidx.compose.runtime.A):androidx.compose.ui.platform.I1");
    }
}
