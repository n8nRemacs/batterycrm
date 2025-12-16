package defpackage;

import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.LockSupport;
import kotlinx.coroutines.internal.Symbol;
import ru.ok.android.onelog.impl.BuildConfig;

/* loaded from: classes.dex */
public final class km4 extends ji5 implements Runnable {
    public static final km4 Z;
    private static volatile Thread _thread;
    private static volatile int debugStatus;
    public static final long s0;

    static {
        Long l;
        km4 km4Var = new km4();
        Z = km4Var;
        km4Var.P(false);
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        try {
            l = Long.getLong("kotlinx.coroutines.DefaultExecutor.keepAlive", 1000L);
        } catch (SecurityException unused) {
            l = 1000L;
        }
        s0 = timeUnit.toNanos(l.longValue());
    }

    @Override // defpackage.ki5
    public final void i0(long j, hi5 hi5Var) {
        throw new RejectedExecutionException("DefaultExecutor was shut down. This error indicates that Dispatchers.shutdown() was invoked prior to completion of exiting coroutines, leaving coroutines in incomplete state. Please refer to Dispatchers.shutdown documentation for more details");
    }

    @Override // defpackage.ji5, defpackage.ms4
    public final sy4 invokeOnTimeout(long j, Runnable runnable, x74 x74Var) {
        Symbol symbol = li5.a;
        long j2 = j > 0 ? j >= 9223372036854L ? BuildConfig.MAX_TIME_TO_UPLOAD : 1000000 * j : 0L;
        if (j2 >= 4611686018427387903L) {
            return iia.a;
        }
        long jNanoTime = System.nanoTime();
        gi5 gi5Var = new gi5(runnable, j2 + jNanoTime);
        n0(jNanoTime, gi5Var);
        return gi5Var;
    }

    @Override // defpackage.ji5
    public final void j0(Runnable runnable) {
        if (debugStatus == 4) {
            throw new RejectedExecutionException("DefaultExecutor was shut down. This error indicates that Dispatchers.shutdown() was invoked prior to completion of exiting coroutines, leaving coroutines in incomplete state. Please refer to Dispatchers.shutdown documentation for more details");
        }
        super.j0(runnable);
    }

    public final synchronized void o0() {
        int i = debugStatus;
        if (i == 2 || i == 3) {
            debugStatus = 3;
            ji5.o.set(this, null);
            ji5.X.set(this, null);
            notifyAll();
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean zM0;
        r7g.a.set(this);
        try {
            synchronized (this) {
                int i = debugStatus;
                if (i == 2 || i == 3) {
                    if (zM0) {
                        return;
                    } else {
                        return;
                    }
                }
                debugStatus = 1;
                notifyAll();
                long j = Long.MAX_VALUE;
                while (true) {
                    Thread.interrupted();
                    long jZ = Z();
                    if (jZ == BuildConfig.MAX_TIME_TO_UPLOAD) {
                        long jNanoTime = System.nanoTime();
                        if (j == BuildConfig.MAX_TIME_TO_UPLOAD) {
                            j = s0 + jNanoTime;
                        }
                        long j2 = j - jNanoTime;
                        if (j2 <= 0) {
                            _thread = null;
                            o0();
                            if (m0()) {
                                return;
                            }
                            y();
                            return;
                        }
                        if (jZ > j2) {
                            jZ = j2;
                        }
                    } else {
                        j = Long.MAX_VALUE;
                    }
                    if (jZ > 0) {
                        int i2 = debugStatus;
                        if (i2 == 2 || i2 == 3) {
                            _thread = null;
                            o0();
                            if (m0()) {
                                return;
                            }
                            y();
                            return;
                        }
                        LockSupport.parkNanos(this, jZ);
                    }
                }
            }
        } finally {
            _thread = null;
            o0();
            if (!m0()) {
                y();
            }
        }
    }

    @Override // defpackage.ji5, defpackage.ki5
    public final void shutdown() {
        debugStatus = 4;
        super.shutdown();
    }

    @Override // defpackage.z74
    /* renamed from: toString */
    public final String getName() {
        return "DefaultExecutor";
    }

    @Override // defpackage.ki5
    public final Thread y() {
        Thread thread;
        Thread thread2 = _thread;
        if (thread2 != null) {
            return thread2;
        }
        synchronized (this) {
            thread = _thread;
            if (thread == null) {
                thread = new Thread(this, "kotlinx.coroutines.DefaultExecutor");
                _thread = thread;
                thread.setContextClassLoader(km4.class.getClassLoader());
                thread.setDaemon(true);
                thread.start();
            }
        }
        return thread;
    }
}
