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
public abstract class y1 implements ha8 {
    public static final yoi X;
    public static final Object Y;
    public static final boolean d = Boolean.parseBoolean(System.getProperty("guava.concurrent.generate_cancellation_cause", "false"));
    public static final Logger o = Logger.getLogger(y1.class.getName());
    public volatile Object a;
    public volatile h1 b;
    public volatile w1 c;

    static {
        yoi n1Var;
        try {
            n1Var = new j1(AtomicReferenceFieldUpdater.newUpdater(w1.class, Thread.class, "a"), AtomicReferenceFieldUpdater.newUpdater(w1.class, w1.class, "b"), AtomicReferenceFieldUpdater.newUpdater(y1.class, w1.class, "c"), AtomicReferenceFieldUpdater.newUpdater(y1.class, h1.class, "b"), AtomicReferenceFieldUpdater.newUpdater(y1.class, Object.class, "a"));
            th = null;
        } catch (Throwable th) {
            th = th;
            n1Var = new n1();
        }
        X = n1Var;
        if (th != null) {
            o.log(Level.SEVERE, "SafeAtomicHelper is broken!", th);
        }
        Y = new Object();
    }

    public static void b(y1 y1Var) {
        h1 h1Var;
        h1 h1Var2;
        h1 h1Var3 = null;
        while (true) {
            w1 w1Var = y1Var.c;
            if (X.c(y1Var, w1Var, w1.c)) {
                while (w1Var != null) {
                    Thread thread = w1Var.a;
                    if (thread != null) {
                        w1Var.a = null;
                        LockSupport.unpark(thread);
                    }
                    w1Var = w1Var.b;
                }
                do {
                    h1Var = y1Var.b;
                } while (!X.a(y1Var, h1Var, h1.d));
                while (true) {
                    h1Var2 = h1Var3;
                    h1Var3 = h1Var;
                    if (h1Var3 == null) {
                        break;
                    }
                    h1Var = h1Var3.c;
                    h1Var3.c = h1Var2;
                }
                while (h1Var2 != null) {
                    h1Var3 = h1Var2.c;
                    Runnable runnable = h1Var2.a;
                    if (runnable instanceof l1) {
                        l1 l1Var = (l1) runnable;
                        y1Var = l1Var.a;
                        if (y1Var.a == l1Var) {
                            if (X.b(y1Var, l1Var, f(l1Var.b))) {
                                break;
                            }
                        } else {
                            continue;
                        }
                    } else {
                        c(runnable, h1Var2.b);
                    }
                    h1Var2 = h1Var3;
                }
                return;
            }
        }
    }

    public static void c(Runnable runnable, Executor executor) {
        try {
            executor.execute(runnable);
        } catch (RuntimeException e) {
            o.log(Level.SEVERE, "RuntimeException while executing runnable " + runnable + " with executor " + executor, (Throwable) e);
        }
    }

    public static Object e(Object obj) throws ExecutionException {
        if (obj instanceof c1) {
            Throwable th = ((c1) obj).b;
            CancellationException cancellationException = new CancellationException("Task was cancelled.");
            cancellationException.initCause(th);
            throw cancellationException;
        }
        if (obj instanceof f1) {
            throw new ExecutionException(((f1) obj).a);
        }
        if (obj == Y) {
            return null;
        }
        return obj;
    }

    public static Object f(ha8 ha8Var) {
        Object obj;
        if (ha8Var instanceof y1) {
            Object obj2 = ((y1) ha8Var).a;
            if (!(obj2 instanceof c1)) {
                return obj2;
            }
            c1 c1Var = (c1) obj2;
            return c1Var.a ? c1Var.b != null ? new c1(c1Var.b, false) : c1.d : obj2;
        }
        boolean zIsCancelled = ha8Var.isCancelled();
        boolean z = true;
        if ((!d) && zIsCancelled) {
            return c1.d;
        }
        boolean z2 = false;
        while (true) {
            try {
                try {
                    obj = ha8Var.get();
                    break;
                } catch (InterruptedException unused) {
                    z2 = z;
                } catch (Throwable th) {
                    if (z2) {
                        Thread.currentThread().interrupt();
                    }
                    throw th;
                }
            } catch (CancellationException e) {
                if (zIsCancelled) {
                    return new c1(e, false);
                }
                return new f1(new IllegalArgumentException("get() threw CancellationException, despite reporting isCancelled() == false: " + ha8Var, e));
            } catch (ExecutionException e2) {
                return new f1(e2.getCause());
            } catch (Throwable th2) {
                return new f1(th2);
            }
        }
        if (z2) {
            Thread.currentThread().interrupt();
        }
        return obj == null ? Y : obj;
    }

