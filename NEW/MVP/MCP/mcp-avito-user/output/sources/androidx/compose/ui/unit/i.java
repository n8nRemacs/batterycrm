package androidx.compose.ui.unit;

import androidx.compose.runtime.F3;
import androidx.compose.ui.unit.l;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: Dp.kt */
@s0
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"ui-unit_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class i {
    @F3
    public static final long a(float f12, float f13) {
        long jFloatToRawIntBits = (Float.floatToRawIntBits(f13) & 4294967295L) | (Float.floatToRawIntBits(f12) << 32);
        l.a aVar = l.f42859b;
        return jFloatToRawIntBits;
    }
}
