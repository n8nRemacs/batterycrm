package androidx.compose.foundation;

import androidx.compose.runtime.F3;
import kotlin.Metadata;
import l0.C43522a;

/* compiled from: Border.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"foundation_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* renamed from: androidx.compose.foundation.i0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C20529i0 {
    @F3
    @Y61.k
    public static final androidx.compose.ui.v a(@Y61.k androidx.compose.ui.v vVar, float f12, long j12, @Y61.k androidx.compose.ui.graphics.h1 h1Var) {
        return b(vVar, f12, new androidx.compose.ui.graphics.k1(j12, null), h1Var);
    }

    @F3
    @Y61.k
    public static final androidx.compose.ui.v b(@Y61.k androidx.compose.ui.v vVar, float f12, @Y61.k androidx.compose.ui.graphics.J j12, @Y61.k androidx.compose.ui.graphics.h1 h1Var) {
        return vVar.d0(new BorderModifierNodeElement(f12, j12, h1Var, null));
    }

    public static final long c(long j12, float f12) {
        float fMax = Math.max(0.0f, Float.intBitsToFloat((int) (j12 >> 32)) - f12);
        float fMax2 = Math.max(0.0f, Float.intBitsToFloat((int) (j12 & 4294967295L)) - f12);
        long jFloatToRawIntBits = (Float.floatToRawIntBits(fMax) << 32) | (Float.floatToRawIntBits(fMax2) & 4294967295L);
        C43522a.C11768a c11768a = C43522a.f413378b;
        return jFloatToRawIntBits;
    }
}
