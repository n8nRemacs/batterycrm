package defpackage;

import java.util.Locale;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import java.util.logging.Level;
import java.util.logging.Logger;

/* loaded from: classes.dex */
public abstract class k4 implements ha8 {
    public static final gpi X;
    public static final Object Y;
    public static final boolean d = Boolean.parseBoolean(System.getProperty("guava.concurrent.generate_cancellation_cause", "false"));
    public static final Logger o = Logger.getLogger(k4.class.getName());
    public volatile Object a;
    public volatile g4 b;
    public volatile j4 c;

    static {
        gpi i4Var;
        try {
            i4Var = new h4(AtomicReferenceFieldUpdater.newUpdater(j4.class, Thread.class, "a"), AtomicReferenceFieldUpdater.newUpdater(j4.class, j4.class, "b"), AtomicReferenceFieldUpdater.newUpdater(k4.class, j4.class, "c"), AtomicReferenceFieldUpdater.newUpdater(k4.class, g4.class, "b"), AtomicReferenceFieldUpdater.newUpdater(k4.class, Object.class, "a"));
            th = null;
        } catch (Throwable th) {
            th = th;
            i4Var = new i4();
        }
        X = i4Var;
        if (th != null) {
            o.log(Level.SEVERE, "SafeAtomicHelper is broken!", th);
        }
        Y = new Object();
    }

    public static void e(k4 k4Var) {
        j4 j4Var;
        g4 g4Var;
        g4 g4Var2;
        g4 g4Var3;
        do {
            j4Var = k4Var.c;
        } while (!X.c(k4Var, j4Var, j4.c));
        while (true) {
            g4Var = null;
            if (j4Var == null) {
                break;
            }
            Thread thread = j4Var.a;
            if (thread != null) {
                j4Var.a = null;
                LockSupport.unpark(thread);
            }
            j4Var = j4Var.b;
        }
        k4Var.c();
        do {
            g4Var2 = k4Var.b;
        } while (!X.a(k4Var, g4Var2, g4.d));
        while (true) {
            g4Var3 = g4Var;
            g4Var = g4Var2;
            if (g4Var == null) {
                break;
            }
            g4Var2 = g4Var.c;
            g4Var.c = g4Var3;
        }
        while (g4Var3 != null) {
            g4 g4Var4 = g4Var3.c;
            g(g4Var3.a, g4Var3.b);
            g4Var3 = g4Var4;
        }
    }

    public static void g(Runnable runnable, Executor executor) {
        try {
            executor.execute(runnable);
        } catch (RuntimeException e) {
            o.log(Level.SEVERE, "RuntimeException while executing runnable " + runnable + " with executor " + executor, (Throwable) e);
        }
    }

    public static Object h(Object obj) throws ExecutionException {
        if (obj instanceof e4) {
            Throwable th = ((e4) obj).b;
            CancellationException cancellationException = new CancellationException("Task was cancelled.");
            cancellationException.initCause(th);
            throw cancellationException;
        }
        if (obj instanceof f4) {
            throw new ExecutionException(((f4) obj).a);
        }
        if (obj == Y) {
            return null;
        }
        return obj;
    }

    public static Object i(k4 k4Var) {
        Object obj;
        boolean z = false;
        while (true) {
            try {
                obj = k4Var.get();
                break;
            } catch (InterruptedException unused) {
                z = true;
            } catch (Throwable th) {
                if (z) {
                    Thread.currentThread().interrupt();
                }
                throw th;
            }
        }
        if (z) {
            Thread.currentThread().interrupt();
        }
        return obj;
    }

    public final void a(StringBuilder sb) {
        try {
            Object objI = i(this);
            sb.append("SUCCESS, result=[");
            sb.append(objI == this ? "this future" : String.valueOf(objI));
            sb.append("]");
        } catch (CancellationException unused) {
            sb.append("CANCELLED");
        } catch (RuntimeException e) {
            sb.append("UNKNOWN, cause=[");
            sb.append(e.getClass());
            sb.append(" thrown from get()]");
        } catch (ExecutionException e2) {
            sb.append("FAILURE, cause=[");
            sb.append(e2.getCause());
            sb.append("]");
        }
    }