    public final void a(StringBuilder sb) {
        Object obj;
        boolean z = false;
        while (true) {
            try {
                try {
                    obj = get();
                    break;
                } catch (InterruptedException unused) {
                    z = true;
                } catch (Throwable th) {
                    if (z) {
                        Thread.currentThread().interrupt();
                    }
                    throw th;
                }
            } catch (CancellationException unused2) {
                sb.append("CANCELLED");
                return;
            } catch (RuntimeException e) {
                sb.append("UNKNOWN, cause=[");
                sb.append(e.getClass());
                sb.append(" thrown from get()]");
                return;
            } catch (ExecutionException e2) {
                sb.append("FAILURE, cause=[");
                sb.append(e2.getCause());
                sb.append("]");
                return;
            }
        }
        if (z) {
            Thread.currentThread().interrupt();
        }
        sb.append("SUCCESS, result=[");
        sb.append(obj == this ? "this future" : String.valueOf(obj));
        sb.append("]");
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x0053, code lost:
    
        return true;
     */
    @Override // java.util.concurrent.Future
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean cancel(boolean r8) {
        /*
            r7 = this;
            java.lang.Object r0 = r7.a
            r1 = 1
            r2 = 0
            if (r0 != 0) goto L8
            r3 = r1
            goto L9
        L8:
            r3 = r2
        L9:
            boolean r4 = r0 instanceof defpackage.l1
            r3 = r3 | r4
            if (r3 == 0) goto L5b
            boolean r3 = defpackage.y1.d
            if (r3 == 0) goto L1f
            c1 r3 = new c1
            java.util.concurrent.CancellationException r4 = new java.util.concurrent.CancellationException
            java.lang.String r5 = "Future.cancel() was called."
            r4.<init>(r5)
            r3.<init>(r4, r8)
            goto L26
        L1f:
            if (r8 == 0) goto L24
            c1 r3 = defpackage.c1.c
            goto L26
        L24:
            c1 r3 = defpackage.c1.d
        L26:
            r4 = r7
            r5 = r2
        L28:
            yoi r6 = defpackage.y1.X
            boolean r6 = r6.b(r4, r0, r3)
            if (r6 == 0) goto L54
            b(r4)
            boolean r4 = r0 instanceof defpackage.l1
            if (r4 == 0) goto L53
            l1 r0 = (defpackage.l1) r0
            ha8 r0 = r0.b
            boolean r4 = r0 instanceof defpackage.y1
            if (r4 == 0) goto L50
            r4 = r0
            y1 r4 = (defpackage.y1) r4
            java.lang.Object r0 = r4.a
            if (r0 != 0) goto L48
            r5 = r1
            goto L49
        L48:
            r5 = r2
        L49:
            boolean r6 = r0 instanceof defpackage.l1
            r5 = r5 | r6
            if (r5 == 0) goto L53
            r5 = r1
            goto L28
        L50:
            r0.cancel(r8)
        L53:
            return r1
        L54:
            java.lang.Object r0 = r4.a
            boolean r6 = r0 instanceof defpackage.l1
            if (r6 != 0) goto L28
            return r5
        L5b:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.y1.cancel(boolean):boolean");
    }

    @Override // defpackage.ha8
    public final void d(Runnable runnable, Executor executor) {
        executor.getClass();
        h1 h1Var = this.b;
        h1 h1Var2 = h1.d;
        if (h1Var != h1Var2) {
            h1 h1Var3 = new h1(runnable, executor);
            do {
                h1Var3.c = h1Var;
                if (X.a(this, h1Var, h1Var3)) {
                    return;
                } else {
                    h1Var = this.b;
                }
            } while (h1Var != h1Var2);
        }
        c(runnable, executor);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final String g() {
        Object obj = this.a;
        if (obj instanceof l1) {
            StringBuilder sb = new StringBuilder("setFuture=[");
            ha8 ha8Var = ((l1) obj).b;
            return ho7.l(sb, ha8Var == this ? "this future" : String.valueOf(ha8Var), "]");
        }
        if (!(this instanceof ScheduledFuture)) {
            return null;
        }
        return "remaining delay=[" + ((ScheduledFuture) this).getDelay(TimeUnit.MILLISECONDS) + " ms]";
    }

    @Override // java.util.concurrent.Future
    public final Object get(long j, TimeUnit timeUnit) throws InterruptedException, TimeoutException {
        boolean z;
        w1 w1Var = w1.c;
        long nanos = timeUnit.toNanos(j);
        if (Thread.interrupted()) {
            throw new InterruptedException();
        }
        Object obj = this.a;
        if ((obj != null) && (!(obj instanceof l1))) {
            return e(obj);
        }
        long jNanoTime = nanos > 0 ? System.nanoTime() + nanos : 0L;
        if (nanos >= 1000) {
            w1 w1Var2 = this.c;
            if (w1Var2 != w1Var) {
                w1 w1Var3 = new w1();
                z = true;
                do {
                    yoi yoiVar = X;
                    yoiVar.g(w1Var3, w1Var2);
                    if (yoiVar.c(this, w1Var2, w1Var3)) {
                        do {
                            LockSupport.parkNanos(this, nanos);
                            if (Thread.interrupted()) {
                                h(w1Var3);
                                throw new InterruptedException();
                            }
                            Object obj2 = this.a;
                            if ((obj2 != null) && (!(obj2 instanceof l1))) {
                                return e(obj2);
                            }
                            nanos = jNanoTime - System.nanoTime();
                        } while (nanos >= 1000);
                        h(w1Var3);
                    } else {
                        w1Var2 = this.c;
                    }
                } while (w1Var2 != w1Var);
            }
            return e(this.a);
        }
        z = true;
        while (nanos > 0) {
            Object obj3 = this.a;
            if ((obj3 != null ? z : false) && (!(obj3 instanceof l1))) {
                return e(obj3);
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
            boolean z2 = (jConvert == 0 || nanos2 > 1000) ? z : false;
            if (jConvert > 0) {
                String strI2 = strI + jConvert + " " + lowerCase;
                if (z2) {
                    strI2 = az1.i(strI2, ",");
                }
                strI = az1.i(strI2, " ");
            }
            if (z2) {
                strI = strI + nanos2 + " nanoseconds ";
            }
            string3 = az1.i(strI, "delay)");
        }
        if (isDone()) {
            throw new TimeoutException(az1.i(string3, " but future completed as timeout expired"));
        }
        throw new TimeoutException(u45.k(string3, " for ", string));
    }

    public final void h(w1 w1Var) {
        w1Var.a = null;
        while (true) {
            w1 w1Var2 = this.c;
            if (w1Var2 == w1.c) {
                return;
            }
            w1 w1Var3 = null;
            while (w1Var2 != null) {
                w1 w1Var4 = w1Var2.b;
                if (w1Var2.a != null) {
                    w1Var3 = w1Var2;
                } else if (w1Var3 != null) {
                    w1Var3.b = w1Var4;
                    if (w1Var3.a == null) {
                        break;
                    }
                } else if (!X.c(this, w1Var2, w1Var4)) {
                    break;
                }
                w1Var2 = w1Var4;
            }
            return;
        }
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.a instanceof c1;
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return (!(r0 instanceof l1)) & (this.a != null);
    }

    public final String toString() {
        String strG;
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append("[status=");
        if (this.a instanceof c1) {
            sb.append("CANCELLED");
        } else if (isDone()) {
            a(sb);
        } else {
            try {
                strG = g();
            } catch (RuntimeException e) {
                strG = "Exception thrown from implementation: " + e.getClass();
            }
            if (strG != null && !strG.isEmpty()) {
                sb.append("PENDING, info=[");
                sb.append(strG);
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
        w1 w1Var = w1.c;
        if (!Thread.interrupted()) {
            Object obj2 = this.a;
            if ((obj2 != null) & (!(obj2 instanceof l1))) {
                return e(obj2);
            }
            w1 w1Var2 = this.c;
            if (w1Var2 != w1Var) {
                w1 w1Var3 = new w1();
                do {
                    yoi yoiVar = X;
                    yoiVar.g(w1Var3, w1Var2);
                    if (yoiVar.c(this, w1Var2, w1Var3)) {
                        do {
                            LockSupport.park(this);
                            if (!Thread.interrupted()) {
                                obj = this.a;
                            } else {
                                h(w1Var3);
                                throw new InterruptedException();
                            }
                        } while (!((obj != null) & (!(obj instanceof l1))));
                        return e(obj);
                    }
                    w1Var2 = this.c;
                } while (w1Var2 != w1Var);
            }
            return e(this.a);
        }
        throw new InterruptedException();
    }
}
