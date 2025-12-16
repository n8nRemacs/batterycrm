package io.reactivex.rxjava3.internal.util;

import androidx.compose.foundation.text.selection.C21030p;
import java.util.concurrent.atomic.AtomicLong;
import s41.C47998a;

/* compiled from: BackpressureHelper.java */
/* loaded from: classes8.dex */
public final class c {
    public c() {
        throw new IllegalStateException("No instances!");
    }

    public static long a(@j41.e AtomicLong atomicLong, long j12) {
        long j13;
        do {
            j13 = atomicLong.get();
            if (j13 == Long.MAX_VALUE) {
                return Long.MAX_VALUE;
            }
        } while (!atomicLong.compareAndSet(j13, c(j13, j12)));
        return j13;
    }

    public static long b(@j41.e AtomicLong atomicLong, long j12) {
        long j13;
        do {
            j13 = atomicLong.get();
            if (j13 == Long.MIN_VALUE) {
                return Long.MIN_VALUE;
            }
            if (j13 == Long.MAX_VALUE) {
                return Long.MAX_VALUE;
            }
        } while (!atomicLong.compareAndSet(j13, c(j13, j12)));
        return j13;
    }

    public static long c(long j12, long j13) {
        long j14 = j12 + j13;
        if (j14 < 0) {
            return Long.MAX_VALUE;
        }
        return j14;
    }

    public static long d(long j12, long j13) {
        long j14 = j12 * j13;
        if (((j12 | j13) >>> 31) == 0 || j14 / j12 == j13) {
            return j14;
        }
        return Long.MAX_VALUE;
    }

    public static long e(@j41.e AtomicLong atomicLong, long j12) {
        long j13;
        long j14;
        do {
            j13 = atomicLong.get();
            if (j13 == Long.MAX_VALUE) {
                return Long.MAX_VALUE;
            }
            j14 = j13 - j12;
            if (j14 < 0) {
                C47998a.b(new IllegalStateException(C21030p.a(j14, "More produced than requested: ")));
                j14 = 0;
            }
        } while (!atomicLong.compareAndSet(j13, j14));
        return j14;
    }

    public static long f(@j41.e AtomicLong atomicLong, long j12) {
        long j13;
        long j14;
        do {
            j13 = atomicLong.get();
            if (j13 == Long.MIN_VALUE) {
                return Long.MIN_VALUE;
            }
            if (j13 == Long.MAX_VALUE) {
                return Long.MAX_VALUE;
            }
            j14 = j13 - j12;
            if (j14 < 0) {
                C47998a.b(new IllegalStateException(C21030p.a(j14, "More produced than requested: ")));
                j14 = 0;
            }
        } while (!atomicLong.compareAndSet(j13, j14));
        return j14;
    }
}
