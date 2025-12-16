package com.google.common.util.concurrent;

import com.google.common.base.InterfaceC37276u;
import com.google.common.util.concurrent.AbstractC37532c;
import com.google.common.util.concurrent.AbstractC37545i0;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;

/* compiled from: AbstractTransformFuture.java */
@InterfaceC37531b0
@XY0.b
/* renamed from: com.google.common.util.concurrent.p, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
abstract class AbstractRunnableC37558p<I, O, F, T> extends AbstractC37545i0.a<O> implements Runnable {

    /* renamed from: l, reason: collision with root package name */
    public static final /* synthetic */ int f360631l = 0;

    /* renamed from: j, reason: collision with root package name */
    @I41.a
    public D0<? extends I> f360632j;

    /* renamed from: k, reason: collision with root package name */
    @I41.a
    public InterfaceC37276u f360633k;

    /* compiled from: AbstractTransformFuture.java */
    /* renamed from: com.google.common.util.concurrent.p$a */
    public static final class a<I, O> extends AbstractRunnableC37558p<I, O, InterfaceC37569v<? super I, ? extends O>, D0<? extends O>> {
        @Override // com.google.common.util.concurrent.AbstractRunnableC37558p
        public final Object r(InterfaceC37276u interfaceC37276u, @T0 Object obj) {
            InterfaceC37569v interfaceC37569v = (InterfaceC37569v) interfaceC37276u;
            D0<O> d0Apply = interfaceC37569v.apply(obj);
            if (d0Apply != null) {
                return d0Apply;
            }
            throw new NullPointerException(com.google.common.base.d0.b("AsyncFunction.apply returned null instead of a Future. Did you mean to return immediateFuture(null)? %s", interfaceC37569v));
        }

        @Override // com.google.common.util.concurrent.AbstractRunnableC37558p
        public final void s(Object obj) {
            p((D0) obj);
        }
    }

    /* compiled from: AbstractTransformFuture.java */
    /* renamed from: com.google.common.util.concurrent.p$b */
    public static final class b<I, O> extends AbstractRunnableC37558p<I, O, InterfaceC37276u<? super I, ? extends O>, O> {
        public b() {
            throw null;
        }

        @Override // com.google.common.util.concurrent.AbstractRunnableC37558p
        @T0
        public final Object r(InterfaceC37276u interfaceC37276u, @T0 Object obj) {
            return interfaceC37276u.apply(obj);
        }

        @Override // com.google.common.util.concurrent.AbstractRunnableC37558p
        public final void s(@T0 O o12) {
            n(o12);
        }
    }

    public AbstractRunnableC37558p() {
        throw null;
    }

    @Override // com.google.common.util.concurrent.AbstractC37532c
    public final void c() {
        k(this.f360632j);
        this.f360632j = null;
        this.f360633k = null;
    }

    @Override // com.google.common.util.concurrent.AbstractC37532c
    @I41.a
    public final String l() {
        String str;
        D0<? extends I> d02 = this.f360632j;
        InterfaceC37276u interfaceC37276u = this.f360633k;
        String strL = super.l();
        if (d02 != null) {
            str = "inputFuture=[" + d02 + "], ";
        } else {
            str = "";
        }
        if (interfaceC37276u == null) {
            if (strL != null) {
                return androidx.appcompat.app.r.q(str, strL);
            }
            return null;
        }
        return str + "function=[" + interfaceC37276u + "]";
    }

    @aZ0.g
    @T0
    public abstract Object r(InterfaceC37276u interfaceC37276u, @T0 Object obj);

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.lang.Runnable
    public final void run() {
        D0<? extends I> d02 = this.f360632j;
        InterfaceC37276u interfaceC37276u = this.f360633k;
        if (((this.f360561b instanceof AbstractC37532c.C10692c) | (d02 == null)) || (interfaceC37276u == null)) {
            return;
        }
        this.f360632j = null;
        if (d02.isCancelled()) {
            p(d02);
            return;
        }
        try {
            try {
                Object objR = r(interfaceC37276u, C37568u0.b(d02));
                this.f360633k = null;
                s(objR);
            } catch (Throwable th2) {
                try {
                    V0.a(th2);
                    o(th2);
                } finally {
                    this.f360633k = null;
                }
            }
        } catch (Error e12) {
            o(e12);
        } catch (CancellationException unused) {
            cancel(false);
        } catch (RuntimeException e13) {
            o(e13);
        } catch (ExecutionException e14) {
            o(e14.getCause());
        }
    }

    @aZ0.g
    public abstract void s(@T0 T t12);
}
