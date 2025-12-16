package defpackage;

import java.util.Objects;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public abstract class j0e {
    public static final boolean a = Boolean.getBoolean("rx3.scheduler.use-nanotime");
    public static final long b;

    static {
        long jLongValue = Long.getLong("rx3.scheduler.drift-tolerance", 15L).longValue();
        String property = System.getProperty("rx3.scheduler.drift-tolerance-unit", "minutes");
        b = "seconds".equalsIgnoreCase(property) ? TimeUnit.SECONDS.toNanos(jLongValue) : "milliseconds".equalsIgnoreCase(property) ? TimeUnit.MILLISECONDS.toNanos(jLongValue) : TimeUnit.MINUTES.toNanos(jLongValue);
    }

    public abstract h0e a();

    public py4 b(Runnable runnable) {
        return c(runnable, 0L, TimeUnit.NANOSECONDS);
    }

    public py4 c(Runnable runnable, long j, TimeUnit timeUnit) {
        h0e h0eVarA = a();
        Objects.requireNonNull(runnable, "run is null");
        f0e f0eVar = new f0e(runnable, h0eVarA);
        h0eVarA.c(f0eVar, j, timeUnit);
        return f0eVar;
    }

    public py4 d(Runnable runnable, long j, long j2, TimeUnit timeUnit) {
        h0e h0eVarA = a();
        c07 c07Var = new c07(runnable, h0eVarA);
        py4 py4VarD = h0eVarA.d(c07Var, j, j2, timeUnit);
        return py4VarD == cd5.a ? py4VarD : c07Var;
    }
}
