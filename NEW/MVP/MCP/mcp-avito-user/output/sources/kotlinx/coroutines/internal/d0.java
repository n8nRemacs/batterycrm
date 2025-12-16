package kotlinx.coroutines.internal;

import kotlin.Metadata;
import kotlin.text.C43066x;

@Metadata(d1 = {"kotlinx/coroutines/internal/e0", "kotlinx/coroutines/internal/f0"}, d2 = {}, k = 4, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class d0 {
    public static final int a() {
        return e0.f411895a;
    }

    public static final long b(@Y61.k String str, long j12, long j13, long j14) {
        String strC = c(str);
        if (strC == null) {
            return j12;
        }
        Long lZ02 = C43066x.z0(strC);
        if (lZ02 == null) {
            throw new IllegalStateException(("System property '" + str + "' has unrecognized value '" + strC + '\'').toString());
        }
        long jLongValue = lZ02.longValue();
        if (j13 <= jLongValue && jLongValue <= j14) {
            return jLongValue;
        }
        throw new IllegalStateException(("System property '" + str + "' should be in range " + j13 + ".." + j14 + ", but is '" + jLongValue + '\'').toString());
    }

    @Y61.l
    public static final String c(@Y61.k String str) {
        int i12 = e0.f411895a;
        try {
            return System.getProperty(str);
        } catch (SecurityException unused) {
            return null;
        }
    }

    public static int d(int i12, int i13, String str) {
        return (int) b(str, i12, 1, (i13 & 8) != 0 ? Integer.MAX_VALUE : 2097150);
    }
}
