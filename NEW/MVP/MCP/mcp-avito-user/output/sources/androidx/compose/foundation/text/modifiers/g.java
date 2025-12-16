package androidx.compose.foundation.text.modifiers;

import androidx.compose.ui.unit.y;
import androidx.compose.ui.unit.z;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: MultiParagraphLayoutCache.kt */
@s0
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"foundation_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public static final long f31646a = z.e(14);

    public static final long a(long j12, long j13) {
        if (!y.e(j13)) {
            throw new IllegalArgumentException("The multiplier must be in em, but was " + ((Object) y.f(j13)) + '.');
        }
        if (y.e(j12)) {
            throw new IllegalStateException("Cannot convert Em to Px when style.fontSize is Em (" + ((Object) y.f(j13)) + "). Please declare the style.fontSize with Sp units instead.");
        }
        long j14 = j12 & 1095216660480L;
        if (j14 != 0) {
            float fD2 = y.d(j13);
            z.a(j12);
            return z.f(j14, y.d(j12) * fD2);
        }
        float fD3 = y.d(j13);
        long j15 = f31646a;
        z.a(j15);
        return z.f(1095216660480L & j15, y.d(j15) * fD3);
    }
}
