package androidx.work.impl.utils.futures;

import androidx.annotation.RestrictTo;
import com.google.common.util.concurrent.D0;
import j.P;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import java.util.logging.Level;
import java.util.logging.Logger;

/* compiled from: AbstractFuture.java */
@RestrictTo
/* loaded from: classes10.dex */
public abstract class a<V> implements D0<V> {

    /* renamed from: e, reason: collision with root package name */
    public static final boolean f55988e = Boolean.parseBoolean(System.getProperty("guava.concurrent.generate_cancellation_cause", "false"));

    /* renamed from: f, reason: collision with root package name */
    public static final Logger f55989f = Logger.getLogger(a.class.getName());

    /* renamed from: g, reason: collision with root package name */
    public static final b f55990g;

    /* renamed from: h, reason: collision with root package name */
    public static final Object f55991h;

    /* renamed from: b, reason: collision with root package name */
    @P
    public volatile Object f55992b;

    /* renamed from: c, reason: collision with root package name */
    @P
    public volatile e f55993c;

    /* renamed from: d, reason: collision with root package name */
    @P
    public volatile i f55994d;

    /* compiled from: AbstractFuture.java */
    public static abstract class b {
        public b() {
        }

        public abstract boolean a(a<?> aVar, e eVar, e eVar2);

        public abstract boolean b(a<?> aVar, Object obj, Object obj2);

        public abstract boolean c(a<?> aVar, i iVar, i iVar2);

        public abstract void d(i iVar, i iVar2);

        public abstract void e(i iVar, Thread thread);
    }

    /* compiled from: AbstractFuture.java */
    public static final class c {

        /* renamed from: b, reason: collision with root package name */
        public static final c f55995b;

        /* renamed from: c, reason: collision with root package name */
        public static final c f55996c;

        /* renamed from: a, reason: collision with root package name */
        @P
        public final CancellationException f55997a;

        static {
            if (a.f55988e) {
                f55996c = null;
                f55995b = null;
            } else {
                f55996c = new c(false, null);
                f55995b = new c(true, null);
            }
        }

        public c(boolean z12, @P CancellationException cancellationException) {
            this.f55997a = cancellationException;
        }
    }

    /* compiled from: AbstractFuture.java */
    public static final class d {

        /* renamed from: a, reason: collision with root package name */
        public final Throwable f55998a;

        /* compiled from: AbstractFuture.java */
        /* renamed from: androidx.work.impl.utils.futures.a$d$a, reason: collision with other inner class name */
        public class C1964a extends Throwable {
            @Override // java.lang.Throwable
            public final synchronized Throwable fillInStackTrace() {
                return this;
            }
        }

        static {
            new d(new C1964a("Failure occurred while trying to finish a future."));
        }

        public d(Throwable th2) {
            boolean z12 = a.f55988e;
            th2.getClass();
            this.f55998a = th2;
        }
    }

    /* compiled from: AbstractFuture.java */
    public static final class e {

        /* renamed from: d, reason: collision with root package name */
        public static final e f55999d = new e(null, null);

        /* renamed from: a, reason: collision with root package name */
        public final Runnable f56000a;

        /* renamed from: b, reason: collision with root package name */
        public final Executor f56001b;

        /* renamed from: c, reason: collision with root package name */
        @P
        public e f56002c;

        public e(Runnable runnable, Executor executor) {
            this.f56000a = runnable;
            this.f56001b = executor;
        }
    }

    /* compiled from: AbstractFuture.java */
    public static final class f extends b {

        /* renamed from: a, reason: collision with root package name */
        public final AtomicReferenceFieldUpdater<i, Thread> f56003a;

        /* renamed from: b, reason: collision with root package name */
        public final AtomicReferenceFieldUpdater<i, i> f56004b;

        /* renamed from: c, reason: collision with root package name */
        public final AtomicReferenceFieldUpdater<a, i> f56005c;

        /* renamed from: d, reason: collision with root package name */
        public final AtomicReferenceFieldUpdater<a, e> f56006d;

        /* renamed from: e, reason: collision with root package name */
        public final AtomicReferenceFieldUpdater<a, Object> f56007e;

        public f(AtomicReferenceFieldUpdater<i, Thread> atomicReferenceFieldUpdater, AtomicReferenceFieldUpdater<i, i> atomicReferenceFieldUpdater2, AtomicReferenceFieldUpdater<a, i> atomicReferenceFieldUpdater3, AtomicReferenceFieldUpdater<a, e> atomicReferenceFieldUpdater4, AtomicReferenceFieldUpdater<a, Object> atomicReferenceFieldUpdater5) {
            super();
            this.f56003a = atomicReferenceFieldUpdater;
            this.f56004b = atomicReferenceFieldUpdater2;
            this.f56005c = atomicReferenceFieldUpdater3;
            this.f56006d = atomicReferenceFieldUpdater4;
            this.f56007e = atomicReferenceFieldUpdater5;
        }

