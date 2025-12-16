package androidx.compose.ui.unit;

import androidx.compose.runtime.F3;
import androidx.compose.ui.unit.q;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;
import l0.g;

/* compiled from: IntOffset.kt */
@s0
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"ui-unit_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class r {
    @F3
    public static final long a(int i12, int i13) {
        long j12 = (i13 & 4294967295L) | (i12 << 32);
        q.a aVar = q.f42862b;
        return j12;
    }

    @F3
    public static final long b(long j12, long j13) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j12 >> 32));
        q.a aVar = q.f42862b;
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j12 & 4294967295L)) + ((int) (j13 & 4294967295L));
        long jFloatToRawIntBits = (Float.floatToRawIntBits(fIntBitsToFloat + ((int) (j13 >> 32))) << 32) | (Float.floatToRawIntBits(fIntBitsToFloat2) & 4294967295L);
        g.a aVar2 = l0.g.f413384b;
        return jFloatToRawIntBits;
    }

    @F3
    public static final long c(long j12) {
        long jRound = (Math.round(Float.intBitsToFloat((int) (j12 & 4294967295L))) & 4294967295L) | (Math.round(Float.intBitsToFloat((int) (j12 >> 32))) << 32);
        q.a aVar = q.f42862b;
        return jRound;
    }
}
