package androidx.compose.ui.unit;

import androidx.compose.runtime.F3;
import androidx.compose.ui.unit.u;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;
import l0.n;

/* compiled from: IntSize.kt */
@s0
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"ui-unit_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class v {
    @F3
    public static final long a(int i12, int i13) {
        long j12 = (i13 & 4294967295L) | (i12 << 32);
        u.a aVar = u.f42871b;
        return j12;
    }

    @F3
    public static final long b(long j12) {
        long jRound = (Math.round(Float.intBitsToFloat((int) (j12 & 4294967295L))) & 4294967295L) | (Math.round(Float.intBitsToFloat((int) (j12 >> 32))) << 32);
        u.a aVar = u.f42871b;
        return jRound;
    }

    @F3
    public static final long c(long j12) {
        long jFloatToRawIntBits = (Float.floatToRawIntBits((int) (j12 & 4294967295L)) & 4294967295L) | (Float.floatToRawIntBits((int) (j12 >> 32)) << 32);
        n.a aVar = l0.n.f413402b;
        return jFloatToRawIntBits;
    }
}
