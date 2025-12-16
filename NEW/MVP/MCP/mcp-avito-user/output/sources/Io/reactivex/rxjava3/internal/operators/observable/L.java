package io.reactivex.rxjava3.internal.operators.observable;

import io.reactivex.rxjava3.internal.observers.AbstractC41804b;

/* compiled from: ObservableDistinctUntilChanged.java */
/* loaded from: classes8.dex */
public final class L<T, K> extends AbstractC41932a<T, T> {

    /* renamed from: c, reason: collision with root package name */
    public final l41.o<? super T, K> f403695c;

    /* renamed from: d, reason: collision with root package name */
    public final l41.d<? super K, ? super K> f403696d;

    /* compiled from: ObservableDistinctUntilChanged.java */
    public static final class a<T, K> extends AbstractC41804b<T, T> {

        /* renamed from: g, reason: collision with root package name */
        public final l41.o<? super T, K> f403697g;

        /* renamed from: h, reason: collision with root package name */
        public final l41.d<? super K, ? super K> f403698h;

        /* renamed from: i, reason: collision with root package name */
        public K f403699i;

        /* renamed from: j, reason: collision with root package name */
        public boolean f403700j;

        public a(io.reactivex.rxjava3.core.G<? super T> g12, l41.o<? super T, K> oVar, l41.d<? super K, ? super K> dVar) {
            super(g12);
            this.f403697g = oVar;
            this.f403698h = dVar;
        }

        @Override // io.reactivex.rxjava3.core.G
        public final void onNext(T t12) {
            if (this.f402100e) {
                return;
            }
            int i12 = this.f402101f;
            io.reactivex.rxjava3.core.G<? super R> g12 = this.f402097b;
            if (i12 != 0) {
                g12.onNext(t12);
                return;
            }
            try {
                K kApply = this.f403697g.apply(t12);
                if (this.f403700j) {
                    boolean zA2 = this.f403698h.a(this.f403699i, kApply);
                    this.f403699i = kApply;
                    if (zA2) {
                        return;
                    }
                } else {
                    this.f403700j = true;
                    this.f403699i = kApply;
                }
                g12.onNext(t12);
            } catch (Throwable th2) {
                a(th2);
            }
        }

        @Override // q41.g
        @j41.f
        public final T poll() {
            while (true) {
                T tPoll = this.f402099d.poll();
                if (tPoll == null) {
                    return null;
                }
                K kApply = this.f403697g.apply(tPoll);
                if (!this.f403700j) {
                    this.f403700j = true;
                    this.f403699i = kApply;
                    return tPoll;
                }
                if (!this.f403698h.a(this.f403699i, kApply)) {
                    this.f403699i = kApply;
                    return tPoll;
                }
                this.f403699i = kApply;
            }
        }
    }

    public L(io.reactivex.rxjava3.core.z zVar, l41.o oVar, l41.d dVar) {
        super(zVar);
        this.f403695c = oVar;
        this.f403696d = dVar;
    }

    @Override // io.reactivex.rxjava3.core.z
    public final void w0(io.reactivex.rxjava3.core.G<? super T> g12) {
        this.f403951b.c(new a(g12, this.f403695c, this.f403696d));
    }
}
