package defpackage;

import java.util.Locale;
import java.util.Objects;
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
public abstract class x1 extends ip7 implements ha8 {
    public static final woi X;
    public static final Object Y;
    public static final boolean d;
    public static final f94 o;
    public volatile Object a;
    public volatile g1 b;
    public volatile v1 c;

    static {
        boolean z;
        Throwable th;
        woi m1Var;
        try {
            z = Boolean.parseBoolean(System.getProperty("guava.concurrent.generate_cancellation_cause", "false"));
        } catch (SecurityException unused) {
            z = false;
        }
        d = z;
        o = new f94(x1.class);
        Throwable th2 = null;
        try {
            m1Var = new u1();
            th = null;
        } catch (Error | Exception e) {
            th = e;
            try {
                m1Var = new i1(AtomicReferenceFieldUpdater.newUpdater(v1.class, Thread.class, "a"), AtomicReferenceFieldUpdater.newUpdater(v1.class, v1.class, "b"), AtomicReferenceFieldUpdater.newUpdater(x1.class, v1.class, "c"), AtomicReferenceFieldUpdater.newUpdater(x1.class, g1.class, "b"), AtomicReferenceFieldUpdater.newUpdater(x1.class, Object.class, "a"));
            } catch (Error | Exception e2) {
                th2 = e2;
                m1Var = new m1();
            }
        }
        X = m1Var;
        if (th2 != null) {
            f94 f94Var = o;
            Logger loggerA = f94Var.a();
            Level level = Level.SEVERE;
            loggerA.log(level, "UnsafeAtomicHelper is broken!", th);
            f94Var.a().log(level, "SafeAtomicHelper is broken!", th2);
        }
        Y = new Object();
    }

    public static void e(x1 x1Var, boolean z) {
        g1 g1Var = null;
        while (true) {
            for (v1 v1VarF = X.f(x1Var); v1VarF != null; v1VarF = v1VarF.b) {
                Thread thread = v1VarF.a;
                if (thread != null) {
                    v1VarF.a = null;
                    LockSupport.unpark(thread);
                }
            }
            if (z) {
                z = false;
            }
            x1Var.b();
            g1 g1Var2 = g1Var;
            g1 g1VarE = X.e(x1Var);
            g1 g1Var3 = g1Var2;
            while (g1VarE != null) {
                g1 g1Var4 = g1VarE.c;
                g1VarE.c = g1Var3;
                g1Var3 = g1VarE;
                g1VarE = g1Var4;
            }
            while (g1Var3 != null) {
                g1Var = g1Var3.c;
                Runnable runnable = g1Var3.a;
                Objects.requireNonNull(runnable);
                if (runnable instanceof k1) {
                    k1 k1Var = (k1) runnable;
                    x1Var = k1Var.a;
                    if (x1Var.a == k1Var) {
                        if (X.b(x1Var, k1Var, h(k1Var.b))) {
                            break;
                        }
                    } else {
                        continue;
                    }
                } else {
                    Executor executor = g1Var3.b;
                    Objects.requireNonNull(executor);
                    f(runnable, executor);
                }
                g1Var3 = g1Var;
            }
            return;
        }
    }

    public static void f(Runnable runnable, Executor executor) {
        try {
            executor.execute(runnable);
        } catch (Exception e) {
            o.a().log(Level.SEVERE, "RuntimeException while executing runnable " + runnable + " with executor " + executor, (Throwable) e);
        }
    }

