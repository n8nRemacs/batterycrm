package defpackage;

import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public abstract class h0e implements py4 {
    public static long a(TimeUnit timeUnit) {
        return !j0e.a ? timeUnit.convert(System.currentTimeMillis(), TimeUnit.MILLISECONDS) : timeUnit.convert(System.nanoTime(), TimeUnit.NANOSECONDS);
    }

    public py4 b(Runnable runnable) {
        return c(runnable, 0L, TimeUnit.NANOSECONDS);
    }

    public abstract py4 c(Runnable runnable, long j, TimeUnit timeUnit);

    public final py4 d(Runnable runnable, long j, long j2, TimeUnit timeUnit) {
        n42 n42Var = new n42(2);
        n42 n42Var2 = new n42(n42Var);
        long nanos = timeUnit.toNanos(j2);
        long jA = a(TimeUnit.NANOSECONDS);
        py4 py4VarC = c(new g0e(this, timeUnit.toNanos(j) + jA, runnable, jA, n42Var2, nanos), j, timeUnit);
        if (py4VarC == cd5.a) {
            return py4VarC;
        }
        ty4.d(n42Var, py4VarC);
        return n42Var2;
    }
}
