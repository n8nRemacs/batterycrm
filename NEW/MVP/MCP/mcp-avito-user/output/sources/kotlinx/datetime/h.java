package kotlinx.datetime;

import kotlin.Metadata;
import okhttp3.internal.http2.Http2Connection;

/* compiled from: DateTimePeriod.kt */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"kotlinx-datetime"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class h {
    @Y61.k
    public static final AbstractC43321f a(int i12, int i13, int i14, int i15, int i16, long j12, int i17) {
        int iB2 = b(i12, i13);
        long j13 = 60;
        long j14 = ((i15 * j13) + i16) * j13;
        long j15 = Http2Connection.DEGRADED_PONG_TIMEOUT_NS;
        long j16 = (j12 / j15) + j14 + i17;
        try {
            long j17 = j12 % j15;
            if (j16 > 0 && j17 < 0) {
                j16--;
                j17 += 1000000000;
            } else if (j16 < 0 && j17 > 0) {
                j16++;
                j17 -= 1000000000;
            }
            long jAddExact = Math.addExact(Math.multiplyExact(j16, 1000000000L), j17);
            return jAddExact != 0 ? new g(iB2, i14, jAddExact) : new C43320e(iB2, i14);
        } catch (ArithmeticException unused) {
            StringBuilder sbY = androidx.appcompat.app.r.y(i15, i16, "The total number of nanoseconds in ", " hours, ", " minutes, ");
            sbY.append(i17);
            sbY.append(" seconds, and ");
            sbY.append(j12);
            sbY.append(" nanoseconds overflows a Long");
            throw new IllegalArgumentException(sbY.toString());
        }
    }

    public static final int b(int i12, int i13) {
        long j12 = (i12 * 12) + i13;
        if (-2147483648L > j12 || j12 > 2147483647L) {
            throw new IllegalArgumentException(androidx.appcompat.app.r.l(i12, i13, "The total number of months in ", " years and ", " months overflows an Int"));
        }
        return (int) j12;
    }
}
