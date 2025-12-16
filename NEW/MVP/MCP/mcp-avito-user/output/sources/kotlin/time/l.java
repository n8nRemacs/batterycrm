package kotlin.time;

import kotlin.Metadata;
import kotlin.jvm.internal.s0;
import kotlin.time.e;

/* compiled from: longSaturatedMath.kt */
@s0
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"kotlin-stdlib"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class l {
    public static final long a(long j12) {
        if (j12 < 0) {
            e.f410651c.getClass();
            return e.f410653e;
        }
        e.f410651c.getClass();
        return e.f410652d;
    }

    public static final long b(long j12, long j13, DurationUnit durationUnit) {
        long j14 = j12 - j13;
        if (((j14 ^ j12) & (~(j14 ^ j13))) >= 0) {
            return g.h(j14, durationUnit);
        }
        DurationUnit durationUnit2 = DurationUnit.f410633e;
        if (durationUnit.compareTo(durationUnit2) >= 0) {
            return e.n(a(j14));
        }
        long jConvert = durationUnit.f410640b.convert(1L, durationUnit2.f410640b);
        long j15 = (j12 / jConvert) - (j13 / jConvert);
        long j16 = (j12 % jConvert) - (j13 % jConvert);
        e.a aVar = e.f410651c;
        return e.k(g.h(j15, durationUnit2), g.h(j16, durationUnit));
    }

    public static final long c(long j12, long j13, @Y61.k DurationUnit durationUnit) {
        if (((j13 - 1) | 1) != Long.MAX_VALUE) {
            return (1 | (j12 - 1)) == Long.MAX_VALUE ? a(j12) : b(j12, j13, durationUnit);
        }
        if (j12 != j13) {
            return e.n(a(j13));
        }
        e.f410651c.getClass();
        return 0L;
    }
}
