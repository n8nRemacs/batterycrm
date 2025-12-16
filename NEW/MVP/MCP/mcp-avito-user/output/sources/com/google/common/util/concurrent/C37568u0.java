package com.google.common.util.concurrent;

import aZ0.InterfaceC19845a;
import com.google.common.base.D;
import com.google.common.collect.AbstractC37378n1;
import com.google.common.collect.AbstractC37401r1;
import com.google.common.collect.N4;
import com.google.common.util.concurrent.A0;
import com.google.common.util.concurrent.AbstractC37532c;
import com.google.common.util.concurrent.AbstractRunnableC37558p;
import com.google.common.util.concurrent.Z;
import java.util.Objects;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.logging.Logger;

/* compiled from: Futures.java */
@InterfaceC37531b0
@XY0.b
/* renamed from: com.google.common.util.concurrent.u0, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C37568u0 extends AbstractC37578z0 {

    /* compiled from: Futures.java */
    /* renamed from: com.google.common.util.concurrent.u0$a */
    public static final class a<V> implements Runnable {

        /* renamed from: b, reason: collision with root package name */
        public final D0 f360652b;

        /* renamed from: c, reason: collision with root package name */
        public final InterfaceC37564s0<? super V> f360653c;

        public a(D0 d02, InterfaceC37564s0 interfaceC37564s0) {
            this.f360652b = d02;
            this.f360653c = interfaceC37564s0;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.lang.Runnable
        public final void run() {
            Throwable thA;
            D0 d02 = this.f360652b;
            boolean z12 = d02 instanceof ZY0.a;
            InterfaceC37564s0<? super V> interfaceC37564s0 = this.f360653c;
            if (z12 && (thA = ((ZY0.a) d02).a()) != null) {
                interfaceC37564s0.a(thA);
                return;
            }
            try {
                interfaceC37564s0.onSuccess((Object) C37568u0.b(d02));
            } catch (Error e12) {
                e = e12;
                interfaceC37564s0.a(e);
            } catch (RuntimeException e13) {
                e = e13;
                interfaceC37564s0.a(e);
            } catch (ExecutionException e14) {
                interfaceC37564s0.a(e14.getCause());
            }
        }

        public final String toString() {
            D.b bVarB = com.google.common.base.D.b(this);
            bVarB.d(this.f360653c);
            return bVarB.toString();
        }
    }

    /* compiled from: Futures.java */
    @XY0.b
    /* renamed from: com.google.common.util.concurrent.u0$b */
    public static final class b<V> {

        /* renamed from: a, reason: collision with root package name */
        public final boolean f360654a;

        /* renamed from: b, reason: collision with root package name */
        public final AbstractC37401r1<D0<? extends V>> f360655b;

        public b() {
            throw null;
        }

        public b(boolean z12, AbstractC37401r1 abstractC37401r1, FutureC37566t0 futureC37566t0) {
            this.f360654a = z12;
            this.f360655b = abstractC37401r1;
        }

        public final D0 a(com.google.net.cronet.okhttptransport.p pVar) {
            final Z z12 = new Z(this.f360655b, this.f360654a);
            z12.f360545p = new Z.b(pVar);
            Objects.requireNonNull(z12.f360641m);
            if (z12.f360641m.isEmpty()) {
                z12.t();
            } else {
                EnumC37529a0 enumC37529a0 = EnumC37529a0.f360553b;
                if (z12.f360642n) {
                    N4 it = z12.f360641m.iterator();
                    final int i12 = 0;
                    while (it.hasNext()) {
                        final D0 d02 = (D0) it.next();
                        d02.N(new Runnable() { // from class: com.google.common.util.concurrent.q
                            @Override // java.lang.Runnable
                            public final void run() {
                                D0 d03 = d02;
                                int i13 = i12;
                                Logger logger = AbstractC37563s.f360640o;
                                Z z13 = z12;
                                try {
                                    if (d03.isCancelled()) {
                                        z13.f360641m = null;
                                        z13.cancel(false);
                                    } else {
                                        z13.r(i13, d03);
                                    }
                                    z13.s(null);
                                } catch (Throwable th2) {
                                    z13.s(null);
                                    throw th2;
                                }
                            }
                        }, enumC37529a0);
                        i12++;
                    }
                } else {
                    final AbstractC37378n1 abstractC37378n1 = null;
                    Runnable runnable = new Runnable() { // from class: com.google.common.util.concurrent.r
                        @Override // java.lang.Runnable
                        public final void run() {
                            Logger logger = AbstractC37563s.f360640o;
                            z12.s(abstractC37378n1);
                        }
                    };
                    N4 it2 = z12.f360641m.iterator();
                    while (it2.hasNext()) {
                        ((D0) it2.next()).N(runnable, enumC37529a0);
                    }
                }
            }
            return z12;
        }
    }

    /* compiled from: Futures.java */
    /* renamed from: com.google.common.util.concurrent.u0$c */
    public static final class c<T> extends AbstractC37532c<T> {

        /* renamed from: i, reason: collision with root package name */
        @I41.a
        public d<T> f360656i;

        public c() {
            throw null;
        }

        public c(d dVar, FutureC37566t0 futureC37566t0) {
            this.f360656i = dVar;
        }

        @Override // com.google.common.util.concurrent.AbstractC37532c
        public final void c() {
            this.f360656i = null;
        }

        @Override // com.google.common.util.concurrent.AbstractC37532c, java.util.concurrent.Future
        public final boolean cancel(boolean z12) {
            d<T> dVar = this.f360656i;
            if (!super.cancel(z12)) {
                return false;
            }
            Objects.requireNonNull(dVar);
            dVar.f360657a = true;
            if (!z12) {
                dVar.f360658b = false;
            }
            if (dVar.f360659c.decrementAndGet() == 0 && dVar.f360657a) {
                for (D0<? extends T> d02 : dVar.f360660d) {
                    if (d02 != null) {
                        d02.cancel(dVar.f360658b);
                    }
                }
            }
            return true;
        }

        @Override // com.google.common.util.concurrent.AbstractC37532c
        @I41.a
        public final String l() {
            d<T> dVar = this.f360656i;
            if (dVar == null) {
                return null;
            }
            return "inputCount=[" + dVar.f360660d.length + "], remaining=[" + dVar.f360659c.get() + "]";
        }
    }

    /* compiled from: Futures.java */
    /* renamed from: com.google.common.util.concurrent.u0$d */
    public static final class d<T> {

        /* renamed from: a, reason: collision with root package name */
        public boolean f360657a;

        /* renamed from: b, reason: collision with root package name */
        public boolean f360658b;

        /* renamed from: c, reason: collision with root package name */
        public final AtomicInteger f360659c;

        /* renamed from: d, reason: collision with root package name */
        public final D0<? extends T>[] f360660d;

        public d() {
            throw null;
        }

        public d(D0[] d0Arr, FutureC37566t0 futureC37566t0) {
            this.f360657a = false;
            this.f360658b = true;
            this.f360660d = d0Arr;
            this.f360659c = new AtomicInteger(d0Arr.length);
        }
    }

    public static <V> void a(D0<V> d02, InterfaceC37564s0<? super V> interfaceC37564s0, Executor executor) {
        d02.N(new a(d02, interfaceC37564s0), executor);
    }

    @InterfaceC19845a
    @T0
    public static <V> V b(Future<V> future) {
        com.google.common.base.M.p("Future was expected to be done: %s", future.isDone(), future);
        return (V) p1.a(future);
    }

    public static <V> D0<V> c(Throwable th2) {
        A0.b bVar = new A0.b();
        bVar.o(th2);
        return bVar;
    }

    public static <V> D0<V> d(@T0 V v12) {
        return v12 == null ? (D0<V>) A0.f360480c : new A0(v12);
    }

    public static D0<Void> e() {
        return A0.f360480c;
    }

    public static D0 f(D0 d02, com.google.common.cache.m mVar) {
        Executor executor = EnumC37529a0.f360553b;
        int i12 = AbstractRunnableC37558p.f360631l;
        AbstractRunnableC37558p.b bVar = new AbstractRunnableC37558p.b();
        bVar.f360632j = d02;
        bVar.f360633k = mVar;
        d02.N(bVar, executor);
        return bVar;
    }

    /* compiled from: Futures.java */
    /* renamed from: com.google.common.util.concurrent.u0$e */
    public static final class e<V> extends AbstractC37532c.j<V> implements Runnable {
        @Override // com.google.common.util.concurrent.AbstractC37532c
        @I41.a
        public final String l() {
            return null;
        }

        @Override // com.google.common.util.concurrent.AbstractC37532c
        public final void c() {
        }

        @Override // java.lang.Runnable
        public final void run() {
        }
    }
}
