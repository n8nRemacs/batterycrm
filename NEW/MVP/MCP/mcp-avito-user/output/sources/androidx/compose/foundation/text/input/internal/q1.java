package androidx.compose.foundation.text.input.internal;

import androidx.compose.runtime.C22082i3;
import kotlin.Metadata;
import l0.g;

/* compiled from: TextLayoutState.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"foundation_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class q1 {
    public static final long a(long j12, @Y61.k l0.j jVar) {
        int i12 = (int) (j12 >> 32);
        float fIntBitsToFloat = Float.intBitsToFloat(i12);
        float fIntBitsToFloat2 = jVar.f413390a;
        if (fIntBitsToFloat >= fIntBitsToFloat2) {
            float fIntBitsToFloat3 = Float.intBitsToFloat(i12);
            fIntBitsToFloat2 = jVar.f413392c;
            if (fIntBitsToFloat3 <= fIntBitsToFloat2) {
                fIntBitsToFloat2 = Float.intBitsToFloat(i12);
            }
        }
        int i13 = (int) (j12 & 4294967295L);
        float fIntBitsToFloat4 = Float.intBitsToFloat(i13);
        float fIntBitsToFloat5 = jVar.f413391b;
        if (fIntBitsToFloat4 >= fIntBitsToFloat5) {
            float fIntBitsToFloat6 = Float.intBitsToFloat(i13);
            fIntBitsToFloat5 = jVar.f413393d;
            if (fIntBitsToFloat6 <= fIntBitsToFloat5) {
                fIntBitsToFloat5 = Float.intBitsToFloat(i13);
            }
        }
        long jFloatToRawIntBits = (Float.floatToRawIntBits(fIntBitsToFloat2) << 32) | (Float.floatToRawIntBits(fIntBitsToFloat5) & 4294967295L);
        g.a aVar = l0.g.f413384b;
        return jFloatToRawIntBits;
    }

    public static final long b(@Y61.k p1 p1Var, long j12) {
        l0.g gVarA;
        androidx.compose.ui.layout.A aC2 = p1Var.c();
        if (aC2 == null) {
            return j12;
        }
        androidx.compose.ui.layout.A a12 = (androidx.compose.ui.layout.A) ((C22082i3) p1Var.f31204e).getF42167b();
        if (a12 != null) {
            gVarA = l0.g.a((aC2.m() && a12.m()) ? aC2.z(a12, j12) : j12);
        } else {
            gVarA = null;
        }
        return gVarA != null ? gVarA.f413387a : j12;
    }
}
