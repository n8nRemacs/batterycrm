package io.reactivex.rxjava3.internal.operators.maybe;

import java.util.concurrent.atomic.AtomicReference;

/* compiled from: MaybeCache.java */
/* renamed from: io.reactivex.rxjava3.internal.operators.maybe.c, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C41909c<T> extends io.reactivex.rxjava3.core.q<T> implements io.reactivex.rxjava3.core.t<T> {

    /* renamed from: b, reason: collision with root package name */
    public T f403196b;

    /* compiled from: MaybeCache.java */
    /* renamed from: io.reactivex.rxjava3.internal.operators.maybe.c$a */
    public static final class a<T> extends AtomicReference<C41909c<T>> implements io.reactivex.rxjava3.disposables.d {
        private static final long serialVersionUID = -5791853038359966195L;

        /* renamed from: b, reason: collision with root package name */
        public final io.reactivex.rxjava3.core.t<? super T> f403197b;

        public a(io.reactivex.rxjava3.core.t<? super T> tVar, C41909c<T> c41909c) {
            super(c41909c);
            this.f403197b = tVar;
        }

        @Override // io.reactivex.rxjava3.disposables.d
        public final void dispose() {
            if (getAndSet(null) != null) {
                throw null;
            }
        }

        @Override // io.reactivex.rxjava3.disposables.d
        /* renamed from: i */
        public final boolean getF318621e() {
            return get() == null;
        }
    }

    @Override // io.reactivex.rxjava3.core.t
    public final void e() {
        throw null;
    }

    @Override // io.reactivex.rxjava3.core.q
    public final void o(io.reactivex.rxjava3.core.t<? super T> tVar) {
        tVar.b(new a(tVar, this));
        throw null;
    }

    @Override // io.reactivex.rxjava3.core.t
    public final void onError(Throwable th2) {
        throw null;
    }

    @Override // io.reactivex.rxjava3.core.t
    public final void onSuccess(T t12) {
        this.f403196b = t12;
        throw null;
    }

    @Override // io.reactivex.rxjava3.core.t
    public final void b(io.reactivex.rxjava3.disposables.d dVar) {
    }
}