    public void c() {
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z) {
        Object obj = this.a;
        if (obj == null) {
            if (X.b(this, obj, d ? new e4(new CancellationException("Future.cancel() was called."), z) : z ? e4.c : e4.d)) {
                e(this);
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.ha8
    public final void d(Runnable runnable, Executor executor) {
        executor.getClass();
        g4 g4Var = this.b;
        g4 g4Var2 = g4.d;
        if (g4Var != g4Var2) {
            g4 g4Var3 = new g4(runnable, executor);
            do {
                g4Var3.c = g4Var;
                if (X.a(this, g4Var, g4Var3)) {
                    return;
                } else {
                    g4Var = this.b;
                }
            } while (g4Var != g4Var2);
        }
        g(runnable, executor);
    }

    @Override // java.util.concurrent.Future
    public final Object get(long j, TimeUnit timeUnit) throws InterruptedException, TimeoutException {
        j4 j4Var = j4.c;
        long nanos = timeUnit.toNanos(j);
        if (Thread.interrupted()) {
            throw new InterruptedException();
        }
        Object obj = this.a;
        if (obj != null) {
            return h(obj);
        }
        long jNanoTime = nanos > 0 ? System.nanoTime() + nanos : 0L;
        if (nanos >= 1000) {
            j4 j4Var2 = this.c;
            if (j4Var2 != j4Var) {
                j4 j4Var3 = new j4();
                do {
                    gpi gpiVar = X;
                    gpiVar.f(j4Var3, j4Var2);
                    if (gpiVar.c(this, j4Var2, j4Var3)) {
                        do {
                            LockSupport.parkNanos(this, nanos);
                            if (Thread.interrupted()) {
                                k(j4Var3);
                                throw new InterruptedException();
                            }
                            Object obj2 = this.a;
                            if (obj2 != null) {
                                return h(obj2);
                            }
                            nanos = jNanoTime - System.nanoTime();
                        } while (nanos >= 1000);
                        k(j4Var3);
                    } else {
                        j4Var2 = this.c;
                    }
                } while (j4Var2 != j4Var);
            }
            return h(this.a);
        }
        while (nanos > 0) {
            Object obj3 = this.a;
            if (obj3 != null) {
                return h(obj3);
            }
            if (Thread.interrupted()) {
                throw new InterruptedException();
            }
            nanos = jNanoTime - System.nanoTime();
        }
        String string = toString();
        String string2 = timeUnit.toString();
        Locale locale = Locale.ROOT;
        String lowerCase = string2.toLowerCase(locale);
        StringBuilder sbL = az1.l(j, "Waited ", " ");
        sbL.append(timeUnit.toString().toLowerCase(locale));
        String string3 = sbL.toString();
        if (nanos + 1000 < 0) {
            String strI = az1.i(string3, " (plus ");
            long j2 = -nanos;
            long jConvert = timeUnit.convert(j2, TimeUnit.NANOSECONDS);
            long nanos2 = j2 - timeUnit.toNanos(jConvert);
            boolean z = jConvert == 0 || nanos2 > 1000;
            if (jConvert > 0) {
                String strI2 = strI + jConvert + " " + lowerCase;
                if (z) {
                    strI2 = az1.i(strI2, ",");
                }
                strI = az1.i(strI2, " ");
            }
            if (z) {
                strI = strI + nanos2 + " nanoseconds ";
            }
            string3 = az1.i(strI, "delay)");
        }
        if (isDone()) {
            throw new TimeoutException(az1.i(string3, " but future completed as timeout expired"));
        }
        throw new TimeoutException(u45.k(string3, " for ", string));
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.a instanceof e4;
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return this.a != null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public String j() {
        if (!(this instanceof ScheduledFuture)) {
            return null;
        }
        return "remaining delay=[" + ((ScheduledFuture) this).getDelay(TimeUnit.MILLISECONDS) + " ms]";
    }

    public final void k(j4 j4Var) {
        j4Var.a = null;
        while (true) {
            j4 j4Var2 = this.c;
            if (j4Var2 == j4.c) {
                return;
            }
            j4 j4Var3 = null;
            while (j4Var2 != null) {
                j4 j4Var4 = j4Var2.b;
                if (j4Var2.a != null) {
                    j4Var3 = j4Var2;
                } else if (j4Var3 != null) {
                    j4Var3.b = j4Var4;
                    if (j4Var3.a == null) {
                        break;
                    }
                } else if (!X.c(this, j4Var2, j4Var4)) {
                    break;
                }
                j4Var2 = j4Var4;
            }
            return;
        }
    }

    public boolean l(Object obj) {
        if (obj == null) {
            obj = Y;
        }
        if (!X.b(this, null, obj)) {
            return false;
        }
        e(this);
        return true;
    }

    public boolean m(Throwable th) {
        th.getClass();
        if (!X.b(this, null, new f4(th))) {
            return false;
        }
        e(this);
        return true;
    }

    public final String toString() {
        String strJ;
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append("[status=");
        if (this.a instanceof e4) {
            sb.append("CANCELLED");
        } else if (isDone()) {
            a(sb);
        } else {
            try {
                strJ = j();
            } catch (RuntimeException e) {
                strJ = "Exception thrown from implementation: " + e.getClass();
            }
            if (strJ != null && !strJ.isEmpty()) {
                sb.append("PENDING, info=[");
                sb.append(strJ);
                sb.append("]");
            } else if (isDone()) {
                a(sb);
            } else {
                sb.append("PENDING");
            }
        }
        sb.append("]");
        return sb.toString();
    }

    @Override // java.util.concurrent.Future
    public final Object get() throws InterruptedException {
        Object obj;
        j4 j4Var = j4.c;
        if (!Thread.interrupted()) {
            Object obj2 = this.a;
            if (obj2 != null) {
                return h(obj2);
            }
            j4 j4Var2 = this.c;
            if (j4Var2 != j4Var) {
                j4 j4Var3 = new j4();
                do {
                    gpi gpiVar = X;
                    gpiVar.f(j4Var3, j4Var2);
                    if (gpiVar.c(this, j4Var2, j4Var3)) {
                        do {
                            LockSupport.park(this);
                            if (!Thread.interrupted()) {
                                obj = this.a;
                            } else {
                                k(j4Var3);
                                throw new InterruptedException();
                            }
                        } while (obj == null);
                        return h(obj);
                    }
                    j4Var2 = this.c;
                } while (j4Var2 != j4Var);
            }
            return h(this.a);
        }
        throw new InterruptedException();
    }
}
