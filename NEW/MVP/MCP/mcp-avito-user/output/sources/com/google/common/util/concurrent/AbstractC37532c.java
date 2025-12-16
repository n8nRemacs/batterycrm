package com.google.common.util.concurrent;

import aZ0.InterfaceC19845a;
import com.google.j2objc.annotations.ReflectionSupport;
import java.lang.reflect.Field;
import java.security.AccessController;
import java.security.PrivilegedActionException;
import java.security.PrivilegedExceptionAction;
import java.util.Objects;
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
import sun.misc.Unsafe;

/* compiled from: AbstractFuture.java */
@InterfaceC37531b0
@ReflectionSupport(ReflectionSupport.Level.FULL)
@XY0.b
/* renamed from: com.google.common.util.concurrent.c, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC37532c<V> extends ZY0.a implements D0<V> {

    /* renamed from: e, reason: collision with root package name */
    public static final boolean f360557e;

    /* renamed from: f, reason: collision with root package name */
    public static final Logger f360558f;

    /* renamed from: g, reason: collision with root package name */
    public static final b f360559g;

    /* renamed from: h, reason: collision with root package name */
    public static final Object f360560h;

    /* renamed from: b, reason: collision with root package name */
    @I41.a
    public volatile Object f360561b;

    /* renamed from: c, reason: collision with root package name */
    @I41.a
    public volatile e f360562c;

    /* renamed from: d, reason: collision with root package name */
    @I41.a
    public volatile l f360563d;

    /* compiled from: AbstractFuture.java */
    /* renamed from: com.google.common.util.concurrent.c$b */
    public static abstract class b {
        public b() {
        }

        public abstract boolean a(AbstractC37532c<?> abstractC37532c, @I41.a e eVar, e eVar2);

        public abstract boolean b(AbstractC37532c<?> abstractC37532c, @I41.a Object obj, Object obj2);

        public abstract boolean c(AbstractC37532c<?> abstractC37532c, @I41.a l lVar, @I41.a l lVar2);

        public abstract e d(AbstractC37532c<?> abstractC37532c, e eVar);

        public abstract l e(AbstractC37532c abstractC37532c);

        public abstract void f(l lVar, @I41.a l lVar2);

        public abstract void g(l lVar, Thread thread);
    }

    /* compiled from: AbstractFuture.java */
    /* renamed from: com.google.common.util.concurrent.c$c, reason: collision with other inner class name */
    public static final class C10692c {

        /* renamed from: c, reason: collision with root package name */
        @I41.a
        public static final C10692c f360564c;

        /* renamed from: d, reason: collision with root package name */
        @I41.a
        public static final C10692c f360565d;

        /* renamed from: a, reason: collision with root package name */
        public final boolean f360566a;

        /* renamed from: b, reason: collision with root package name */
        @I41.a
        public final RuntimeException f360567b;

        static {
            if (AbstractC37532c.f360557e) {
                f360565d = null;
                f360564c = null;
            } else {
                f360565d = new C10692c(false, null);
                f360564c = new C10692c(true, null);
            }
        }

        public C10692c(boolean z12, @I41.a RuntimeException runtimeException) {
            this.f360566a = z12;
            this.f360567b = runtimeException;
        }
    }

    /* compiled from: AbstractFuture.java */
    /* renamed from: com.google.common.util.concurrent.c$d */
    public static final class d {

        /* renamed from: b, reason: collision with root package name */
        public static final d f360568b = new d(new a("Failure occurred while trying to finish a future."));

        /* renamed from: a, reason: collision with root package name */
        public final Throwable f360569a;

        /* compiled from: AbstractFuture.java */
        /* renamed from: com.google.common.util.concurrent.c$d$a */
        public class a extends Throwable {
            @Override // java.lang.Throwable
            public final synchronized Throwable fillInStackTrace() {
                return this;
            }
        }

        public d(Throwable th2) {
            th2.getClass();
            this.f360569a = th2;
        }
    }

    /* compiled from: AbstractFuture.java */
    /* renamed from: com.google.common.util.concurrent.c$f */
    public static final class f extends b {

        /* renamed from: a, reason: collision with root package name */
        public final AtomicReferenceFieldUpdater<l, Thread> f360574a;

        /* renamed from: b, reason: collision with root package name */
        public final AtomicReferenceFieldUpdater<l, l> f360575b;

        /* renamed from: c, reason: collision with root package name */
        public final AtomicReferenceFieldUpdater<AbstractC37532c, l> f360576c;

        /* renamed from: d, reason: collision with root package name */
        public final AtomicReferenceFieldUpdater<AbstractC37532c, e> f360577d;

        /* renamed from: e, reason: collision with root package name */
        public final AtomicReferenceFieldUpdater<AbstractC37532c, Object> f360578e;

        public f(AtomicReferenceFieldUpdater<l, Thread> atomicReferenceFieldUpdater, AtomicReferenceFieldUpdater<l, l> atomicReferenceFieldUpdater2, AtomicReferenceFieldUpdater<AbstractC37532c, l> atomicReferenceFieldUpdater3, AtomicReferenceFieldUpdater<AbstractC37532c, e> atomicReferenceFieldUpdater4, AtomicReferenceFieldUpdater<AbstractC37532c, Object> atomicReferenceFieldUpdater5) {
            super();
            this.f360574a = atomicReferenceFieldUpdater;
            this.f360575b = atomicReferenceFieldUpdater2;
            this.f360576c = atomicReferenceFieldUpdater3;
            this.f360577d = atomicReferenceFieldUpdater4;
            this.f360578e = atomicReferenceFieldUpdater5;
        }

        @Override // com.google.common.util.concurrent.AbstractC37532c.b
        public final boolean a(AbstractC37532c<?> abstractC37532c, @I41.a e eVar, e eVar2) {
            AtomicReferenceFieldUpdater<AbstractC37532c, e> atomicReferenceFieldUpdater;
            do {
                atomicReferenceFieldUpdater = this.f360577d;
                if (atomicReferenceFieldUpdater.compareAndSet(abstractC37532c, eVar, eVar2)) {
                    return true;
                }
            } while (atomicReferenceFieldUpdater.get(abstractC37532c) == eVar);
            return false;
        }

        @Override // com.google.common.util.concurrent.AbstractC37532c.b
        public final boolean b(AbstractC37532c<?> abstractC37532c, @I41.a Object obj, Object obj2) {
            AtomicReferenceFieldUpdater<AbstractC37532c, Object> atomicReferenceFieldUpdater;
            do {
                atomicReferenceFieldUpdater = this.f360578e;
                if (atomicReferenceFieldUpdater.compareAndSet(abstractC37532c, obj, obj2)) {
                    return true;
                }
            } while (atomicReferenceFieldUpdater.get(abstractC37532c) == obj);
            return false;
        }

        @Override // com.google.common.util.concurrent.AbstractC37532c.b
        public final boolean c(AbstractC37532c<?> abstractC37532c, @I41.a l lVar, @I41.a l lVar2) {
            AtomicReferenceFieldUpdater<AbstractC37532c, l> atomicReferenceFieldUpdater;
            do {
                atomicReferenceFieldUpdater = this.f360576c;
                if (atomicReferenceFieldUpdater.compareAndSet(abstractC37532c, lVar, lVar2)) {
                    return true;
                }
            } while (atomicReferenceFieldUpdater.get(abstractC37532c) == lVar);
            return false;
        }

        @Override // com.google.common.util.concurrent.AbstractC37532c.b
        public final e d(AbstractC37532c<?> abstractC37532c, e eVar) {
            return this.f360577d.getAndSet(abstractC37532c, eVar);
        }

        @Override // com.google.common.util.concurrent.AbstractC37532c.b
        public final l e(AbstractC37532c abstractC37532c) {
            return this.f360576c.getAndSet(abstractC37532c, l.f360587c);
        }

        @Override // com.google.common.util.concurrent.AbstractC37532c.b
        public final void f(l lVar, @I41.a l lVar2) {
            this.f360575b.lazySet(lVar, lVar2);
        }

        @Override // com.google.common.util.concurrent.AbstractC37532c.b
        public final void g(l lVar, Thread thread) {
            this.f360574a.lazySet(lVar, thread);
        }
    }

    /* compiled from: AbstractFuture.java */
    /* renamed from: com.google.common.util.concurrent.c$g */
    public static final class g<V> implements Runnable {

        /* renamed from: b, reason: collision with root package name */
        public final AbstractC37532c<V> f360579b;

        /* renamed from: c, reason: collision with root package name */
        public final D0<? extends V> f360580c;

        public g(AbstractC37532c<V> abstractC37532c, D0<? extends V> d02) {
            this.f360579b = abstractC37532c;
            this.f360580c = d02;
        }

        @Override // java.lang.Runnable
        public final void run() {
            if (this.f360579b.f360561b != this) {
                return;
            }
            if (AbstractC37532c.f360559g.b(this.f360579b, this, AbstractC37532c.h(this.f360580c))) {
                AbstractC37532c.e(this.f360579b, false);
            }
        }
    }

    /* compiled from: AbstractFuture.java */
    /* renamed from: com.google.common.util.concurrent.c$h */
    public static final class h extends b {
        public h() {
            super();
        }

        @Override // com.google.common.util.concurrent.AbstractC37532c.b
        public final boolean a(AbstractC37532c<?> abstractC37532c, @I41.a e eVar, e eVar2) {
            synchronized (abstractC37532c) {
                try {
                    if (abstractC37532c.f360562c != eVar) {
                        return false;
                    }
                    abstractC37532c.f360562c = eVar2;
                    return true;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        @Override // com.google.common.util.concurrent.AbstractC37532c.b
        public final boolean b(AbstractC37532c<?> abstractC37532c, @I41.a Object obj, Object obj2) {
            synchronized (abstractC37532c) {
                try {
                    if (abstractC37532c.f360561b != obj) {
                        return false;
                    }
                    abstractC37532c.f360561b = obj2;
                    return true;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        @Override // com.google.common.util.concurrent.AbstractC37532c.b
        public final boolean c(AbstractC37532c<?> abstractC37532c, @I41.a l lVar, @I41.a l lVar2) {
            synchronized (abstractC37532c) {
                try {
                    if (abstractC37532c.f360563d != lVar) {
                        return false;
                    }
                    abstractC37532c.f360563d = lVar2;
                    return true;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        @Override // com.google.common.util.concurrent.AbstractC37532c.b
        public final e d(AbstractC37532c<?> abstractC37532c, e eVar) {
            e eVar2;
            synchronized (abstractC37532c) {
                eVar2 = abstractC37532c.f360562c;
                if (eVar2 != eVar) {
                    abstractC37532c.f360562c = eVar;
                }
            }
            return eVar2;
        }

        @Override // com.google.common.util.concurrent.AbstractC37532c.b
        public final l e(AbstractC37532c abstractC37532c) {
            l lVar;
            l lVar2 = l.f360587c;
            synchronized (abstractC37532c) {
                lVar = abstractC37532c.f360563d;
                if (lVar != lVar2) {
                    abstractC37532c.f360563d = lVar2;
                }
            }
            return lVar;
        }

        @Override // com.google.common.util.concurrent.AbstractC37532c.b
        public final void f(l lVar, @I41.a l lVar2) {
            lVar.f360589b = lVar2;
        }

        @Override // com.google.common.util.concurrent.AbstractC37532c.b
        public final void g(l lVar, Thread thread) {
            lVar.f360588a = thread;
        }
    }

    /* compiled from: AbstractFuture.java */
    /* renamed from: com.google.common.util.concurrent.c$i */
    public interface i<V> extends D0<V> {
    }

    /* compiled from: AbstractFuture.java */
    /* renamed from: com.google.common.util.concurrent.c$j */
    public static abstract class j<V> extends AbstractC37532c<V> implements i<V> {
        @Override // com.google.common.util.concurrent.AbstractC37532c, java.util.concurrent.Future
        public boolean isCancelled() {
            return this.f360561b instanceof C10692c;
        }
    }

    /* compiled from: AbstractFuture.java */
    /* renamed from: com.google.common.util.concurrent.c$k */
    public static final class k extends b {

        /* renamed from: a, reason: collision with root package name */
        public static final Unsafe f360581a;

        /* renamed from: b, reason: collision with root package name */
        public static final long f360582b;

        /* renamed from: c, reason: collision with root package name */
        public static final long f360583c;

        /* renamed from: d, reason: collision with root package name */
        public static final long f360584d;

        /* renamed from: e, reason: collision with root package name */
        public static final long f360585e;

        /* renamed from: f, reason: collision with root package name */
        public static final long f360586f;

        /* compiled from: AbstractFuture.java */
        /* renamed from: com.google.common.util.concurrent.c$k$a */
        public class a implements PrivilegedExceptionAction<Unsafe> {
            public static Unsafe a() throws IllegalAccessException, SecurityException, IllegalArgumentException {
                for (Field field : Unsafe.class.getDeclaredFields()) {
                    field.setAccessible(true);
                    Object obj = field.get(null);
                    if (Unsafe.class.isInstance(obj)) {
                        return (Unsafe) Unsafe.class.cast(obj);
                    }
                }
                throw new NoSuchFieldError("the Unsafe");
            }

            @Override // java.security.PrivilegedExceptionAction
            public final /* bridge */ /* synthetic */ Unsafe run() {
                return a();
            }
        }

        static {
            Unsafe unsafe;
            try {
                try {
                    unsafe = Unsafe.getUnsafe();
                } catch (PrivilegedActionException e12) {
                    throw new RuntimeException("Could not initialize intrinsics", e12.getCause());
                }
            } catch (SecurityException unused) {
                unsafe = (Unsafe) AccessController.doPrivileged(new a());
            }
            try {
                f360583c = unsafe.objectFieldOffset(AbstractC37532c.class.getDeclaredField("d"));
                f360582b = unsafe.objectFieldOffset(AbstractC37532c.class.getDeclaredField("c"));
                f360584d = unsafe.objectFieldOffset(AbstractC37532c.class.getDeclaredField("b"));
                f360585e = unsafe.objectFieldOffset(l.class.getDeclaredField("a"));
                f360586f = unsafe.objectFieldOffset(l.class.getDeclaredField("b"));
                f360581a = unsafe;
            } catch (NoSuchFieldException e13) {
                throw new RuntimeException(e13);
            } catch (RuntimeException e14) {
                throw e14;
            }
        }

        public k() {
            super();
        }

        @Override // com.google.common.util.concurrent.AbstractC37532c.b
        public final boolean a(AbstractC37532c<?> abstractC37532c, @I41.a e eVar, e eVar2) {
            return C37534d.a(f360581a, abstractC37532c, f360582b, eVar, eVar2);
        }

        @Override // com.google.common.util.concurrent.AbstractC37532c.b
        public final boolean b(AbstractC37532c<?> abstractC37532c, @I41.a Object obj, Object obj2) {
            return C37534d.a(f360581a, abstractC37532c, f360584d, obj, obj2);
        }

        @Override // com.google.common.util.concurrent.AbstractC37532c.b
        public final boolean c(AbstractC37532c<?> abstractC37532c, @I41.a l lVar, @I41.a l lVar2) {
            return C37534d.a(f360581a, abstractC37532c, f360583c, lVar, lVar2);
        }

        @Override // com.google.common.util.concurrent.AbstractC37532c.b
        public final e d(AbstractC37532c<?> abstractC37532c, e eVar) {
            e eVar2;
            do {
                eVar2 = abstractC37532c.f360562c;
                if (eVar == eVar2) {
                    return eVar2;
                }
            } while (!a(abstractC37532c, eVar2, eVar));
            return eVar2;
        }

        @Override // com.google.common.util.concurrent.AbstractC37532c.b
        public final l e(AbstractC37532c abstractC37532c) {
            l lVar;
            l lVar2 = l.f360587c;
            do {
                lVar = abstractC37532c.f360563d;
                if (lVar2 == lVar) {
                    return lVar;
                }
            } while (!c(abstractC37532c, lVar, lVar2));
            return lVar;
        }

        @Override // com.google.common.util.concurrent.AbstractC37532c.b
        public final void f(l lVar, @I41.a l lVar2) {
            f360581a.putObject(lVar, f360586f, lVar2);
        }

        @Override // com.google.common.util.concurrent.AbstractC37532c.b
        public final void g(l lVar, Thread thread) {
            f360581a.putObject(lVar, f360585e, thread);
        }
    }

    /* compiled from: AbstractFuture.java */
    /* renamed from: com.google.common.util.concurrent.c$l */
    public static final class l {

        /* renamed from: c, reason: collision with root package name */
        public static final l f360587c = new l();

        /* renamed from: a, reason: collision with root package name */
        @I41.a
        public volatile Thread f360588a;

        /* renamed from: b, reason: collision with root package name */
        @I41.a
        public volatile l f360589b;

        public l() {
            AbstractC37532c.f360559g.g(this, Thread.currentThread());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.RuntimeException] */
    /* JADX WARN: Type inference failed for: r0v3, types: [java.util.logging.Logger] */
    /* JADX WARN: Type inference failed for: r11v0, types: [com.google.common.util.concurrent.c$f] */
    /* JADX WARN: Type inference failed for: r3v2, types: [com.google.common.util.concurrent.c$a] */
    /* JADX WARN: Type inference failed for: r3v3 */
    /* JADX WARN: Type inference failed for: r3v4, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r3v5 */
    /* JADX WARN: Type inference failed for: r4v2, types: [com.google.common.util.concurrent.c$k] */
    static {
        boolean z12;
        h hVar;
        try {
            z12 = Boolean.parseBoolean(System.getProperty("guava.concurrent.generate_cancellation_cause", "false"));
        } catch (SecurityException unused) {
            z12 = false;
        }
        f360557e = z12;
        f360558f = Logger.getLogger(AbstractC37532c.class.getName());
        ?? r32 = 0;
        r32 = 0;
        try {
            hVar = new k();
            e = null;
        } catch (Error | RuntimeException e12) {
            e = e12;
            try {
                hVar = new f(AtomicReferenceFieldUpdater.newUpdater(l.class, Thread.class, "a"), AtomicReferenceFieldUpdater.newUpdater(l.class, l.class, "b"), AtomicReferenceFieldUpdater.newUpdater(AbstractC37532c.class, l.class, "d"), AtomicReferenceFieldUpdater.newUpdater(AbstractC37532c.class, e.class, "c"), AtomicReferenceFieldUpdater.newUpdater(AbstractC37532c.class, Object.class, "b"));
            } catch (Error | RuntimeException e13) {
                hVar = new h();
                r32 = e13;
            }
        }
        f360559g = hVar;
        if (r32 != 0) {
            ?? r02 = f360558f;
            Level level = Level.SEVERE;
            r02.log(level, "UnsafeAtomicHelper is broken!", e);
            r02.log(level, "SafeAtomicHelper is broken!", r32);
        }
        f360560h = new Object();
    }

    public static void e(AbstractC37532c<?> abstractC37532c, boolean z12) {
        e eVar = null;
        while (true) {
            abstractC37532c.getClass();
            for (l lVarE = f360559g.e(abstractC37532c); lVarE != null; lVarE = lVarE.f360589b) {
                Thread thread = lVarE.f360588a;
                if (thread != null) {
                    lVarE.f360588a = null;
                    LockSupport.unpark(thread);
                }
            }
            if (z12) {
                abstractC37532c.j();
                z12 = false;
            }
            abstractC37532c.c();
            e eVar2 = eVar;
            e eVarD = f360559g.d(abstractC37532c, e.f360570d);
            e eVar3 = eVar2;
            while (eVarD != null) {
                e eVar4 = eVarD.f360573c;
                eVarD.f360573c = eVar3;
                eVar3 = eVarD;
                eVarD = eVar4;
            }
            while (eVar3 != null) {
                eVar = eVar3.f360573c;
                Runnable runnable = eVar3.f360571a;
                Objects.requireNonNull(runnable);
                if (runnable instanceof g) {
                    g gVar = (g) runnable;
                    abstractC37532c = gVar.f360579b;
                    if (abstractC37532c.f360561b == gVar) {
                        if (f360559g.b(abstractC37532c, gVar, h(gVar.f360580c))) {
                            break;
                        }
                    } else {
                        continue;
                    }
                } else {
                    Executor executor = eVar3.f360572b;
                    Objects.requireNonNull(executor);
                    f(runnable, executor);
                }
                eVar3 = eVar;
            }
            return;
        }
    }

    public static void f(Runnable runnable, Executor executor) {
        try {
            executor.execute(runnable);
        } catch (RuntimeException e12) {
            f360558f.log(Level.SEVERE, "RuntimeException while executing runnable " + runnable + " with executor " + executor, (Throwable) e12);
        }
    }

    @T0
    public static Object g(Object obj) throws ExecutionException {
        if (obj instanceof C10692c) {
            RuntimeException runtimeException = ((C10692c) obj).f360567b;
            CancellationException cancellationException = new CancellationException("Task was cancelled.");
            cancellationException.initCause(runtimeException);
            throw cancellationException;
        }
        if (obj instanceof d) {
            throw new ExecutionException(((d) obj).f360569a);
        }
        if (obj == f360560h) {
            return null;
        }
        return obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static Object h(D0<?> d02) {
        Throwable thA;
        if (d02 instanceof i) {
            Object c10692c = ((AbstractC37532c) d02).f360561b;
            if (c10692c instanceof C10692c) {
                C10692c c10692c2 = (C10692c) c10692c;
                if (c10692c2.f360566a) {
                    c10692c = c10692c2.f360567b != null ? new C10692c(false, c10692c2.f360567b) : C10692c.f360565d;
                }
            }
            Objects.requireNonNull(c10692c);
            return c10692c;
        }
        if ((d02 instanceof ZY0.a) && (thA = ((ZY0.a) d02).a()) != null) {
            return new d(thA);
        }
        boolean zIsCancelled = d02.isCancelled();
        if ((!f360557e) && zIsCancelled) {
            C10692c c10692c3 = C10692c.f360565d;
            Objects.requireNonNull(c10692c3);
            return c10692c3;
        }
        try {
            Object objI = i(d02);
            if (!zIsCancelled) {
                return objI == null ? f360560h : objI;
            }
            return new C10692c(false, new IllegalArgumentException("get() did not throw CancellationException, despite reporting isCancelled() == true: " + d02));
        } catch (Error e12) {
            e = e12;
            return new d(e);
        } catch (CancellationException e13) {
            if (zIsCancelled) {
                return new C10692c(false, e13);
            }
            return new d(new IllegalArgumentException("get() threw CancellationException, despite reporting isCancelled() == false: " + d02, e13));
        } catch (RuntimeException e14) {
            e = e14;
            return new d(e);
        } catch (ExecutionException e15) {
            if (!zIsCancelled) {
                return new d(e15.getCause());
            }
            return new C10692c(false, new IllegalArgumentException("get() did not throw CancellationException, despite reporting isCancelled() == true: " + d02, e15));
        }
    }

    @T0
    public static Object i(D0 d02) {
        V v12;
        boolean z12 = false;
        while (true) {
            try {
                v12 = d02.get();
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
    public void N(Runnable runnable, Executor executor) {
        e eVar;
        com.google.common.base.M.j(executor, "Executor was null.");
        if (!isDone() && (eVar = this.f360562c) != e.f360570d) {
            e eVar2 = new e(runnable, executor);
            do {
                eVar2.f360573c = eVar;
                if (f360559g.a(this, eVar, eVar2)) {
                    return;
                } else {
                    eVar = this.f360562c;
                }
            } while (eVar != e.f360570d);
        }
        f(runnable, executor);
    }

    @Override // ZY0.a
    @I41.a
    public final Throwable a() {
        if (!(this instanceof i)) {
            return null;
        }
        Object obj = this.f360561b;
        if (obj instanceof d) {
            return ((d) obj).f360569a;
        }
        return null;
    }

    public final void b(StringBuilder sb2) {
        try {
            Object objI = i(this);
            sb2.append("SUCCESS, result=[");
            d(sb2, objI);
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
    @InterfaceC19845a
    public boolean cancel(boolean z12) {
        C10692c c10692c;
        Object obj = this.f360561b;
        if (!(obj == null) && !(obj instanceof g)) {
            return false;
        }
        if (f360557e) {
            c10692c = new C10692c(z12, new CancellationException("Future.cancel() was called."));
        } else {
            c10692c = z12 ? C10692c.f360564c : C10692c.f360565d;
            Objects.requireNonNull(c10692c);
        }
        AbstractC37532c<V> abstractC37532c = this;
        boolean z13 = false;
        while (true) {
            if (f360559g.b(abstractC37532c, obj, c10692c)) {
                e(abstractC37532c, z12);
                if (!(obj instanceof g)) {
                    return true;
                }
                D0<? extends V> d02 = ((g) obj).f360580c;
                if (!(d02 instanceof i)) {
                    d02.cancel(z12);
                    return true;
                }
                abstractC37532c = (AbstractC37532c) d02;
                obj = abstractC37532c.f360561b;
                if (!(obj == null) && !(obj instanceof g)) {
                    return true;
                }
                z13 = true;
            } else {
                obj = abstractC37532c.f360561b;
                if (!(obj instanceof g)) {
                    return z13;
                }
            }
        }
    }

    public final void d(StringBuilder sb2, @I41.a Object obj) {
        if (obj == null) {
            sb2.append("null");
        } else {
            if (obj == this) {
                sb2.append("this future");
                return;
            }
            sb2.append(obj.getClass().getName());
            sb2.append("@");
            sb2.append(Integer.toHexString(System.identityHashCode(obj)));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:46:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00c1  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:56:0x00b4 -> B:36:0x007d). Please report as a decompilation issue!!! */
    @Override // java.util.concurrent.Future
    @aZ0.InterfaceC19845a
    @com.google.common.util.concurrent.T0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public V get(long r20, java.util.concurrent.TimeUnit r22) throws java.lang.InterruptedException, java.util.concurrent.TimeoutException {
        /*
            Method dump skipped, instructions count: 369
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.common.util.concurrent.AbstractC37532c.get(long, java.util.concurrent.TimeUnit):java.lang.Object");
    }

    @Override // java.util.concurrent.Future
    public boolean isCancelled() {
        return this.f360561b instanceof C10692c;
    }

    @Override // java.util.concurrent.Future
    public boolean isDone() {
        return (!(r0 instanceof g)) & (this.f360561b != null);
    }

    public final void k(@I41.a Future<?> future) {
        if ((future != null) && isCancelled()) {
            future.cancel(q());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @I41.a
    public String l() {
        if (!(this instanceof ScheduledFuture)) {
            return null;
        }
        return "remaining delay=[" + ((ScheduledFuture) this).getDelay(TimeUnit.MILLISECONDS) + " ms]";
    }

    public final void m(l lVar) {
        lVar.f360588a = null;
        while (true) {
            l lVar2 = this.f360563d;
            if (lVar2 == l.f360587c) {
                return;
            }
            l lVar3 = null;
            while (lVar2 != null) {
                l lVar4 = lVar2.f360589b;
                if (lVar2.f360588a != null) {
                    lVar3 = lVar2;
                } else if (lVar3 != null) {
                    lVar3.f360589b = lVar4;
                    if (lVar3.f360588a == null) {
                        break;
                    }
                } else if (!f360559g.c(this, lVar2, lVar4)) {
                    break;
                }
                lVar2 = lVar4;
            }
            return;
        }
    }

    @InterfaceC19845a
    public boolean n(@T0 V v12) {
        if (v12 == null) {
            v12 = (V) f360560h;
        }
        if (!f360559g.b(this, null, v12)) {
            return false;
        }
        e(this, false);
        return true;
    }

    @InterfaceC19845a
    public boolean o(Throwable th2) {
        th2.getClass();
        if (!f360559g.b(this, null, new d(th2))) {
            return false;
        }
        e(this, false);
        return true;
    }

    @InterfaceC19845a
    public boolean p(D0<? extends V> d02) {
        d dVar;
        d02.getClass();
        Object obj = this.f360561b;
        if (obj == null) {
            if (d02.isDone()) {
                if (!f360559g.b(this, null, h(d02))) {
                    return false;
                }
                e(this, false);
                return true;
            }
            g gVar = new g(this, d02);
            if (f360559g.b(this, null, gVar)) {
                try {
                    d02.N(gVar, EnumC37529a0.f360553b);
                } catch (Error | RuntimeException e12) {
                    try {
                        dVar = new d(e12);
                    } catch (Error | RuntimeException unused) {
                        dVar = d.f360568b;
                    }
                    f360559g.b(this, gVar, dVar);
                }
                return true;
            }
            obj = this.f360561b;
        }
        if (obj instanceof C10692c) {
            d02.cancel(((C10692c) obj).f360566a);
        }
        return false;
    }

    public final boolean q() {
        Object obj = this.f360561b;
        return (obj instanceof C10692c) && ((C10692c) obj).f360566a;
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x00c2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.String toString() {
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
            goto Lcc
        L50:
            boolean r1 = r6.isDone()
            if (r1 == 0) goto L5b
            r6.b(r0)
            goto Lcc
        L5b:
            int r1 = r0.length()
            java.lang.String r3 = "PENDING"
            r0.append(r3)
            java.lang.Object r3 = r6.f360561b
            boolean r4 = r3 instanceof com.google.common.util.concurrent.AbstractC37532c.g
            java.lang.String r5 = "Exception thrown from implementation: "
            if (r4 == 0) goto L93
            java.lang.String r4 = ", setFuture=["
            r0.append(r4)
            com.google.common.util.concurrent.c$g r3 = (com.google.common.util.concurrent.AbstractC37532c.g) r3
            com.google.common.util.concurrent.D0<? extends V> r3 = r3.f360580c
            if (r3 != r6) goto L81
            java.lang.String r3 = "this future"
            r0.append(r3)     // Catch: java.lang.StackOverflowError -> L7d java.lang.RuntimeException -> L7f
            goto L8f
        L7d:
            r3 = move-exception
            goto L85
        L7f:
            r3 = move-exception
            goto L85
        L81:
            r0.append(r3)     // Catch: java.lang.StackOverflowError -> L7d java.lang.RuntimeException -> L7f
            goto L8f
        L85:
            r0.append(r5)
            java.lang.Class r3 = r3.getClass()
            r0.append(r3)
        L8f:
            r0.append(r2)
            goto Lbc
        L93:
            java.lang.String r3 = r6.l()     // Catch: java.lang.StackOverflowError -> L9c java.lang.RuntimeException -> L9e
            java.lang.String r3 = com.google.common.base.d0.a(r3)     // Catch: java.lang.StackOverflowError -> L9c java.lang.RuntimeException -> L9e
            goto Laf
        L9c:
            r3 = move-exception
            goto L9f
        L9e:
            r3 = move-exception
        L9f:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>(r5)
            java.lang.Class r3 = r3.getClass()
            r4.append(r3)
            java.lang.String r3 = r4.toString()
        Laf:
            if (r3 == 0) goto Lbc
            java.lang.String r4 = ", info=["
            r0.append(r4)
            r0.append(r3)
            r0.append(r2)
        Lbc:
            boolean r3 = r6.isDone()
            if (r3 == 0) goto Lcc
            int r3 = r0.length()
            r0.delete(r1, r3)
            r6.b(r0)
        Lcc:
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.common.util.concurrent.AbstractC37532c.toString():java.lang.String");
    }

    /* compiled from: AbstractFuture.java */
    /* renamed from: com.google.common.util.concurrent.c$e */
    public static final class e {

        /* renamed from: d, reason: collision with root package name */
        public static final e f360570d = new e();

        /* renamed from: a, reason: collision with root package name */
        @I41.a
        public final Runnable f360571a;

        /* renamed from: b, reason: collision with root package name */
        @I41.a
        public final Executor f360572b;

        /* renamed from: c, reason: collision with root package name */
        @I41.a
        public e f360573c;

        public e(Runnable runnable, Executor executor) {
            this.f360571a = runnable;
            this.f360572b = executor;
        }

        public e() {
            this.f360571a = null;
            this.f360572b = null;
        }
    }

    @aZ0.g
    public void c() {
    }

    public void j() {
    }

    @Override // java.util.concurrent.Future
    @InterfaceC19845a
    @T0
    public V get() throws InterruptedException {
        Object obj;
        if (!Thread.interrupted()) {
            Object obj2 = this.f360561b;
            if ((obj2 != null) & (!(obj2 instanceof g))) {
                return (V) g(obj2);
            }
            l lVar = this.f360563d;
            l lVar2 = l.f360587c;
            if (lVar != lVar2) {
                l lVar3 = new l();
                do {
                    b bVar = f360559g;
                    bVar.f(lVar3, lVar);
                    if (bVar.c(this, lVar, lVar3)) {
                        do {
                            LockSupport.park(this);
                            if (!Thread.interrupted()) {
                                obj = this.f360561b;
                            } else {
                                m(lVar3);
                                throw new InterruptedException();
                            }
                        } while (!((obj != null) & (!(obj instanceof g))));
                        return (V) g(obj);
                    }
                    lVar = this.f360563d;
                } while (lVar != lVar2);
            }
            Object obj3 = this.f360561b;
            Objects.requireNonNull(obj3);
            return (V) g(obj3);
        }
        throw new InterruptedException();
    }
}
