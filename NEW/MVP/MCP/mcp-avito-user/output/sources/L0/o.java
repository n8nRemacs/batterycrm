package l0;

import androidx.compose.runtime.F3;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;
import l0.g;
import l0.n;

/* compiled from: Size.kt */
@s0
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"ui-geometry_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class o {
    @F3
    public static final long a(float f12, float f13) {
        long jFloatToRawIntBits = (Float.floatToRawIntBits(f13) & 4294967295L) | (Float.floatToRawIntBits(f12) << 32);
        n.a aVar = n.f413402b;
        return jFloatToRawIntBits;
    }

    public static final long b(long j12) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j12 >> 32)) / 2.0f;
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j12 & 4294967295L)) / 2.0f;
        long jFloatToRawIntBits = (Float.floatToRawIntBits(fIntBitsToFloat2) & 4294967295L) | (Float.floatToRawIntBits(fIntBitsToFloat) << 32);
        g.a aVar = g.f413384b;
        return jFloatToRawIntBits;
    }

    @F3
    @Y61.k
    public static final j c(long j12) {
        g.f413384b.getClass();
        return k.a(0L, j12);
    }
}
