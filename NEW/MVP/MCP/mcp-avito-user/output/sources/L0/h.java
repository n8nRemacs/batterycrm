package l0;

import androidx.compose.runtime.F3;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;
import l0.g;

/* compiled from: Offset.kt */
@s0
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"ui-geometry_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class h {
    @F3
    public static final long a(float f12, float f13) {
        long jFloatToRawIntBits = (Float.floatToRawIntBits(f13) & 4294967295L) | (Float.floatToRawIntBits(f12) << 32);
        g.a aVar = g.f413384b;
        return jFloatToRawIntBits;
    }

    @F3
    public static final long b(long j12, long j13, float f12) {
        float fB2 = E0.e.b(Float.intBitsToFloat((int) (j12 >> 32)), Float.intBitsToFloat((int) (j13 >> 32)), f12);
        float fB3 = E0.e.b(Float.intBitsToFloat((int) (j12 & 4294967295L)), Float.intBitsToFloat((int) (j13 & 4294967295L)), f12);
        long jFloatToRawIntBits = (Float.floatToRawIntBits(fB2) << 32) | (Float.floatToRawIntBits(fB3) & 4294967295L);
        g.a aVar = g.f413384b;
        return jFloatToRawIntBits;
    }
}
