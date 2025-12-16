package androidx.compose.ui.unit;

import androidx.compose.ui.unit.y;
import kotlin.Metadata;
import kotlin.X;
import kotlin.jvm.internal.s0;

/* compiled from: TextUnit.kt */
@s0
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"ui-unit_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class z {
    @X
    public static final void a(long j12) {
        y.a aVar = y.f42874b;
        if ((j12 & 1095216660480L) == 0) {
            p.a("Cannot perform operation for Unspecified type.");
        }
    }

    @X
    public static final void b(long j12, long j13) {
        y.a aVar = y.f42874b;
        if (!(((j12 & 1095216660480L) == 0 || (1095216660480L & j13) == 0) ? false : true)) {
            p.a("Cannot perform operation for Unspecified type.");
        }
        if (A.b(y.c(j12), y.c(j13))) {
            return;
        }
        p.a("Cannot perform operation for " + ((Object) A.c(y.c(j12))) + " and " + ((Object) A.c(y.c(j13))));
    }

    public static final long c(double d12) {
        return f(4294967296L, (float) d12);
    }

    public static final long d(float f12) {
        return f(4294967296L, f12);
    }

    public static final long e(int i12) {
        return f(4294967296L, i12);
    }

    @X
    public static final long f(long j12, float f12) {
        long jFloatToRawIntBits = j12 | (Float.floatToRawIntBits(f12) & 4294967295L);
        y.a aVar = y.f42874b;
        return jFloatToRawIntBits;
    }
}
