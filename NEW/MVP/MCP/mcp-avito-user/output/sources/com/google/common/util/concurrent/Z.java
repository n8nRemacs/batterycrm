package com.google.common.util.concurrent;

import com.google.common.util.concurrent.AbstractC37563s;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;

/* compiled from: CombinedFuture.java */
@InterfaceC37531b0
@XY0.b
/* loaded from: classes6.dex */
final class Z<V> extends AbstractC37563s<Object, V> {

    /* renamed from: p, reason: collision with root package name */
    @I41.a
    public b f360545p;

    /* compiled from: CombinedFuture.java */
    public final class a extends Z<V>.c<D0<V>> {
        @Override // com.google.common.util.concurrent.B0
        public final Object e() {
            throw null;
        }

        @Override // com.google.common.util.concurrent.B0
        public final String f() {
            throw null;
        }

        @Override // com.google.common.util.concurrent.Z.c
        public final void h(Object obj) {
            throw null;
        }
    }

    /* compiled from: CombinedFuture.java */
    public final class b extends Z<V>.c<V> {

        /* renamed from: f, reason: collision with root package name */
        public final com.google.net.cronet.okhttptransport.p f360546f;

        public b(com.google.net.cronet.okhttptransport.p pVar) {
            super(Z.this);
            this.f360546f = pVar;
        }

        @Override // com.google.common.util.concurrent.B0
        @T0
        public final V e() {
            return (V) this.f360546f.call();
        }

        @Override // com.google.common.util.concurrent.B0
        public final String f() {
            return this.f360546f.toString();
        }

        @Override // com.google.common.util.concurrent.Z.c
        public final void h(@T0 V v12) {
            Z.this.n(v12);
        }
    }

    /* compiled from: CombinedFuture.java */
    public abstract class c<T> extends B0<T> {

        /* renamed from: d, reason: collision with root package name */
        public final Executor f360548d;

        /* renamed from: e, reason: collision with root package name */
        public final /* synthetic */ Z f360549e;

        public c(Z z12) {
            EnumC37529a0 enumC37529a0 = EnumC37529a0.f360553b;
            this.f360549e = z12;
            this.f360548d = enumC37529a0;
        }

        @Override // com.google.common.util.concurrent.B0
        public final void a(Throwable th2) {
            Z z12 = this.f360549e;
            z12.f360545p = null;
            if (th2 instanceof ExecutionException) {
                z12.o(((ExecutionException) th2).getCause());
            } else if (th2 instanceof CancellationException) {
                z12.cancel(false);
            } else {
                z12.o(th2);
            }
        }

        @Override // com.google.common.util.concurrent.B0
        public final void b(@T0 T t12) {
            this.f360549e.f360545p = null;
            h(t12);
        }

        @Override // com.google.common.util.concurrent.B0
        public final boolean d() {
            return this.f360549e.isDone();
        }

        public abstract void h(@T0 T t12);
    }

    public Z() {
        throw null;
    }

    @Override // com.google.common.util.concurrent.AbstractC37532c
    public final void j() {
        b bVar = this.f360545p;
        if (bVar != null) {
            bVar.c();
        }
    }

    @Override // com.google.common.util.concurrent.AbstractC37563s
    public final void t() {
        b bVar = this.f360545p;
        if (bVar != null) {
            try {
                ((EnumC37529a0) bVar.f360548d).getClass();
                bVar.run();
            } catch (RejectedExecutionException e12) {
                bVar.f360549e.o(e12);
            }
        }
    }

    @Override // com.google.common.util.concurrent.AbstractC37563s
    public final void v(AbstractC37563s.a aVar) {
        this.f360641m = null;
        if (aVar == AbstractC37563s.a.f360643b) {
            this.f360545p = null;
        }
    }
}
