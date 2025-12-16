package kotlin.internal;

import kotlin.Metadata;
import kotlin.X;

/* compiled from: progressionUtil.kt */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"kotlin-stdlib"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class n {
    @X
    public static final int a(int i12, int i13, int i14) {
        if (i14 > 0) {
            if (i12 >= i13) {
                return i13;
            }
            int i15 = i13 % i14;
            if (i15 < 0) {
                i15 += i14;
            }
            int i16 = i12 % i14;
            if (i16 < 0) {
                i16 += i14;
            }
            int i17 = (i15 - i16) % i14;
            if (i17 < 0) {
                i17 += i14;
            }
            return i13 - i17;
        }
        if (i14 >= 0) {
            throw new IllegalArgumentException("Step is zero.");
        }
        if (i12 <= i13) {
            return i13;
        }
        int i18 = -i14;
        int i19 = i12 % i18;
        if (i19 < 0) {
            i19 += i18;
        }
        int i22 = i13 % i18;
        if (i22 < 0) {
            i22 += i18;
        }
        int i23 = (i19 - i22) % i18;
        if (i23 < 0) {
            i23 += i18;
        }
        return i13 + i23;
    }

    @X
    public static final long b(long j12, long j13, long j14) {
        if (j14 > 0) {
            if (j12 >= j13) {
                return j13;
            }
            long j15 = j13 % j14;
            if (j15 < 0) {
                j15 += j14;
            }
            long j16 = j12 % j14;
            if (j16 < 0) {
                j16 += j14;
            }
            long j17 = (j15 - j16) % j14;
            if (j17 < 0) {
                j17 += j14;
            }
            return j13 - j17;
        }
        if (j14 >= 0) {
            throw new IllegalArgumentException("Step is zero.");
        }
        if (j12 <= j13) {
            return j13;
        }
        long j18 = -j14;
        long j19 = j12 % j18;
        if (j19 < 0) {
            j19 += j18;
        }
        long j22 = j13 % j18;
        if (j22 < 0) {
            j22 += j18;
        }
        long j23 = (j19 - j22) % j18;
        if (j23 < 0) {
            j23 += j18;
        }
        return j13 + j23;
    }
}
