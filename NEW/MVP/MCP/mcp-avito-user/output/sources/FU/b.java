package FU;

import androidx.compose.ui.input.nestedscroll.i;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;
import kotlin.ranges.s;
import l0.g;

/* compiled from: NestedScroll.kt */
@s0
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"_design-modules_compose_shared_nested-scroll"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class b {
    public static final int a(long j12) {
        int i12 = Math.abs(Float.intBitsToFloat((int) (j12 >> 32))) >= 0.5f ? 1 : 0;
        return Math.abs(Float.intBitsToFloat((int) (j12 & 4294967295L))) >= 0.5f ? i12 | 2 : i12;
    }

    public static final long b(int[] iArr, long j12) {
        long jFloatToRawIntBits = (Float.floatToRawIntBits(Float.intBitsToFloat((int) (j12 >> 32)) >= 0.0f ? s.c(iArr[0] * (-1.0f), Float.intBitsToFloat(r1)) : s.a(iArr[0] * (-1.0f), Float.intBitsToFloat(r1))) << 32) | (Float.floatToRawIntBits(Float.intBitsToFloat((int) (j12 & 4294967295L)) >= 0.0f ? s.c(iArr[1] * (-1.0f), Float.intBitsToFloat(r9)) : s.a(iArr[1] * (-1.0f), Float.intBitsToFloat(r9))) & 4294967295L);
        g.a aVar = g.f413384b;
        return jFloatToRawIntBits;
    }

    public static final int c(int i12) {
        i.f40105b.getClass();
        return !i.a(i12, i.f40108e) ? 1 : 0;
    }

    public static final int d(float f12) {
        return ((int) (f12 >= 0.0f ? Math.ceil(f12) : Math.floor(f12))) * (-1);
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x0027  */
    @androidx.compose.runtime.InterfaceC22132o
    @Y61.k
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final FU.a e(@Y61.l androidx.compose.runtime.A r3) {
        /*
            r0 = -1398815205(0xffffffffac9fc61b, float:-4.541046E-12)
            r3.C(r0)
            androidx.compose.runtime.J3 r0 = androidx.compose.ui.platform.AndroidCompositionLocals_androidKt.f41073f
            java.lang.Object r0 = r3.o(r0)
            android.view.View r0 = (android.view.View) r0
            r1 = 1736960266(0x6787e90a, float:1.2836366E24)
            r3.C(r1)
            boolean r1 = r3.B(r0)
            java.lang.Object r2 = r3.t()
            if (r1 != 0) goto L27
            androidx.compose.runtime.A$a r1 = androidx.compose.runtime.A.f37866a
            r1.getClass()
            androidx.compose.runtime.A$a$a r1 = androidx.compose.runtime.A.a.f37868b
            if (r2 != r1) goto L2f
        L27:
            FU.a r2 = new FU.a
            r2.<init>(r0)
            r3.H(r2)
        L2f:
            FU.a r2 = (FU.a) r2
            r3.h()
            r3.h()
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: FU.b.e(androidx.compose.runtime.A):FU.a");
    }
}
