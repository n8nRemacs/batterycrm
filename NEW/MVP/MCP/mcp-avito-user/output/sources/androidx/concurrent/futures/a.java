package androidx.concurrent.futures;

import androidx.annotation.RestrictTo;
import com.google.common.util.concurrent.D0;
import j.P;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import java.util.logging.Level;
import java.util.logging.Logger;

/* compiled from: AbstractResolvableFuture.java */
@RestrictTo
/* loaded from: classes.dex */
public abstract class a<V> implements D0<V> {

    /* renamed from: e, reason: collision with root package name */
    public static final boolean f43135e = Boolean.parseBoolean(System.getProperty("guava.concurrent.generate_cancellation_cause", "false"));

    /* renamed from: f, reason: collision with root package name */
    public static final Logger f43136f = Logger.getLogger(a.class.getName());

    /* renamed from: g, reason: collision with root package name */
    public static final b f43137g;

    /* renamed from: h, reason: collision with root package name */
    public static final Object f43138h;

    /* renamed from: b, reason: collision with root package name */
    @P
    public volatile Object f43139b;

    /* renamed from: c, reason: collision with root package name */
    @P
    public volatile e f43140c;

    /* renamed from: d, reason: collision with root package name */
    @P
    public volatile i f43141d;

    /* compiled from: AbstractResolvableFuture.java */
    public static abstract class b {
        public b() {
        }

        public abstract boolean a(a<?> aVar, e eVar, e eVar2);

        public abstract boolean b(a<?> aVar, Object obj, Object obj2);

        public abstract boolean c(a<?> aVar, i iVar, i iVar2);

        public abstract void d(i iVar, i iVar2);

        public abstract void e(i iVar, Thread thread);
    }

    /* compiled from: AbstractResolvableFuture.java */
    public static final class c {

        /* renamed from: c, reason: collision with root package name */
        public static final c f43142c;

        /* renamed from: d, reason: collision with root package name */
        public static final c f43143d;

        /* renamed from: a, reason: collision with root package name */
        public final boolean f43144a;

        /* renamed from: b, reason: collision with root package name */
        @P
        public final CancellationException f43145b;

        static {
            if (a.f43135e) {
                f43143d = null;
                f43142c = null;
            } else {
                f43143d = new c(false, null);
                f43142c = new c(true, null);
            }
        }

        public c(boolean z12, @P CancellationException cancellationException) {
            this.f43144a = z12;
            this.f43145b = cancellationException;
        }
    }

    /* compiled from: AbstractResolvableFuture.java */
    public static final class d {

        /* renamed from: a, reason: collision with root package name */
        public final Throwable f43146a;

        /* compiled from: AbstractResolvableFuture.java */
        /* renamed from: androidx.concurrent.futures.a$d$a, reason: collision with other inner class name */
        public class C1698a extends Throwable {
            @Override // java.lang.Throwable
            public final synchronized Throwable fillInStackTrace() {
                return this;
            }
        }

        static {
            new d(new C1698a("Failure occurred while trying to finish a future."));
        }

        public d(Throwable th2) {
            boolean z12 = a.f43135e;
            th2.getClass();
            this.f43146a = th2;
        }
    }

    /* compiled from: AbstractResolvableFuture.java */
    public static final class e {

        /* renamed from: d, reason: collision with root package name */
        public static final e f43147d = new e(null, null);

        /* renamed from: a, reason: collision with root package name */
        public final Runnable f43148a;

        /* renamed from: b, reason: collision with root package name */
        public final Executor f43149b;

        /* renamed from: c, reason: collision with root package name */
        @P
        public e f43150c;

        public e(Runnable runnable, Executor executor) {
            this.f43148a = runnable;
            this.f43149b = executor;
        }
    }

    /* compiled from: AbstractResolvableFuture.java */
    public static final class f extends b {

        /* renamed from: a, reason: collision with root package name */
        public final AtomicReferenceFieldUpdater<i, Thread> f43151a;

        /* renamed from: b, reason: collision with root package name */
        public final AtomicReferenceFieldUpdater<i, i> f43152b;

        /* renamed from: c, reason: collision with root package name */
        public final AtomicReferenceFieldUpdater<a, i> f43153c;

        /* renamed from: d, reason: collision with root package name */
        public final AtomicReferenceFieldUpdater<a, e> f43154d;

        /* renamed from: e, reason: collision with root package name */
        public final AtomicReferenceFieldUpdater<a, Object> f43155e;

