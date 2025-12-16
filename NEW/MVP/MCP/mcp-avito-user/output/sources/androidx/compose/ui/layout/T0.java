package androidx.compose.ui.layout;

import androidx.compose.runtime.F3;
import kotlin.Metadata;
import l0.n;

/* compiled from: ScaleFactor.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"ui_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class T0 {
    @F3
    public static final long a(long j12, long j13) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j13 >> 32)) * Float.intBitsToFloat((int) (j12 >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j13 & 4294967295L)) * Float.intBitsToFloat((int) (j12 & 4294967295L));
        long jFloatToRawIntBits = (Float.floatToRawIntBits(fIntBitsToFloat2) & 4294967295L) | (Float.floatToRawIntBits(fIntBitsToFloat) << 32);
        n.a aVar = l0.n.f413402b;
        return jFloatToRawIntBits;
    }
}