    public static Object g(Object obj) throws ExecutionException {
        if (obj instanceof b1) {
            Throwable th = ((b1) obj).b;
            CancellationException cancellationException = new CancellationException("Task was cancelled.");
            cancellationException.initCause(th);
            throw cancellationException;
        }
        if (obj instanceof e1) {
            throw new ExecutionException(((e1) obj).a);
        }
        if (obj == Y) {
            return null;
        }
        return obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0046  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.Object h(defpackage.ha8 r6) {
        /*
            Method dump skipped, instructions count: 233
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.x1.h(ha8):java.lang.Object");
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
            } catch (ExecutionException e) {
                sb.append("FAILURE, cause=[");
                sb.append(e.getCause());
                sb.append("]");
                return;
            } catch (Exception e2) {
                sb.append("UNKNOWN, cause=[");
                sb.append(e2.getClass());
                sb.append(" thrown from get()]");
                return;
            }
        }
        if (z) {
            Thread.currentThread().interrupt();
        }
        sb.append("SUCCESS, result=[");
        c(sb, obj);
        sb.append("]");
    }

    public void b() {
    }

    public final void c(StringBuilder sb, Object obj) {
        if (obj == null) {
            sb.append("null");
        } else {
            if (obj == this) {
                sb.append("this future");
                return;
            }
            sb.append(obj.getClass().getName());
            sb.append("@");
            sb.append(Integer.toHexString(System.identityHashCode(obj)));
        }
    }

    @Override // java.util.concurrent.Future
    public boolean cancel(boolean z) {
        b1 b1Var;
        Object obj = this.a;
        if (!(obj == null) && !(obj instanceof k1)) {
            return false;
        }
        if (d) {
            b1Var = new b1(new CancellationException("Future.cancel() was called."), z);
        } else {
            b1Var = z ? b1.c : b1.d;
            Objects.requireNonNull(b1Var);
        }
        x1 x1Var = this;
        boolean z2 = false;
        while (true) {
            if (X.b(x1Var, obj, b1Var)) {
                e(x1Var, z);
                if (!(obj instanceof k1)) {
                    break;
                }
                ha8 ha8Var = ((k1) obj).b;
                if (!(ha8Var instanceof o1)) {
                    ha8Var.cancel(z);
                    break;
                }
                x1Var = (x1) ha8Var;
                obj = x1Var.a;
                if (!(obj == null) && !(obj instanceof k1)) {
                    break;
                }
                z2 = true;
            } else {
                obj = x1Var.a;
                if (!(obj instanceof k1)) {
                    return z2;
                }
            }
        }
        return true;
    }

    @Override // defpackage.ha8
    public void d(Runnable runnable, Executor executor) {
        g1 g1Var;
        g1 g1Var2 = g1.d;
        u5j.e(executor, "Executor was null.");
        if (!isDone() && (g1Var = this.b) != g1Var2) {
            g1 g1Var3 = new g1(runnable, executor);
            do {
                g1Var3.c = g1Var;
                if (X.a(this, g1Var, g1Var3)) {
                    return;
                } else {
                    g1Var = this.b;
                }
            } while (g1Var != g1Var2);
        }
        f(runnable, executor);
    }

    @Override // java.util.concurrent.Future
    public Object get(long j, TimeUnit timeUnit) throws InterruptedException, TimeoutException {
        boolean z;
        long j2;
        v1 v1Var = v1.c;
        long nanos = timeUnit.toNanos(j);
        if (Thread.interrupted()) {
            throw new InterruptedException();
        }
        Object obj = this.a;
        if ((obj != null) && (!(obj instanceof k1))) {
            return g(obj);
        }
        long j3 = 0;
        long jNanoTime = nanos > 0 ? System.nanoTime() + nanos : 0L;
        if (nanos >= 1000) {
            v1 v1Var2 = this.c;
            if (v1Var2 != v1Var) {
                v1 v1Var3 = new v1();
                z = true;
                while (true) {
                    woi woiVar = X;
                    woiVar.g(v1Var3, v1Var2);
                    if (woiVar.c(this, v1Var2, v1Var3)) {
                        j2 = j3;
                        do {
                            LockSupport.parkNanos(this, Math.min(nanos, 2147483647999999999L));
                            if (Thread.interrupted()) {
                                j(v1Var3);
                                throw new InterruptedException();
                            }
                            Object obj2 = this.a;
                            if ((obj2 != null) && (!(obj2 instanceof k1))) {
                                return g(obj2);
                            }
                            nanos = jNanoTime - System.nanoTime();
                        } while (nanos >= 1000);
                        j(v1Var3);
                    } else {
                        long j4 = j3;
                        v1Var2 = this.c;
                        if (v1Var2 == v1Var) {
                            break;
                        }
                        j3 = j4;
                    }
                }
            }
            Object obj3 = this.a;
            Objects.requireNonNull(obj3);
            return g(obj3);
        }
        z = true;
        j2 = 0;
        while (nanos > j2) {
            Object obj4 = this.a;
            if ((obj4 != null ? z : false) && (!(obj4 instanceof k1))) {
                return g(obj4);
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
        if (nanos + 1000 < j2) {
            String strI = az1.i(string3, " (plus ");
            long j5 = -nanos;
            long jConvert = timeUnit.convert(j5, TimeUnit.NANOSECONDS);
            long nanos2 = j5 - timeUnit.toNanos(jConvert);
            boolean z2 = (jConvert == j2 || nanos2 > 1000) ? z : false;
            if (jConvert > j2) {
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

    /* JADX WARN: Multi-variable type inference failed */
    public String i() {
        if (!(this instanceof ScheduledFuture)) {
            return null;
        }
        return "remaining delay=[" + ((ScheduledFuture) this).getDelay(TimeUnit.MILLISECONDS) + " ms]";
    }

    public boolean isCancelled() {
        return this.a instanceof b1;
    }

    @Override // java.util.concurrent.Future
    public boolean isDone() {
        return (!(r0 instanceof k1)) & (this.a != null);
    }

    public final void j(v1 v1Var) {
        v1Var.a = null;
        while (true) {
            v1 v1Var2 = this.c;
            if (v1Var2 == v1.c) {
                return;
            }
            v1 v1Var3 = null;
            while (v1Var2 != null) {
                v1 v1Var4 = v1Var2.b;
                if (v1Var2.a != null) {
                    v1Var3 = v1Var2;
                } else if (v1Var3 != null) {
                    v1Var3.b = v1Var4;
                    if (v1Var3.a == null) {
                        break;
                    }
                } else if (!X.c(this, v1Var2, v1Var4)) {
                    break;
                }
                v1Var2 = v1Var4;
            }
            return;
        }
    }

    public boolean k(Object obj) {
        if (obj == null) {
            obj = Y;
        }
        if (!X.b(this, null, obj)) {
            return false;
        }
        e(this, false);
        return true;
    }

    public boolean l(Throwable th) {
        if (!X.b(this, null, new e1(th))) {
            return false;
        }
        e(this, false);
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00c9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String toString() {
        /*
            r6 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.Class r1 = r6.getClass()
            java.lang.String r1 = r1.getName()
            java.lang.String r2 = "com.google.common.util.concurrent."
            boolean r1 = r1.startsWith(r2)
            if (r1 == 0) goto L21
            java.lang.Class r1 = r6.getClass()
            java.lang.String r1 = r1.getSimpleName()
            r0.append(r1)
            goto L2c
        L21:
            java.lang.Class r1 = r6.getClass()
            java.lang.String r1 = r1.getName()
            r0.append(r1)
        L2c:
            r1 = 64
            r0.append(r1)
            int r1 = java.lang.System.identityHashCode(r6)
            java.lang.String r1 = java.lang.Integer.toHexString(r1)
            r0.append(r1)
            java.lang.String r1 = "[status="
            r0.append(r1)
            boolean r1 = r6.isCancelled()
            java.lang.String r2 = "]"
            if (r1 == 0) goto L50
            java.lang.String r1 = "CANCELLED"
            r0.append(r1)
            goto Ld3
        L50:
            boolean r1 = r6.isDone()
            if (r1 == 0) goto L5b
            r6.a(r0)
            goto Ld3
        L5b:
            int r1 = r0.length()
            java.lang.String r3 = "PENDING"
            r0.append(r3)
            java.lang.Object r3 = r6.a
            boolean r4 = r3 instanceof defpackage.k1
            java.lang.String r5 = "Exception thrown from implementation: "
            if (r4 == 0) goto L93
            java.lang.String r4 = ", setFuture=["
            r0.append(r4)
            k1 r3 = (defpackage.k1) r3
            ha8 r3 = r3.b
            if (r3 != r6) goto L81
            java.lang.String r3 = "this future"
            r0.append(r3)     // Catch: java.lang.StackOverflowError -> L7d java.lang.Exception -> L7f
            goto L8f
        L7d:
            r3 = move-exception
            goto L85
        L7f:
            r3 = move-exception
            goto L85
        L81:
            r0.append(r3)     // Catch: java.lang.StackOverflowError -> L7d java.lang.Exception -> L7f
            goto L8f
        L85:
            r0.append(r5)
            java.lang.Class r3 = r3.getClass()
            r0.append(r3)
        L8f:
            r0.append(r2)
            goto Lc3
        L93:
            java.lang.String r3 = r6.i()     // Catch: java.lang.StackOverflowError -> La0 java.lang.Exception -> La2
            if (r3 == 0) goto La4
            boolean r4 = r3.isEmpty()     // Catch: java.lang.StackOverflowError -> La0 java.lang.Exception -> La2
            if (r4 == 0) goto Lb6
            goto La4
        La0:
            r3 = move-exception
            goto La6
        La2:
            r3 = move-exception
            goto La6
        La4:
            r3 = 0
            goto Lb6
        La6:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>(r5)
            java.lang.Class r3 = r3.getClass()
            r4.append(r3)
            java.lang.String r3 = r4.toString()
        Lb6:
            if (r3 == 0) goto Lc3
            java.lang.String r4 = ", info=["
            r0.append(r4)
            r0.append(r3)
            r0.append(r2)
        Lc3:
            boolean r3 = r6.isDone()
            if (r3 == 0) goto Ld3
            int r3 = r0.length()
            r0.delete(r1, r3)
            r6.a(r0)
        Ld3:
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.x1.toString():java.lang.String");
    }

    @Override // java.util.concurrent.Future
    public Object get() throws InterruptedException {
        Object obj;
        v1 v1Var = v1.c;
        if (!Thread.interrupted()) {
            Object obj2 = this.a;
            if ((obj2 != null) & (!(obj2 instanceof k1))) {
                return g(obj2);
            }
            v1 v1Var2 = this.c;
            if (v1Var2 != v1Var) {
                v1 v1Var3 = new v1();
                do {
                    woi woiVar = X;
                    woiVar.g(v1Var3, v1Var2);
                    if (woiVar.c(this, v1Var2, v1Var3)) {
                        do {
                            LockSupport.park(this);
                            if (!Thread.interrupted()) {
                                obj = this.a;
                            } else {
                                j(v1Var3);
                                throw new InterruptedException();
                            }
                        } while (!((obj != null) & (!(obj instanceof k1))));
                        return g(obj);
                    }
                    v1Var2 = this.c;
                } while (v1Var2 != v1Var);
            }
            Object obj3 = this.a;
            Objects.requireNonNull(obj3);
            return g(obj3);
        }
        throw new InterruptedException();
    }
}