        public f(AtomicReferenceFieldUpdater<i, Thread> atomicReferenceFieldUpdater, AtomicReferenceFieldUpdater<i, i> atomicReferenceFieldUpdater2, AtomicReferenceFieldUpdater<a, i> atomicReferenceFieldUpdater3, AtomicReferenceFieldUpdater<a, e> atomicReferenceFieldUpdater4, AtomicReferenceFieldUpdater<a, Object> atomicReferenceFieldUpdater5) {
            super();
            this.f43151a = atomicReferenceFieldUpdater;
            this.f43152b = atomicReferenceFieldUpdater2;
            this.f43153c = atomicReferenceFieldUpdater3;
            this.f43154d = atomicReferenceFieldUpdater4;
            this.f43155e = atomicReferenceFieldUpdater5;
        }

        @Override // androidx.concurrent.futures.a.b
        public final boolean a(a<?> aVar, e eVar, e eVar2) {
            AtomicReferenceFieldUpdater<a, e> atomicReferenceFieldUpdater;
            do {
                atomicReferenceFieldUpdater = this.f43154d;
                if (atomicReferenceFieldUpdater.compareAndSet(aVar, eVar, eVar2)) {
                    return true;
                }
            } while (atomicReferenceFieldUpdater.get(aVar) == eVar);
            return false;
        }

        @Override // androidx.concurrent.futures.a.b
        public final boolean b(a<?> aVar, Object obj, Object obj2) {
            AtomicReferenceFieldUpdater<a, Object> atomicReferenceFieldUpdater;
            do {
                atomicReferenceFieldUpdater = this.f43155e;
                if (atomicReferenceFieldUpdater.compareAndSet(aVar, obj, obj2)) {
                    return true;
                }
            } while (atomicReferenceFieldUpdater.get(aVar) == obj);
            return false;
        }

        @Override // androidx.concurrent.futures.a.b
        public final boolean c(a<?> aVar, i iVar, i iVar2) {
            AtomicReferenceFieldUpdater<a, i> atomicReferenceFieldUpdater;
            do {
                atomicReferenceFieldUpdater = this.f43153c;
                if (atomicReferenceFieldUpdater.compareAndSet(aVar, iVar, iVar2)) {
                    return true;
                }
            } while (atomicReferenceFieldUpdater.get(aVar) == iVar);
            return false;
        }

        @Override // androidx.concurrent.futures.a.b
        public final void d(i iVar, i iVar2) {
            this.f43152b.lazySet(iVar, iVar2);
        }

        @Override // androidx.concurrent.futures.a.b
        public final void e(i iVar, Thread thread) {
            this.f43151a.lazySet(iVar, thread);
        }
    }

    /* compiled from: AbstractResolvableFuture.java */
    public static final class g<V> implements Runnable {
        @Override // java.lang.Runnable
        public final void run() {
            throw null;
        }
    }

    /* compiled from: AbstractResolvableFuture.java */
    public static final class h extends b {
        public h() {
            super();
        }

