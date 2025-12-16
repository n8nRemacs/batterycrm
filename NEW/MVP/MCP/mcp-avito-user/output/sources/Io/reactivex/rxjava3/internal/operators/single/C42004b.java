package io.reactivex.rxjava3.internal.operators.single;

import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: SingleCache.java */
/* renamed from: io.reactivex.rxjava3.internal.operators.single.b, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C42004b<T> extends io.reactivex.rxjava3.core.I<T> implements io.reactivex.rxjava3.core.L<T> {

    /* renamed from: b, reason: collision with root package name */
    public T f404560b;

    /* compiled from: SingleCache.java */
    /* renamed from: io.reactivex.rxjava3.internal.operators.single.b$a */
    public static final class a<T> extends AtomicBoolean implements io.reactivex.rxjava3.disposables.d {
        private static final long serialVersionUID = 7514387411091976596L;

        /* renamed from: b, reason: collision with root package name */
        public final io.reactivex.rxjava3.core.L<? super T> f404561b;

        /* renamed from: c, reason: collision with root package name */
        public final C42004b<T> f404562c;

        public a(io.reactivex.rxjava3.core.L<? super T> l12, C42004b<T> c42004b) {
            this.f404561b = l12;
            this.f404562c = c42004b;
        }

        @Override // io.reactivex.rxjava3.disposables.d
        public final void dispose() {
            if (compareAndSet(false, true)) {
                this.f404562c.getClass();
                throw null;
            }
        }

        @Override // io.reactivex.rxjava3.disposables.d
        /* renamed from: i */
        public final boolean getF318621e() {
            return get();
        }
    }

    @Override // io.reactivex.rxjava3.core.L
    public final void onError(Throwable th2) {
        throw null;
    }

    @Override // io.reactivex.rxjava3.core.L
    public final void onSuccess(T t12) {
        this.f404560b = t12;
        throw null;
    }

    @Override // io.reactivex.rxjava3.core.I
    public final void y(io.reactivex.rxjava3.core.L<? super T> l12) {
        l12.b(new a(l12, this));
        throw null;
    }

    @Override // io.reactivex.rxjava3.core.L
    public final void b(io.reactivex.rxjava3.disposables.d dVar) {
    }
}
