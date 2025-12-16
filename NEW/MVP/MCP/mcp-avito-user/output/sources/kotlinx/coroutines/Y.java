package kotlinx.coroutines;

import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.LockSupport;
import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import kotlinx.coroutines.AbstractC43303t0;

/* compiled from: DefaultExecutor.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\u00020\u00012\u00060\u0002j\u0002`\u0003B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u001e\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0002@\u0002X\u0082\u000e¢\u0006\f\n\u0004\b\u0007\u0010\b\u0012\u0004\b\t\u0010\u0005R\u0016\u0010\u000b\u001a\u00020\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lkotlinx/coroutines/Y;", "Lkotlinx/coroutines/t0;", "Ljava/lang/Runnable;", "Lkotlinx/coroutines/Runnable;", "<init>", "()V", "Ljava/lang/Thread;", "_thread", "Ljava/lang/Thread;", "get_thread$annotations", "", "debugStatus", "I", "kotlinx-coroutines-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class Y extends AbstractC43303t0 implements Runnable {

    @Y61.l
    private static volatile Thread _thread;
    private static volatile int debugStatus;

    /* renamed from: j, reason: collision with root package name */
    @Y61.k
    public static final Y f410745j;

    /* renamed from: k, reason: collision with root package name */
    public static final long f410746k;

    static {
        Long l12;
        Y y12 = new Y();
        f410745j = y12;
        y12.D(false);
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        try {
            l12 = Long.getLong("kotlinx.coroutines.DefaultExecutor.keepAlive", 1000L);
        } catch (SecurityException unused) {
            l12 = 1000L;
        }
        f410746k = timeUnit.toNanos(l12.longValue());
    }

    @Override // kotlinx.coroutines.AbstractC43305u0
    @Y61.k
    /* renamed from: M */
    public final Thread getF411942j() {
        Thread thread = _thread;
        if (thread == null) {
            synchronized (this) {
                thread = _thread;
                if (thread == null) {
                    thread = new Thread(this, "kotlinx.coroutines.DefaultExecutor");
                    _thread = thread;
                    thread.setContextClassLoader(Y.class.getClassLoader());
                    thread.setDaemon(true);
                    thread.start();
                }
            }
        }
        return thread;
    }

    @Override // kotlinx.coroutines.AbstractC43305u0
    public final void T(long j12, @Y61.k AbstractC43303t0.c cVar) {
        throw new RejectedExecutionException("DefaultExecutor was shut down. This error indicates that Dispatchers.shutdown() was invoked prior to completion of exiting coroutines, leaving coroutines in incomplete state. Please refer to Dispatchers.shutdown documentation for more details");
    }

    @Override // kotlinx.coroutines.AbstractC43303t0
    public final void U(@Y61.k Runnable runnable) {
        if (debugStatus == 4) {
            throw new RejectedExecutionException("DefaultExecutor was shut down. This error indicates that Dispatchers.shutdown() was invoked prior to completion of exiting coroutines, leaving coroutines in incomplete state. Please refer to Dispatchers.shutdown documentation for more details");
        }
        super.U(runnable);
    }

    public final synchronized void X() {
        int i12 = debugStatus;
        if (i12 == 2 || i12 == 3) {
            debugStatus = 3;
            AbstractC43303t0.f412288g.set(this, null);
            AbstractC43303t0.f412289h.set(this, null);
            notifyAll();
        }
    }

    @Override // kotlinx.coroutines.AbstractC43303t0, kotlinx.coroutines.InterfaceC43082c0
    @Y61.k
    public final InterfaceC43268o0 g(long j12, @Y61.k Runnable runnable, @Y61.k CoroutineContext coroutineContext) {
        long jA2 = C43309w0.a(j12);
        if (jA2 >= 4611686018427387903L) {
            return C43224g1.f411855b;
        }
        long jNanoTime = System.nanoTime();
        AbstractC43303t0.b bVar = new AbstractC43303t0.b(jA2 + jNanoTime, runnable);
        W(jNanoTime, bVar);
        return bVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean zIsEmpty;
        w1.f412301a.getClass();
        w1.f412302b.set(this);
        try {
            synchronized (this) {
                int i12 = debugStatus;
                if (i12 == 2 || i12 == 3) {
                    if (zIsEmpty) {
                        return;
                    } else {
                        return;
                    }
                }
                debugStatus = 1;
                notifyAll();
                long j12 = Long.MAX_VALUE;
                long j13 = Long.MAX_VALUE;
                while (true) {
                    Thread.interrupted();
                    long jH2 = H();
                    if (jH2 == j12) {
                        long jNanoTime = System.nanoTime();
                        if (j13 == j12) {
                            j13 = f410746k + jNanoTime;
                        }
                        long j14 = j13 - jNanoTime;
                        if (j14 <= 0) {
                            _thread = null;
                            X();
                            if (isEmpty()) {
                                return;
                            }
                            getF411942j();
                            return;
                        }
                        jH2 = kotlin.ranges.s.d(jH2, j14);
                    } else {
                        j13 = Long.MAX_VALUE;
                    }
                    if (jH2 > 0) {
                        int i13 = debugStatus;
                        if (i13 == 2 || i13 == 3) {
                            _thread = null;
                            X();
                            if (isEmpty()) {
                                return;
                            }
                            getF411942j();
                            return;
                        }
                        LockSupport.parkNanos(this, jH2);
                    }
                    j12 = Long.MAX_VALUE;
                }
            }
        } finally {
            _thread = null;
            X();
            if (!isEmpty()) {
                getF411942j();
            }
        }
    }

    @Override // kotlinx.coroutines.AbstractC43303t0, kotlinx.coroutines.AbstractC43300s0
    public final void shutdown() {
        debugStatus = 4;
        super.shutdown();
    }
}