        @Override // androidx.concurrent.futures.a.b
        public final boolean a(a<?> aVar, e eVar, e eVar2) {
            synchronized (aVar) {
                try {
                    if (aVar.f43140c != eVar) {
                        return false;
                    }
                    aVar.f43140c = eVar2;
                    return true;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        @Override // androidx.concurrent.futures.a.b
        public final boolean b(a<?> aVar, Object obj, Object obj2) {
            synchronized (aVar) {
                try {
                    if (aVar.f43139b != obj) {
                        return false;
                    }
                    aVar.f43139b = obj2;
                    return true;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        @Override // androidx.concurrent.futures.a.b
        public final boolean c(a<?> aVar, i iVar, i iVar2) {
            synchronized (aVar) {
                try {
                    if (aVar.f43141d != iVar) {
                        return false;
                    }
                    aVar.f43141d = iVar2;
                    return true;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        @Override // androidx.concurrent.futures.a.b
        public final void d(i iVar, i iVar2) {
            iVar.f43158b = iVar2;
        }

        @Override // androidx.concurrent.futures.a.b
        public final void e(i iVar, Thread thread) {
            iVar.f43157a = thread;
        }
    }

    /* compiled from: AbstractResolvableFuture.java */
    public static final class i {

        /* renamed from: c, reason: collision with root package name */
        public static final i f43156c = new i();

        /* renamed from: a, reason: collision with root package name */
        @P
        public volatile Thread f43157a;

        /* renamed from: b, reason: collision with root package name */
        @P
        public volatile i f43158b;

        public i() {
            a.f43137g.e(this, Thread.currentThread());
        }
    }

    static {
        b hVar;
        try {
            hVar = new f(AtomicReferenceFieldUpdater.newUpdater(i.class, Thread.class, "a"), AtomicReferenceFieldUpdater.newUpdater(i.class, i.class, "b"), AtomicReferenceFieldUpdater.newUpdater(a.class, i.class, "d"), AtomicReferenceFieldUpdater.newUpdater(a.class, e.class, "c"), AtomicReferenceFieldUpdater.newUpdater(a.class, Object.class, "b"));
            th = null;
        } catch (Throwable th2) {
            th = th2;
            hVar = new h();
        }
        f43137g = hVar;
        if (th != null) {
            f43136f.log(Level.SEVERE, "SafeAtomicHelper is broken!", th);
        }
        f43138h = new Object();
    }

    public static void c(a<?> aVar) {
        i iVar;
        e eVar;
        do {
            iVar = aVar.f43141d;
        } while (!f43137g.c(aVar, iVar, i.f43156c));
        while (iVar != null) {
            Thread thread = iVar.f43157a;
            if (thread != null) {
                iVar.f43157a = null;
                LockSupport.unpark(thread);
            }
            iVar = iVar.f43158b;
        }
        aVar.b();
        do {
            eVar = aVar.f43140c;
        } while (!f43137g.a(aVar, eVar, e.f43147d));
        e eVar2 = null;
        while (eVar != null) {
            e eVar3 = eVar.f43150c;
            eVar.f43150c = eVar2;
            eVar2 = eVar;
            eVar = eVar3;
        }
        while (eVar2 != null) {
            e eVar4 = eVar2.f43150c;
            Runnable runnable = eVar2.f43148a;
            if (runnable instanceof g) {
                ((g) runnable).getClass();
                throw null;
            }
            d(runnable, eVar2.f43149b);
            eVar2 = eVar4;
        }
    }

    public static void d(Runnable runnable, Executor executor) {
        try {
            executor.execute(runnable);
        } catch (RuntimeException e12) {
            f43136f.log(Level.SEVERE, "RuntimeException while executing runnable " + runnable + " with executor " + executor, (Throwable) e12);
        }
    }

    public static Object e(Object obj) throws ExecutionException {
        if (obj instanceof c) {
            CancellationException cancellationException = ((c) obj).f43145b;
            CancellationException cancellationException2 = new CancellationException("Task was cancelled.");
            cancellationException2.initCause(cancellationException);
            throw cancellationException2;
        }
        if (obj instanceof d) {
            throw new ExecutionException(((d) obj).f43146a);
        }
        if (obj == f43138h) {
            return null;
        }
        return obj;
    }

    @RestrictTo
    public static <V> V f(Future<V> future) {
        V v12;
        boolean z12 = false;
        while (true) {
            try {
                v12 = future.get();
                break;
            } catch (InterruptedException unused) {
                z12 = true;
            } catch (Throwable th2) {
                if (z12) {
                    Thread.currentThread().interrupt();
                }
                throw th2;
            }
        }
        if (z12) {
            Thread.currentThread().interrupt();
        }
        return v12;
    }

    @Override // com.google.common.util.concurrent.D0
    public final void N(Runnable runnable, Executor executor) {
        executor.getClass();
        e eVar = this.f43140c;
        e eVar2 = e.f43147d;
        if (eVar != eVar2) {
            e eVar3 = new e(runnable, executor);
            do {
                eVar3.f43150c = eVar;
                if (f43137g.a(this, eVar, eVar3)) {
                    return;
                } else {
                    eVar = this.f43140c;
                }
            } while (eVar != eVar2);
        }
        d(runnable, executor);
    }

    public final void a(StringBuilder sb2) {
        try {
            Object objF = f(this);
            sb2.append("SUCCESS, result=[");
            sb2.append(objF == this ? "this future" : String.valueOf(objF));
            sb2.append("]");
        } catch (CancellationException unused) {
            sb2.append("CANCELLED");
        } catch (RuntimeException e12) {
            sb2.append("UNKNOWN, cause=[");
            sb2.append(e12.getClass());
            sb2.append(" thrown from get()]");
        } catch (ExecutionException e13) {
            sb2.append("FAILURE, cause=[");
            sb2.append(e13.getCause());
            sb2.append("]");
        }
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z12) {
        Object obj = this.f43139b;
        if ((obj == null) | (obj instanceof g)) {
            c cVar = f43135e ? new c(z12, new CancellationException("Future.cancel() was called.")) : z12 ? c.f43142c : c.f43143d;
            while (!f43137g.b(this, obj, cVar)) {
                obj = this.f43139b;
                if (!(obj instanceof g)) {
                }
            }
            c(this);
            if (!(obj instanceof g)) {
                return true;
            }
            ((g) obj).getClass();
            throw null;
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:46:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00b5  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:56:0x00a8 -> B:36:0x0074). Please report as a decompilation issue!!! */
    @Override // java.util.concurrent.Future
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final V get(long r20, java.util.concurrent.TimeUnit r22) throws java.lang.InterruptedException, java.util.concurrent.TimeoutException {
        /*
            Method dump skipped, instructions count: 357
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.concurrent.futures.a.get(long, java.util.concurrent.TimeUnit):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @P
    public String h() {
        Object obj = this.f43139b;
        if (obj instanceof g) {
            StringBuilder sb2 = new StringBuilder("setFuture=[");
            ((g) obj).getClass();
            sb2.append("null");
            sb2.append("]");
            return sb2.toString();
        }
        if (!(this instanceof ScheduledFuture)) {
            return null;
        }
        return "remaining delay=[" + ((ScheduledFuture) this).getDelay(TimeUnit.MILLISECONDS) + " ms]";
    }

    public final void i(i iVar) {
        iVar.f43157a = null;
        while (true) {
            i iVar2 = this.f43141d;
            if (iVar2 == i.f43156c) {
                return;
            }
            i iVar3 = null;
            while (iVar2 != null) {
                i iVar4 = iVar2.f43158b;
                if (iVar2.f43157a != null) {
                    iVar3 = iVar2;
                } else if (iVar3 != null) {
                    iVar3.f43158b = iVar4;
                    if (iVar3.f43157a == null) {
                        break;
                    }
                } else if (!f43137g.c(this, iVar2, iVar4)) {
                    break;
                }
                iVar2 = iVar4;
            }
            return;
        }
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.f43139b instanceof c;
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return (!(r0 instanceof g)) & (this.f43139b != null);
    }

    public boolean j(@P V v12) {
        if (v12 == null) {
            v12 = (V) f43138h;
        }
        if (!f43137g.b(this, null, v12)) {
            return false;
        }
        c(this);
        return true;
    }

    public boolean k(Throwable th2) {
        th2.getClass();
        if (!f43137g.b(this, null, new d(th2))) {
            return false;
        }
        c(this);
        return true;
    }

    public final boolean l() {
        Object obj = this.f43139b;
        return (obj instanceof c) && ((c) obj).f43144a;
    }

    public final String toString() {
        String strH;
        StringBuilder sb2 = new StringBuilder();
        sb2.append(super.toString());
        sb2.append("[status=");
        if (this.f43139b instanceof c) {
            sb2.append("CANCELLED");
        } else if (isDone()) {
            a(sb2);
        } else {
            try {
                strH = h();
            } catch (RuntimeException e12) {
                strH = "Exception thrown from implementation: " + e12.getClass();
            }
            if (strH != null && !strH.isEmpty()) {
                sb2.append("PENDING, info=[");
                sb2.append(strH);
                sb2.append("]");
            } else if (isDone()) {
                a(sb2);
            } else {
                sb2.append("PENDING");
            }
        }
        sb2.append("]");
        return sb2.toString();
    }

    public void b() {
    }

    @Override // java.util.concurrent.Future
    public final V get() throws InterruptedException {
        Object obj;
        if (!Thread.interrupted()) {
            Object obj2 = this.f43139b;
            if ((obj2 != null) & (!(obj2 instanceof g))) {
                return (V) e(obj2);
            }
            i iVar = this.f43141d;
            i iVar2 = i.f43156c;
            if (iVar != iVar2) {
                i iVar3 = new i();
                do {
                    b bVar = f43137g;
                    bVar.d(iVar3, iVar);
                    if (bVar.c(this, iVar, iVar3)) {
                        do {
                            LockSupport.park(this);
                            if (!Thread.interrupted()) {
                                obj = this.f43139b;
                            } else {
                                i(iVar3);
                                throw new InterruptedException();
                            }
                        } while (!((obj != null) & (!(obj instanceof g))));
                        return (V) e(obj);
                    }
                    iVar = this.f43141d;
                } while (iVar != iVar2);
            }
            return (V) e(this.f43139b);
        }
        throw new InterruptedException();
    }
}
