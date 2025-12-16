package defpackage;

import java.util.concurrent.atomic.AtomicLong;
import ru.ok.android.onelog.impl.BuildConfig;

/* loaded from: classes.dex */
public abstract class nui {
    public static Boolean a;

    public static long a(AtomicLong atomicLong, long j) {
        long j2;
        do {
            j2 = atomicLong.get();
            if (j2 == BuildConfig.MAX_TIME_TO_UPLOAD) {
                return BuildConfig.MAX_TIME_TO_UPLOAD;
            }
        } while (!atomicLong.compareAndSet(j2, b(j2, j)));
        return j2;
    }

    public static long b(long j, long j2) {
        long j3 = j + j2;
        return j3 < 0 ? BuildConfig.MAX_TIME_TO_UPLOAD : j3;
    }

    public static void c(AtomicLong atomicLong, long j) {
        long j2;
        long j3;
        do {
            j2 = atomicLong.get();
            if (j2 == BuildConfig.MAX_TIME_TO_UPLOAD) {
                return;
            }
            j3 = j2 - j;
            if (j3 < 0) {
                t8j.a(new IllegalStateException(vb9.e(j3, "More produced than requested: ")));
                j3 = 0;
            }
        } while (!atomicLong.compareAndSet(j2, j3));
    }

    public static String d(int i) {
        if (i == 100) {
            return "HIGH_ACCURACY";
        }
        if (i == 102) {
            return "BALANCED_POWER_ACCURACY";
        }
        if (i == 104) {
            return "LOW_POWER";
        }
        if (i == 105) {
            return "PASSIVE";
        }
        throw new IllegalArgumentException();
    }
}
