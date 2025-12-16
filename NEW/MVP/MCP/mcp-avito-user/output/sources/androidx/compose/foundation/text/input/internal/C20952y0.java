package androidx.compose.foundation.text.input.internal;

import kotlin.Metadata;

/* compiled from: MathUtils.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"foundation_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* renamed from: androidx.compose.foundation.text.input.internal.y0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C20952y0 {
    public static final float a(long j12, l0.j jVar) {
        if (androidx.compose.foundation.text.selection.M0.a(j12, jVar)) {
            return 0.0f;
        }
        float f12 = l0.g.f(l0.g.i(jVar.i(), j12));
        if (f12 >= Float.MAX_VALUE) {
            f12 = Float.MAX_VALUE;
        }
        float f13 = l0.g.f(l0.g.i((Float.floatToRawIntBits(jVar.f413392c) << 32) | (Float.floatToRawIntBits(jVar.f413391b) & 4294967295L), j12));
        if (f13 < f12) {
            f12 = f13;
        }
        float f14 = l0.g.f(l0.g.i(jVar.d(), j12));
        if (f14 < f12) {
            f12 = f14;
        }
        float f15 = l0.g.f(l0.g.i(jVar.e(), j12));
        return f15 < f12 ? f15 : f12;
    }
}
