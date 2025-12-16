package kotlin.time;

import java.util.Collection;
import java.util.concurrent.TimeUnit;
import kotlin.InterfaceC42733c0;
import kotlin.K0;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;
import kotlin.text.C43066x;
import kotlin.time.e;

/* compiled from: Duration.kt */
@s0
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"kotlin-stdlib"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class g {
    public static final long a(String str) {
        DurationUnit durationUnit;
        char cCharAt;
        int length = str.length();
        if (length == 0) {
            throw new IllegalArgumentException("The string is empty");
        }
        e.f410651c.getClass();
        char cCharAt2 = str.charAt(0);
        int i12 = (cCharAt2 == '+' || cCharAt2 == '-') ? 1 : 0;
        boolean z12 = (i12 > 0) && C43066x.j0(str, '-');
        if (length <= i12) {
            throw new IllegalArgumentException("No components");
        }
        if (str.charAt(i12) != 'P') {
            throw new IllegalArgumentException();
        }
        int i13 = i12 + 1;
        if (i13 == length) {
            throw new IllegalArgumentException();
        }
        DurationUnit durationUnit2 = null;
        long jK2 = 0;
        boolean z13 = false;
        while (i13 < length) {
            if (str.charAt(i13) != 'T') {
                int i14 = i13;
                while (i14 < str.length() && (('0' <= (cCharAt = str.charAt(i14)) && cCharAt < ':') || C43066x.r("+-.", cCharAt))) {
                    i14++;
                }
                String strSubstring = str.substring(i13, i14);
                if (strSubstring.length() == 0) {
                    throw new IllegalArgumentException();
                }
                int length2 = strSubstring.length() + i13;
                if (length2 < 0 || length2 >= str.length()) {
                    throw new IllegalArgumentException("Missing unit for value ".concat(strSubstring));
                }
                char cCharAt3 = str.charAt(length2);
                int i15 = length2 + 1;
                if (z13) {
                    if (cCharAt3 == 'H') {
                        durationUnit = DurationUnit.f410636h;
                    } else if (cCharAt3 == 'M') {
                        durationUnit = DurationUnit.f410635g;
                    } else {
                        if (cCharAt3 != 'S') {
                            throw new IllegalArgumentException(androidx.compose.ui.graphics.colorspace.e.l("Invalid duration ISO time unit: ", cCharAt3));
                        }
                        durationUnit = DurationUnit.f410634f;
                    }
                } else {
                    if (cCharAt3 != 'D') {
                        throw new IllegalArgumentException(androidx.compose.ui.graphics.colorspace.e.l("Invalid or unsupported duration ISO non-time unit: ", cCharAt3));
                    }
                    durationUnit = DurationUnit.f410637i;
                }
                if (durationUnit2 != null && durationUnit2.compareTo(durationUnit) <= 0) {
                    throw new IllegalArgumentException("Unexpected order of duration components");
                }
                int iH2 = C43066x.H('.', 0, 6, strSubstring);
                jK2 = (durationUnit != DurationUnit.f410634f || iH2 <= 0) ? e.k(jK2, h(e(strSubstring), durationUnit)) : e.k(e.k(jK2, h(e(strSubstring.substring(0, iH2)), durationUnit)), f(Double.parseDouble(strSubstring.substring(iH2)), durationUnit));
                durationUnit2 = durationUnit;
                i13 = i15;
            } else {
                if (z13 || (i13 = i13 + 1) == length) {
                    throw new IllegalArgumentException();
                }
                z13 = true;
            }
        }
        return z12 ? e.n(jK2) : jK2;
    }

    public static final long b(long j12) {
        long j13 = (j12 << 1) + 1;
        e.a aVar = e.f410651c;
        int i12 = f.f410655a;
        return j13;
    }

    public static final long c(long j12) {
        return (-4611686018426L > j12 || j12 >= 4611686018427L) ? b(kotlin.ranges.s.i(j12, -4611686018427387903L, 4611686018427387903L)) : d(j12 * 1000000);
    }

    public static final long d(long j12) {
        long j13 = j12 << 1;
        e.a aVar = e.f410651c;
        int i12 = f.f410655a;
        return j13;
    }

    public static final long e(String str) {
        int length = str.length();
        int i12 = (length <= 0 || !C43066x.r("+-", str.charAt(0))) ? 0 : 1;
        if (length - i12 > 16) {
            Iterable lVar = new kotlin.ranges.l(i12, str.length() - 1, 1);
            if (!(lVar instanceof Collection) || !((Collection) lVar).isEmpty()) {
                kotlin.ranges.k it = lVar.iterator();
                while (it.f406910d) {
                    char cCharAt = str.charAt(it.a());
                    if ('0' > cCharAt || cCharAt >= ':') {
                    }
                }
            }
            return str.charAt(0) == '-' ? Long.MIN_VALUE : Long.MAX_VALUE;
        }
        if (C43066x.h0(str, "+", false)) {
            str = C43066x.x(1, str);
        }
        return Long.parseLong(str);
    }

    @K0
    @InterfaceC42733c0
    public static final long f(double d12, @Y61.k DurationUnit durationUnit) {
        double dA2 = i.a(d12, durationUnit, DurationUnit.f410631c);
        if (Double.isNaN(dA2)) {
            throw new IllegalArgumentException("Duration value cannot be NaN.");
        }
        long jC2 = kotlin.math.b.c(dA2);
        return (-4611686018426999999L > jC2 || jC2 >= 4611686018427000000L) ? c(kotlin.math.b.c(i.a(d12, durationUnit, DurationUnit.f410633e))) : d(jC2);
    }

    @K0
    @InterfaceC42733c0
    public static final long g(int i12, @Y61.k DurationUnit durationUnit) {
        if (durationUnit.compareTo(DurationUnit.f410634f) > 0) {
            return h(i12, durationUnit);
        }
        return d(DurationUnit.f410631c.f410640b.convert(i12, durationUnit.f410640b));
    }

    @K0
    @InterfaceC42733c0
    public static final long h(long j12, @Y61.k DurationUnit durationUnit) {
        DurationUnit durationUnit2 = DurationUnit.f410631c;
        long jConvert = durationUnit.f410640b.convert(4611686018426999999L, durationUnit2.f410640b);
        long j13 = -jConvert;
        TimeUnit timeUnit = durationUnit.f410640b;
        return (j13 > j12 || j12 > jConvert) ? b(kotlin.ranges.s.i(DurationUnit.f410633e.f410640b.convert(j12, timeUnit), -4611686018427387903L, 4611686018427387903L)) : d(durationUnit2.f410640b.convert(j12, timeUnit));
    }
}
