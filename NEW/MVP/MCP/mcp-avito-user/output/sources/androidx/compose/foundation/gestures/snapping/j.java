package androidx.compose.foundation.gestures.snapping;

import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.pager.m0;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: PagerSnapLayoutInfoProvider.kt */
@s0
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"foundation_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class j {
    public static final float a(m0 m0Var) {
        return m0Var.l().getF29870e() == Orientation.f27426c ? Float.intBitsToFloat((int) (m0Var.p() >> 32)) : Float.intBitsToFloat((int) (m0Var.p() & 4294967295L));
    }

    public static final boolean b(m0 m0Var, float f12) {
        boolean f29873h = m0Var.l().getF29873h();
        boolean z12 = (m0Var.q() ? -f12 : a(m0Var)) > 0.0f;
        return (z12 && f29873h) || !(z12 || f29873h);
    }
}
