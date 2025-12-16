package defpackage;

import ru.ok.android.onelog.impl.BuildConfig;

/* loaded from: classes.dex */
public abstract class c9g implements xi3 {
    public static long a(long j) {
        int i = f2a.b;
        return (1 | (j - 1)) == BuildConfig.MAX_TIME_TO_UPLOAD ? s65.o(bsi.c(j)) : bsi.d(System.nanoTime() - f2a.a, j, y65.NANOSECONDS);
    }
}