        @Override // androidx.work.impl.utils.futures.a.b
        public final boolean a(a<?> aVar, e eVar, e eVar2) {
            AtomicReferenceFieldUpdater<a, e> atomicReferenceFieldUpdater;
            do {
                atomicReferenceFieldUpdater = this.f56006d;
                if (atomicReferenceFieldUpdater.compareAndSet(aVar, eVar, eVar2)) {
                    return true;
                }
            } while (atomicReferenceFieldUpdater.get(aVar) == eVar);
            return false;
        }

        @Override // androidx.work.impl.utils.futures.a.b
        public final boolean b(a<?> aVar, Object obj, Object obj2) {
            AtomicReferenceFieldUpdater<a, Object> atomicReferenceFieldUpdater;
            do {
                atomicReferenceFieldUpdater = this.f56007e;
                if (atomicReferenceFieldUpdater.compareAndSet(aVar, obj, obj2)) {
                    return true;
                }
            } while (atomicReferenceFieldUpdater.get(aVar) == obj);
            return false;
        }

        @Override // androidx.work.impl.utils.futures.a.b
        public final boolean c(a<?> aVar, i iVar, i iVar2) {
            AtomicReferenceFieldUpdater<a, i> atomicReferenceFieldUpdater;
            do {
                atomicReferenceFieldUpdater = this.f56005c;
                if (atomicReferenceFieldUpdater.compareAndSet(aVar, iVar, iVar2)) {
                    return true;
                }
            } while (atomicReferenceFieldUpdater.get(aVar) == iVar);
            return false;
        }

        @Override // androidx.work.impl.utils.futures.a.b
        public final void d(i iVar, i iVar2) {
            this.f56004b.lazySet(iVar, iVar2);
        }

        @Override // androidx.work.impl.utils.futures.a.b
        public final void e(i iVar, Thread thread) {
            this.f56003a.lazySet(iVar, thread);
        }
    }

    /* compiled from: AbstractFuture.java */
    public static final class g<V> implements Runnable {
        @Override // java.lang.Runnable
        public final void run() {
            throw null;
        }
    }

    /* compiled from: AbstractFuture.java */
    public static final class h extends b {
        public h() {
            super();
        }

