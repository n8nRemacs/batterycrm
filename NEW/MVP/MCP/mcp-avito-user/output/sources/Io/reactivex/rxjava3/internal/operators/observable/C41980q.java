package io.reactivex.rxjava3.internal.operators.observable;

import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: ObservableCache.java */
/* renamed from: io.reactivex.rxjava3.internal.operators.observable.q, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C41980q<T> extends AbstractC41932a<T, T> implements io.reactivex.rxjava3.core.G<T> {

    /* renamed from: c, reason: collision with root package name */
    public b<T> f404238c;

    /* renamed from: d, reason: collision with root package name */
    public int f404239d;

    /* compiled from: ObservableCache.java */
    /* renamed from: io.reactivex.rxjava3.internal.operators.observable.q$a */
    public static final class a<T> extends AtomicInteger implements io.reactivex.rxjava3.disposables.d {
        private static final long serialVersionUID = 6770240836423125754L;

        /* renamed from: b, reason: collision with root package name */
        public final io.reactivex.rxjava3.core.G<? super T> f404240b;

        /* renamed from: c, reason: collision with root package name */
        public final C41980q<T> f404241c;

        /* renamed from: d, reason: collision with root package name */
        public volatile boolean f404242d;

        public a(io.reactivex.rxjava3.core.G<? super T> g12, C41980q<T> c41980q) {
            this.f404240b = g12;
            this.f404241c = c41980q;
        }

        @Override // io.reactivex.rxjava3.disposables.d
        public final void dispose() {
            if (this.f404242d) {
                return;
            }
            this.f404242d = true;
            this.f404241c.getClass();
            throw null;
        }

        @Override // io.reactivex.rxjava3.disposables.d
        public final boolean i() {
            return this.f404242d;
        }
    }

    /* compiled from: ObservableCache.java */
    /* renamed from: io.reactivex.rxjava3.internal.operators.observable.q$b */
    public static final class b<T> {

        /* renamed from: a, reason: collision with root package name */
        public final T[] f404243a;

        public b(int i12) {
            this.f404243a = (T[]) new Object[i12];
        }
    }

    @Override // io.reactivex.rxjava3.core.G
    public final void e() {
        throw null;
    }

    @Override // io.reactivex.rxjava3.core.G
    public final void onError(Throwable th2) {
        throw null;
    }

    @Override // io.reactivex.rxjava3.core.G
    public final void onNext(T t12) {
        int i12 = this.f404239d;
        if (i12 == 0) {
            b<T> bVar = new b<>(i12);
            bVar.f404243a[0] = t12;
            this.f404239d = 1;
            this.f404238c = bVar;
        } else {
            this.f404238c.f404243a[i12] = t12;
            this.f404239d = i12 + 1;
        }
        throw null;
    }

    @Override // io.reactivex.rxjava3.core.z
    public final void w0(io.reactivex.rxjava3.core.G<? super T> g12) {
        g12.b(new a(g12, this));
        throw null;
    }

    @Override // io.reactivex.rxjava3.core.G
    public final void b(io.reactivex.rxjava3.disposables.d dVar) {
    }
}