        @Override // androidx.work.impl.utils.futures.a.b
        public final boolean a(a<?> aVar, e eVar, e eVar2) {
            synchronized (aVar) {
                try {
                    if (aVar.f55993c != eVar) {
                        return false;
                    }
                    aVar.f55993c = eVar2;
                    return true;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        @Override // androidx.work.impl.utils.futures.a.b
        public final boolean b(a<?> aVar, Object obj, Object obj2) {
            synchronized (aVar) {
                try {
                    if (aVar.f55992b != obj) {
                        return false;
                    }
                    aVar.f55992b = obj2;
                    return true;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        @Override // androidx.work.impl.utils.futures.a.b
        public final boolean c(a<?> aVar, i iVar, i iVar2) {
            synchronized (aVar) {
                try {
                    if (aVar.f55994d != iVar) {
                        return false;
                    }
                    aVar.f55994d = iVar2;
                    return true;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        @Override // androidx.work.impl.utils.futures.a.b
        public final void d(i iVar, i iVar2) {
            iVar.f56010b = iVar2;
        }

        @Override // androidx.work.impl.utils.futures.a.b
        public final void e(i iVar, Thread thread) {
            iVar.f56009a = thread;
        }
    }

    /* compiled from: AbstractFuture.java */
    public static final class i {

        /* renamed from: c, reason: collision with root package name */
        public static final i f56008c = new i();

        /* renamed from: a, reason: collision with root package name */
        @P
        public volatile Thread f56009a;

        /* renamed from: b, reason: collision with root package name */
        @P
        public volatile i f56010b;

        public i() {
            a.f55990g.e(this, Thread.currentThread());
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
        f55990g = hVar;
        if (th != null) {
            f55989f.log(Level.SEVERE, "SafeAtomicHelper is broken!", th);
        }
        f55991h = new Object();
    }

    public static void b(a<?> aVar) {
        i iVar;
        e eVar;
        do {
            iVar = aVar.f55994d;
        } while (!f55990g.c(aVar, iVar, i.f56008c));
        while (iVar != null) {
            Thread thread = iVar.f56009a;
            if (thread != null) {
                iVar.f56009a = null;
                LockSupport.unpark(thread);
            }
            iVar = iVar.f56010b;
        }
        do {
            eVar = aVar.f55993c;
        } while (!f55990g.a(aVar, eVar, e.f55999d));
        e eVar2 = null;
        while (eVar != null) {
            e eVar3 = eVar.f56002c;
            eVar.f56002c = eVar2;
            eVar2 = eVar;
            eVar = eVar3;
        }
        while (eVar2 != null) {
            e eVar4 = eVar2.f56002c;
            Runnable runnable = eVar2.f56000a;
            if (runnable instanceof g) {
                ((g) runnable).getClass();
                throw null;
            }
            c(runnable, eVar2.f56001b);
            eVar2 = eVar4;
        }
    }

    public static void c(Runnable runnable, Executor executor) {
        try {
            executor.execute(runnable);
        } catch (RuntimeException e12) {
            f55989f.log(Level.SEVERE, "RuntimeException while executing runnable " + runnable + " with executor " + executor, (Throwable) e12);
        }
    }

    public static Object d(Object obj) throws ExecutionException {
        if (obj instanceof c) {
            CancellationException cancellationException = ((c) obj).f55997a;
            CancellationException cancellationException2 = new CancellationException("Task was cancelled.");
            cancellationException2.initCause(cancellationException);
            throw cancellationException2;
        }
        if (obj instanceof d) {
            throw new ExecutionException(((d) obj).f55998a);
        }
        if (obj == f55991h) {
            return null;
        }
        return obj;
    }

    public static Object e(a aVar) {
        V v12;
        boolean z12 = false;
        while (true) {
            try {
                v12 = aVar.get();
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
        e eVar = this.f55993c;
        e eVar2 = e.f55999d;
        if (eVar != eVar2) {
            e eVar3 = new e(runnable, executor);
            do {
                eVar3.f56002c = eVar;
                if (f55990g.a(this, eVar, eVar3)) {
                    return;
                } else {
                    eVar = this.f55993c;
                }
            } while (eVar != eVar2);
        }
        c(runnable, executor);
    }

    public final void a(StringBuilder sb2) {
        try {
            Object objE = e(this);
            sb2.append("SUCCESS, result=[");
            sb2.append(objE == this ? "this future" : String.valueOf(objE));
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
        Object obj = this.f55992b;
        if ((obj == null) | (obj instanceof g)) {
            c cVar = f55988e ? new c(z12, new CancellationException("Future.cancel() was called.")) : z12 ? c.f55995b : c.f55996c;
            while (!f55990g.b(this, obj, cVar)) {
                obj = this.f55992b;
                if (!(obj instanceof g)) {
                }
            }
            b(this);
            if (!(obj instanceof g)) {
                return true;
            }
            ((g) obj).getClass();
            throw null;
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @P
    public final String f() {
        Object obj = this.f55992b;
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

    public final void g(i iVar) {
        iVar.f56009a = null;
        while (true) {
            i iVar2 = this.f55994d;
            if (iVar2 == i.f56008c) {
                return;
            }
            i iVar3 = null;
            while (iVar2 != null) {
                i iVar4 = iVar2.f56010b;
                if (iVar2.f56009a != null) {
                    iVar3 = iVar2;
                } else if (iVar3 != null) {
                    iVar3.f56010b = iVar4;
                    if (iVar3.f56009a == null) {
                        break;
                    }
                } else if (!f55990g.c(this, iVar2, iVar4)) {
                    break;
                }
                iVar2 = iVar4;
            }
            return;
        }
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
        throw new UnsupportedOperationException("Method not decompiled: androidx.work.impl.utils.futures.a.get(long, java.util.concurrent.TimeUnit):java.lang.Object");
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.f55992b instanceof c;
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return (!(r0 instanceof g)) & (this.f55992b != null);
    }

    public final String toString() {
        String strF;
        StringBuilder sb2 = new StringBuilder();
        sb2.append(super.toString());
        sb2.append("[status=");
        if (this.f55992b instanceof c) {
            sb2.append("CANCELLED");
        } else if (isDone()) {
            a(sb2);
        } else {
            try {
                strF = f();
            } catch (RuntimeException e12) {
                strF = "Exception thrown from implementation: " + e12.getClass();
            }
            if (strF != null && !strF.isEmpty()) {
                sb2.append("PENDING, info=[");
                sb2.append(strF);
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

    @Override // java.util.concurrent.Future
    public final V get() throws InterruptedException {
        Object obj;
        if (!Thread.interrupted()) {
            Object obj2 = this.f55992b;
            if ((obj2 != null) & (!(obj2 instanceof g))) {
                return (V) d(obj2);
            }
            i iVar = this.f55994d;
            i iVar2 = i.f56008c;
            if (iVar != iVar2) {
                i iVar3 = new i();
                do {
                    b bVar = f55990g;
                    bVar.d(iVar3, iVar);
                    if (bVar.c(this, iVar, iVar3)) {
                        do {
                            LockSupport.park(this);
                            if (!Thread.interrupted()) {
                                obj = this.f55992b;
                            } else {
                                g(iVar3);
                                throw new InterruptedException();
                            }
                        } while (!((obj != null) & (!(obj instanceof g))));
                        return (V) d(obj);
                    }
                    iVar = this.f55994d;
                } while (iVar != iVar2);
            }
            return (V) d(this.f55992b);
        }
        throw new InterruptedException();
    }
}
